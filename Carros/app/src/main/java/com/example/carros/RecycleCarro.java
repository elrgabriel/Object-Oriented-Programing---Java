package com.example.carros;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

        View v = LayoutInflater.from(ctx).inflate(R.layout.itemcarro,parent,false);
        return new RecycleCarro.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleCarro.ViewHolder holder, int position) {
        Carro carro = stand.get(position);
        holder.editid.setText(String.valueOf(carro.getId()));
        holder.editmodelo.setText(carro.getModelo());

    }

    @Override
    public int getItemCount() {
        return stand.size();
    }
}
