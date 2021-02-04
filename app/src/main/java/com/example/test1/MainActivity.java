package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.test1.API.ApiModel;
import com.example.test1.MVP.MvpInterface;

import java.awt.font.TextAttribute;

public class MainActivity extends AppCompatActivity implements MvpInterface.Presenter {

    Button simButton;
    TextView activity;
    MainActivity Presenter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simButton=findViewById(R.id.sim_button);



        simButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Presenter.showTheData();

                Intent intent=new Intent(MainActivity.this,DetailsActivity.class);

                intent.putExtra("activity",activity.getText().toString());
                intent.putExtra("activity", MvpInterface.showTheData());



                startActivity(intent);


            }


        });




    }


    @Override
    public void getData() {

    }

    @Override
    public void showTheData() {

    }
}