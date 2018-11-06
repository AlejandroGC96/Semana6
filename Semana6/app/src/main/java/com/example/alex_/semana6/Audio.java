package com.example.alex_.semana6;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class Audio extends AppCompatActivity {

    int length;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.audio);

        final Button boton1 = (Button)findViewById(R.id.button6);
        final Button boton2 = (Button)findViewById(R.id.button7);
        final Button boton3 = (Button)findViewById(R.id.button8);
        final MediaPlayer mp = MediaPlayer.create(Audio.this, R.raw.megaman);

        boton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp.start();

            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp.seekTo(length);
                mp.start();

            }
        });
        boton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                mp.pause();
                length= mp.getCurrentPosition();

            }
        });

    }



    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
}
