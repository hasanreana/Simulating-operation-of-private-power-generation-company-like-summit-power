package com.example.summit_power_company_.ReanaManagingDirector;

import java.io.Serializable;

public class MaterialProducts implements Serializable {
    private String materialName;
    private int materialQuantity;
    private int manpower;
    private int budget;

    public MaterialProducts() {
    }

    public MaterialProducts(String materialName, int materialQuantity, int manpower, int budget) {
        this.materialName = materialName;
        this.materialQuantity = materialQuantity;
        this.manpower = manpower;
        this.budget = budget;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public int getMaterialQuantity() {
        return materialQuantity;
    }

    public void setMaterialQuantity(int materialQuantity) {
        this.materialQuantity = materialQuantity;
    }

    public int getManpower() {
        return manpower;
    }

    public void setManpower(int manpower) {
        this.manpower = manpower;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "MaterialProducts{" +
                "materialName='" + materialName + '\'' +
                ", materialQuantity=" + materialQuantity +
                ", manpower=" + manpower +
                ", budget=" + budget +
                '}';
    }
}
