package com.example.shervin.designtest.WebServices.Advertisments.Interfaces;

import com.example.shervin.designtest.WebServices.Advertisments.DataResponse;

import retrofit2.Call;
import retrofit2.http.POST;

public interface DataInterface {

    @POST("advertisement/filter?window_size=50&order=our_suggestion&direction=asc")
    Call<DataResponse> getData();
}
