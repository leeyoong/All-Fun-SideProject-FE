package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;

import com.example.test.WEB.ApiInterface;
import com.example.test.WEB.Object;
import com.example.test.WEB.ResponseJson;
import com.example.test.WEB.web;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText idname = (EditText) findViewById(R.id.idname);
        EditText passname = (EditText) findViewById(R.id.passname);

        Button login = (Button) findViewById(R.id.login);
        Button regin = (Button) findViewById(R.id.regin);

        CheckBox autolog = (CheckBox) findViewById(R.id.autolog);

        TextView idfound = (TextView) findViewById(R.id.idfound);
        TextView passfound = (TextView) findViewById(R.id.passfound);




    }
}