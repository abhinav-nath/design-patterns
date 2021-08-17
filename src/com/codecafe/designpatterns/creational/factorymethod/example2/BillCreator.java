package com.codecafe.designpatterns.creational.factorymethod.example2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BillCreator {

    public static void main(String[] args) throws IOException {

        PlanFactory planFactory = new PlanFactory();

        System.out.println("Enter the name of the plan : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String planName = br.readLine();

        System.out.println("Enter the number of units consumed : ");
        int units = Integer.parseInt(br.readLine());

        Plan plan = planFactory.getPlan(planName);

        if (plan != null) {
            plan.setRate();

            System.out.println("Bill for plan " + planName + " and " + units + " units is : ");
            plan.calculateBill(units);
        } else {
            System.out.println("plan name is invalid");
        }
    }

}