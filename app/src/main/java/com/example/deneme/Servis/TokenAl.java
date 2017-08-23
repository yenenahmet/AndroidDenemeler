package com.example.deneme.Servis;

import com.example.deneme.Model.TokenCb;

import retrofit.Call;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;


public interface TokenAl {
    @FormUrlEncoded
    @POST("/token")
    Call<TokenCb> konumyollaServis(@Field("grant_type")String grat_type, @Field("username") String username, @Field("password") String password);
}
