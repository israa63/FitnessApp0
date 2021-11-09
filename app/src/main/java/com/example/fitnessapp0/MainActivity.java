package com.example.fitnessapp0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    public static final String Name="Name";
    public static final String Password="Password";
    public static final String Gender="Gender";



    private EditText editName;
    private EditText editpassword;
    private Spinner spinner;
    private SharedPreferences.Editor editor;
    private SharedPreferences pref;
    public static final String FLAG="FLAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editName= findViewById(R.id.editname);
        editpassword = findViewById(R.id.editpassword);
        spinner= findViewById(R.id.spinner);
        setupSharedPref();
        checkPref();
    }
    private void setupSharedPref() {
        pref= PreferenceManager.getDefaultSharedPreferences(this);
        editor=pref.edit();
    }

    private void checkPref() {
        boolean flag= pref.getBoolean(FLAG,false);
        if(flag)
        {
            String name= pref.getString(Name,"");


            int gender=pref.getInt(Gender,-1);

            editName.setText(name);

            spinner.setSelection(gender);

        }

    }




    public void btnonclicksave(View view) {
        Intent n= new Intent( this,SecondActivity.class);
        startActivity(n);

        String name=editName.getText().toString();
        String item =spinner.getSelectedItem().toString();

        int userChoice = spinner.getSelectedItemPosition();
        editor.putString(Name,name);
        editor.putInt(Gender,userChoice);
        editor.commit();
    }

}