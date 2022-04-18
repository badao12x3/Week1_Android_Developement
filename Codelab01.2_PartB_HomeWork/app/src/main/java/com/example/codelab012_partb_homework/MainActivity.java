package com.example.codelab012_partb_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import codelab012_partb_homework.R;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button mChangeColorZero;
    private Button mChangeColorCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        mChangeColorZero = (Button) findViewById(R.id.button_zero);
        mChangeColorCount = (Button) findViewById(R.id.button_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
        if(mCount % 2 == 0 && mChangeColorCount != null){
            mChangeColorCount.setBackgroundColor(Color.rgb(98,0,238));
        }else if (mCount % 2 != 0 && mChangeColorCount != null){
            mChangeColorCount.setBackgroundColor(Color.RED);
        }
        if (mChangeColorZero != null) {
            mChangeColorZero.setBackgroundColor(Color.rgb(69, 70, 120));
        }
    }

    public void setZero(View view) {
        mCount = 0;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
        if(mChangeColorCount != null){
            mChangeColorCount.setBackgroundColor(Color.rgb(98,0,238));
        }
        if (mChangeColorZero != null) {
            mChangeColorZero.setBackgroundColor(Color.LTGRAY);
        }
    }
}