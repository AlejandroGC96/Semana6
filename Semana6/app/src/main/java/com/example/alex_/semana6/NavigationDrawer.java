package com.example.alex_.semana6;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import pl.droidsonroids.gif.GifDrawable;

public class NavigationDrawer extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        final TextView texto = (TextView)findViewById(R.id.textoinformacionship);
        final VideoView video = (VideoView)findViewById(R.id.videoView2);
        String uriPath = "android.resource://"+getPackageName()+"/"+R.raw.xwing;
        Uri uri = Uri.parse(uriPath);
        video.setVideoURI(uri);




        int id = item.getItemId();

        if (id == R.id.nav_xwing) {

            video.setVisibility(View.VISIBLE);
            texto.setText("El caza estelar T-65B Ala-X fue una nave de un solo asiento fabricado por la Corporación Incom " +
                    "y utilizada por la Alianza para Restaurar la República durante la Guerra Civil Galáctica." +
                    " Reconocido por su velocidad y maniobrabilidad en la batalla, " +
                    "se convirtió en el principal caza estelar del Cuerpo de Cazas Estelares de la Alianza Rebelde ");
            video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                public void onPrepared(MediaPlayer arg0) {

                    video.start();
                    arg0.setLooping(true);//Loop

                }
            });
        } else if (id == R.id.nav_ywing) {
            video.setVisibility(View.VISIBLE);
            texto.setText("El caza estelar BTL Ala-Y fue una serie de caza estelares-bombarderos multifunciones fabricado por Fabricaciones Koensayr. " +
                    "Entre los modelos notables estaban el caza estelar de asalto/bombardero BTL-A4 Ala-Y para un solo piloto y el BTL-S3 de dos asientos, " +
                    "çque tenía espacio para un artillero o un pasajero." );
            uriPath = "android.resource://"+getPackageName()+"/"+R.raw.ywing;
            uri = Uri.parse(uriPath);
            video.setVideoURI(uri);
            video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                public void onPrepared(MediaPlayer arg0) {

                    video.start();
                    arg0.setLooping(true);//Loop

                }
            });


        } else if (id == R.id.nav_awing) {

            video.setVisibility(View.VISIBLE);
            texto.setText("El Interceptor RZ-1 Ala-A, también conocido como el caza estelar RZ-1 Ala-A, era un caza estelar en forma de cuña fabricado por Sistemas de Ingeniería Kuat," +
                    " que se inspiró en el diseño de los cazas estelares de la República usados durante las Guerras Clon. " +
                    "Basado en el prototipo R-22 original, el movimiento de la Rebelión temprana adoptó al caza para usarlo contra el Imperio Galáctico, " +
                    "dejando que estos, llamados RZ-1s, viesen acción durante la Era Imperial y la Guerra Civil Galáctica. La variante actualizada RZ-2 reemplazaría a la RZ-1 después de la Batalla de Endor," +
                    " y vería su uso treinta años después durante el conflicto entre la Resistencia y la Primera Orden. " );
            uriPath = "android.resource://"+getPackageName()+"/"+R.raw.awing;
            uri = Uri.parse(uriPath);
            video.setVideoURI(uri);
            video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                public void onPrepared(MediaPlayer arg0) {

                    video.start();
                    arg0.setLooping(true);//Loop

                }
            });


        } else if (id == R.id.nav_falcon) {

            video.setVisibility(View.VISIBLE);
            texto.setText("El Carguero ligero YT-1300, también conocido como carguero Corelliano YT-1300, " +
                    "era un tipo de carguero ligero fabricado por la Corporación de Ingeniería Corelliana" +
                    " que fue utilizado en la galaxia durante los días finales de la República Galáctica y el reinado del Imperio Galáctico. " +
                    "El Halcón Milenario, una nave de contrabando que se convirtió en parte de la Flota de la Alianza Rebelde, era un YT-1300 de la variante YT-1300f. " );
            uriPath = "android.resource://"+getPackageName()+"/"+R.raw.falcon;
            uri = Uri.parse(uriPath);
            video.setVideoURI(uri);
            video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                public void onPrepared(MediaPlayer arg0) {

                    video.start();
                    arg0.setLooping(true);//Loop

                }
            });

        } else if (id == R.id.nav_fighter) {

            video.setVisibility(View.VISIBLE);
            texto.setText("El Caza estelar de superioridad espacial TIE/LN (alternativamente llamada TIE/ln o simplemente TIE/LN) " +
                    "comúnmente conocida como el Caza TIE era la caza estelar característica del Imperio Galáctico y el símbolo de facto de la superioridad espacial del Imperio. " +
                    "Instantáneamente reconocible por el rugido de sus motores, el TIE/LN exudaba el poder " +
                    "y prestigio Imperial, siendo usada a través de la galaxia durante toda la existencia del Imperio. " );
            uriPath = "android.resource://"+getPackageName()+"/"+R.raw.fighter;
            uri = Uri.parse(uriPath);
            video.setVideoURI(uri);
            video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                public void onPrepared(MediaPlayer arg0) {

                    video.start();
                    arg0.setLooping(true);//Loop

                }
            });

        } else if (id == R.id.nav_avanced) {

            video.setVisibility(View.VISIBLE);
            texto.setText("El TIE Avanzado x1, o TIE/av, fue un prototipo de caza estelar avanzado que formaba parte de la Línea TIE fabricado por Sistemas de Flotas Sienar. " );
            uriPath = "android.resource://"+getPackageName()+"/"+R.raw.avanz;
            uri = Uri.parse(uriPath);
            video.setVideoURI(uri);
            video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                public void onPrepared(MediaPlayer arg0) {

                    video.start();
                    arg0.setLooping(true);//Loop

                }
            });

        }else if(id == R.id.nav_lanzadera){

            video.setVisibility(View.VISIBLE);
            texto.setText("La Lanzadera T-4a clase Lambda, también conocida como la Imperial Lambda, Transporte Imperial o Lanzadera Imperial," +
                    " era un transporte multipropósito con un diseño de lámina triangular utilizado por el Imperio Galáctico durante la Guerra Civil Galáctica, " +
                    "y se consideraba una elegante salida de los estándares de ingeniería imperial. Las lanzaderas a menudo eran utilizados por altos oficiales imperiales y " +
                    "dignatarios como Darth Vader y el Emperador Sheev Palpatine, pero se los encontraba más comúnmente transportando soldados de asalto o cargamento.  " );
            uriPath = "android.resource://"+getPackageName()+"/"+R.raw.lambda;
            uri = Uri.parse(uriPath);
            video.setVideoURI(uri);
            video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                public void onPrepared(MediaPlayer arg0) {

                    video.start();
                    arg0.setLooping(true);//Loop

                }
            });

        }else if(id == R.id.nav_interceptor) {

            video.setVisibility(View.VISIBLE);
            texto.setText("El Interceptor TIE/IN, también conocido como Interceptor TIE, era un tipo de caza TIE utilizado por el Imperio Galáctico, " +
                    "especialmente durante la Batalla de Endor. Fue identificable por la adición de cuatro paneles en forma de flecha con cañones láser. " );
            uriPath = "android.resource://"+getPackageName()+"/"+R.raw.interceptor;
            uri = Uri.parse(uriPath);
            video.setVideoURI(uri);
            video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                public void onPrepared(MediaPlayer arg0) {

                    video.start();
                    arg0.setLooping(true);//Loop

                }
            });

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
