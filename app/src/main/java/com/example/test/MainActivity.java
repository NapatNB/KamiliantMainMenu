package com.example.test;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button btnAR , btnWebsite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAR = (Button) findViewById(R.id.btn_AR);
        btnWebsite = (Button) findViewById(R.id.btn_web);

        btnAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToWebsite();
            }
        });

    }
    private void moveToARActivity(){

    }
    private void moveToWebsite(){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kamiliant.com/th/"));
        startActivity(browserIntent);
    }


}
