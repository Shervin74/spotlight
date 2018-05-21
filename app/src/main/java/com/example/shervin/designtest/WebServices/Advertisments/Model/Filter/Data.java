package com.example.shervin.designtest.WebServices.Advertisments.Model.Filter;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("admin_message")
    @Expose
    private Object adminMessage;
    @SerializedName("published_at")
    @Expose
    private String publishedAt;
    @SerializedName("laddered_at")
    @Expose
    private String ladderedAt;
    @SerializedName("expires_at")
    @Expose
    private String expiresAt;
    @SerializedName("is_special")
    @Expose
    private Boolean isSpecial;
    @SerializedName("is_location_visible")
    @Expose
    private Boolean isLocationVisible;
    @SerializedName("is_empty")
    @Expose
    private Object isEmpty;
    @SerializedName("evacuation_date")
    @Expose
    private Object evacuationDate;
    @SerializedName("advertisement_completeness_percentage")
    @Expose
    private Integer advertisementCompletenessPercentage;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("priority_weight")
    @Expose
    private Integer priorityWeight;
    @SerializedName("update_credits")
    @Expose
    private Integer updateCredits;
    @SerializedName("max_connected_agents_count")
    @Expose
    private Integer maxConnectedAgentsCount;
    @SerializedName("number_of_pictures")
    @Expose
    private Integer numberOfPictures;
    @SerializedName("is_visible_in_ar")
    @Expose
    private Boolean isVisibleInAr;
    @SerializedName("has_sms_notifications")
    @Expose
    private Boolean hasSmsNotifications;
    @SerializedName("has_email_notifications")
    @Expose
    private Boolean hasEmailNotifications;
    @SerializedName("latest_package_id")
    @Expose
    private Object latestPackageId;
    @SerializedName("is_liked")
    @Expose
    private Boolean isLiked;
    @SerializedName("is_seen")
    @Expose
    private Boolean isSeen;
    @SerializedName("is_open_house")
    @Expose
    private Boolean isOpenHouse;
    @SerializedName("owner")
    @Expose
    private Owner owner;
    @SerializedName("estate")
    @Expose
    private Estate estate;
    @SerializedName("advertisement_type")
    @Expose
    private AdevertisementType advertisementType;
    @SerializedName("presale")
    @Expose
    private Presale presale;
    @SerializedName("rent")
    @Expose
    private Object rent;
    @SerializedName("sale")
    @Expose
    private Object sale;
    @SerializedName("allowed_pets")
    @Expose
    private List<Object> allowedPets = null;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getAdminMessage() {
        return adminMessage;
    }

    public void setAdminMessage(Object adminMessage) {
        this.adminMessage = adminMessage;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getLadderedAt() {
        return ladderedAt;
    }

    public void setLadderedAt(String ladderedAt) {
        this.ladderedAt = ladderedAt;
    }

    public String getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    public Boolean getIsSpecial() {
        return isSpecial;
    }

    public void setIsSpecial(Boolean isSpecial) {
        this.isSpecial = isSpecial;
    }

    public Boolean getIsLocationVisible() {
        return isLocationVisible;
    }

    public void setIsLocationVisible(Boolean isLocationVisible) {
        this.isLocationVisible = isLocationVisible;
    }

    public Object getIsEmpty() {
        return isEmpty;
    }

    public void setIsEmpty(Object isEmpty) {
        this.isEmpty = isEmpty;
    }

    public Object getEvacuationDate() {
        return evacuationDate;
    }

    public void setEvacuationDate(Object evacuationDate) {
        this.evacuationDate = evacuationDate;
    }

    public Integer getAdvertisementCompletenessPercentage() {
        return advertisementCompletenessPercentage;
    }

    public void setAdvertisementCompletenessPercentage(Integer advertisementCompletenessPercentage) {
        this.advertisementCompletenessPercentage = advertisementCompletenessPercentage;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public Integer getPriorityWeight() {
        return priorityWeight;
    }

    public void setPriorityWeight(Integer priorityWeight) {
        this.priorityWeight = priorityWeight;
    }

    public Integer getUpdateCredits() {
        return updateCredits;
    }

    public void setUpdateCredits(Integer updateCredits) {
        this.updateCredits = updateCredits;
    }

    public Integer getMaxConnectedAgentsCount() {
        return maxConnectedAgentsCount;
    }

    public void setMaxConnectedAgentsCount(Integer maxConnectedAgentsCount) {
        this.maxConnectedAgentsCount = maxConnectedAgentsCount;
    }

    public Integer getNumberOfPictures() {
        return numberOfPictures;
    }

    public void setNumberOfPictures(Integer numberOfPictures) {
        this.numberOfPictures = numberOfPictures;
    }

    public Boolean getIsVisibleInAr() {
        return isVisibleInAr;
    }

    public void setIsVisibleInAr(Boolean isVisibleInAr) {
        this.isVisibleInAr = isVisibleInAr;
    }

    public Boolean getHasSmsNotifications() {
        return hasSmsNotifications;
    }

    public void setHasSmsNotifications(Boolean hasSmsNotifications) {
        this.hasSmsNotifications = hasSmsNotifications;
    }

    public Boolean getHasEmailNotifications() {
        return hasEmailNotifications;
    }

    public void setHasEmailNotifications(Boolean hasEmailNotifications) {
        this.hasEmailNotifications = hasEmailNotifications;
    }

    public Object getLatestPackageId() {
        return latestPackageId;
    }

    public void setLatestPackageId(Object latestPackageId) {
        this.latestPackageId = latestPackageId;
    }

    public Boolean getIsLiked() {
        return isLiked;
    }

    public void setIsLiked(Boolean isLiked) {
        this.isLiked = isLiked;
    }

    public Boolean getIsSeen() {
        return isSeen;
    }

    public void setIsSeen(Boolean isSeen) {
        this.isSeen = isSeen;
    }

    public Boolean getIsOpenHouse() {
        return isOpenHouse;
    }

    public void setIsOpenHouse(Boolean isOpenHouse) {
        this.isOpenHouse = isOpenHouse;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Estate getEstate() {
        return estate;
    }

    public void setEstate(Estate estate) {
        this.estate = estate;
    }

    public AdevertisementType getAdvertisementType() {
        return advertisementType;
    }

    public void setAdvertisementType(AdevertisementType advertisementType) {
        this.advertisementType = advertisementType;
    }

    public Presale getPresale() {
        return presale;
    }

    public void setPresale(Presale presale) {
        this.presale = presale;
    }

    public Object getRent() {
        return rent;
    }

    public void setRent(Object rent) {
        this.rent = rent;
    }

    public Object getSale() {
        return sale;
    }

    public void setSale(Object sale) {
        this.sale = sale;
    }

    public List<Object> getAllowedPets() {
        return allowedPets;
    }

    public void setAllowedPets(List<Object> allowedPets) {
        this.allowedPets = allowedPets;
    }
}
