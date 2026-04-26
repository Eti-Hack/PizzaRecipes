package com.example.pizzarecipes.display;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.pizzarecipes.R;
import com.example.pizzarecipes.models.Pizza;
import java.util.List;

public class PizzaAdapter extends BaseAdapter {

    private final Context context;
    private final List<Pizza> items;

    public PizzaAdapter(Context context, List<Pizza> items) {
        this.context = context;
        this.items = items;
    }

    @Override public int getCount() { return items.size(); }
    @Override public Object getItem(int position) { return items.get(position); }
    @Override public long getItemId(int position) { return items.get(position).getId(); }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.row_pizza, parent, false);
            holder = new ViewHolder();
            holder.image  = convertView.findViewById(R.id.imgPizza);
            holder.name   = convertView.findViewById(R.id.tvNom);
            holder.duree  = convertView.findViewById(R.id.tvDuree);
            holder.prix   = convertView.findViewById(R.id.tvPrix);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Pizza pizza = items.get(position);
        holder.image.setImageResource(pizza.getPhoto());
        holder.name.setText(pizza.getTitle());
        holder.duree.setText("⏱  " + pizza.getCookTime());
        holder.prix.setText(pizza.getCost() + " €");

        return convertView;
    }

    static class ViewHolder {
        ImageView image;
        TextView name;
        TextView duree;
        TextView prix;
    }
}