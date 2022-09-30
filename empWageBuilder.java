package com.Bridgelabz.EmployeeWageBuilder;

public class empWageBuilder {
    static int FULL_TIME = 1;

    public static void main(String[] args) {
        //check emp present or not
        checkEmpPresent();


    }

    static double checkEmpPresent() {
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == FULL_TIME)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Present");

        return empCheck;
    }
}
