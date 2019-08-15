package com.hypertech.ysm99admin.jh_highschool;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Timetable extends AppCompatActivity {

    Button tableback;
    Button onlinett;
    Button g1c1;
    Button g1c2;
    Button g1c3;
    Button g1c4;
    Button g1c5;
    Button g1c6;
    Button g1c7;
    Button g1c8;
    Button g1c9;
    Button g1c10;
    Button g1c11;
    Button g1c12;
    Button g2c1;
    Button g2c2;
    Button g2c3;
    Button g2c4;
    Button g2c5;
    Button g2c6;
    Button g2c7;
    Button g2c8;
    Button g2c9;
    Button g2c10;
    Button g2c11;
    Button g2c12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timetable);


        Button tableback = (Button)findViewById(R.id.tableback);
        tableback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                finish();
            }
        });

        Button onlinett = (Button)findViewById(R.id.onlinett);
        onlinett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://comcigan.com/st/"));
                startActivity(intent);
            }
        });

        Button g1c1 = (Button)findViewById(R.id.g1c1);
        g1c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),g1c1.class);
                startActivity(myIntent);
            }
        });

        Button g1c2 = (Button)findViewById(R.id.g1c2);
        g1c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),g1c2.class);
                startActivity(myIntent);
            }
        });

        Button g1c3 = (Button)findViewById(R.id.g1c3);
        g1c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),g1c3.class);
                startActivity(myIntent);
            }
        });

        Button g1c4 = (Button)findViewById(R.id.g1c4);
        g1c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),g1c4.class);
                startActivity(myIntent);
            }
        });

        Button g1c5 = (Button)findViewById(R.id.g1c5);
        g1c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),g1c5.class);
                startActivity(myIntent);
            }
        });

        Button g1c6 = (Button)findViewById(R.id.g1c6);
        g1c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),g1c6.class);
                startActivity(myIntent);
            }
        });

        Button g1c7 = (Button)findViewById(R.id.g1c7);
        g1c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),g1c7.class);
                startActivity(myIntent);
            }
        });

        Button g1c8 = (Button)findViewById(R.id.g1c8);
        g1c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),g1c8.class);
                startActivity(myIntent);
            }
        });

        Button g1c9 = (Button)findViewById(R.id.g1c9);
        g1c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),g1c9.class);
                startActivity(myIntent);
            }
        });

        Button g1c10 = (Button)findViewById(R.id.g1c10);
        g1c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),g1c10.class);
                startActivity(myIntent);
            }
        });

        Button g1c11 = (Button)findViewById(R.id.g1c11);
        g1c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),g1c11.class);
                startActivity(myIntent);
            }
        });

        Button g1c12 = (Button)findViewById(R.id.g1c12);
        g1c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),g1c12.class);
                startActivity(myIntent);
            }
        });

        Button g2c1 = (Button)findViewById(R.id.g2c1);
        g2c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),g2c1.class);
                startActivity(myIntent);
            }
        });

        Button g2c2 = (Button)findViewById(R.id.g2c2);
        g2c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),g2c2.class);
                startActivity(myIntent);
            }
        });

        Button g2c3 = (Button)findViewById(R.id.g2c3);
        g2c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),g2c3.class);
                startActivity(myIntent);
            }
        });

        Button g2c4 = (Button)findViewById(R.id.g2c4);
        g2c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),g2c4.class);
                startActivity(myIntent);
            }
        });

        Button g2c5 = (Button)findViewById(R.id.g2c5);
        g2c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),g2c5.class);
                startActivity(myIntent);
            }
        });

        Button g2c6 = (Button)findViewById(R.id.g2c6);
        g2c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),g2c6.class);
                startActivity(myIntent);
            }
        });

        Button g2c7 = (Button)findViewById(R.id.g2c7);
        g2c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),g2c7.class);
                startActivity(myIntent);
            }
        });

        Button g2c8 = (Button)findViewById(R.id.g2c8);
        g2c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),g2c8.class);
                startActivity(myIntent);
            }
        });

        Button g2c9 = (Button)findViewById(R.id.g2c9);
        g2c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),g2c9.class);
                startActivity(myIntent);
            }
        });

        Button g2c10 = (Button)findViewById(R.id.g2c10);
        g2c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),g2c10.class);
                startActivity(myIntent);
            }
        });

        Button g2c11 = (Button)findViewById(R.id.g2c11);
        g2c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),g2c11.class);
                startActivity(myIntent);
            }
        });

        Button g2c12 = (Button)findViewById(R.id.g2c12);
        g2c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),g2c12.class);
                startActivity(myIntent);
            }
        });

        //추후 이곳에 g3c1부터 g3c12까지 추가해야함.
    }
}
