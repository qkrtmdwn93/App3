package com.example.sw_center_02.application3;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class Practice1 extends AppCompatActivity {
    RadioButton r1;
    RadioButton r2;
    ImageView image1;
    Button btn1;
    private int selectID = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice1);

        r1 = (RadioButton)findViewById(R.id.radioButton_man);
        r2 = (RadioButton)findViewById(R.id.radioButton_woman);
        image1 = (ImageView)findViewById(R.id.imageview);
        btn1 = (Button)findViewById(R.id.Button1);

        r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                image1.setImageResource(R.drawable.woman);
            }
        });

        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                image1.setImageResource(R.drawable.man);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r1.isChecked() == true) {
                    Toast.makeText(getBaseContext(), "당신은 남성입니다.", Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(getBaseContext(), "당신은 여성입니다.", Toast.LENGTH_SHORT).show();
                }
                }
        });
    }
}
