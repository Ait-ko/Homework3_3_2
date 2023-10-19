package com.example.homework3_3_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> contactName = new ArrayList<>();
    private RecyclerView rv_contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        loadData();
    }

    private void loadData() {
        contactName.add("Лев");
        contactName.add("Тигр");
        contactName.add("Кот");
        contactName.add("Собака");
        contactName.add("попугай");
        contactName.add("Голубь");
        contactName.add("Пудиль");
        contactName.add("Волк");
        contactName.add("Цербер");
        contactName.add("Пигас");
        contactName.add("Гидра");
        contactName.add("Дракон");
        initAdapter();
    }
    private void initAdapter(){
        contactAdapter adapter = new contactAdapter(contactName);
        rv_contact.setAdapter(adapter);
    }

    private void initView() {
        rv_contact = findViewById(R.id.rv_activityMain);
    }
}