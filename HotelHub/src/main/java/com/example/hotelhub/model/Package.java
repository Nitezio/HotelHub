package com.example.hotelhub.model;

import jakarta.persistence.*;

@Entity
public class Package {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long packageId;
    private String packageName;
    private String foodIncluded;
    private int numberOfDays;
    private int maxPeople;
    private String facilitiesIncluded;
    private double packagePrice;
    // Getters and Setters

    public Long getPackageId() {
        return packageId;
    }

    public void setPackageId(Long packageId) {
        this.packageId = packageId;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getFoodIncluded() {
        return foodIncluded;
    }

    public void setFoodIncluded(String foodIncluded) {
        this.foodIncluded = foodIncluded;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getFacilitiesIncluded() {
        return facilitiesIncluded;
    }

    public void setFacilitiesIncluded(String facilitiesIncluded) {
        this.facilitiesIncluded = facilitiesIncluded;
    }

    public double getPackagePrice() {
        return packagePrice;
    }

    public void setPackagePrice(double packagePrice) {
        this.packagePrice = packagePrice;
    }

    public Package() {
    }

    public Package(Long packageId, String packageName, String foodIncluded, int numberOfDays, int maxPeople, String facilitiesIncluded, double packagePrice) {
        this.packageId = packageId;
        this.packageName = packageName;
        this.foodIncluded = foodIncluded;
        this.numberOfDays = numberOfDays;
        this.maxPeople = maxPeople;
        this.facilitiesIncluded = facilitiesIncluded;
        this.packagePrice = packagePrice;
    }

    @Override
    public String toString() {
        return "Package{" +
                "packageId=" + packageId +
                ", packageName='" + packageName + '\'' +
                ", foodIncluded='" + foodIncluded + '\'' +
                ", numberOfDays=" + numberOfDays +
                ", maxPeople=" + maxPeople +
                ", facilitiesIncluded='" + facilitiesIncluded + '\'' +
                ", packagePrice=" + packagePrice +
                '}';
    }
}
