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

public class Email extends AppCompatActivity {

    private Button btnSave;
    private TextView alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        btnSave = findViewById(R.id.btnSave);
        alertDialog = findViewById(R.id.alertDialog);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder (Email.this);

                builder.setCancelable(true);
                builder.setTitle("Edit Email?");
                builder.setMessage("This will change your email account.");

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Email.this, "Change Successfully",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Email.this, Profil.class);
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
        Intent intent = new Intent(Email.this, Profil.class);
        startActivity(intent);
    }
}
