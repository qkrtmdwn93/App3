package com.example.sw_center_02.application3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Practice2 extends AppCompatActivity {
    EditText E1;
    EditText E2;
    EditText E3;
    Button B1;
    Button B2;
    TextView T1;
    TextView T2;
    ImageView ImageV;

    int score_guk, score_math, score_eng, total, average;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice2);

        E1 = (EditText)findViewById(R.id.enter_guk);
        E2 = (EditText)findViewById(R.id.enter_math);
        E3 = (EditText)findViewById(R.id.enter_eng);
        B1 = (Button)findViewById(R.id.calculate_score);
        B2 = (Button)findViewById(R.id.initail);
        T1 = (TextView)findViewById(R.id.score_total);
        T2 = (TextView)findViewById(R.id.score_average);
        ImageV = (ImageView)findViewById(R.id.score_image);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(E1.getText().toString().replace(" ","").equals("") || E2.getText().toString().replace(" ","").equals("") || E3.getText().toString().replace(" ","").equals("")){
                    Toast.makeText(getBaseContext(), "값을 입력해주세요", Toast.LENGTH_SHORT).show();
                }
                else {
                    score_guk = Integer.parseInt(E1.getText().toString());
                    score_math = Integer.parseInt(E2.getText().toString());
                    score_eng = Integer.parseInt(E3.getText().toString());

                    total = score_guk + score_math + score_eng;
                    average = total / 3;

                    T1.setText(total + "점");
                    T2.setText(average + "점");

                    if(average >= 90){
                        ImageV.setImageResource(R.drawable.a_score);
                    }
                    else if(average >= 80 && average < 90){
                        ImageV.setImageResource(R.drawable.b_score);
                    }
                    else{
                        ImageV.setImageResource(R.drawable.sad);
                    }
                }
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                E1.setText(null);
                E2.setText(null);
                E3.setText(null);
                T1.setText("0점");
                T2.setText("0점");
                ImageV.setImageResource(0);
                Toast.makeText(getBaseContext(), "초기화 되었습니다", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
