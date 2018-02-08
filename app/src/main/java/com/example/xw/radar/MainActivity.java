package com.example.xw.radar;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private MyRadar mRadar;
    double[] data={70,40,60,80,50,100,20};
    String[] titles={"小黑","屁","大傻","小抠","哈哈","haha"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRadar= (MyRadar) findViewById(R.id.radar);

        mRadar.setData(data);
        mRadar.setTitles(titles);

    }
}
