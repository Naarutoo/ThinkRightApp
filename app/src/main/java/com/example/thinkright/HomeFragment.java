package com.example.thinkright;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class HomeFragment extends Fragment implements itemClickListner {
    ArrayList<MeditationModel> typelist= new ArrayList<>();
    RecyclerView recyclerView1;
    RelativeLayout relativeLayout;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView1 = view.findViewById(R.id.recyclerView);

        buildData();
        setRecycleView();
        return view;
    }


    private void setRecycleView() {
        MeditationAdapter adapter = new MeditationAdapter(typelist,this);
        recyclerView1.setLayoutManager(new GridLayoutManager(this.getContext(), 2));
        recyclerView1.setAdapter(adapter);

    }

    private void buildData() {
        MeditationModel meditationModel1 = new MeditationModel(R.drawable.success, "Success");
        typelist.add(meditationModel1);
        MeditationModel meditationModel2 = new MeditationModel(R.drawable.happiness, "Happiness");
        typelist.add(meditationModel2);
        MeditationModel meditationModel3 = new MeditationModel(R.drawable.health, "Health");
        typelist.add(meditationModel3);
        MeditationModel meditationModel4 = new MeditationModel(R.drawable.focus, "Focus");
        typelist.add(meditationModel4);
        MeditationModel meditationModel5 = new MeditationModel(R.drawable.sleep, "Sleep");
        typelist.add(meditationModel5);
        MeditationModel meditationModel6 = new MeditationModel(R.drawable.relationship, "Relationship");
        typelist.add(meditationModel6);

    }




    @Override
    public void onItemClicked(MeditationModel model) {
        Intent intent = new Intent(HomeFragment.this.getContext(),VideoActivity.class);
        startActivity(intent);
    }
}