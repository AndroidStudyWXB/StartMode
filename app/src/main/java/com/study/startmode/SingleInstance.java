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
public class SingleInstance extends Activity {

    private Button signleInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signelinstance_layout);

        Log.d("SIGNLEINSTANCE", "Task id is " + getTaskId());

        signleInstance = (Button) findViewById(R.id.main_activity);
        signleInstance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SingleInstance.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
