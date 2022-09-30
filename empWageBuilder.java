package com.Bridgelabz.EmployeeWageBuilder;

public class empWageBuilder {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public static int empPerHR_wage = 20;

    //emplyee hours

    static int num_of_Working_days = 20;
    static int max_Hour_In_Month = 100;
    static int empHrs = 0;
    static int totalEmpHr = 0;
    static int totalWorkingDays = 0;

    public static void main(String[] args) {
        getEmpTotalWage();

    }

    static void getEmpTotalWage() {
        while (totalEmpHr <= max_Hour_In_Month && totalWorkingDays < num_of_Working_days) {
            totalWorkingDays++;
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
            totalEmpHr += empHrs;
            System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " + empHrs);
        }
        int totalEmpWage = totalEmpHr * empPerHR_wage;
        System.out.println("Employee Total Wage: " +totalEmpWage+ " Rs");

    }

}
