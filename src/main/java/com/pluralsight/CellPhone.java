package com.pluralsight;

public class CellPhone {
    private int serial = 9999999;
    private String model = " iPhone X";
    private String carrier = "AT&T";
    private String phoneNumber = " 800-555-5555";
    private String owner = " Dana Wyatt)";

    public CellPhone() {
        serial = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}


