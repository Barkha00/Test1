package com.example.test1.API;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {



    @GET("/")
    Call<ApiModel>getData();


}
