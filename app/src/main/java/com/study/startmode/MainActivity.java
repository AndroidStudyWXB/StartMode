package com.study.startmode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button standard_btn;
    private Button singletop_btn;
    private Button singleInstance_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        standard_btn = (Button) findViewById(R.id.standard_start);
        standard_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StandartMode.class);
                startActivity(intent);
            }
        });

        singletop_btn = (Button) findViewById(R.id.singletop_start);
        singletop_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SingleTopMode.class);
                startActivity(intent);
            }
        });

        singleInstance_btn = (Button) findViewById(R.id.singleInstance_btn);
        singleInstance_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SingleInstance.class);
                startActivity(intent);
            }
        });
    }
}
