package com.matahariramadhan;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public int calculateWage(int extraHours){
        return baseSalary + (extraHours * hourlyRate);
    }

    public void setBaseSalary(int baseSalary){
        if (baseSalary <= 0)
            throw  new IllegalArgumentException("Base Salary cannot less then or equal to 0");

        this.baseSalary = baseSalary;
    }

    private int getBaseSalary(){
        return baseSalary;
    }

    public void setHourlyRate(int hourlyRate){
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly Rate cannot less then or equal to 0");

        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }
}
