package com.example.a2018222012_selmanparlak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    ImageView img;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        img=findViewById(R.id.imageview);
        txt=findViewById(R.id.textView);
        int select=getIntent().getIntExtra("SelectedItem",0);
        String[]strings=getIntent().getStringArrayExtra("Movies");
        int[]ints=getIntent().getIntArrayExtra("Images");
        if(select==0) {
            txt.setText(strings[0]);
            img.setImageResource(ints[0]);
        }
        if(select==1)
        {
            txt.setText(strings[1]);
            img.setImageResource(ints[1]);
        }
        if(select==2) {
            txt.setText(strings[2]);
            img.setImageResource(ints[2]);
        }
        if(select==3)
        {
            txt.setText(strings[3]);
            img.setImageResource(ints[3]);
        }
        if(select==4) {
            txt.setText(strings[4]);
            img.setImageResource(ints[4]);
        }

    }
}