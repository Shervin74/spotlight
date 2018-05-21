package com.example.shervin.designtest.WebServices.Advertisments.Model.Filter;

import com.example.shervin.designtest.WebServices.Advertisments.Model.Filter.Application.Application;
import com.example.shervin.designtest.WebServices.Advertisments.Model.Filter.Estate_info.EstateType;
import com.example.shervin.designtest.WebServices.Advertisments.Model.Filter.Estate_info.Factory;
import com.example.shervin.designtest.WebServices.Advertisments.Model.Filter.Estate_info.FirstImage;
import com.example.shervin.designtest.WebServices.Advertisments.Model.Filter.Estate_info.Location;
import com.example.shervin.designtest.WebServices.Advertisments.Model.Filter.Estate_info.MainPicture;
import com.example.shervin.designtest.WebServices.Advertisments.Model.Filter.Estate_info.OwnerSt_;
import com.example.shervin.designtest.WebServices.Advertisments.Model.Filter.Region.Region;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Estate {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("main_picture_id")
    @Expose
    private Integer mainPictureId;
    @SerializedName("luxury_percentage")
    @Expose
    private Integer luxuryPercentage;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("altitude")
    @Expose
    private Double altitude;
    @SerializedName("address")
    @Expose
    private Object address;
    @SerializedName("area")
    @Expose
    private Object area;
    @SerializedName("land_area")
    @Expose
    private Object landArea;

//    @SerializedName("width")
//    @Expose
//    private Integer width;
//    @SerializedName("height")
//    @Expose
//    private Object height;
//    @SerializedName("street_width")
//    @Expose
//    private Double streetWidth;
//    @SerializedName("number_of_owners")
//    @Expose
//    private Integer numberOfOwners;
//    @SerializedName("building_age")
//    @Expose
//    private Integer buildingAge;
//    @SerializedName("is_rebuilt")
//    @Expose
//    private Object isRebuilt;
//    @SerializedName("land_ownership_area")
//    @Expose
//    private Object landOwnershipArea;
//    @SerializedName("elevation")
//    @Expose
//    private Double elevation;
    @SerializedName("first_image")
    @Expose
    private FirstImage firstImage;

//    @SerializedName("region")
//    @Expose
//    private Region region;
//    @SerializedName("estate_type")
//    @Expose
//    private EstateType estateType;
//    @SerializedName("document_type")
//    @Expose
//    private Object documentType;
//    @SerializedName("owner")
//    @Expose
//    private OwnerSt_ ownerSt;
//    @SerializedName("residential")
//    @Expose
//    private Object residential;
//    @SerializedName("factory")
//    @Expose
//    private Factory factory;
//    @SerializedName("garden")
//    @Expose
//    private Object garden;
//    @SerializedName("commercial")
//    @Expose
//    private Object commercial;
//    @SerializedName("main_picture")
//    @Expose
//    private MainPicture mainPicture;
//    @SerializedName("applications")
//    @Expose
//    private List<Application> applications = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMainPictureId() {
        return mainPictureId;
    }

    public void setMainPictureId(Integer mainPictureId) {
        this.mainPictureId = mainPictureId;
    }

    public Integer getLuxuryPercentage() {
        return luxuryPercentage;
    }

    public void setLuxuryPercentage(Integer luxuryPercentage) {
        this.luxuryPercentage = luxuryPercentage;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    public Object getAddress() {
        return address;
    }

    public void setAddress(Object address) {
        this.address = address;
    }

    public Object getArea() {
        return area;
    }

    public void setArea(Object area) {
        this.area = area;
    }

    public Object getLandArea() {
        return landArea;
    }

    public void setLandArea(Object landArea) {
        this.landArea = landArea;
    }

    public FirstImage getFirstImage() {
        return firstImage;
    }

    public void setFirstImage(FirstImage firstImage) {
        this.firstImage = firstImage;
    }

    //    public Integer getWidth() {
//        return width;
//    }
//
//    public void setWidth(Integer width) {
//        this.width = width;
//    }
//
//    public Object getHeight() {
//        return height;
//    }
//
//    public void setHeight(Object height) {
//        this.height = height;
//    }
//
//    public Double getStreetWidth() {
//        return streetWidth;
//    }
//
//    public void setStreetWidth(Double streetWidth) {
//        this.streetWidth = streetWidth;
//    }
//
//    public Integer getNumberOfOwners() {
//        return numberOfOwners;
//    }
//
//    public void setNumberOfOwners(Integer numberOfOwners) {
//        this.numberOfOwners = numberOfOwners;
//    }
//
//    public Integer getBuildingAge() {
//        return buildingAge;
//    }
//
//    public void setBuildingAge(Integer buildingAge) {
//        this.buildingAge = buildingAge;
//    }
//
//    public Object getIsRebuilt() {
//        return isRebuilt;
//    }
//
//    public void setIsRebuilt(Object isRebuilt) {
//        this.isRebuilt = isRebuilt;
//    }
//
//    public Object getLandOwnershipArea() {
//        return landOwnershipArea;
//    }
//
//    public void setLandOwnershipArea(Object landOwnershipArea) {
//        this.landOwnershipArea = landOwnershipArea;
//    }
//
//    public Double getElevation() {
//        return elevation;
//    }
//
//    public void setElevation(Double elevation) {
//        this.elevation = elevation;
//    }
//
//    public FirstImage getFirstImage() {
//        return firstImage;
//    }
//
//    public void setFirstImage(FirstImage firstImage) {
//        this.firstImage = firstImage;
//    }
//
//    public Region getRegion() {
//        return region;
//    }
//
//    public void setRegion(Region region) {
//        this.region = region;
//    }
//
//    public EstateType getEstateType() {
//        return estateType;
//    }
//
//    public void setEstateType(EstateType estateType) {
//        this.estateType = estateType;
//    }
//
//    public Object getDocumentType() {
//        return documentType;
//    }
//
//    public void setDocumentType(Object documentType) {
//        this.documentType = documentType;
//    }
//
//    public OwnerSt_ getOwnerSt() {
//        return ownerSt;
//    }
//
//    public void setOwnerSt(OwnerSt_ ownerSt) {
//        this.ownerSt = ownerSt;
//    }
//
//    public Object getResidential() {
//        return residential;
//    }
//
//    public void setResidential(Object residential) {
//        this.residential = residential;
//    }
//
//    public Factory getFactory() {
//        return factory;
//    }
//
//    public void setFactory(Factory factory) {
//        this.factory = factory;
//    }
//
//    public Object getGarden() {
//        return garden;
//    }
//
//    public void setGarden(Object garden) {
//        this.garden = garden;
//    }
//
//    public Object getCommercial() {
//        return commercial;
//    }
//
//    public void setCommercial(Object commercial) {
//        this.commercial = commercial;
//    }
//
//    public MainPicture getMainPicture() {
//        return mainPicture;
//    }
//
//    public void setMainPicture(MainPicture mainPicture) {
//        this.mainPicture = mainPicture;
//    }
//
//    public List<Application> getApplications() {
//        return applications;
//    }
//
//    public void setApplications(List<Application> applications) {
//        this.applications = applications;
//    }
}
