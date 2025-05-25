package com.example.summit_power_company_.ReanaManagingDirector;

public class Production {
    String batchName;
    int batchItem;

    public Production(String batchName, int batchItem) {
        this.batchName = batchName;
        this.batchItem = batchItem;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public int getBatchItem() {
        return batchItem;
    }

    public void setBatchItem(int batchItem) {
        this.batchItem = batchItem;
    }

    @Override
    public String toString() {
        return "Production{" +
                "batchName='" + batchName + '\'' +
                ", batchItem=" + batchItem +
                '}';
    }
}
