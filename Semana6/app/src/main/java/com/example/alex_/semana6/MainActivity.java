package com.example.alex_.semana6;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button boton1 = (Button)findViewById(R.id.button);
        final Button boton2 = (Button)findViewById(R.id.button2);
        final Button btIO = (Button) findViewById(R.id.btIO);
        boton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent actionBar = new Intent(MainActivity.this, com.example.alex_.semana6.Menu.class);
                startActivity(actionBar);
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent mmedia = new Intent(MainActivity.this, Mmedia.class);
                startActivity(mmedia);
            }
        });

        btIO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                lanzarIO();
            }
        });


    }

    public void lanzarIO(){
        Intent intencion= new Intent(this, IoActivity.class);
        startActivity(intencion);
    }


}
