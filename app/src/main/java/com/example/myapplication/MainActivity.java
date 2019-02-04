package com.example.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    public final static String TAG = "radio clicked";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void onRadioButtonClick(View view) {
        EditText usDollar = findViewById(R.id.usDollar);
        EditText bitcoin = findViewById(R.id.bitcoin);
        RadioButton bitcoinRb = findViewById(R.id.btcRb);
        double usd = Double.parseDouble( usDollar.getText().toString() );
        double btc = usd * 0.00029;
        bitcoin.setText(Double.toString(btc));
        bitcoinRb.setChecked(false);
    }

    public void onRadioButton2Click(View view) {
        EditText usDollar = findViewById(R.id.usDollar);
        EditText bitcoin = findViewById(R.id.bitcoin);
        RadioButton usRb = findViewById(R.id.usRb);
        double btc  = Double.parseDouble( bitcoin.getText().toString() );
        double usd = btc * 3406.99;
        usDollar.setText(Double.toString(usd));
        usRb.setChecked(false);
    }

    public void addRadioListener() {
        RadioButton rb = findViewById(R.id.usRb);
        rb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("hi", "hey");
            }
        });
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
}
