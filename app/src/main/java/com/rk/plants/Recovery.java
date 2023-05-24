package com.rk.plants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Recovery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recovery);
    }

    public void Login(View view) {
        Intent intent = new Intent(Recovery.this,Login.class);
        startActivity(intent);
    }
}