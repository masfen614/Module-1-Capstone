package com.techelevator.application;

import com.techelevator.models.Items;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class VendingMachine {
    Scanner InventoryList = new Scanner("catering.csv");
    Scanner InventoryList2 = new Scanner("catering1.csv");

    public void run() {
        
        while(true) {

            UserOutput.displayHomeScreen();
            String choice = UserInput.getHomeScreenOption();

            if(choice.equals("display"))
            {
                // display the vending machine slots
            }
            else if(choice.equals("purchase"))
            {
                // make a purchase
            }
            else if(choice.equals("exit"))
            {
                // good bye
                break;
            }
        }
    }
}

