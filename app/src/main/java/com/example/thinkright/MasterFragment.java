package com.example.thinkright;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MasterFragment extends Fragment {
    RecyclerView recyclerView2;
    ArrayList<MasterModel> masterlist = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view2 = inflater.inflate(R.layout.fragment_master, container, false);
        recyclerView2 = view2.findViewById(R.id.recyclerView2);
        buildList();
        setRecyclerView();


        return view2;
    }

    private void setRecyclerView() {
        MasterAdapter adapter = new MasterAdapter(masterlist);
        LinearLayoutManager manager = new LinearLayoutManager(this.getContext());
        recyclerView2.setLayoutManager(manager);
        recyclerView2.setAdapter(adapter);

    }

    private void buildList() {
        MasterModel masterModel1 = new MasterModel(R.drawable.shivani, "BK Shivani", "BK Shivanin is a globally renowned spiritual guide and mentor. The practical and logical solutions that ......Click for more");
        masterlist.add(masterModel1);
        MasterModel masterModel2 = new MasterModel(R.drawable.tyagi, "Tyagi Shrujo", "Kriya Yogi and disciple of paramhansa Yogananda,Tyagi Shrujo shares his extensive knowledge.....");
        masterlist.add(masterModel2);
        MasterModel masterModel3 = new MasterModel(R.drawable.diksha, "Diksha Lalwani", "Trained from the Sivananda school of yoga (Kerala & Uttarkashi),Diksha has been a meditaion .....");
        masterlist.add(masterModel3);
        MasterModel masterModel4 = new MasterModel(R.drawable.vidisha, "Vidisha Kaushal", "Vidisha Kaushal, a sound healing and life mastery expert takes you on a transformational journey....");
        masterlist.add(masterModel4);
    }

}