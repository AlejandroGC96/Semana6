package com.example.alex_.semana6;

import android.app.Activity;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;


public class DatosSensores extends Activity implements SensorEventListener {
    private SensorManager sensorManager = null;

    private Sensor sensorTemperatura = null;
    private Sensor sensorProximidad = null;
    private Sensor sensorLuz = null;
    private Sensor sensorAcelerometro = null;
    private Sensor sensorPresionAtm = null;
    private Sensor sensorHumedad = null;
    private Sensor sensorLinearAcc = null;
    private Sensor sensorStep = null;

    private TextView tvAcelerometro = null;
    private TextView tvPresionAtmosferica = null;
    private TextView tvLuz = null;
    private TextView tvProximidad = null;
    private TextView tvTemperatura = null;
    private TextView tvHumedad = null;
    private TextView tvAceleracion = null;
    private TextView tvStep = null;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datasensores);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

        sensorProximidad = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        sensorLuz = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
        sensorAcelerometro = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sensorTemperatura = sensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE);
        sensorPresionAtm = sensorManager.getDefaultSensor(Sensor.TYPE_PRESSURE);
        sensorHumedad = sensorManager.getDefaultSensor(Sensor.TYPE_RELATIVE_HUMIDITY);
        sensorLinearAcc = sensorManager.getDefaultSensor(Sensor.TYPE_LINEAR_ACCELERATION);
        sensorStep = sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);


        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> listaSensores = sensorManager.getSensorList(Sensor.TYPE_ALL);

        tvAcelerometro = (TextView) findViewById(R.id.tvAcelerometro);
        tvPresionAtmosferica = (TextView) findViewById(R.id.tvPresionAtmosferica);
        tvLuz = (TextView) findViewById(R.id.tvLuz);
        tvProximidad = (TextView) findViewById(R.id.tvProximidad);
        tvTemperatura = (TextView) findViewById(R.id.tvTemperatura);
        tvHumedad = (TextView) findViewById(R.id.tvHumedad);
        tvAceleracion = (TextView) findViewById(R.id.tvAceleracion);
        tvStep = (TextView) findViewById(R.id.tvStep);

        if(sensorAcelerometro == null){
            tvAcelerometro.setText("No hay sensor acelerometro");
        }
        else if(sensorPresionAtm == null){
            tvPresionAtmosferica.setText("No hay sensor de presion atmosferica");
        } else if(sensorLuz == null){
            tvLuz.setText("No hay sensor de luz");
        }else if(sensorProximidad == null){
            tvProximidad.setText("No hay sensor de proximidad");
        }else if(sensorTemperatura == null){
            tvTemperatura.setText("No hay sensor de temperatura");
        }else if(sensorHumedad == null){
            tvHumedad.setText("No hay sensor de proximidad");
        }else if(sensorStep == null){
            tvStep.setText("No hay sensor de contador de pasos");
        }else if(sensorLinearAcc == null){
            tvAceleracion.setText("No hay sensor de aceleracion lineal");
        }

        /*
       else if(sensorLuz == null){
            Toast.makeText(getApplicationContext(), "No hay sensor de luz", Toast.LENGTH_SHORT).show();}


        if(sensorProximidad == null){
            Toast.makeText(getApplicationContext(), "No hay sensor de proximidad", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getApplicationContext(), "Hay sensor de proximidad", Toast.LENGTH_SHORT).show();
            sensorManager.registerListener(this, sensorProximidad, SensorManager.SENSOR_DELAY_GAME);
        }


        if(sensorTemperatura == null){
            Toast.makeText(getApplicationContext(), "No hay sensor de temperatura ambiental", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(getApplicationContext(), "Hay sensor de temperatura ambiental", Toast.LENGTH_SHORT).show();
            sensorManager.registerListener(this, sensorTemperatura, SensorManager.SENSOR_DELAY_GAME);
        }

        */
    }
    // Obligatorio implementar
    @Override
    public void onAccuracyChanged(Sensor arg0, int arg1) {
    }

    // Obligatorio implementar
    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        synchronized (this){
            float[] data;
            float x, y, z;

            switch(sensorEvent.sensor.getType()){
                case Sensor.TYPE_ACCELEROMETER:
                    data = sensorEvent.values;
                    x = data[0];
                    y = data[1];
                    z = data[2];
                    tvAcelerometro.setText("x: " + x + "\ny: "+y + "\nz: "+z);
                    /* prueba added
                    float x1 = sensorEvent.values[0];
                    if(x1 < -5){
                        getWindow().getDecorView().setBackgroundColor(Color.BLUE);
                    }else if(x1 > -5){
                        getWindow().getDecorView().setBackgroundColor(Color.RED);
                    } */
                    break;
                case Sensor.TYPE_PRESSURE:
                    x=sensorPresionAtm.getPower();
                    tvPresionAtmosferica.setText("Presion Atmosferica: "+ x);
                    break;
                case Sensor.TYPE_LIGHT:
                    data = sensorEvent.values;
                    tvLuz.setText("Nivel de luz: "+ data[0]);
                    break;
                case Sensor.TYPE_PROXIMITY:
                    data = sensorEvent.values;
                    if(data[0]==0){
                        tvProximidad.setText("Hay algo delante del sensor...");
                    }
                    else{
                        tvProximidad.setText("No hay nada delante");
                    }
                    break;
                case Sensor.TYPE_AMBIENT_TEMPERATURE:
                    x= sensorTemperatura.getPower();
                    tvTemperatura.setText("Temperatura: " + x);
                    break;
                case Sensor.TYPE_RELATIVE_HUMIDITY:
                    x = sensorHumedad.getPower();
                    tvHumedad.setText("Nivel de humedad: 0" + x);
                    break;
                case Sensor.TYPE_LINEAR_ACCELERATION:
                    data = sensorEvent.values;
                    x = data[0];
                    y = data[1];
                    z = data[2];
                    tvAceleracion.setText("x:" + x + "\ny: "+y + "\nz: "+z);
                    break;
                case Sensor.TYPE_STEP_COUNTER:
                    data = sensorEvent.values;
                    x = data[0];
                    tvStep.setText("Número de pasos " + String.valueOf(sensorEvent.values[0]));
                    break;
            }
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_GAME);
        sensorManager.registerListener(this,sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY),SensorManager.SENSOR_DELAY_NORMAL);
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT), SensorManager.SENSOR_DELAY_NORMAL);
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_RELATIVE_HUMIDITY), SensorManager.SENSOR_DELAY_GAME);
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE), SensorManager.SENSOR_DELAY_GAME);
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_LINEAR_ACCELERATION), SensorManager.SENSOR_DELAY_GAME);
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER), SensorManager.SENSOR_DELAY_GAME);

    }

    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(this);
        super.onStop();
    }


}
