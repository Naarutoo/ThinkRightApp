package com.example.thinkright;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MeditationAdapter extends RecyclerView.Adapter<HolderHome> {
 private   ArrayList<MeditationModel> typelist;
 private   itemClickListner  click;


    public MeditationAdapter(ArrayList<MeditationModel> typelist,itemClickListner itemClickListner) {
        this.typelist = typelist;
        this.click = itemClickListner;

    }

    @NonNull

    @Override
    public HolderHome onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view1,parent,false);
        return new HolderHome(view,click);
    }

    @Override
    public void onBindViewHolder(@NonNull  HolderHome holder, int position) {
     MeditationModel meditationModel = typelist.get(position);
     holder.SetData(meditationModel);
    }

    @Override
    public int getItemCount() {
        return typelist.size();
    }
}
