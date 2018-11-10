package com.example.alex_.semana6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IoActivity  extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla);

        final TextView tvPantalla = (TextView) findViewById(R.id.tvPantalla);

        tvPantalla.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN: tvPantalla.setText("Has activado el TOUCH");
                    break;
                    case MotionEvent.ACTION_MOVE: tvPantalla.setText("Has realizado un movimiento con el TOUCH");
                    break;
                    case MotionEvent.ACTION_UP: tvPantalla.setText("Has terminado con el TOUCH");
                    break;
                }

                return true;
            }
        });

        final Button btListaSensores = (Button) findViewById(R.id.btListaSensores);
        btListaSensores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                lanzarLista();
            }
        });

        final Button btDatosSensores = (Button) findViewById(R.id.btDatosSensores);
        btDatosSensores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                lanzarDatos();
            }
        });

    }

    public void lanzarLista(){
        Intent intencion= new Intent(this, ListaSensores.class);
        startActivity(intencion);
    }

    public void lanzarDatos(){
        Intent intencion = new Intent(this, DatosSensores.class);
        startActivity(intencion);
    }
}
