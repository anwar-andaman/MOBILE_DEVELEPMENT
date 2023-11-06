package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Validate(View view)
    {
        RadioButton local = findViewById(R.id.radLocal);
        RadioButton cloud = findViewById(R.id.radioCloud);
        CheckBox chkDB = findViewById(R.id.chkDB);
        CheckBox chkWeb = findViewById(R.id.chkWeb);
        EditText name = findViewById(R.id.txtName);
        Boolean ValidateFlag = false;
        if (name.getText().toString().equals(""))
        {
            Toast.makeText(MainActivity.this,"Name must be entered",Toast.LENGTH_SHORT).show();

        }
        else if(local.isChecked()==false && cloud.isChecked()==false)
        {
            Toast.makeText(MainActivity.this,"Please select Service Location",Toast.LENGTH_SHORT).show();

        }
        else if (chkWeb.isChecked()==false && chkDB.isChecked()==false)
        {
            Toast.makeText(MainActivity.this,"Please Please select atleast one service",Toast.LENGTH_SHORT).show();

        }
        else
        {
            Toast.makeText(MainActivity.this,"Form Validated and Submitted Successfully",Toast.LENGTH_SHORT).show();

        }

    }
}