package com.rk.plants;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Plants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plants);

    }

    public void DetailProduct(View view) {
        Intent intent = new Intent(Plants.this, DetailProduct.class);
        startActivity(intent);
    }

    public void Cart(View view) {
        Intent intent = new Intent(Plants.this, Cart.class);
        startActivity(intent);
    }

    public void Home(View view) {
        Intent intent = new Intent(Plants.this, Home.class);
        startActivity(intent);
    }

    public void Search(View view) {
        Intent intent = new Intent(Plants.this, Search.class);
        startActivity(intent);
    }

    public void Logout(View view) {
        Intent intent = new Intent(Plants.this, Login.class);
        startActivity(intent);
    }
}