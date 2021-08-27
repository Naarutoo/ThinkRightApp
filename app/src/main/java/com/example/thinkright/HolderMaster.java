package com.example.thinkright;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HolderMaster extends RecyclerView.ViewHolder {
    ImageView mIvMaster;
    TextView mTvHeader,mTvDesc;
    public HolderMaster(@NonNull View itemView) {
        super(itemView);
        initview();
    }

    private void initview() {
        mIvMaster = itemView.findViewById(R.id.ivMaster);
        mTvHeader = itemView.findViewById(R.id.tvHeader);
        mTvDesc = itemView.findViewById(R.id.tvDesc);
    }
    public void setData2(MasterModel masterModel){
        mIvMaster.setImageResource(masterModel.getMasterImage());
        mTvHeader.setText(masterModel.getMasterHeader());
        mTvDesc.setText(masterModel.getMasterDesc());
    }
}
