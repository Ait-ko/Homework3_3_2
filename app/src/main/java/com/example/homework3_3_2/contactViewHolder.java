package com.example.homework3_3_2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class contactViewHolder extends RecyclerView.ViewHolder {
    private TextView tv_name;
    public contactViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_name= itemView.findViewById(R.id.tv_name);

    }
    public void onBind (String contactName){
        tv_name.setText(contactName);
    }

}
