package com.rk.plants;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageSlider imgSlider = findViewById(R.id.img_slider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.img_slideshow1,  ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.img_slideshow2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.img_slideshow3, ScaleTypes.FIT));

        imgSlider.setImageList(slideModels, ScaleTypes.FIT);
    }

    public void Cart(View view) {
        Intent intent = new Intent(Home.this, Cart.class);
        startActivity(intent);
    }

    public void Profil(View view) {
        Intent intent = new Intent(Home.this, Profil.class);
        startActivity(intent);
    }

    public void Plants(View view) {
        Intent intent = new Intent(Home.this, Plants.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(Home.this, Search.class);
        startActivity(intent);
    }

    public void Logout(View view) {
        Intent intent = new Intent(Home.this, Login.class);
        startActivity(intent);
    }

    public void DetailProduct(View view) {
        Intent intent = new Intent(Home.this, DetailProduct.class);
        startActivity(intent);
    }

}


