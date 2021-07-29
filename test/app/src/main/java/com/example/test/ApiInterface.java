package com.example.test;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiInterface {


    //email.check
    @POST("/auth/check/email")
    Call<ResponseJson> EmailCheck(@Body JsonObject jsonObject);

    // post { email : wjflasdjfl@naver.com }
    // receive massage : 200 true , 404,405 false


    //login
    @POST("/auth/login")
    Call<ResponseJson> Login(@Body JsonObject jsonObject);
    // post { email : wjeojrwo@naver.com password : *******}
    // reeive massage : 1개




    //my page upload
    @POST("/")
    Call<ResponseJson> getLogin(@Body JsonObject jsonObject);



}
