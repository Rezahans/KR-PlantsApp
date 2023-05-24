package com.rk.plants;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Order extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }
    public void Cart(View view) {
        Intent intent = new Intent(Order.this, Cart.class);
        startActivity(intent);
    }

    public void Card(View view) {
        Intent intent = new Intent(Order.this, Card.class);
        startActivity(intent);
    }

    public void Pay(View view) {
        Intent intent = new Intent(Order.this, Pay.class);
        startActivity(intent);
    }
}
