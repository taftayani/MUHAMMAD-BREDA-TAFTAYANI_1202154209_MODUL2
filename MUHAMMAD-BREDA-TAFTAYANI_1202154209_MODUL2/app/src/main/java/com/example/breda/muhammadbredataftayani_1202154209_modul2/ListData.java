package com.example.breda.muhammadbredataftayani_1202154209_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;

/**
 * Created by Breda on 2/17/2018.
 */

class ListData extends RecyclerView.Adapter<ListData.ListViewHolder> {


    private final LinkedList<String> Coffes;
    private final LinkedList<Integer> Price;
    private final LinkedList<Integer> Photos;

    private LayoutInflater inflater;
    //deklarasi ListData dengan Menu
    public ListData(Context context, LinkedList<String> nCoffees, LinkedList<Integer> nPrices, LinkedList<Integer> nPhotos) {
        inflater=LayoutInflater.from(context);
        this.Price =nPrices;
        this.Coffes = nCoffees;
        this.Photos=nPhotos;

    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View nitemView =inflater.inflate(R.layout.list_coffee,parent,false);
        return new ListViewHolder(nitemView,this);
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {
        Integer CurrentPhoto = Photos.get(position);
        Integer CurrentPrice = Price.get(position);
        String CurrentCoffee = Coffes.get(position);
        holder.CoffeeItem.setText(CurrentCoffee);
        holder.PriceItem.setText("RP"+CurrentPrice.toString());
        holder.ImageItem.setImageResource(CurrentPhoto);

    }

    @Override
    public int getItemCount() {
        return Coffes.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder{

        public final TextView CoffeeItem;
        public final TextView PriceItem;
        public final ImageView ImageItem;

        final ListData madapter;
        public ListViewHolder(final View itemView, ListData madapter1) {
            super(itemView);
            CoffeeItem = (TextView)itemView.findViewById(R.id.coffee);
            PriceItem = (TextView)itemView.findViewById(R.id.prices);
            ImageItem = (ImageView) itemView.findViewById(R.id.R_photo);
            ImageItem.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view){
                    //iterasi posisi awal saat klik
                    int position= getLayoutPosition();
                    //iterasi setiap nilai item saat klik
                    String coffee=Coffes.get(position);
                    Integer price=Price.get(position);
                    Integer photo=Photos.get(position);
                    //iterasi saat diklik pindah ke detail menu
                    Intent intent=new Intent(itemView.getContext(),DetailMenu.class);
                    //iterasi untuk meletakkan nilai
                    intent.putExtra("coffee",coffee);
                    intent.putExtra("price",price);
                    intent.putExtra("photo",photo);
                    itemView.getContext().startActivity(intent);
                }
            });
            this.madapter = madapter1;
        }

    }
}
