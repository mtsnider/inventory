package com.strangerandglory.inventory;

import java.util.Date;

/**
 * Created by m on 2016-10-31.
 */

public class Item {

    private String name;
    private double price;
    private double attributeWeightName;
    private double weight;
    private Date photoDate;
    private String brandName;
    private String categoryName;
    private int quantity;
    private int optimumQuantity;
    private int leastOptimumQuantity;

    public Item(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAttributeWeightName() {
        return attributeWeightName;
    }

    public void setAttributeWeightName(double attributeWeightName) {
        this.attributeWeightName = attributeWeightName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Date getPhotoDate() {
        return photoDate;
    }

    public void setPhotoDate(Date photoDate) {
        this.photoDate = photoDate;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getOptimumQuantity() {
        return optimumQuantity;
    }

    public void setOptimumQuantity(int optimumQuantity) {
        this.optimumQuantity = optimumQuantity;
    }

    public int getLeastOptimumQuantity() {
        return leastOptimumQuantity;
    }

    public void setLeastOptimumQuantity(int leastOptimumQuantity) {
        this.leastOptimumQuantity = leastOptimumQuantity;
    }
}
