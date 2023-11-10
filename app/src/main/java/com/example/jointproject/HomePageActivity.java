package com.example.jointproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class HomePageActivity extends AppCompatActivity {
    private RecyclerView categoryRecyclerview,categoryShowDetailsRecyclerView;
    private ArrayList<CategoryModal> myCategoryModel;
    private ArrayList<AdapterCategoryShowDetailsModal> adapterCategoryShowDetailsModals;
    private Adapter adapter;
    private AdapterCategoryShowDetails adapterCategoryShowDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        categoryRecyclerview = findViewById(R.id.recycle_category);
        categoryShowDetailsRecyclerView = findViewById(R.id.recyclerViewCategoryType);
        adapterCategoryShowDetailsModals = new ArrayList<>();
        adapterCategoryShowDetails = new AdapterCategoryShowDetails(this,adapterCategoryShowDetailsModals);
        categoryShowDetailsRecyclerView.setLayoutManager(new GridLayoutManager(this,2));
        myCategoryModel= new ArrayList<>();
        adapter = new Adapter(this,myCategoryModel);
        myCategoryModel.add(new CategoryModal("1",null,"Wears"));
        myCategoryModel.add(new CategoryModal("2","https://www.lenni.fr/wp-content/uploads/2015/12/Nike-sneackers-1.jpg","sneakers"));
        myCategoryModel.add(new CategoryModal("3","https://www.lenni.fr/wp-content/uploads/2015/12/Nike-sneackers-1.jpg","coats"));
        myCategoryModel.add(new CategoryModal("4","https://www.lenni.fr/wp-content/uploads/2015/12/Nike-sneackers-1.jpg","shoes"));
        myCategoryModel.add(new CategoryModal("5","https://www.lenni.fr/wp-content/uploads/2015/12/Nike-sneackers-1.jpg","phones"));
        myCategoryModel.add(new CategoryModal("7","https://www.lenni.fr/wp-content/uploads/2015/12/Nike-sneackers-1.jpg","bag"));
        categoryRecyclerview.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        categoryRecyclerview.setAdapter(adapter);
       adapterCategoryShowDetailsModals.add(new AdapterCategoryShowDetailsModal("1","https://www.lenni.fr/wp-content/uploads/2015/12/Nike-sneackers-1.jpg","product1","300","sneakers"));
       adapterCategoryShowDetailsModals.add(new AdapterCategoryShowDetailsModal("2","https://www.lenni.fr/wp-content/uploads/2015/12/Nike-sneackers-1.jpg","product2","300","sneakers"));

        adapterCategoryShowDetailsModals.add(new AdapterCategoryShowDetailsModal("3","https://www.lenni.fr/wp-content/uploads/2015/12/Nike-sneackers-1.jpg","product3","300","sneakers"));
        adapterCategoryShowDetailsModals.add(new AdapterCategoryShowDetailsModal("4","https://www.lenni.fr/wp-content/uploads/2015/12/Nike-sneackers-1.jpg","product4","300","sneakers"));

        adapterCategoryShowDetailsModals.add(new AdapterCategoryShowDetailsModal("5","https://www.lenni.fr/wp-content/uploads/2015/12/Nike-sneackers-1.jpg","product5","300","sneakers"));

        adapterCategoryShowDetailsModals.add(new AdapterCategoryShowDetailsModal("6","https://www.lenni.fr/wp-content/uploads/2015/12/Nike-sneackers-1.jpg","product6","300","sneakers"));
       categoryShowDetailsRecyclerView.setHasFixedSize(true);
        categoryShowDetailsRecyclerView.setAdapter(adapterCategoryShowDetails);





    }
}