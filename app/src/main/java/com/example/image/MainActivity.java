package com.example.image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView)findViewById(R.id.img);
    }
    int i=0;
    public void change(View view) {
        if(i==0){
            img.setImageResource(R.drawable._123456);
            i=1;
        }
        else{
            img.setImageResource(R.drawable._789456);
            i=0;
        }
    }
}