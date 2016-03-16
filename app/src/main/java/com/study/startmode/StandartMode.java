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
public class StandartMode extends Activity {

    private Button startSelf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.standard_layout);

        Log.d("StandartMode", this.toString());
        startSelf = (Button) findViewById(R.id.start_self);
        startSelf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StandartMode.this, StandartMode.class);
                startActivity(intent);
            }
        });
    }
}
