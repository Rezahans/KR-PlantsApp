package com.rk.plants;



import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DetailProduct extends AppCompatActivity {

    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailproduct);

        btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DetailProduct.this, "Product Added to Cart",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void plants(View view) {
        Intent intent = new Intent(DetailProduct.this, Plants.class);
        startActivity(intent);
    }
}

