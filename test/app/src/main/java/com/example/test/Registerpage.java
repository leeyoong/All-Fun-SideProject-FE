package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.test.WEB.web;

public class Registerpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerpage);

        EditText regpw = (EditText) findViewById(R.id.regpw);
        EditText regname = (EditText) findViewById(R.id.regname);
        EditText regbirth = (EditText) findViewById(R.id.regbirth);
        EditText regphone = (EditText) findViewById(R.id.regphone);
        EditText regmail = (EditText) findViewById(R.id.regmail);
        EditText regnick = (EditText) findViewById(R.id.regnick);

        Button regnickbutton = (Button) findViewById(R.id.regnickbutton);
        Button regmailbutton = (Button) findViewById(R.id.regmailbutton);
        Button regmailbutton2 = (Button) findViewById(R.id.regmailbutton2);
        Button regfinish = (Button) findViewById(R.id.regfinish);

        CheckBox malebox = (CheckBox) findViewById(R.id.malebox);
        CheckBox femalebox = (CheckBox) findViewById(R.id.femalebox);

        regnickbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                web base = new web();
                base.Post_SignUp("alstn0723@naver.com","1234","1996-07-23",
                        "김민수","010-2016-2885","섹스킹","MALE");
            }
        });
    }
}