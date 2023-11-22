package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PaysAdapter  extends  RecyclerView.Adapter<PaysAdapter.PaysViewHolder>{
    private List<Pays> paysListe;
    public PaysAdapter(List<Pays> paysListe){
        this.paysListe = paysListe;
    }
    public static class PaysViewHolder extends RecyclerView.ViewHolder{
        TextView textViewName , textViewCapital;
        public PaysViewHolder(@NonNull View itemView){
            super(itemView);
            textViewName = itemView.findViewById(R.id.textName);
            textViewCapital = itemView.findViewById(R.id.textCapital);
        }
    }
    @NonNull
    @Override
    public PaysViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_pays,parent,false);
        return new PaysViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PaysViewHolder holder, int position) {
        Pays pays = paysListe.get(position);
        holder.textViewName.setText(pays.getName());
        holder.textViewCapital.setText(pays.getCapital());
    }

    @Override
    public int getItemCount() {
        return paysListe.size();
    }
}
