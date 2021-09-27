package com.example.home_lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    private static final String TAG = "@@@";

    private Button newButton;
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
    private Button equallyButton;
    private TextView textView;
    private EditText answer;

    boolean first_input = false;
    boolean first_action = false;

    boolean val_1 = false;

    double value1 = 0.0;
    double value2 = 0.0;

    String sing = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeReference();

        answer.setText("0");
        first_input = true;
        first_action = true;

        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first_input){
                    answer.setText("1");
                    first_input = false;
                } else {
                    answer.setText(String.format("%s%s", answer.getText().toString(),"1"));
                }
                first_action = true;
            }
        });

        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first_input){
                    answer.setText("2");
                    first_input = false;
                } else {
                    answer.setText(String.format("%s%s", answer.getText().toString(),"2"));
                }
                first_action = true;
            }
        });

        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first_input){
                    answer.setText("3");
                    first_input = false;
                } else {
                    answer.setText(String.format("%s%s", answer.getText().toString(),"3"));
                }
                first_action = true;
            }
        });

        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first_input){
                    answer.setText("4");
                    first_input = false;
                } else {
                    answer.setText(String.format("%s%s", answer.getText().toString(),"4"));
                }
                first_action = true;
            }
        });

        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first_input){
                    answer.setText("5");
                    first_input = false;
                } else {
                    answer.setText(String.format("%s%s", answer.getText().toString(),"5"));
                }
                first_action = true;
            }
        });

        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first_input){
                    answer.setText("6");
                    first_input = false;
                } else {
                    answer.setText(String.format("%s%s", answer.getText().toString(),"6"));
                }
                first_action = true;
            }
        });

        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first_input){
                    answer.setText("7");
                    first_input = false;
                } else {
                    answer.setText(String.format("%s%s", answer.getText().toString(),"7"));
                }
                first_action = true;
            }
        });

        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first_input){
                    answer.setText("8");
                    first_input = false;
                } else {
                    answer.setText(String.format("%s%s", answer.getText().toString(),"8"));
                }
                first_action = true;
            }
        });

        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first_input){
                    answer.setText("9");
                    first_input = false;
                } else {
                    answer.setText(String.format("%s%s", answer.getText().toString(),"9"));
                }
                first_action = true;
            }
        });

        nullButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first_input){
                    answer.setText("0");
                    first_input = false;
                } else {
                    answer.setText(String.format("%s%s", answer.getText().toString(),"0"));
                }
                first_action = true;
            }
        });

        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sing = "+";
                if (first_action){
                    if (!val_1){
                        value1 = Double.valueOf(answer.getText().toString());
                        val_1 = true;
                    } else {
                        value2 = Double.valueOf(answer.getText().toString());
                    }
                    first_action = false;
                }
                answer.setText("+");
                first_input = true;
            }
        });

        minButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sing = "-";
                if (first_action){
                    if (!val_1){
                        value1 = Double.valueOf(answer.getText().toString());
                        val_1 = true;
                    } else {
                        value2 = Double.valueOf(answer.getText().toString());
                    }
                    first_action = false;
                }
                answer.setText("-");
                first_input = true;
            }
        });

        mulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sing = "*";
                if (first_action){
                    if (!val_1){
                        value1 = Double.valueOf(answer.getText().toString());
                        val_1 = true;
                    } else {
                        value2 = Double.valueOf(answer.getText().toString());
                    }
                    first_action = false;
                }
                answer.setText("*");
                first_input = true;
            }
        });

        divisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sing = "/";
                if (first_action){
                    if (!val_1){
                        value1 = Double.valueOf(answer.getText().toString());
                        val_1 = true;
                    } else {
                        value2 = Double.valueOf(answer.getText().toString());
                    }
                    first_action = false;
                }
                answer.setText("/");
                first_input = true;
            }
        });

        equallyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first_action){
                    if (!val_1){
                        value1 = Double.valueOf(answer.getText().toString());
                        val_1 = false;
                    } else {
                        value2 = Double.valueOf(answer.getText().toString());
                    }

                    if (sing.equals("+")){
                        double sum = value1 + value2;
                        answer.setText(String.valueOf(sum));
                    } else {
                        answer.setText(answer.getText());
                    } if (sing.equals("-")){
                        double min = value1 - value2;
                        answer.setText(String.valueOf(min));
                    } else {
                        answer.setText(answer.getText());
                    } if (sing.equals("*")){
                        double mul = value1 * value2;
                        answer.setText(String.valueOf(mul));
                    } else {
                        answer.setText(answer.getText());
                    } if (sing.equals("/")){
                        double div = value1 / value2;
                        answer.setText(String.valueOf(div));
                    } else {
                        answer.setText(answer.getText());
                    }

                }
                value1 = 0;
                value2 = 0;
                val_1 = false;
                first_input = true;
                first_action = true;
            }
        });
         newButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 answer.setText("0");
                 first_input = true;
             }
         });

         pointButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 answer.setText(".");
                 first_input = true;
             }
         });


    }

    private void initializeReference() {
        oneButton = (Button) findViewById(R.id.one_button);
        newButton = (Button) findViewById(R.id.new_button);
        mulButton = (Button) findViewById(R.id.mul_button);
        twoButton = (Button) findViewById(R.id.two_button);
        threeButton = (Button) findViewById(R.id.three_button);
        fourButton = (Button) findViewById(R.id.four_button);
        fiveButton = (Button) findViewById(R.id.five_button);
        sixButton = (Button) findViewById(R.id.six_button);
        sevenButton = (Button) findViewById(R.id.seven_button);
        eightButton = (Button) findViewById(R.id.eight_button);
        nineButton = (Button) findViewById(R.id.nine_button);
        divisionButton = (Button) findViewById(R.id.division_button);
        nullButton = (Button) findViewById(R.id.null_button);
        pointButton = (Button) findViewById(R.id.point_button);
        equallyButton = (Button) findViewById(R.id.equally_button);
        sumButton = (Button) findViewById(R.id.sum_button);
        minButton = (Button) findViewById(R.id.min_button);
        textView = (TextView) findViewById(R.id.text);
        answer = (EditText) findViewById(R.id.answer);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() called");
    }
}