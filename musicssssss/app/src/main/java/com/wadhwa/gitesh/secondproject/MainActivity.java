package com.wadhwa.gitesh.secondproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView albums = (TextView) findViewById(R.id.albums);
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumIntent = new Intent(MainActivity.this, albums.class);
                startActivity(albumIntent);
            }
        });
        TextView artist = (TextView) findViewById(R.id.artist);
        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistIntent = new Intent(MainActivity.this, artist.class);
                startActivity(artistIntent);
            }
        });
        TextView folders = (TextView) findViewById(R.id.folders);
        folders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent foldersIntent = new Intent(MainActivity.this, folders.class);
                startActivity(foldersIntent);
            }
        });
        TextView generes = (TextView) findViewById(R.id.geners);
        generes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent generesIntent = new Intent(MainActivity.this, paymentActivity.class);
                startActivity(generesIntent);
            }
        });
        TextView songs = (TextView) findViewById(R.id.songs);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songsIntent = new Intent(MainActivity.this, songs.class);
                startActivity(songsIntent);
            }
        });
    }
    }

