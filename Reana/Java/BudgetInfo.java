package com.example.summit_power_company_.ReanaManagingDirector;

import java.time.LocalDate;

public class BudgetInfo {
    private int proposalId;
    private String department;


    private int amount; // 0 = Unlimited

    private String status;
    private LocalDate date;

    public BudgetInfo(int proposalId, String department, int amount, String status, LocalDate date) {
        this.proposalId = proposalId;
        this.department = department;
        this.amount = amount;
        this.status = status;
        this.date = date;
    }

    public int getProposalId() {
        return proposalId;
    }

    public void setProposalId(int proposalId) {
        this.proposalId = proposalId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "BudgetInfo{" +
                "proposalId=" + proposalId +
                ", department='" + department + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                ", date=" + date +
                '}';
    }
}
