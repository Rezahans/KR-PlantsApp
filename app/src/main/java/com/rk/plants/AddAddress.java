package com.rk.plants;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class AddAddress extends AppCompatActivity {

    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addaddress);

        btnSave = findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AddAddress.this, "Added New Address",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AddAddress.this, Address.class);
                startActivity(intent);
            }
        });

    }

    public void Address(View view) {
        Intent intent = new Intent(AddAddress.this, Address.class);
        startActivity(intent);
    }
}
