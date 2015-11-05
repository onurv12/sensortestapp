package com.onurv.sensortestapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button buttonGyroscope = (Button) findViewById(R.id.buttonGyroscope);
        Button buttonProximity = (Button) findViewById(R.id.buttonProximity);
        Button buttonAccelerometer = (Button) findViewById(R.id.buttonAccelerometer);
        Button buttonBarometer= (Button) findViewById(R.id.buttonBarometer);
        Button buttonAmbientLight = (Button) findViewById(R.id.buttonAmbientLight);
        Button buttonRotation = (Button) findViewById(R.id.buttonRotation);
        buttonProximity.setOnClickListener(this);
        buttonAccelerometer.setOnClickListener(this);
        buttonGyroscope.setOnClickListener(this);
        buttonBarometer.setOnClickListener(this);
        buttonAmbientLight.setOnClickListener(this);
        buttonRotation.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.buttonProximity:
                this.startActivity(new Intent(this, ProximityActivity.class));
                break;
            case R.id.buttonAccelerometer:
                this.startActivity(new Intent(this, AccelerometerActivity.class));
                break;
            case R.id.buttonGyroscope:
                this.startActivity(new Intent(this, GyroscopeActivity.class));
                break;
            case R.id.buttonBarometer:
                this.startActivity(new Intent(this, BarometerActivity.class));
                break;
            case R.id.buttonAmbientLight:
                this.startActivity(new Intent(this, AmbientLightActivity.class));
                break;
            case R.id.buttonRotation:
                this.startActivity(new Intent(this, RotationActivity.class));
                break;
        }
    }
}
