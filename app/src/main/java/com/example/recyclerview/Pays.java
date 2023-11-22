package com.example.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Pays {
    private String name;
    private String capital;
    public Pays(String name , String capital){
        this.name = name;
        this.capital = capital;
    }
    public String getName(){return name;}
    public String getCapital(){return capital;}
}
