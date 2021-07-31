package com.example.test.WEB;

import com.example.test.DTO.*;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface {


    //email.check
    @POST("/auth/check/email")
    Call<ResponseJson> emailCheck(@Body OneItemDto Object);

    // post { email : wjflasdjfl@naver.com }
    // receive massage : 200 true , 404,405 false

    //email.check
    @POST("/auth/check/nickname")
    Call<ResponseJson> nickNameCheck(@Body OneItemDto Object);

    // post { email : wjflasdjfl@naver.com }
    // receive massage : 200 true , 404,405 false

    //login
    @POST("/auth/login")
    Call<MemberDataDto> login(@Body LoginDto Object);
    // post { email : wjeojrwo@naver.com password : *******}
    // reeive massage : 1개

    //sign up
    @POST("/auth/create")
    Call<ResponseJson> createMember(@Body CreateMemberDto jsonObject);
    // post { email : wjeojrwo@naver.com password : *******}
    // reeive
    //public class CreateMemberDto {
    //    private String email; //중복체크 & 이메일 인증 완료된 이메일
    //    private String passwd;
    //    private String birth; //yyyy-mm-dd
    //    private String name;
    //    private String phone;
    //    private String nickname; //중복없는 닉네임
    //    private String gender; // Male Female
    //}

    //sign up
    @POST("/auth/findid")
    Call<ResponseJson> findID(@Body FindEmailDto Object);
    // post { email : wjeojrwo@naver.com password : *******}
    // reeive massage :public class FindMemberDto {
    //    @NonNull private String name;
    //    @NonNull private String birth;
    //    @NonNull private String phone;
    //    private String email;
    //}


    //send email
    @POST("/auth/findpw")
    Call<ResponseJson> findPW(@Body FindPasswordDto Object);
    // post { email }
    // reeive massage : 1개
    //public class FindMemberDto {
    //
        //    @NonNull private String name;
        //    @NonNull private String birth;
        //    @NonNull private String phone;
        //    private String email;
        //}

    //my page upload


    @POST("/auth/")
    Call<ResponseJson> getLogin(@Body JsonObject jsonObject);



}
