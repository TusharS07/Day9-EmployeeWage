package com.Bridgelabz.EmployeeWageBuilder;

public class empWageBuilder {
    static int FULL_TIME = 1;
    static int PART_TIME = 2;
    static int empPerHR_wage = 20;

    //
    static int empHrs = 0;

    public static void main(String[] args) {
        getEmpDailyWage();

    }

    static double getEmpDailyWage() {
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == FULL_TIME)
            empHrs = 8;
        else if (empCheck == PART_TIME)
            empHrs = 4;
        double empWage = empHrs * empPerHR_wage;
        System.out.println("Employee Daily wage is " +empWage);

        return empWage;

    }

}
