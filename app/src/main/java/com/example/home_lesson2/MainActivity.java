package com.example.home_lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "@@@";

    private Button newButton;
    private Button deleteButton;
    private Button exitButton;
    private Button sumButton;
    private Button minButton;
    private Button mulButton;
    private Button oneButton;
    private Button twoButton;
    private Button threeButton;
    private Button fourButton;
    private Button fiveButton;
    private Button sixButton;
    private Button sevenButton;
    private Button eightButton;
    private Button nineButton;
    private Button divisionButton;
    private Button nullButton;
    private Button pointButton;
    private Button percentButton;
    private Button equallyButton;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oneButton = (Button) findViewById(R.id.one_button);
        deleteButton = (Button) findViewById(R.id.delete_button);
        newButton = (Button) findViewById(R.id.new_button);
        exitButton = (Button) findViewById(R.id.exit_button);
        mulButton = (Button) findViewById(R.id.mul_button);
        twoButton = (Button) findViewById(R.id.two_button);
        threeButton = (Button) findViewById(R.id.three_button);
        fourButton = (Button) findViewById(R.id.four_button);
        fiveButton = (Button) findViewById(R.id.five_button);
        sixButton = (Button) findViewById(R.id.six_button);
        exitButton = (Button) findViewById(R.id.exit_button);
        sevenButton = (Button) findViewById(R.id.seven_button);
        eightButton = (Button) findViewById(R.id.eight_button);
        nineButton = (Button) findViewById(R.id.nine_button);
        divisionButton = (Button) findViewById(R.id.division_button);
        nullButton = (Button) findViewById(R.id.null_button);
        pointButton = (Button) findViewById(R.id.point_button);
        percentButton = (Button) findViewById(R.id.percent_button);
        equallyButton = (Button) findViewById(R.id.equally_button);
        sumButton = (Button) findViewById(R.id.sum_button);
        minButton = (Button) findViewById(R.id.min_button);
        textView = (TextView) findViewById(R.id.text);

        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oneButton.setText("1");
            }
        });

        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twoButton.setText("2");
            }
        });

        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                threeButton.setText("3");
            }
        });

        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fourButton.setText("4");
            }
        });

        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fiveButton.setText("5");
            }
        });

        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sixButton.setText("6");
            }
        });

        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sevenButton.setText("7");
            }
        });

        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eightButton.setText("8");
            }
        });

        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nineButton.setText("9");
            }
        });

        nullButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nullButton.setText("0");
            }
        });

        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumButton.setText("+");
            }
        });

        minButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                minButton.setText("-");
            }
        });

        mulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mulButton.setText("*");
            }
        });

        divisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                divisionButton.setText("/");
            }
        });

        equallyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equallyButton.setText("=");
            }
        });

        percentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                percentButton.setText("%");
            }
        });

        pointButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pointButton.setText(".");
            }
        });
    }


    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "onStart() called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() called");
    }
}