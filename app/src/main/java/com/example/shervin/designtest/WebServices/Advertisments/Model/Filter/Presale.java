package com.example.shervin.designtest.WebServices.Advertisments.Model.Filter;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Presale {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("total_price")
    @Expose
    private Integer totalPrice;
    @SerializedName("is_installmentable")
    @Expose
    private Boolean isInstallmentable;
    @SerializedName("payment_method")
    @Expose
    private Object paymentMethod;
    @SerializedName("has_loan")
    @Expose
    private Object hasLoan;
    @SerializedName("loan_amount")
    @Expose
    private Object loanAmount;
    @SerializedName("is_swappable")
    @Expose
    private Object isSwappable;
    @SerializedName("ownership_percentage")
    @Expose
    private Integer ownershipPercentage;
    @SerializedName("is_furnished")
    @Expose
    private Object isFurnished;
    @SerializedName("progress_percentage")
    @Expose
    private Object progressPercentage;
    @SerializedName("delivery_date")
    @Expose
    private Object deliveryDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Boolean getIsInstallmentable() {
        return isInstallmentable;
    }

    public void setIsInstallmentable(Boolean isInstallmentable) {
        this.isInstallmentable = isInstallmentable;
    }

    public Object getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Object paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Object getHasLoan() {
        return hasLoan;
    }

    public void setHasLoan(Object hasLoan) {
        this.hasLoan = hasLoan;
    }

    public Object getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Object loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Object getIsSwappable() {
        return isSwappable;
    }

    public void setIsSwappable(Object isSwappable) {
        this.isSwappable = isSwappable;
    }

    public Integer getOwnershipPercentage() {
        return ownershipPercentage;
    }

    public void setOwnershipPercentage(Integer ownershipPercentage) {
        this.ownershipPercentage = ownershipPercentage;
    }

    public Object getIsFurnished() {
        return isFurnished;
    }

    public void setIsFurnished(Object isFurnished) {
        this.isFurnished = isFurnished;
    }

    public Object getProgressPercentage() {
        return progressPercentage;
    }

    public void setProgressPercentage(Object progressPercentage) {
        this.progressPercentage = progressPercentage;
    }

    public Object getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Object deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

}
