package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

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
        Intent n = new Intent(getApplicationContext(), Activity2.class);
        n.putExtra("name",T1.getText().toString());
        n.putExtra("Rname",T2.getText().toString());
        startActivity(n);
    }
}