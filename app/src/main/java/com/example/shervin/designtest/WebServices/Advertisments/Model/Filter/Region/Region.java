package com.example.shervin.designtest.WebServices.Advertisments.Model.Filter.Region;

import com.example.shervin.designtest.WebServices.Advertisments.Model.Filter.Region.CenterPoint;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Region {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("parent_id")
    @Expose
    private Integer parentId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("en_name")
    @Expose
    private String enName;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("center_point")
    @Expose
    private CenterPoint centerPoint;
    @SerializedName("official_traffic_area")
    @Expose
    private String officialTrafficArea;
    @SerializedName("has_children")
    @Expose
    private Integer hasChildren;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CenterPoint getCenterPoint() {
        return centerPoint;
    }

    public void setCenterPoint(CenterPoint centerPoint) {
        this.centerPoint = centerPoint;
    }

    public String getOfficialTrafficArea() {
        return officialTrafficArea;
    }

    public void setOfficialTrafficArea(String officialTrafficArea) {
        this.officialTrafficArea = officialTrafficArea;
    }

    public Integer getHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(Integer hasChildren) {
        this.hasChildren = hasChildren;
    }
}
