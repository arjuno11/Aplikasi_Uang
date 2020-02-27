package com.example.aplikasiuang;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.AdapterViewHolder> {
    private ArrayList<List> dataList;

    public Adapter(ArrayList<List> dataList) {
        this.dataList = dataList;
    }

    @Override
    public AdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list, parent, false);
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AdapterViewHolder holder, int position) {
        holder.txt_tgl.setText(dataList.get(position).getTanggal());
        holder.txt_pemasukan.setText(dataList.get(position).getPemasukan());
        holder.txt_pengeluaran.setText(dataList.get(position).getPengeluaran());
        holder.txt_hasil.setText(dataList.get(position).getHasil());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class AdapterViewHolder extends RecyclerView.ViewHolder{
        private TextView txt_tgl, txt_pemasukan, txt_pengeluaran, txt_hasil;

        public AdapterViewHolder(View itemView) {
            super(itemView);
            txt_tgl = (TextView) itemView.findViewById(R.id.txt_tgl);
            txt_pemasukan = (TextView) itemView.findViewById(R.id.txt_pemasukan);
            txt_pengeluaran = (TextView) itemView.findViewById(R.id.txt_pengeluaran);
            txt_hasil = (TextView) itemView.findViewById(R.id.txt_hasil);
        }
    }
}
