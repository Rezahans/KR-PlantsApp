package com.rk.plants;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AddCard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addcard);
    }

    public void Card(View view) {
        Intent intent = new Intent(AddCard.this, Card.class);
        startActivity(intent);
    }}