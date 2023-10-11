package com.example.activityswitching;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.buttonSwitch);
        btn.setOnClickListener(new View.OnClickListener()
        {
            //@Override
            public void onClick(View v)
            {
                Intent n = new Intent(getApplicationContext(),Activity2.class);
                startActivity(n);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this, "onStart Invoked", Toast.LENGTH_SHORT).show();
        Log.i("ActivitySwitch","onStart invoked");
    }

    protected void onResume()
    {
        super.onResume();
        Toast.makeText(MainActivity.this, "onResume Invoked", Toast.LENGTH_SHORT).show();
        Log.i("ActivitySwitch","onResume invoked");
    }
    protected  void onPause()
    {
        super.onPause();
        Toast.makeText(MainActivity.this, "onPause Invoked", Toast.LENGTH_SHORT).show();
        Log.i("ActivitySwitch","onPause invoked");
    }

    protected void onStop()
    {
        super.onStop();
        Toast.makeText(MainActivity.this, "onStop Invoked", Toast.LENGTH_SHORT).show();
        Log.i("ActivitySwitch","onStop invoked");
    }

    protected void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(MainActivity.this, "onDestroy Invoked", Toast.LENGTH_SHORT).show();
        Log.i("ActivitySwitch","onDestroy invoked");
    }

}