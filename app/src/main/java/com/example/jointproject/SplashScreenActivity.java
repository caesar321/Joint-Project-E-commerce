package com.example.jointproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class SplashScreenActivity extends AppCompatActivity {
    ViewPager2 viewPager;
    ArrayList<viewPagerModal> modal;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        viewPager = findViewById(R.id.viewPager);
        fab = findViewById(R.id.fab);
        int[] images ={R.drawable.trollz,R.drawable.order,R.drawable.easypayment};
        String[] headings ={"Connect","Order ", "Payment"};
        String[]description = {getString(R.string.string_des1),"Browse your Orders in a fun and interactive way","Payment is easier,faster and Reliable"};

        modal= new ArrayList<>();
        for (int i=0;i<images.length;i++){
            viewPagerModal myViewPager = new viewPagerModal(images[i],headings[i],description[i]);
            modal.add(myViewPager);

        }
        viewPagerAdapter viewPagerAdapter = new viewPagerAdapter(modal);
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setClipToPadding(false);
        viewPager.setClipChildren(false);
        viewPager.setOffscreenPageLimit(2);
        viewPager.getChildAt(0).setOverScrollMode(View.OVER_SCROLL_NEVER);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SplashScreenActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}