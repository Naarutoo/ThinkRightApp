package com.example.thinkright;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MasterAdapter extends RecyclerView.Adapter<HolderMaster> {
    ArrayList<MasterModel>masterList;

    public MasterAdapter(ArrayList<MasterModel> masterList) {
        this.masterList = masterList;
    }

    @NonNull
    @Override
    public HolderMaster onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view3 = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view2,parent,false);
        return new HolderMaster(view3);
    }

    @Override
    public void onBindViewHolder(@NonNull  HolderMaster holder, int position) {
MasterModel masterModel = masterList.get(position);
holder.setData2(masterModel);
    }

    @Override
    public int getItemCount() {
        return masterList.size();
    }
}
