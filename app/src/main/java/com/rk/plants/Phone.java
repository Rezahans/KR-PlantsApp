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


public class Phone extends AppCompatActivity {

    private Button btnSave;
    private TextView alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);

        btnSave = findViewById(R.id.btnSave);
        alertDialog = findViewById(R.id.alertDialog);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder (Phone.this);

                builder.setCancelable(true);
                builder.setTitle("Edit Phone?");
                builder.setMessage("This will change your phone number.");

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Phone.this, "Change Successfully",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Phone.this, Profil.class);
                        startActivity(intent);
                    }
                });

                builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                builder.show();
            }
        });
    }

    public void Profil(View view) {
        Intent intent = new Intent(Phone.this, Profil.class);
        startActivity(intent);
    }
}
