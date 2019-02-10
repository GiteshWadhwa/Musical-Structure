package com.wadhwa.gitesh.secondproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class paymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        TextView alb = (TextView) findViewById(R.id.album);
        alb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albIntent = new Intent(paymentActivity.this, albums.class);
                startActivity(albIntent);
            }
        });
    }
}
