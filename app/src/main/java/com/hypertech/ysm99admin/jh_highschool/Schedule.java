package com.hypertech.ysm99admin.jh_highschool;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Schedule extends AppCompatActivity {

    Button scheduleback;
    Button scheduleb3;
    Button scheduleb2;
    Button scheduleb1;
    Button schedule0;
    Button schedule1;
    Button schedule2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schedule);


        Button scheduleback = (Button)findViewById(R.id.scheduleback);
        scheduleback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                finish();
            }
        });

        Button scheduleb3 = (Button)findViewById(R.id.scheduleb3);
        scheduleb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                Intent myIntent = new Intent(getApplicationContext(),scheduleb3.class);
                startActivity(myIntent);
            }
        });

        Button scheduleb2 = (Button)findViewById(R.id.scheduleb2);
        scheduleb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),scheduleb2.class);
                startActivity(myIntent);
            }
        });

        Button scheduleb1 = (Button)findViewById(R.id.scheduleb1);
        scheduleb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),scheduleb1.class);
                startActivity(myIntent);
            }
        });

        Button schedule0 = (Button)findViewById(R.id.schedule0);
        schedule0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),schedule0.class);
                startActivity(myIntent);
            }
        });

        Button schedule1 = (Button)findViewById(R.id.schedule1);
        schedule1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),schedule1.class);
                startActivity(myIntent);
            }
        });

        Button schedule2 = (Button)findViewById(R.id.schedule2);
        schedule2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),schedule2.class);
                startActivity(myIntent);
            }
        });

        //나중에 이곳에 schedule3 버튼을 추가해야함 - 현재 비활성화
    }
}
