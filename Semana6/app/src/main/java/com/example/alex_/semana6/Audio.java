package com.example.alex_.semana6;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class Audio extends AppCompatActivity {

    int length;
    MediaPlayer mp;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.audio);

        final Button boton1 = (Button)findViewById(R.id.button6);
        final Button boton2 = (Button)findViewById(R.id.button7);
        final Button boton3 = (Button)findViewById(R.id.button8);
       final ListView listView = (ListView) findViewById(R.id.list);
        mp = MediaPlayer.create(Audio.this, R.raw.megaman);

        String[] values = new String[] { "Mega man", "Sonic the Hedgehog"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int itemPosition     = position;

                String  itemValue    = (String) listView.getItemAtPosition(position);

                Toast.makeText(getApplicationContext(),
                        "Opcion :"+itemPosition+" " +itemValue , Toast.LENGTH_LONG).show();

                if(itemPosition==0){

                    mp = MediaPlayer.create(Audio.this, R.raw.megaman);

                }else {
                    mp = MediaPlayer.create(Audio.this, R.raw.sonic);
                }
            }



        });


        boton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                    mp.seekTo(0);
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
