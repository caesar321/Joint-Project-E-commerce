package com.example.jointproject;

import android.content.Context;
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

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Context context;
   private ArrayList<CategoryModal> categoryModalArrayList;

    public Adapter(Context context, ArrayList<CategoryModal> categoryModalArrayList) {
        this.context = context;
        this.categoryModalArrayList = categoryModalArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //Picasso.get().load(categoryModalArrayList.get(position).getImage()).into(holder.imgCat);
        holder.txtCat.setText(categoryModalArrayList.get(position).getTxtCategory());
        holder.categoryCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return categoryModalArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgCat;
        private TextView txtCat;
        private CardView categoryCardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCat = itemView.findViewById(R.id.categories_img);
            txtCat = itemView.findViewById(R.id.txt_Categories);
            categoryCardView = itemView.findViewById(R.id.cardviewCategory);
        }
    }
}
