package com.example.a2018222012_selmanparlak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Homepage extends AppCompatActivity {
    ListView lw;
    String[]movies={"Dead Poets Society",
                    "Drive","Dune","Thor:Ragnarok","Spider-Man:Into the Spider-Verse"};
    int[]images={R.drawable.dps,R.drawable.drive,R.drawable.dune,R.drawable.thor,R.drawable.spiderman};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        lw=findViewById(R.id.lw);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(getApplicationContext(),R.layout.list,R.id.txt,movies);
        lw.setAdapter(arrayAdapter);
        lw.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(Homepage.this,Details.class);
                intent.putExtra("SelectedItem",i);
                intent.putExtra("Movies",movies);
                intent.putExtra("Images",images);
                startActivity(intent);

                /*
                if(i==0)
                {
                    Toast.makeText(getApplicationContext(), "1.metin", Toast.LENGTH_SHORT).show();
                }
                if(i==1)
                {
                    Toast.makeText(getApplicationContext(), "2.metin", Toast.LENGTH_SHORT).show();

                }
                */

            }
        });


    }
}