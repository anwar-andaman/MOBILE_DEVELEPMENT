package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doOperation(int opType)
    {
        TextView t = (TextView)findViewById(R.id.result);
        Integer n1 = Integer.parseInt(((EditText)findViewById(R.id.num1)).getText().toString());
        Integer n2 = Integer.parseInt(((EditText)findViewById(R.id.num2)).getText().toString());
        Integer result=0;
        //result=0;
        switch(opType)
        {
            case 1: result=n1+n2;
                   break;
            case 2: result=n1-n2;
                    break;
            case 3: result=n1*n2;
                    break;
            case 4: result=n1/n2;
                     break;
        }
        t.setText("Result: " + result.toString());
    }
    public void plusClick(View view)
    {

        doOperation(1);
    }

    public void minusClick(View view)
    {
        doOperation(2);
    }

    public void mulClick(View view)
    {
        doOperation(3);
    }

    public void divClick(View view)
    {
        doOperation(4);
    }
}