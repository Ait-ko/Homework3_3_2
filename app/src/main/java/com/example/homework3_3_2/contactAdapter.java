package com.example.homework3_3_2;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class contactAdapter extends RecyclerView.Adapter<contactViewHolder> {
    public contactAdapter(ArrayList<String> contactNameList) {
        this.contactNameList = contactNameList;
    }

    private ArrayList<String> contactNameList;

    @NonNull
    @Override
    public contactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new contactViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull contactViewHolder holder, int position) {
        holder.onBind(contactNameList.get(position));

    }

    @Override
    public int getItemCount() {
        return contactNameList.size();
    }
}
