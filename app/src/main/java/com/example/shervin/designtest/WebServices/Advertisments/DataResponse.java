package com.example.shervin.designtest.WebServices.Advertisments;

import com.example.shervin.designtest.WebServices.Advertisments.Model.Filter.Data;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataResponse {

    @SerializedName("data")
    @Expose
    private List<Data> datas;


    public List<Data> getDatas() {
        return datas;
    }

    public void setDatas(List<Data> datas) {
        this.datas = datas;
    }
}
