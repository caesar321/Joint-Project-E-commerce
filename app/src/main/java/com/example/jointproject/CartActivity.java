package com.example.jointproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class CartActivity extends AppCompatActivity {
    private RecyclerView cartRecyclerView,cartRecyclerViewForProductandPriceDetail;
    private ArrayList<AdapterCategoryShowDetailsModal>myCartModel;
    private CartAdapter cartAdapter;
    private CartShowProductAndPriceAdapter cartShowProductAndPriceAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        cartRecyclerView= findViewById(R.id.RecyclerViewCart);
cartRecyclerViewForProductandPriceDetail= findViewById(R.id.recyclerViewProductsNameAndPrice);
        myCartModel= new ArrayList<>();
        cartShowProductAndPriceAdapter = new CartShowProductAndPriceAdapter(this,myCartModel);
        cartAdapter = new CartAdapter(this,myCartModel);
        cartRecyclerView.setHasFixedSize(true);
        cartRecyclerViewForProductandPriceDetail.setHasFixedSize(true);
        cartRecyclerViewForProductandPriceDetail.setLayoutManager(new LinearLayoutManager(this));
        cartRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        myCartModel.add(new AdapterCategoryShowDetailsModal("1","https://www.lenni.fr/wp-content/uploads/2015/12/Nike-sneackers-1.jpg","product1","300","sneakers"));
        myCartModel.add(new AdapterCategoryShowDetailsModal("2","https://www.lenni.fr/wp-content/uploads/2015/12/Nike-sneackers-1.jpg","product2","300","sneakers"));

        myCartModel.add(new AdapterCategoryShowDetailsModal("3","https://www.lenni.fr/wp-content/uploads/2015/12/Nike-sneackers-1.jpg","product3","300","sneakers"));
        myCartModel.add(new AdapterCategoryShowDetailsModal("1","https://www.lenni.fr/wp-content/uploads/2015/12/Nike-sneackers-1.jpg","product4","300","sneakers"));

        cartRecyclerView.setAdapter(cartAdapter);
        cartRecyclerViewForProductandPriceDetail.setAdapter(cartShowProductAndPriceAdapter);
    }
}