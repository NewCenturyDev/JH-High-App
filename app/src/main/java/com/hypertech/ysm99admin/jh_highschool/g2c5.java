package com.hypertech.ysm99admin.jh_highschool;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.hypertech.ysm99admin.jh_highschool.R.id.g2c4back;

public class g2c5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.g2c5);

        Button g2c5back = (Button)findViewById(R.id.g2c5back);
        g2c5back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                finish();
            }
        });
    }
}
