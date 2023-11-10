package com.example.jointproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder>{
    Context context;
    private ArrayList<AdapterCategoryShowDetailsModal> myCartModel;

    public CartAdapter(Context context, ArrayList<AdapterCategoryShowDetailsModal> myCartModel) {
        this.context = context;
        this.myCartModel = myCartModel;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cart_adapter_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.cart_product.setText(myCartModel.get(position).getProductCSDM());
        holder.cart_product_category.setText(myCartModel.get(position).getCategoryCSDM());
        holder.cart_product_price.setText(myCartModel.get(position).getPriceCSDM());
        // Picasso.get().load(myCartModel.get(position).getImageCSDM()).into(holder.cart_image);
    }

    @Override
    public int getItemCount() {
        return myCartModel.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView cart_image;
        private TextView cart_product,cart_product_price,cart_product_category;
        private RatingBar ratingBar;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cart_image = itemView.findViewById(R.id.cart_image);
            cart_product= itemView.findViewById(R.id.cart_product_name);
            cart_product_price= itemView.findViewById(R.id.cart_product_price);
            cart_product_category = itemView.findViewById(R.id.cart_product_category);
        }
    }
}
