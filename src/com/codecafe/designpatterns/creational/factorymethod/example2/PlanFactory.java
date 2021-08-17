package com.codecafe.designpatterns.creational.factorymethod.example2;

public class PlanFactory {

    // Factory method
    public Plan getPlan(String planName) {

        if ("COMMERCIALPLAN".equalsIgnoreCase(planName))
            return new CommercialPlan();

        if ("DOMESTICPLAN".equalsIgnoreCase(planName))
            return new DomesticPlan();

        if ("INSTITUTIONALPLAN".equalsIgnoreCase(planName))
            return new InstitutionalPlan();

        return null;

    }
}