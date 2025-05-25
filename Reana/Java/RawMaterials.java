package com.example.summit_power_company_.ReanaManagingDirector;

public class RawMaterials {
    String rawName;
    int rawQuantity;

    public RawMaterials(String rawName, int rawQuantity) {
        this.rawName = rawName;
        this.rawQuantity = rawQuantity;
    }

    public String getRawName() {
        return rawName;
    }

    public void setRawName(String rawName) {
        this.rawName = rawName;
    }

    public int getRawQuantity() {
        return rawQuantity;
    }

    public void setRawQuantity(int rawQuantity) {
        this.rawQuantity = rawQuantity;
    }

    @Override
    public String toString() {
        return "RawMaterials{" +
                "rawName='" + rawName + '\'' +
                ", rawQuantity=" + rawQuantity +
                '}';
    }
}
