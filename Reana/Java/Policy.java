package com.example.summit_power_company_.ReanaManagingDirector;

import java.time.LocalDate;

public class Policy {
    private String policytitle;
    private String policyDetails;
    private LocalDate policyEffectiveDate;

    public Policy(String policytitle, String policyDetails, LocalDate policyEffectiveDate) {
        this.policytitle = policytitle;
        this.policyDetails = policyDetails;
        this.policyEffectiveDate = policyEffectiveDate;
    }

    public String getPolicytitle() {
        return policytitle;
    }

    public void setPolicytitle(String policytitle) {
        this.policytitle = policytitle;
    }

    public String getPolicyDetails() {
        return policyDetails;
    }

    public void setPolicyDetails(String policyDetails) {
        this.policyDetails = policyDetails;
    }

    public LocalDate getPolicyEffectiveDate() {
        return policyEffectiveDate;
    }

    public void setPolicyEffectiveDate(LocalDate policyEffectiveDate) {
        this.policyEffectiveDate = policyEffectiveDate;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policytitle='" + policytitle + '\'' +
                ", policyDetails='" + policyDetails + '\'' +
                ", policyEffectiveDate=" + policyEffectiveDate +
                '}';
    }
}
