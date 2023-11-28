package com.example.toggleimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    int imgSource=1;
    int images[] ={R.drawable.usericon1, R.drawable.usericon};
    Button btn;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btntoggle);
        iv=findViewById(R.id.imgVw);

    }
    public void Toggle(View vw)
    {
        if (imgSource==1)
            imgSource=0;
        else
            imgSource=1;
        iv.setImageResource(images[imgSource]);
    }
}