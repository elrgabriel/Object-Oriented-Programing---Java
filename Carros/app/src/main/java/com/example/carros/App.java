package com.example.carros;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class App extends Application {
   public static List<Carro> stand = new ArrayList<>();
    public static Context ctx;
    public static final String TAG = "XPTO";
    @Override
    public void onCreate() {
        super.onCreate();
        ctx = getApplicationContext();
        Log.i(TAG,"App Created");
        MySQL mysql = new MySQL(ctx);
        //mysql.inserirCarro(new Carro(1,"Ford Fiesta","Utilitário",new byte[]{}));
       // mysql.inserirCarro(new Carro(2,"Ferrari","Desportivo",new byte[]{}));
       // criarLista();
        App.stand = mysql.carregaLista();


        for(Carro c : stand)Log.i(TAG,c.toString());
    }

    void criarLista(){
        stand.add(new Carro(1,"Ford Fiesta","Utilitário",new byte[]{}));
        stand.add(new Carro(2,"Ferrari","Desportivo",new byte[]{}));
        stand.add(new Carro(3,"Volkswagen","Luxo",new byte[]{}));
        stand.add(new Carro(4,"Mustang","Desportivo",new byte[]{}));
        stand.add(new Carro(5,"BMW","Utilitário",new byte[]{}));
    }

}
