package com.techelevator.ui;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Responsibilities: This class should handle receiving ALL input from the User
 * 
 * Dependencies: None
 */
public class UserInput {
    private static BigDecimal balance = new BigDecimal(0);
    private static Scanner scanner = new Scanner(System.in);

    public static BigDecimal getBalance() {
        return balance;
    }

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
            return "Feed Money";
        } else if (option.equals("S")) {
            return "Select Item";
        } else if (option.equals("F")) {
            return "Current Money Provided: " + balance;
        } else {
            return "";
        }

    }

    public static BigDecimal moneyFeed() {


        System.out.println("Please select amount");
        System.out.println();

        System.out.println("$1");
        System.out.println("$5");
        System.out.println("$10");
        System.out.println("$20");

        System.out.println();
        System.out.print("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toUpperCase();



        if (option.equals("1") || option.equals("5") || option.equals("10") || option.equals("20")) {
            balance = balance.add(BigDecimal.valueOf(Integer.parseInt(option)));
        }
        return balance;
    }



    }

    

