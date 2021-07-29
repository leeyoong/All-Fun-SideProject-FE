package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.util.Log;

import com.google.android.gms.common.api.*;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.gson.JsonObject;

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

        Object TestObject = new Object("hwjoo","12345");
        ApiInterface apiService = web.getClient().create(ApiInterface.class);
        Call<ResponseJson> call = apiService.EmailCheck(TestObject.toJson());

        call.enqueue(new Callback<ResponseJson>() {
            @Override
            public void onResponse(Call<ResponseJson> call, Response<ResponseJson> response) {
                try {
                    Log.d("TEST", response.body().toString());
                    ResponseJson responseJson = response.body();
                    idfound.setText(responseJson.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseJson> call, Throwable t) {
                idfound.setText(t.toString());
            }
        });


    }
}