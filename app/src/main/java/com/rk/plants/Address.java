package com.rk.plants;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Address extends AppCompatActivity {

    ImageButton btnDelete;
    Button btnChoose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);

        btnDelete = findViewById(R.id.btnDelete);
        btnChoose = findViewById(R.id.btnChoose);

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Address.this, "Delete Success",Toast.LENGTH_SHORT).show();
            }
        });
        btnChoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Address.this, "Shipping Address Changed",Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void Profil(View view) {
        Intent intent = new Intent(Address.this, Profil.class);
        startActivity(intent);
    }

    public void AddAddress(View view) {
        Intent intent = new Intent(Address.this, AddAddress.class);
        startActivity(intent);
    }


    public void EditAddress(View view) {
        Intent intent = new Intent(Address.this, EditAddress.class);
        startActivity(intent);
    }
}