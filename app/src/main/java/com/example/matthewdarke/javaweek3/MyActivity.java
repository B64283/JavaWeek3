/*
Matthew Darke
Java Week 3
term 1410

 */




package com.example.matthewdarke.javaweek3;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
//import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;

import java.util.ArrayList;
import java.util.Arrays;


public class MyActivity extends Activity {

    Spinner giftSpinner;
    ArrayAdapter<String>giftAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

//set up spinner
        giftSpinner = (Spinner) findViewById(R.id.giftsSpinner);

//create an Array list using String
        ArrayList<String>giftsList = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.spiritual_gifts_array)));

// Create an ArrayAdapter using the string array and a default spinner layout

        giftAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,giftsList);

// Apply the adapter to the spinner
        giftSpinner.setAdapter(giftAdapter);

    }



    /*public class SpinnerActivity extends Activity implements OnItemSelectedListener {


        public void onItemSelected(AdapterView<?> parent, View view,
                                   int pos, long id) {
            // An item was selected. You can retrieve the selected item using
            parent.getItemAtPosition(pos);


            Spinner spinner = (Spinner) findViewById(R.id.spinner);
            spinner.setOnItemSelectedListener(this);

        }

        public void onNothingSelected(AdapterView<?> parent) {
            // Another interface callback
        }
    }*/


















    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
