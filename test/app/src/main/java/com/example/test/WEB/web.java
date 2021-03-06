package com.example.test.WEB;

import android.util.Log;

import com.example.test.DTO.*;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


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





    public String Post_EmailCheck(String Email){
        //Web 생성
        ApiInterface apiService = web.getClient().create(ApiInterface.class);

        //보낼 오브젝트 생성
        OneItemDto email = new OneItemDto(Email);
        // 요청 시작
        Call<ResponseJson> call = apiService.emailCheck(email);
        call.enqueue(new Callback<ResponseJson>() {
            @Override
            public void onResponse(Call<ResponseJson> call, Response<ResponseJson> response) {
                try {
                    Log.d("TEST", response.body().toString());
                    ResponseJson responseJson = response.body();
                    if(response.code() == 200){
                        //성공했을 때 200

                    }

                    else{
                        // 실패할 경우 404

                    }
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
    public String Post_Nicknmae(String Nickname){
        //Web 생성
        ApiInterface apiService = web.getClient().create(ApiInterface.class);

        //보낼 오브젝트 생성
        OneItemDto Object= new OneItemDto(Nickname);
        // 요청 시작
        Call<ResponseJson> call = apiService.nickNameCheck(Object);
        call.enqueue(new Callback<ResponseJson>() {
            @Override
            public void onResponse(Call<ResponseJson> call, Response<ResponseJson> response) {
                try {
                    Log.d("TEST", response.body().toString());
                    ResponseJson responseJson = response.body();
                    if(response.code() == 200){
                        //성공했을 때 200

                    }

                    else{
                        // 실패할 경우 404

                    }
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
    public String Post_SendEmail(String Email){
        //Web 생성
        ApiInterface apiService = web.getClient().create(ApiInterface.class);

        //보낼 오브젝트 생성
        OneItemDto object= new OneItemDto(Email);
        // 요청 시작
        Call<ResponseJson> call = apiService.emailCheck(object);
        call.enqueue(new Callback<ResponseJson>() {
            @Override
            public void onResponse(Call<ResponseJson> call, Response<ResponseJson> response) {
                try {
                    Log.d("TEST", response.body().toString());
                    ResponseJson responseJson = response.body();
                    if(response.code() == 200){
                        //성공했을 때 200

                    }

                    else{
                        // 실패할 경우 404

                    }
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
    public MemberDataDto Post_Login(String Email,String password){
        //Web 생성
        ApiInterface apiService = web.getClient().create(ApiInterface.class);

        //보낼 오브젝트 생성
        LoginDto object = new LoginDto(Email,password);
        // 요청 시작
        Call<MemberDataDto> call = apiService.login(object);
        call.enqueue(new Callback<MemberDataDto>() {
            @Override
            public void onResponse(Call<MemberDataDto> call, Response<MemberDataDto> response) {
                try {
                    Log.d("TEST", response.body().toString());
                    MemberDataDto data = response.body();
                    if(response.code() == 200){
                        //성공했을 때 200

                    }

                    else{
                        // 실패할 경우 40

                    }
                    //idfound.setText(responseJson.toString());
                } catch (Exception e) {

                    e.printStackTrace();


                }
            }



            @Override
            public void onFailure(Call<MemberDataDto> call, Throwable t) {
                //idfound.setText(t.toString());
            }
        });
        return null;
    }
    public String Post_FindPassword(String name,String birth,String phone, String email){
        //Web 생성
        ApiInterface apiService = web.getClient().create(ApiInterface.class);

        //보낼 오브젝트 생성
        FindPasswordDto object = new FindPasswordDto(name,birth,phone,email);
        // 요청 시작
        Call<ResponseJson> call = apiService.findPW(object);
        call.enqueue(new Callback<ResponseJson>() {
            @Override
            public void onResponse(Call<ResponseJson> call, Response<ResponseJson> response) {
                try {
                    Log.d("TEST", response.body().toString());
                    ResponseJson responseJson = response.body();
                    //성공시

                    //idfound.setText(responseJson.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                    //ㅈ망했을 시

                }
            }

            @Override
            public void onFailure(Call<ResponseJson> call, Throwable t) {
                //idfound.setText(t.toString());
            }
        });
        return null;
    }
    public String Post_FindEmail(String name,String birth,String phone){
        //Web 생성
        ApiInterface apiService = web.getClient().create(ApiInterface.class);

        //보낼 오브젝트 생성
        FindEmailDto object = new FindEmailDto(name,birth,phone);
        // 요청 시작
        Call<ResponseJson> call = apiService.findID(object);
        call.enqueue(new Callback<ResponseJson>() {
            @Override
            public void onResponse(Call<ResponseJson> call, Response<ResponseJson> response) {
                try {
                    Log.d("TEST", response.body().toString());
                    ResponseJson responseJson = response.body();
                    //성공시

                    //idfound.setText(responseJson.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                    //ㅈ망했을 시

                }
            }

            @Override
            public void onFailure(Call<ResponseJson> call, Throwable t) {
                //idfound.setText(t.toString());
            }
        });
        return null;
    }
    public String Post_SignUp(String email, String passwd, String birth, String name, String phone, String nickname, String gender){
        //Web 생성
        ApiInterface apiService = web.getClient().create(ApiInterface.class);

        //보낼 오브젝트 생성
        CreateMemberDto object = new CreateMemberDto(email, passwd, birth, name, phone, nickname, gender);
        // 요청 시작
        Call<ResponseJson> call = apiService.createMember(object);
        call.enqueue(new Callback<ResponseJson>() {
            @Override
            public void onResponse(Call<ResponseJson> call, Response<ResponseJson> response) {
                try {
                    Log.d("TEST", response.body().toString());
                    ResponseJson responseJson = response.body();
                    //성공시

                    //idfound.setText(responseJson.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                    //ㅈ망했을 시

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