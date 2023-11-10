package com.example.jointproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;

public class viewPagerAdapter extends RecyclerView.Adapter<viewPagerAdapter.ViewHolder> {
    ArrayList<viewPagerModal> viewPagerModals;

    public viewPagerAdapter(ArrayList<viewPagerModal> viewPagerModals) {
        this.viewPagerModals = viewPagerModals;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
       return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        viewPagerModal viewPagerModal = viewPagerModals.get(position);
        holder.imageView.setImageResource(viewPagerModal.imagesID);
        holder.txtDescription.setText(viewPagerModal.description);
        holder.txtHeading.setText(viewPagerModal.heading);

    }

    @Override
    public int getItemCount() {
        return viewPagerModals.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView txtHeading,txtDescription;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image1);
            txtHeading = itemView.findViewById(R.id.title_1);
            txtDescription = itemView.findViewById(R.id.des);
        }
    }

}
   /* int images[] = {
            R.drawable.cartimage,
            R.drawable.people,
            R.drawable.clothes
    };
    int des[]={
            R.string.string_title1,
            R.string.string_title2 ,
            R.string.string_title3,

    };

    public viewPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (LinearLayout)object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater= (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view= layoutInflater.inflate(R.layout.item_layout,container,false);
        ImageView sliderimage= (ImageView)view.findViewById(R.id.image1);
        TextView txtslidertext = (TextView) view.findViewById(R.id.title_1);
        sliderimage.setImageResource(images[position]);
        txtslidertext.setText(des[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);

    }*/
