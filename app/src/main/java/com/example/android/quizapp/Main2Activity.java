package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    //initialize the buttons

    Button ans1, ans2, ans3,ans4;
    //Get all the textviews
    TextView score, quizzes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //capture the buttons in the first place
        ans1=(findViewById(R.id.ans1));
        ans2=(findViewById(R.id.ans2));
        ans3=(findViewById(R.id.ans3));
        ans4=(findViewById(R.id.ans4));

        score=(findViewById(R.id.score));
        quizzes=(findViewById(R.id.quizzes));


        //Create onclick listners for each button to capture user choices
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        ans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        ans4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
