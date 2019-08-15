package com.hypertech.ysm99admin.jh_highschool;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        Button menuback = (Button)findViewById(R.id.menuback);
        menuback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                finish();
            }
        });

        Button menub1 = (Button)findViewById(R.id.menub1);
        menub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),menub1.class);
                startActivity(myIntent);
            }
        });

        Button menu0 = (Button)findViewById(R.id.menu0);
        menu0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(getApplicationContext(),menu0.class);
                startActivity(myIntent);
            }
        });

        //추후 이곳에 menub2 , b3 , 1 , 2 , 3 버튼 연결 코드 추가할 것.
    }
}
