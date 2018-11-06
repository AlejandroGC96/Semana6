package com.example.alex_.semana6;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class Menu extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actionbar);

    }


    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // action with ID action_refresh was selected
            case R.id.action_refresh:
                Toast.makeText(this, "Refresh selected", Toast.LENGTH_SHORT)
                        .show();
                break;
            // action with ID action_settings was selected
            case R.id.action_settings:
                Toast.makeText(this, "Settings selected", Toast.LENGTH_SHORT)
                        .show();
                break;
            case R.id.action_inicio:
                Intent actionBar = new Intent(Menu.this, com.example.alex_.semana6.MainActivity.class);
                startActivity(actionBar);
                break;

            case R.id.action_media:

                Intent media = new Intent(Menu.this, com.example.alex_.semana6.Mmedia.class);
                startActivity(media);

            default:
                break;
        }

        return true;
    }

}
