package com.matahariramadhan;
import com.matahariramadhan.Employee;

public class Main {
    public static void main(String[] args) {
//        var employee = new Employee(50_000,20);
        var employee = new Employee(50_000);
//        int wage = employee.calculateWage(10);
        int wage = employee.calculateWage();
        Employee.printNumberOfEmployee();

        System.out.println(wage);
    }
}