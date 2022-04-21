package com.example.listaproduktow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ProductDataBase db = ProductDataBase.getDatabase(getApplicationContext());
        db.productDao().insertProduct(new Product(50,"klocki"));
    }
}