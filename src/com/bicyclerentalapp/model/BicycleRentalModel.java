/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bicyclerentalapp.model;

/**
 *
 * @author Prajjwal Nakarmi
 */
public class BicycleRentalModel {
    private int customerId;
    private String fullname;
    private String email;
    private long contact;
    private int rentedDays;
    private String modelNo;
    private String modelName;

    public BicycleRentalModel() {
    }

    public BicycleRentalModel(int customerId, String fullname, String email, long contact, int rentedDays, String modelNo, String modelName) {
        this.customerId = customerId;
        this.fullname = fullname;
        this.email = email;
        this.contact = contact;
        this.rentedDays = rentedDays;
        this.modelNo = modelNo;
        this.modelName = modelName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public int getRentedDays() {
        return rentedDays;
    }

    public void setRentedDays(int rentedDays) {
        this.rentedDays = rentedDays;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
