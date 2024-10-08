package com.oci.presensi.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.oci.presensi.R;
import com.oci.presensi.helper.DataHelper;
import com.oci.presensi.model.ModelAbsensiFetch;

import java.util.List;

public class AdapterDataRekapAbsensiDetail extends RecyclerView.Adapter<AdapterDataRekapAbsensiDetail.ViewHolder> {
    private final List<ModelAbsensiFetch> itemList;
    private final DataHelper dataHelper;

    public AdapterDataRekapAbsensiDetail(List<ModelAbsensiFetch> itemList, DataHelper dataHelper) {
        this.itemList = itemList;
        this.dataHelper = dataHelper;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_absensi_harian_admin, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ModelAbsensiFetch absensi = itemList.get(position);
        holder.nama.setText(dataHelper.getNamaUser(absensi.getUserId()));
        holder.jamDtg.setText(absensi.getDatangTimestamp() != null ? absensi.getDatangTimestamp() : "Belum hadir");
        holder.jamPlg.setText(absensi.getPulangTimestamp() != null ? absensi.getPulangTimestamp() : "Belum pulang");
    }

    @Override
    public int getItemCount() {
        return itemList != null ? itemList.size() : 0;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView nama;
        private final TextView jamDtg;
        private final TextView jamPlg;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.nama);
            jamDtg = itemView.findViewById(R.id.jamDatang);
            jamPlg = itemView.findViewById(R.id.jamPulang);
        }
    }
}