package com.vacaciones;

import java.util.Scanner;

public class months {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month number: ");
        int monthNumber = scanner.nextInt();

        String monthName = getMonthName(monthNumber);
        int daysInMonth = getDaysInMonth(monthNumber);

        if (daysInMonth != -1) {
            System.out.println("The month is " + monthName + " and has " + daysInMonth + " days.");
        } else {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }

        scanner.close();
    }

    public static String getMonthName(int monthNumber) {
        String[] monthNames = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };

        if (monthNumber >= 1 && monthNumber <= 12) {
            return monthNames[monthNumber - 1];
        } else {
            return "Invalid month";
        }
    }

    public static int getDaysInMonth(int monthNumber) {
        int[] daysInMonths = {
            31, 28, 31, 30,
            31, 30, 31, 31,
            30, 31, 30, 31
        };

        if (monthNumber >= 1 && monthNumber <= 12) {
            return daysInMonths[monthNumber - 1];
        } else {
            return -1;
        }
    }

}


