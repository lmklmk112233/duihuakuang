package com.example.limingkun.duihuakuang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        Intent intent =
                new Intent(Main1Activity.this,
                        Duihuakuang.class);
        startActivity(intent);
        finish();


    }
}
