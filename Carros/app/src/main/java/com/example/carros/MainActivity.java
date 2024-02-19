package com.example.carros;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecycleCarro adpt;
    RecyclerView recycleView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycleView = findViewById(R.id.recycle_carro_main);
        adpt = new RecycleCarro(MainActivity.this,App.stand);
        recycleView.setAdapter(adpt);
        recycleView.setLayoutManager(new LinearLayoutManager(this));


    }
}