package com.example.recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PaysAdapter paysAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Pays> paysList = new ArrayList<>();
       for (int i=0 ;i<4;i++){
           paysList.add(new Pays("Palestine","Al_Quds"));
           paysList.add(new Pays("Maroc","Rabat"));
           paysList.add(new Pays("Egypt","Cairo"));
           paysList.add(new Pays("Qatar","Doha"));
           paysList.add(new Pays("Algeria","Algeria"));
       }

        paysAdapter = new PaysAdapter(paysList);
        recyclerView.setAdapter(paysAdapter);
    }
}