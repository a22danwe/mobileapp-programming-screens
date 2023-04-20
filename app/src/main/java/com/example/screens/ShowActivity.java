package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

   TextView TextViewName;
   TextView TextViewAge;
   String name;
   String age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        TextViewName=findViewById(R.id.textViewName);
        TextViewAge=findViewById(R.id.textViewAge);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
             name = extras.getString("Name");
             age = extras.getString("Age");
            // Do something with the name and number
        }
        TextViewName.setText(name);
        TextViewAge.setText(String.valueOf(age));
    }
}