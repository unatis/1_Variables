package com.company;

import java.io.Console;
import java.util.Scanner;

public class Main_Operators_1 {

    public static void main(String[] args) {

        int CurrentYear = 2021;
        String Name = "";
        String LastName = "";
        String FullName ="";
        int YearOfBirth = 0;
        int WorkingDaysInMonth = 25;
        int WorkingHoursPerDay = 8;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter worker name : ");
        Name = scanner.nextLine();

        System.out.print("Please enter worker last name : ");
        LastName = scanner.nextLine();

        FullName = Name + " " + LastName;

        System.out.print("Please enter worker year of birth : ");
        YearOfBirth = scanner.nextInt();

        System.out.print("Please enter worker salary per hour : ");
        double DalySalary = scanner.nextDouble();

        int Age = CurrentYear - YearOfBirth;

        double MonthSalary = (WorkingHoursPerDay * DalySalary) * WorkingDaysInMonth;

        System.out.print("\n");
        System.out.println("FullName: " + FullName);
        System.out.println("Age: " + Age);
        System.out.println("Salary: " + MonthSalary);

    }

}

