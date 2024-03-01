package com.example.carros;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecycleCarro extends RecyclerView.Adapter<RecycleCarro.ViewHolder> {

    public Context ctx;
    public List<Carro> stand;
    private IOnSacaFoto listener;
    public void setOnSacaFotoListener(IOnSacaFoto lst){
        this.listener = lst;
    }

    public RecycleCarro(Context ctx, List<Carro> stand) {
        this.ctx = ctx;
        this.stand = stand;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        EditText editid, editmodelo;
        Spinner spincat;
        ImageView imgfoto;
        Button btdel, btupdate;

        public ViewHolder(@NonNull View v) {
            super(v);
            editid = v.findViewById(R.id.edit_idcarro_itemcarro);
            editmodelo = v.findViewById(R.id.edit_modelo_itemcarro);
            spincat = v.findViewById(R.id.spin_categoria_itemcarro);
            imgfoto = v.findViewById(R.id.img_foto_carro);
            btdel = v.findViewById(R.id.bt_delete_itemcarro);
            btupdate = v.findViewById(R.id.bt_update_itemcarro);
        }
    }

    @NonNull
    @Override
    public RecycleCarro.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(ctx).inflate(R.layout.itemcarro, parent, false);
        return new RecycleCarro.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleCarro.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Carro carro = stand.get(position);
        holder.editid.setText(String.valueOf(carro.getId()));
        holder.editmodelo.setText(carro.getModelo());
        ArrayAdapter<String> adptcats = new ArrayAdapter<>(
                ctx,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
                ctx.getResources().getStringArray(R.array.categorias)
        );
        adptcats.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        int poscur = adptcats.getPosition(carro.getCategoria());
        holder.spincat.setAdapter(adptcats);
        holder.spincat.setSelection(poscur);
        if (carro.getFoto().length > 0) {
            holder.imgfoto.setImageBitmap(Carro.arrayToBitmap(carro.getFoto()));
        }
        holder.imgfoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.sacaFoto(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return stand.size();
    }



}
