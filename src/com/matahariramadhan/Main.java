package com.matahariramadhan;

public class Main {
    public static void main(String[] args) {
        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;

        System.out.println(calculateWage(baseSalary,extraHours,hourlyRate));
    }
    public static int calculateWage(int baseSalary, int extraHours, int hourlyRate){
        int wage = baseSalary + (extraHours * hourlyRate);
        return wage;
    }
}