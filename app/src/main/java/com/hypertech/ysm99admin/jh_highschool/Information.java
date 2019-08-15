package com.hypertech.ysm99admin.jh_highschool;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information);
        Button infoback = (Button) findViewById(R.id.infoback);
        infoback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button info1 = (Button)findViewById(R.id.info1);
        info1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.jeohyeon.hs.kr/main/main_mobile.php?categoryid=02&menuid=01&groupid=00"));
                startActivity(intent);
            }
        });

        Button info2 = (Button)findViewById(R.id.info2);
        info2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.jeohyeon.hs.kr/main/main_mobile.php?categoryid=02&menuid=02&groupid=00"));
                startActivity(intent);
            }
        });

        Button info3 = (Button)findViewById(R.id.info3);
        info3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.jeohyeon.hs.kr/main/main_mobile.php?categoryid=02&menuid=10&groupid=00"));
                startActivity(intent);
            }
        });
    }
}
