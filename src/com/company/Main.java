package com.company;

import java.util.Scanner;

public class Main {
    public static void printNextLeapYears (int year) {
        int count = 0;

        while (count < 20) {
            year++;
             if (checkIfYearIsLead(year)){
                System.out.println("Anul # " + (count + 1) + " " + year);
                count++;
            }
        }
    }
    public static boolean checkIfYearIsLead (int year) {
        boolean isLeapYear = false;
        if(year % 4 == 0) {
            isLeapYear = true;
        }
        return isLeapYear;
    }

    public static void main(String[] args) {
        // Afisare urmatorilor 20 de ani bisecti
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti un an:");
        int year = sc.nextInt();
        if (checkIfYearIsLead(year)) {
            System.out.println("Bisect");
            printNextLeapYears(year);

        } else {
            System.out.println("Nu este bisect");
        }
    }
}