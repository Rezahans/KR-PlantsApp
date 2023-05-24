package com.rk.plants;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Card extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
    }

    public void Success(View view) {
        Intent intent = new Intent(Card.this, Pay.class);
        startActivity(intent);
    }

    public void Order(View view) {
        Intent intent = new Intent(Card.this, Order.class);
        startActivity(intent);
    }

    public void AddCard(View view) {
        Intent intent = new Intent(Card.this, AddCard.class);
        startActivity(intent);
    }
}