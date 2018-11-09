package com.example.alex_.semana6;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoMP4 extends Activity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.videomp4);

        String path = "https://quackquackmp4.000webhostapp.com/Media/Boba.mp4";
        final VideoView myVideoView = (VideoView)findViewById(R.id.videoView4);
        myVideoView.setVideoURI(Uri.parse(path));
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(myVideoView);
        myVideoView.setMediaController(mediaController);
        myVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            public void onPrepared(MediaPlayer arg0) {

                myVideoView.start();
                arg0.setLooping(true);//Loop

            }
        });



    }
}
