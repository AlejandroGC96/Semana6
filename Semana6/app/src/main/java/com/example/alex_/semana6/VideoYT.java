package com.example.alex_.semana6;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;


public class VideoYT extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.videoyt);
    VideoView v = (VideoView) findViewById(R.id.videoView3);

    v.setVideoURI(Uri.parse("rtsp://v4.cache3.c.youtube.com/CjYLENy73wIaLQlW_ji2apr6AxMYDSANFEIJbXYtZ29vZ2xlSARSBXdhdGNoYOr_86Xm06e5UAw=/0/0/0/video.3gp"));

            v.setMediaController(new MediaController(this)); //sets MediaController in the video view

    // MediaController containing controls for a MediaPlayer

    v.requestFocus();//give focus to a specific view

    v.start();//starts the video

    }

}
