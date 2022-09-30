package com.Bridgelabz.EmployeeWageBuilder;

public class empWageBuilder {
    static int FULL_TIME = 1;
    static int empPerHR_wage = 20;

    //
    static int empHrs = 0;

    public static void main(String[] args) {
        getEmpDailyWage();

    }

    static double getEmpDailyWage() {
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == FULL_TIME)
            empHrs = 8;
        else
            empHrs = 0;
        double empWage = empHrs * empPerHR_wage;
        System.out.println("Employee Daily wage is " +empWage);

        return empWage;

    }

}
