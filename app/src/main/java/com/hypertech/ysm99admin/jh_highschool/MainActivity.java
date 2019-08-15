package com.hypertech.ysm99admin.jh_highschool;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Notice;
    Button Messages;
    Button Schedules;
    Button Files;
    Button Menu;
    Button information;
    Button Timetable;
    Button Exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button credit = (Button)findViewById(R.id.credit);
        credit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),credit.class);
                startActivity(myIntent);
            }
        });

        Button exit = (Button) findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                finish();
            }
        });

        Button Notice = (Button)findViewById(R.id.Notice);
        Notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
            Intent intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.jeohyeon.hs.kr/main/main_mobile.php?categoryid=03&menuid=01&groupid=00"));
                startActivity(intent);
            }
        });

        Button Messages = (Button)findViewById(R.id.Messages);
        Messages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.jeohyeon.hs.kr/main/main_mobile.php?categoryid=03&menuid=02&groupid=00"));
                startActivity(intent);
            }
        });

        Button schedule = (Button)findViewById(R.id.Schedule);
        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),Schedule.class);
                startActivity(myIntent);
            }
        });

        Button Timetable = (Button)findViewById(R.id.Timetable);
        Timetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),Timetable.class);
                startActivity(myIntent);
            }
        });

        Button Menu = (Button)findViewById(R.id.Menu);
        Menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),Menu.class);
                startActivity(myIntent);
            }
        });

        Button Files = (Button)findViewById(R.id.Files);
        Files.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),Files.class);
                startActivity(myIntent);
            }
        });

        Button information = (Button)findViewById(R.id.information);
        information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),Information.class);
                startActivity(myIntent);
            }
        });
    }
}
