package com.rk.plants;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Cart extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

    }

    public void Home(View view) {
        Intent intent = new Intent(Cart.this, Home.class);
        startActivity(intent);
    }

    public void DetailProduct(View view) {
        Intent intent = new Intent(Cart.this, DetailProduct.class);
        startActivity(intent);
    }

    public void Order(View view) {
        Intent intent = new Intent(Cart.this, Order.class);
        startActivity(intent);
    }
}