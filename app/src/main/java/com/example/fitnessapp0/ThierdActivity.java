package com.example.fitnessapp0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ThierdActivity extends AppCompatActivity {
    ListView  l;
    String tutorials[]
            = { "squat exercise", "Aerobic exercise",
            "resistance exercises", "Balance exercises",
            "Flexibility exercises" };
   // String mDescription[] = {"Facebook Description", "Whatsapp Description", "Twitter Description", "Instagram Description", "Youtube Description"};
   // int images[] = {R.drawable.facebook, R.drawable.whatsapp, R.drawable.twitter, R.drawable.instagram, R.drawable.youtube};
    // so our images and other things are set in array

    // now paste some images in drawable


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thierd);
        l = findViewById(R.id.list_view);
        ArrayAdapter<String> arr;
        arr
                = new ArrayAdapter<String>(
                this,
                R.layout.support_simple_spinner_dropdown_item,
                tutorials);
        l.setAdapter(arr);


    }
}