package com.rk.plants;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Pass extends AppCompatActivity {

    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass);

        btnSave = findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Pass.this, "Password Changed!",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Pass.this, Profil.class);
                startActivity(intent);
            }
        });
    }
    public void Profil(View view) {
        Intent intent = new Intent(Pass.this, Profil.class);
        startActivity(intent);
    }
}
