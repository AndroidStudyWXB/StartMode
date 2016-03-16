package com.study.startmode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by WXB506 on 2016/3/16.
 */
public class SingleTopMode extends Activity {

    private Button singleTop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singletop_layout);

        Log.d("SingleTop", this.toString());

        singleTop = (Button) findViewById(R.id.singleTop);
        singleTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SingleTopMode.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
