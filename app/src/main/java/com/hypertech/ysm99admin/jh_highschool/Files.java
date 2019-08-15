package com.hypertech.ysm99admin.jh_highschool;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Files extends AppCompatActivity {

    Button files1;
    Button files2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.files);

        Button files1 = (Button)findViewById(R.id.files1);
        files1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://jeohyeon.e-wut.co.kr/"));
                startActivity(intent);
            }
        });

        Button filesback = (Button)findViewById(R.id.filesback);
        filesback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0){
                finish();
            }
        });
    }
}
