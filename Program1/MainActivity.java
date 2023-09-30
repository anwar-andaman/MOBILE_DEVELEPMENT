package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText uid = findViewById(R.id.editTextText);
        EditText pwd = findViewById(R.id.editTextTextPassword);
        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (uid.getText().toString().equals("anwar") && pwd.getText().toString().equals("anwar123") )
                    Toast.makeText(MainActivity.this, "Successfully Logged in", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Login Failed. Try Again", Toast.LENGTH_SHORT).show();
            }
        });

    }




}