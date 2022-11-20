package com.techelevator.application;

import com.techelevator.models.*;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {

    private int balance = 0;

    public void run() {
      List<Items> list = readFile();


            while (true) {
                UserOutput.displayHomeScreen();
                String choice = UserInput.getHomeScreenOption();

                if (choice.equals("display")) {
                    // display the vending machine slots
                    for (Items itemItems : list){
                        System.out.println(itemItems);
                    }

                } else if (choice.equals("purchase")) {
                    // make a purchase
                    purchase(list);
                } else if (choice.equals("exit")) {
                    // good bye
                    break;
                }
            }
        }


    public List<Items> readFile() {
        List<Items> inventoryList = new ArrayList<>();
        // taking a list of the inventory and making an Array
        File inventory = new File("catering1.csv");
        if (!inventory.exists()) {
            System.out.println("Error reading file");
            System.exit(0);
        }
        int quantity = 6;

        try (Scanner fileInput = new Scanner(inventory)) {

            while (fileInput.hasNextLine()) {

                String lineOfText = fileInput.nextLine();
                String[] splitLine = lineOfText.split(",");
                String slot = splitLine[0];
                String name = splitLine[1];
                BigDecimal price = new BigDecimal(splitLine[2]);
                String type = splitLine[3];
                if (type.equals("Munchy")){
                    inventoryList.add(new Munchies(quantity, slot, name, price, type));
                }
                 else if (type.equals("Candy")){
                    inventoryList.add(new Candy(quantity, slot, name, price, type));
                }
                else if (type.equals("Drink")){
                    inventoryList.add(new Drinks(quantity, slot, name, price, type));
                }
                else if (type.equals("Gum")){
                    inventoryList.add(new Gum(quantity, slot, name, price, type));
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return inventoryList;
    }
    public void purchase(List<Items> ItemList){
        while (true){
        String choice = UserInput.getPurchaseOption();

            if (choice.equals("Feed Money")){
                // sout prompt user to input money 1,5,10,50,20
                // scanner to take in $ amount
                // capture that into a variable to then update balance
                UserInput.getMoneyFeedingOption();

            // reference feed money method, write a new method outside of purchase methode
            // select a while loop, userInput.getPurchase, informing the user what money they inputting



            //Call a method to deal with money
        }
//        else if (choice.equals("Select Item")){
//            UserOutput.Items();
        }

    }
}