package com.wadhwa.gitesh.secondproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class artist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);
        TextView alb1 = (TextView) findViewById(R.id.albums1);
        alb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albIntent = new Intent(artist.this, albums.class);
                startActivity(albIntent);
            }
        });
    }
    }

