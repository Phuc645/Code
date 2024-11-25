package com.hsu.lab06;

public class Shippers {
    private int shipperID;
    private String companyName;
    private String phone;

    public Shippers() {
    }

    public Shippers(int shipperID, String companyName, String phone) {
        this.shipperID = shipperID;
        this.companyName = companyName;
        this.phone = phone;
    }

    public int getShipperID() {
        return shipperID;
    }

    public void setShipperID(int shipperID) {
        this.shipperID = shipperID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        String S = String.format("%-20d%-20s%-20s\n", shipperID, companyName, phone);
        return S;
    }

}
