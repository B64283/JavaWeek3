/*
Matthew Darke
Java Week 3
term 1410

 */




package com.example.matthewdarke.javaweek3;

import java.util.ArrayList;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;



import java.util.Arrays;


public class MyActivity extends Activity {

// declare member variables
    final Context gContext = this;
    public Spinner giftSpinner;
    public ArrayList<Gifts>giftList;
    public ListView giftsListView;
    public TextView gSpinnerDetails;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);


  //Custom Class
        giftList = new ArrayList<Gifts>();
        giftList.add(new Gifts("Wisdom", "1 Corinthians 12-14, Acts 2:38,Psalm 11:10", 1));
        giftList.add(new Gifts("Knowledge", "1 Corinthians 12-14, Acts 2:38,Porverbs 18:15", 2));
        giftList.add(new Gifts("Faith", "Romans 10:17, Hebrews 11:6, Matthew 21;22", 3));
        giftList.add(new Gifts("Healing", "1 Peter 2:24, Psalm 103:3, Matthew 10:1", 4));
        giftList.add(new Gifts("Miracles", "John 4:48, Acts 19:11, Acts 3:6", 5));
        giftList.add(new Gifts("Prophecy", "1 Corinthians 14:1-40, 1 John 4:1, Matthew 7:21-23", 6));
        giftList.add(new Gifts("Discernment", "Hebrews 4:12, Matthew 10:16,", 7));
        giftList.add(new Gifts("Tongues", "1 Corinthians 14:2, Mark 16:17, Jude 1:20", 8));
        giftList.add(new Gifts("Interpretation of Tongues", "Acts 2:1-47, 1 Corinthians 14:13, 1 Corinthians 14:27", 9));





    //implement Ui elements
        giftsListView = (ListView)findViewById(R.id.gifts_List);
        giftSpinner = (Spinner)findViewById(R.id.giftsSpinner);
        gSpinnerDetails = (TextView)findViewById(R.id.spinnerTextView);





    //call adapter method here


    }






























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
