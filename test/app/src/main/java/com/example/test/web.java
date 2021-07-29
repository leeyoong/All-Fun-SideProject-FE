package com.example.test;

import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.*;


public class web {

    public static final String BASE_URL = "http://10.0.2.2:8080";
    private static Retrofit retrofit = null;


    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public String Json_request_to_server(){
        Object TestObject = new Object("hwjoo","12345");
        ApiInterface apiService = web.getClient().create(ApiInterface.class);
        Call<ResponseJson> call = apiService.getJsonString(TestObject.toJson());
        final String[] return_String = {"hi"};
        call.enqueue(new Callback<ResponseJson>() {
            @Override
            public void onResponse(Call<ResponseJson> call, Response<ResponseJson> response) {
                try {
                    Log.d("TEST", response.body().toString());
                    ResponseJson responseJson = response.body();
                    //idfound.setText(responseJson.toString());
                } catch (Exception e) {
                    e.printStackTrace();

                }
            }

            @Override
            public void onFailure(Call<ResponseJson> call, Throwable t) {
                //idfound.setText(t.toString());
            }
        });
        return null;
    }


}
