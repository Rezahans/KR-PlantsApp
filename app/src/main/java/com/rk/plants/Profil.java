package com.rk.plants;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class Profil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
    }

    public void Home(View view) {
        Intent intent = new Intent(Profil.this, Home.class);
        startActivity(intent);
    }

    public void Name(View view) {
        Intent intent = new Intent(Profil.this, Name.class);
        startActivity(intent);
    }

    public void Phone(View view) {
        Intent intent = new Intent(Profil.this, Phone.class);
        startActivity(intent);
    }

    public void Email(View view) {
        Intent intent = new Intent(Profil.this, Email.class);
        startActivity(intent);
    }

    public void Pass(View view) {
        Intent intent = new Intent(Profil.this, Pass.class);
        startActivity(intent);
    }

    public void Address(View view) {
        Intent intent = new Intent(Profil.this, Address.class);
        startActivity(intent);

    }

    public void Logout(View view) {
        Intent intent = new Intent(Profil.this, Login.class);
        startActivity(intent);
    }
}
