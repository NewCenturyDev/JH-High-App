package com.hypertech.ysm99admin.jh_highschool;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class credit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.credit);

        Button creditback = (Button)findViewById(R.id.creditback);
        creditback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                finish();
            }
        });

        Button jhpage = (Button)findViewById(R.id.jhpage);
        jhpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.jeohyeon.hs.kr/"));
                startActivity(intent);
            }
        });

        Button jhleaderspage = (Button)findViewById(R.id.jhleaderspage);
        jhleaderspage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.facebook.com/jeohyeon.stunion"));
                startActivity(intent);
            }
        });

        Button ysm99spage = (Button)findViewById(R.id.ysm99spage);
        ysm99spage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://na.to/ysm99server"));
                startActivity(intent);
            }
        });
    }
}
