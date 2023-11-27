package com.example.registration;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitForm(View Vw)
    {
        EditText T1, T2;
        T1 = findViewById(R.id.txtName);
        T1.getText().toString().equals("");

        T2 = findViewById(R.id.txtRelationName);
        SharedPreferences SP = getSharedPreferences("MySP",MODE_PRIVATE);
        SharedPreferences.Editor SPEdit = getSharedPreferences("MySP",MODE_PRIVATE).edit();
        SPEdit.putString("name",T1.getText().toString());
        SPEdit.putString("fName",T2.getText().toString());
        SPEdit.commit();
        SPEdit.apply();

        Intent n = new Intent(getApplicationContext(), Activity2.class);
        //n.putExtra("name",T1.getText().toString());
        //n.putExtra("Rname",T2.getText().toString());
        startActivity(n);
    }
}