package com.techelevator.ui;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Responsibilities: This class should handle receiving ALL input from the User
 * 
 * Dependencies: None
 */
public class UserInput {
    private static Scanner scanner = new Scanner(System.in);

    public static String getHomeScreenOption() {
        System.out.println("What would you like to do?");
        System.out.println();

        System.out.println("D) Display Vending Machine Items");
        System.out.println("P) Purchase");
        System.out.println("E) Exit");

        System.out.println();
        System.out.print("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toUpperCase();

        if (option.equals("D")) {
            return "display";
        } else if (option.equals("P")) {
            return "purchase";
        } else if (option.equals("E")) {
            return "exit";
        } else {
            return "";
        }

    }

    public static String getPurchaseOption() {
        // When the customer selects "P" we need the display to give the next few options
        System.out.println("(M) Feed Money");
        System.out.println("(S) Select Transaction");
        System.out.println("(F) Finish Transaction");

        System.out.println();
        System.out.println("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toUpperCase();

        if (option.equals("M")) {
            return "Money";
        } else if (option.equals("S")) {
            return "Select Item";
        } else if (option.equals("F")) {
            return "Finish Transaction";
        } else {
            return "";
        }

    }

    public static int getMoneyFeedingOption() {

        int amountFeedingA = 1;
        int amountFeedingB = 5;
        int amountFeedingC = 10;
        int amountFeedingD = 20;

        System.out.println("Please select amount");
        System.out.println();

        System.out.println("A) $1");
        System.out.println("B) $5");
        System.out.println("C) $10");
        System.out.println("D) $20");

        System.out.println();
        System.out.print("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toUpperCase();


        if (option.equals("A) $1")) {
            return amountFeedingA;

        } else if (option.equals("B) $5")) {
            return amountFeedingB;

        } else if (option.equals("C) $10")) {
            return amountFeedingC;

        } else if (option.equals("D) $20")) {
            return amountFeedingD;
        }

        return getMoneyFeedingOption();
    }



    }

    

