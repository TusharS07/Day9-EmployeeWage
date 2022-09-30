package com.Bridgelabz.EmployeeWageDay9;

public class EmpWageBuilder {
    public final int FULL_TIME = 1;
    public final int PART_TIME = 2;
    public int empPerHR_wage = 20;


    public int num_of_Working_days = 20;
    public int max_Hour_In_Month = 100;


    public static void main(String[] args) {
        TotalEmpWage totalWage = new TotalEmpWage();
        totalWage.getEmpTotalWage();


    }

    public static class  TotalEmpWage extends EmpWageBuilder {

        public int empHrs = 0;
        public int totalEmpHr = 0;
        public int totalWorkingDays = 0;


        public void getEmpTotalWage() {
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
            System.out.println("Employee Total Wage: " + totalEmpWage + " Rs");

        }
    }
}
