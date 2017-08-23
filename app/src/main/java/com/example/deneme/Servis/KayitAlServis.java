package com.example.deneme.Servis;

import com.example.deneme.Model.KayitOlusturModelCb;
import com.example.deneme.Model.KayitOlusturModel;


import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.Header;
import retrofit.http.POST;



public interface KayitAlServis {
    @POST("/BirseyLazimmi/KullaniciKaydet/api/json")
    Call<KayitOlusturModelCb> Kayital(@Body KayitOlusturModel kayitOlusturModel, @Header("Authorization")String autToken);
}
