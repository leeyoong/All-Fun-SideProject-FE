package com.example.test.DTO;

import androidx.annotation.NonNull;

 public class FindMemberDto {

    public FindMemberDto(@NonNull String name, @NonNull String birth, @NonNull String phone, String email) {
       this.name = name;
       this.birth = birth;
       this.phone = phone;
       this.email = email;
    }

    @NonNull private String name;
    @NonNull private String birth;
    @NonNull private String phone;
    private String email;



    @NonNull
    public String getName() {
       return name;
    }

    public void setName(@NonNull String name) {
       this.name = name;
    }

    @NonNull
    public String getBirth() {
       return birth;
    }

    public void setBirth(@NonNull String birth) {
       this.birth = birth;
    }

    @NonNull
    public String getPhone() {
       return phone;
    }

    public void setPhone(@NonNull String phone) {
       this.phone = phone;
    }

    public String getEmail() {
       return email;
    }

    public void setEmail(String email) {
       this.email = email;
    }

    @Override
    public String toString() {
       return "FindMemberDto{" +
               "name='" + name + '\'' +
               ", birth='" + birth + '\'' +
               ", phone='" + phone + '\'' +
               ", email='" + email + '\'' +
               '}';
    }
 }
