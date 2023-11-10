package com.example.jointproject;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdapterCategoryShowDetails extends RecyclerView.Adapter<AdapterCategoryShowDetails.ViewHolder>{
    Context context;
    private ArrayList<AdapterCategoryShowDetailsModal> adapterCategoryShowDetailsModals;

    public AdapterCategoryShowDetails(Context context, ArrayList<AdapterCategoryShowDetailsModal> adapterCategoryShowDetailsModals) {
        this.context = context;
        this.adapterCategoryShowDetailsModals = adapterCategoryShowDetailsModals;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_category_show_details,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtProduct.setText(adapterCategoryShowDetailsModals.get(position).getProductCSDM());
        holder.txtCategory.setText(adapterCategoryShowDetailsModals.get(position).getCategoryCSDM());
        holder.txtPrice.setText("$"+adapterCategoryShowDetailsModals.get(position).getPriceCSDM());
       // Picasso.get().load(adapterCategoryShowDetailsModals.get(position).getImageCSDM()).into(holder.imgCSD);
        holder.cardviewCSD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,ProductDetailActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return adapterCategoryShowDetailsModals.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgCSD;
        private TextView txtProduct,txtPrice,txtCategory;
        private CardView cardviewCSD;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtCategory= itemView.findViewById(R.id.txtcategoryCSD);
           txtPrice= itemView.findViewById(R.id.priceCSD);
          txtProduct= itemView.findViewById(R.id.txtnameOfProductCSD);
          imgCSD = itemView.findViewById(R.id.imgCSD);
          cardviewCSD= itemView.findViewById(R.id.cardviewCSD);

        }
    }
}
