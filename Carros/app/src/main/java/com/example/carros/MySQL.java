package com.example.carros;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MySQL extends SQLiteOpenHelper {
    public static final String CARROS = "carros";
    public static final String ID = "id";
    public static final String MODELO = "modelo";
    public static final String CATEGORIA = "categoria";
    public static final String FOTO = "foto";
    Context ctx;
    public static final String DATABASE = "Carros.db";

    public MySQL(@Nullable Context context) {
        super(context, DATABASE,null, 1);
        ctx = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE " + CARROS + " ( " +
                "    " + ID + "        INTEGER PRIMARY KEY, " +
                "    " + MODELO + "    TEXT(50), " +
                "    " + CATEGORIA + " TEXT(50), " +
                "    " + FOTO + "      BLOB " +
                ");";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "Drop table if exists " + CARROS + " ; ";
        db.execSQL(sql);
        onCreate(db);

    }

    public long inserirCarro (Carro c){
        long resp = 0;
        SQLiteDatabase db = getWritableDatabase();
        try{

            db.beginTransaction();
            ContentValues cv = new ContentValues();
            cv.put(ID, c.getId());
            cv.put(MODELO,c.getModelo());
            cv.put(CATEGORIA,c.getCategoria());
            cv.put(FOTO,c.getFoto());
            resp = db.insert(CARROS,null,cv );
            db.setTransactionSuccessful();
            db.endTransaction();
        }catch(SQLException erro){
            Toast.makeText(ctx,erro.getMessage(),Toast.LENGTH_LONG).show();
            db.endTransaction();
        }
        db.close();
        return resp;
    }

    public List<Carro> carregaLista(){
        List<Carro> carros = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        String sql = "select * from " + CARROS + ";";
        Cursor cur = db.rawQuery(sql,null);
        if (cur.getCount() > 0) {
            cur.moveToFirst();
            do{
                carros.add(new Carro(cur.getInt(0),cur.getString(1),cur.getString(2),cur.getBlob(3)));
            }while(cur.moveToNext());
        }
        return carros;
    }

}
