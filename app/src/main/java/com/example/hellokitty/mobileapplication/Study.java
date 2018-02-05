package com.example.hellokitty.mobileapplication;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class Study extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.study);

        final TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10,tx11,tx12,tx13;
        final EditText et1,et2,et3,et4,et5,et6;
        final RadioButton rb1,rb2;
        final Spinner sp1,sp2,sp3,sp4,sp5,sp6;

        tx1 = (TextView) findViewById(R.id.Tx1);
        tx2 = (TextView) findViewById(R.id.Tx2);
        tx3 = (TextView) findViewById(R.id.Tx3);
        tx4 = (TextView) findViewById(R.id.Tx4);
        tx5 = (TextView) findViewById(R.id.Tx5);
        tx6 = (TextView) findViewById(R.id.Tx6);
        tx7 = (TextView) findViewById(R.id.Tx7);
        tx8 = (TextView) findViewById(R.id.Tx8);
        tx9 = (TextView) findViewById(R.id.Tx9);
        tx10 = (TextView) findViewById(R.id.Tx10);
        tx11 = (TextView) findViewById(R.id.Tx11);
        tx12 = (TextView) findViewById(R.id.Tx12);
        tx13 = (TextView) findViewById(R.id.Tx13);


        et1 = (EditText) findViewById(R.id.eT1);
        et2 = (EditText) findViewById(R.id.eT2);
        et3 = (EditText) findViewById(R.id.eT3);
        et4 = (EditText) findViewById(R.id.eT4);
        et5 = (EditText) findViewById(R.id.eT5);
        et6 = (EditText) findViewById(R.id.eT6);


        rb1 = (RadioButton) findViewById(R.id.rB1);
        rb2 = (RadioButton) findViewById(R.id.rB2);

        sp1 = (Spinner) findViewById(R.id.Sp1);
        sp2 = (Spinner) findViewById(R.id.Sp2);
        sp3 = (Spinner) findViewById(R.id.Sp3);
        sp4 = (Spinner) findViewById(R.id.Sp4);
        sp5 = (Spinner) findViewById(R.id.Sp5);
        sp6 = (Spinner) findViewById(R.id.Sp6);


        Typeface FontFace1 = Typeface.createFromAsset(getAssets(),"fonts/RSU_light.ttf");

        tx1.setTypeface(FontFace1);
        tx2.setTypeface(FontFace1);
        tx3.setTypeface(FontFace1);
        tx4.setTypeface(FontFace1);
        tx5.setTypeface(FontFace1);
        tx6.setTypeface(FontFace1);
        tx7.setTypeface(FontFace1);
        tx8.setTypeface(FontFace1);
        tx9.setTypeface(FontFace1);
        tx10.setTypeface(FontFace1);
        tx11.setTypeface(FontFace1);
        tx12.setTypeface(FontFace1);
        tx13.setTypeface(FontFace1);


        et1.setTypeface(FontFace1);
        et2.setTypeface(FontFace1);
        et3.setTypeface(FontFace1);
        et4.setTypeface(FontFace1);
        et5.setTypeface(FontFace1);
        et6.setTypeface(FontFace1);

        rb1.setTypeface(FontFace1);
        rb2.setTypeface(FontFace1);


    }
}
