package com.example.a2018222012_selmanparlak;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=findViewById(R.id.img);
        img.setImageResource(R.drawable.play);



        Thread th = new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                    Intent intent=new Intent(MainActivity.this,Homepage.class);
                    startActivity(intent);
                    finish();

            }
        };
        th.start();

    }
}
