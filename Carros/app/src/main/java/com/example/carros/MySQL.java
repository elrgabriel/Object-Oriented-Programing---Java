package com.example.carros;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MySQL extends SQLiteOpenHelper {
    public static final String CARROS = "carros";
    public static final String ID = "id";
    public static final String MODELO = "modelo";
    public static final String CATEGORIA = "categoria";
    public static final String FOTO = "foto";
    Context ctx;
    public static final String DATABASE = "Carros.sql";

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
}
