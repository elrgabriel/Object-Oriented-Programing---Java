package com.example.carros;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    public static final int CANAL_FOTO = 1;
    RecycleCarro adpt;
    RecyclerView recycleView;
    public int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycleView = findViewById(R.id.recycle_carro_main);
        adpt = new RecycleCarro(MainActivity.this,App.stand);
        adpt.setOnSacaFotoListener(new IOnSacaFoto() {
            @Override
            public void sacaFoto(int posicao) {
                pos = posicao;
                Intent it = new Intent(Intent.ACTION_GET_CONTENT);
                it.setType("image/*");
                startActivityForResult(it,CANAL_FOTO);
            }
        });
        recycleView.setAdapter(adpt);
        recycleView.setLayoutManager(new LinearLayoutManager(this));


    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CANAL_FOTO) {
            Uri uri = Uri.parse(data.getData().toString());
            try {
                Bitmap bmp = MediaStore.Images.Media.getBitmap(getContentResolver(),uri);
                App.stand.get(pos).setFoto(Carro.bitmapToArray(bmp));
                adpt.notifyDataSetChanged();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}