package com.example.test1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends Activity {

    TextView activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        activity = findViewById(R.id.activity);



        String name=getIntent().getStringExtra("activity");
        activity.setText(name);



    }
}
