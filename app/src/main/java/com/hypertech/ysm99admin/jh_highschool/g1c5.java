package com.hypertech.ysm99admin.jh_highschool;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class g1c5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.g1c5);
    Button g1c5back = (Button)findViewById(R.id.g1c5back);
    g1c5back.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v){
            finish();
        }
    });
    }
}
