package com.example.deneme.Servis;

import com.example.deneme.Model.denememodel;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Header;


public interface TokenDenemeServis {
    @GET("/api/BirseyLazimmi")
    Call<denememodel> getProfil(@Header("Authorization") String autToken);
}
