package com.example.android_practice;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface retrofitInterface {
    @GET("api/user")
    Call<User> user(@Header("Authorization")String userKey);
}
