package com.example.hellokitty.mobileapplication;

import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.time.Instant;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final LinearLayout bg = (LinearLayout) findViewById(R.id.bg);
        final TextView Un = (TextView) findViewById(R.id.TxUn);
        final TextView Ps = (TextView) findViewById(R.id.txPS);
        final EditText UsN = (EditText) findViewById(R.id.UserName);
        final EditText PssUser = (EditText) findViewById(R.id.PasswordUser);
        final CheckBox Cb = (CheckBox) findViewById(R.id.ChB);
        final TextView FGP = (TextView) findViewById(R.id.Fg);
        final Button loginBt = (Button) findViewById(R.id.Btlogin);
        final Button StudyBt = (Button) findViewById(R.id.Study);

        Typeface FontFace1 = Typeface.createFromAsset(getAssets(),"fonts/RSU_light.ttf");

        bg.setBackgroundResource(R.drawable.bgappmobile);
        Un.setTypeface(FontFace1);
        Ps.setTypeface(FontFace1);
        UsN.setTypeface(FontFace1);
        PssUser.setTypeface(FontFace1);
        Cb.setTypeface(FontFace1);
        FGP.setTypeface(FontFace1);
        loginBt.setTypeface(FontFace1);
        StudyBt.setTypeface(FontFace1);

         loginBt.setOnClickListener(new View.OnClickListener() {
                            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, MainActivity.class);
                startActivity(intent);
            }
        });

        StudyBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Study.class);
                startActivity(intent);
            }
        });

    }
}
