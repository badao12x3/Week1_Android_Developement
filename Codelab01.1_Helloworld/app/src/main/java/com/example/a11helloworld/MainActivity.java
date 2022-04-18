package com.example.a11helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("han","hiue");
        Log.d("MainActivity", "Hello World");
        Log.i("ilovyou","weareone");
        Log.w("howareyou","imfine");
        Log.e("íntant","like");
        Log.wtf("soyoudo","verygoof");
        Log.i("MainActivity", "MainActivity layout is complete");
    };
}