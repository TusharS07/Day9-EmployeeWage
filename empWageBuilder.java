package com.Bridgelabz.EmployeeWageBuilder;

public class empWageBuilder {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    static int empPerHR_wage = 20;

    //
    static int empHrs = 0;
    static int num_of_Working_days = 20;
    static double empWage = 0;
    static double totalEmpWage = 0;

    public static void main(String[] args) {
        getEmpMonthWage();

    }

    static void getEmpMonthWage() {
            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
            switch (empCheck) {
                case FULL_TIME:
                    empHrs = 8;
                    break;
                case PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * empPerHR_wage;
            totalEmpWage =empWage * num_of_Working_days;
            System.out.println("Employee Daily wage is " + empWage+ " Rs");
            System.out.println("Total Monthly Emp wage:- " +totalEmpWage+ " Rs");

    }

}
