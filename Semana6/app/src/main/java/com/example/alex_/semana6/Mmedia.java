package com.example.alex_.semana6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class Mmedia extends AppCompatActivity {



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mmedia);



        final Button boton1 = (Button)findViewById(R.id.button3);
        final Button boton2 = (Button)findViewById(R.id.button4);
        final Button boton3 = (Button)findViewById(R.id.button5);
        final Button boton4 = (Button)findViewById(R.id.button10);
        final Button boton5 = (Button)findViewById(R.id.button11);

        boton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent audio = new Intent(Mmedia.this, Audio.class);
                startActivity(audio);
            }
        });

               boton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent video = new Intent(Mmedia.this, Video.class);
                startActivity(video);
            }
        });

        boton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent animacion = new Intent(Mmedia.this, Animacion.class);
                startActivity(animacion);
            }
        });
        boton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent YT = new Intent(Mmedia.this, VideoYT.class);
                startActivity(YT);
            }
        });

       boton5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent MP4 = new Intent(Mmedia.this, VideoMP4.class);
                startActivity(MP4);
            }
        });


    }

    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
}
