/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Ben Phung
 */

package org.example;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // Prompt user
        System.out.println( "Press C to convert from Fahrenheit to Celsius. " );
        System.out.println( "Press F to convert from Celsius to Fahrenheit. " );
        String Degree = scan.nextLine();
        Degree = Degree.toLowerCase();


        if (Degree.equals("c"))
        {
            System.out.print( "Please enter the temperature in Fahrenheit: ");
            String TempF = scan.nextLine();

            // Turn string into double
            double dTempF = Double.parseDouble(TempF);
            // Calculate
            double dTempC = (dTempF - 32) * (5.0 / 9.0);

            System.out.println( "The temperature in Celsius is" +dTempC);
        }
        else if (Degree.equals("f"))
        {
            System.out.print( "Please enter the temperature in Celsius: ");
            String TempC = scan.nextLine();

            // Turn string into double
            double dTempC = Double.parseDouble(TempC);

            // Calculate
            double dTempF = (dTempC * (9.0 / 5.0)) + 32;

            System.out.println( "The temperature in Fahrenheit is " +dTempF);
        }
        // For if user doesn't enter C or F
        else
        {
            System.out.println( "Invalid input.");
        }
    }
}
