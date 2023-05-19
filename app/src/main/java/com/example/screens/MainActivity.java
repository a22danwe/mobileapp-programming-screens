package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText EditTextName;
    EditText EditTextAge;
    Button pressButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pressButton = findViewById(R.id.pressButton);
        EditTextName=findViewById(R.id.editTextName);
        EditTextAge=findViewById(R.id.editTextAge);
        pressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ShowActivity.class);
                intent.putExtra("Name", EditTextName.getText().toString()); // Optional
                intent.putExtra("Age", EditTextAge.getText().toString()); // Optional
                startActivity(intent);



            }
        });
    }
}
