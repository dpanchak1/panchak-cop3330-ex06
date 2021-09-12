/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 David Panchak
 */
package org.example;
import java.util.Scanner;
import java.util.Calendar;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input=new Scanner(System.in);
        System.out.print("What is your current age? ");
        int currentAge= input.nextInt();
        System.out.print("What age would you like to retire? ");
        int retirementAge= input.nextInt();

        int yearsLeft= retirementAge-currentAge;
        int currentYear=Calendar.getInstance().get(Calendar.YEAR);
        int retirementYear=currentYear+yearsLeft;

        System.out.printf("You have %d years left until you can retire.%n",yearsLeft);
        System.out.printf("It is %d, so you can retire in %d",currentYear, retirementYear);


    }
}
