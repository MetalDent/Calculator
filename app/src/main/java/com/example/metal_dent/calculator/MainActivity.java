package com.example.metal_dent.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDiv,
            buttonMulti, button10, buttonC, buttonEqual;
    EditText edtTxt;

    float mValue1, mValue2;

    boolean Addition, Subtraction, Multiplication, Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonDiv = (Button) findViewById(R.id.buttondiv);
        buttonMulti = (Button) findViewById(R.id.buttonmulti);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttonequal);
        edtTxt = (EditText) findViewById(R.id.edit1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtTxt.setText(edtTxt.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtTxt.setText(edtTxt.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtTxt.setText(edtTxt.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtTxt.setText(edtTxt.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtTxt.setText(edtTxt.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtTxt.setText(edtTxt.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtTxt.setText(edtTxt.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtTxt.setText(edtTxt.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtTxt.setText(edtTxt.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtTxt.setText(edtTxt.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(edtTxt == null) {
                    edtTxt.setText("");
                }
                else{
                    mValue1 = Float.parseFloat(edtTxt.getText() + "");
                    Addition = true;
                    edtTxt.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValue1 = Float.parseFloat(edtTxt.getText() + "");
                Subtraction = true;
                edtTxt.setText(null);
            }
        });

        buttonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValue1 = Float.parseFloat(edtTxt.getText() + "");
                Multiplication = true;
                edtTxt.setText(null);
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValue1 = Float.parseFloat(edtTxt.getText() + "");
                Division = true;
                edtTxt.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValue2 = Float.parseFloat(edtTxt.getText() + "");

                if(Addition == true) {
                    edtTxt.setText(mValue1 + mValue2 + "");
                    Addition = false;
                }

                if(Subtraction == true) {
                    edtTxt.setText(mValue1 - mValue2 + "");
                    Subtraction = false;
                }

                if(Multiplication == true) {
                    edtTxt.setText(mValue1 * mValue2 + "");
                    Multiplication = false;
                }

                if(Division == true) {
                    edtTxt.setText(mValue1 / mValue2 + "");
                    Division = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtTxt.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtTxt.setText(edtTxt.getText() + ".");
            }
        });
    }
}
