package com.matahariramadhan;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployee;

    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployee++;
    }

    public Employee(int baseSalary){
        this(baseSalary,0);
    }

    public static void printNumberOfEmployee(){
        System.out.println(numberOfEmployee);
    }

    public int calculateWage(int extraHours){
        return baseSalary + (extraHours * hourlyRate);
    }

    public int calculateWage(){
        return calculateWage(0);
    }

    private void setBaseSalary(int baseSalary){
        if (baseSalary < 0)
            throw  new IllegalArgumentException("Base Salary cannot less then 0");

        this.baseSalary = baseSalary;
    }

    private int getBaseSalary(){
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate){
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly Rate cannot less then 0");

        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }
}
