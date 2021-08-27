package com.example.thinkright;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HolderHome extends RecyclerView.ViewHolder {
    ImageView mIvMeditationType;
    TextView mTvMeditaionType;
    RelativeLayout mrelativeLayout1;
    itemClickListner itemClickListner;

    public HolderHome(@NonNull View itemView, itemClickListner click) {
        super(itemView);

        this.itemClickListner = click;
        initview();
    }

    private void initview() {
        mIvMeditationType = itemView.findViewById(R.id.ivMeditationType);
        mTvMeditaionType = itemView.findViewById(R.id.tvMeditationType);
        mrelativeLayout1 = itemView.findViewById(R.id.relativeLayout1);

    }

    public void SetData(MeditationModel meditationModel) {


        mIvMeditationType.setImageResource(meditationModel.getTypeImage());
        mTvMeditaionType.setText(meditationModel.getTypeText());
        mrelativeLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListner.onItemClicked(meditationModel);
            }
        });

    }

}
