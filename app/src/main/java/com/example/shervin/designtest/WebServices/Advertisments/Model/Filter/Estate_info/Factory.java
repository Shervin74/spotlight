package com.example.shervin.designtest.WebServices.Advertisments.Model.Filter.Estate_info;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Factory {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("has_factory_building")
    @Expose
    private Boolean hasFactoryBuilding;
    @SerializedName("number_of_ceiling_areas")
    @Expose
    private Integer numberOfCeilingAreas;
    @SerializedName("ceiling_area")
    @Expose
    private Object ceilingArea;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getHasFactoryBuilding() {
        return hasFactoryBuilding;
    }

    public void setHasFactoryBuilding(Boolean hasFactoryBuilding) {
        this.hasFactoryBuilding = hasFactoryBuilding;
    }

    public Integer getNumberOfCeilingAreas() {
        return numberOfCeilingAreas;
    }

    public void setNumberOfCeilingAreas(Integer numberOfCeilingAreas) {
        this.numberOfCeilingAreas = numberOfCeilingAreas;
    }

    public Object getCeilingArea() {
        return ceilingArea;
    }

    public void setCeilingArea(Object ceilingArea) {
        this.ceilingArea = ceilingArea;
    }

}
