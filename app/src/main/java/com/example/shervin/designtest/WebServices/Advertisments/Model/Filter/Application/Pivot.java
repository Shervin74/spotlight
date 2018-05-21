package com.example.shervin.designtest.WebServices.Advertisments.Model.Filter.Application;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pivot {
    @SerializedName("estate_id")
    @Expose
    private Integer estateId;
    @SerializedName("application_id")
    @Expose
    private Integer applicationId;

    public Integer getEstateId() {
        return estateId;
    }

    public void setEstateId(Integer estateId) {
        this.estateId = estateId;
    }

    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }
}
