package com.wadhwa.gitesh.secondproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class folders extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_folders);
        TextView art2 = (TextView) findViewById(R.id.albums1);
        art2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atrIntent = new Intent(folders.this, artist.class);
                startActivity(atrIntent);
            }
        });
    }
}
