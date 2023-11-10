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

import java.util.ArrayList;

public class CartShowProductAndPriceAdapter extends RecyclerView.Adapter<CartShowProductAndPriceAdapter.ViewHolder>{
     Context context;
    private ArrayList<AdapterCategoryShowDetailsModal> myCartModelForProductDetail;

    public CartShowProductAndPriceAdapter(Context context, ArrayList<AdapterCategoryShowDetailsModal> myCartModelForProductDetail) {
        this.context = context;
        this.myCartModelForProductDetail = myCartModelForProductDetail;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.cart_show_productname_price_adapter,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       holder.product_detail_cart_product_name.setText(myCartModelForProductDetail.get(position).getProductCSDM());
       holder.product_detail_cart_product_price.setText(myCartModelForProductDetail.get(position).getPriceCSDM());

    }

    @Override
    public int getItemCount() {
       return myCartModelForProductDetail.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView product_detail_cart_product_name,product_detail_cart_product_price;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            product_detail_cart_product_price = itemView.findViewById(R.id.product_activity_cart_price);
            product_detail_cart_product_name= itemView.findViewById(R.id.product_activity_cart_product_name);
        }
    }
}
