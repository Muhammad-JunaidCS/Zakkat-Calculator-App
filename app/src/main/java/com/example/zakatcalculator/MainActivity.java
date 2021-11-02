package com.example.zakatcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView zakkat;
    private EditText cashInHand,cashGivenOut,borrowedCash,valueOfGold,valueOfSilver;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zakkat = (TextView) findViewById(R.id.zakkat);
        cashInHand=(EditText) findViewById(R.id.cash_in_hand);
        cashGivenOut=(EditText) findViewById(R.id.cash_in_loan);
        borrowedCash=(EditText) findViewById(R.id.borrow_cash);
        valueOfGold=(EditText) findViewById(R.id.gold_possess);
        valueOfSilver=(EditText) findViewById(R.id.silver_posssess);
        radioGroup=(RadioGroup) findViewById(R.id.radio_group);
    }

    public void Calculate(View view) {
        zakkat.setText(Double.toString(0.0));
        float cashInHnd,cashGiven,borrowCash,goldValue,silverValue;
        double total;
        cashInHnd =Float.parseFloat(cashInHand.getText().toString());
        cashGiven=Float.parseFloat(cashGivenOut.getText().toString());
        borrowCash=Float.parseFloat(borrowedCash.getText().toString());
        goldValue=Float.parseFloat(valueOfGold.getText().toString());
        silverValue=Float.parseFloat(valueOfSilver.getText().toString());
        total=cashInHnd+cashGiven+goldValue+silverValue-borrowCash;
        if(radioGroup.getCheckedRadioButtonId()==R.id.radio2 && total>80933)
        {
            total=total*(2.5/100);
            zakkat.setText(Double.toString(total));
        }
        else if(radioGroup.getCheckedRadioButtonId()==R.id.radio1 && total>747954)
        {
            total=total*(2.5/100);
            zakkat.setText(Double.toString(total));
        }

    }
}