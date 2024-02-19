package com.example.carros;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public class Carro implements Parcelable {

    //region Campos
    private int id;
    private String modelo, categoria;
    private byte[] foto;
    // endregion

    //region Getters & Setters

    protected Carro(Parcel in) {
        id = in.readInt();
        modelo = in.readString();
        categoria = in.readString();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            foto = in.readBlob();
        }
    }

    public static final Creator<Carro> CREATOR = new Creator<Carro>() {
        @Override
        public Carro createFromParcel(Parcel in) {
            return new Carro(in);
        }

        @Override
        public Carro[] newArray(int size) {
            return new Carro[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    //endregion

    @NonNull
    @Override
    public String toString() {
        return String.format("%d %s %s",id,modelo,categoria);
    }

    //region Construtores

    public Carro(int id, String modelo, String categoria, byte[] foto) {
        this.id = id;
        this.modelo = modelo;
        this.categoria = categoria;
        this.foto = foto;
    }

    public Carro(int id, String modelo, String categoria, Bitmap bmp) {
        this.id = id;
        this.modelo = modelo;
        this.categoria = categoria;
        this.foto = bitmapToArray(bmp);
    }

    //endregion

    public static byte[] bitmapToArray(Bitmap bmp){
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.PNG,100,stream);
        return stream.toByteArray();
    }

    public static Bitmap arrayToBitmap(byte[] foto){

       return BitmapFactory.decodeByteArray(foto,0,foto.length);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(modelo);
        dest.writeString(categoria);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            dest.writeBlob(foto);
        }
    }
}
