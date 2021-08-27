package com.example.thinkright;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {
VideoView vd,vd2,vd3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
   initview();
    vd.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video1);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vd);
        vd.setMediaController(mediaController);

        vd2.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video2);
        MediaController mediaController2 = new MediaController(this);
        mediaController.setAnchorView(vd2);
        vd2.setMediaController(mediaController2);

        vd3.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video3);
        MediaController mediaController3 = new MediaController(this);
        mediaController.setAnchorView(vd3);
        vd3.setMediaController(mediaController3);
    }

    private void initview() {
        vd = findViewById(R.id.video1);
        vd2 = findViewById(R.id.video2);
        vd3 = findViewById(R.id.video3);
    }
}