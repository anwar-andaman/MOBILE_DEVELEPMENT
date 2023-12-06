package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String name,Rname;
        TextView tName,tRname;
        setContentView(R.layout.activity_2);
        name = getIntent().getStringExtra("name");
        Rname = getIntent().getStringExtra("Rname");
        tName = findViewById(R.id.txtName);
        tRname = findViewById(R.id.txtRname);
        tName.setText("NAME: " + name);
        tRname.setText("FATHER'S NAME: " + Rname);
    }

    public void goBack(View vw)
    {
        super.finish();

    }
}