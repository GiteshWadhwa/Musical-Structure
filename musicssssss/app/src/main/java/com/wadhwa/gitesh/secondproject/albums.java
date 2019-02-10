package com.wadhwa.gitesh.secondproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class albums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

    TextView art1 = (TextView) findViewById(R.id.artist1);
        art1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent artIntent = new Intent(albums.this, artist.class);
            startActivity(artIntent);
        }
    });
}
}