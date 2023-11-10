package com.example.jointproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

public class ProductDetailActivity extends AppCompatActivity {
    private RecyclerView ProductDetailRecyclerView;
    private AdapterCategoryShowDetails adapterCategoryShowDetails;
    private ArrayList<AdapterCategoryShowDetailsModal> adapterCategoryShowDetailsModalArrayList;
    RatingBar ratingBar;
    private MaterialButton btnAddToCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);
        ProductDetailRecyclerView= findViewById(R.id.recyclerProductDetail);
        adapterCategoryShowDetailsModalArrayList= new ArrayList<>();
        btnAddToCart= findViewById(R.id.btnCart);
        adapterCategoryShowDetails= new AdapterCategoryShowDetails(this,adapterCategoryShowDetailsModalArrayList);
        ratingBar =findViewById(R.id.ratingBar);
        ratingBar.setRating(3.0f);
        ratingBar.setNumStars(3);
        btnAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ProductDetailActivity.this,CartActivity.class);
                startActivity(intent);
            }
        });
       adapterCategoryShowDetailsModalArrayList.add(new AdapterCategoryShowDetailsModal("1","https://www.lenni.fr/wp-content/uploads/2015/12/Nike-sneackers-1.jpg","product1","300","sneakers"));
        adapterCategoryShowDetailsModalArrayList.add(new AdapterCategoryShowDetailsModal("2","https://www.lenni.fr/wp-content/uploads/2015/12/Nike-sneackers-1.jpg","product2","300","sneakers"));

        adapterCategoryShowDetailsModalArrayList.add(new AdapterCategoryShowDetailsModal("3","https://www.lenni.fr/wp-content/uploads/2015/12/Nike-sneackers-1.jpg","product3","300","sneakers"));
       adapterCategoryShowDetailsModalArrayList.add(new AdapterCategoryShowDetailsModal("4","https://www.lenni.fr/wp-content/uploads/2015/12/Nike-sneackers-1.jpg","product4","300","sneakers"));

       adapterCategoryShowDetailsModalArrayList.add(new AdapterCategoryShowDetailsModal("5","https://www.lenni.fr/wp-content/uploads/2015/12/Nike-sneackers-1.jpg","product5","300","sneakers"));

       adapterCategoryShowDetailsModalArrayList.add(new AdapterCategoryShowDetailsModal("6","https://www.lenni.fr/wp-content/uploads/2015/12/Nike-sneackers-1.jpg","product6","300","sneakers"));
       ProductDetailRecyclerView.setHasFixedSize(true);
       ProductDetailRecyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
    ProductDetailRecyclerView.setAdapter(adapterCategoryShowDetails);

    }
}