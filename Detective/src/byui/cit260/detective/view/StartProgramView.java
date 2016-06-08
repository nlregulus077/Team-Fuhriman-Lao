/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.view;

import byui.cit260.detective.control.GameControl;
import byui.cit260.detective.model.Player;
import java.util.Scanner;

/**
 *
 * @author Nina
 */
public class StartProgramView {
    
    private String promptMessage;

    public StartProgramView() {
        
        this.promptMessage = "\nYou have a vague memory of your name since waking up in the ransacked apartment." 
                + "\nWhat is it?";
        // display the banner when the view is created
        this.displayBanner();
    }

    private void displayBanner() {
       
        System.out.println(
        "\n************************************************************************"
        + "\n*                                                                      *"
        + "\n* Welcome to Detective!                                                *"
        + "\n*                                                                      *"
        + "\n* In this game you will be taking the role of a private detective. You *"
        + "\n* find yourself in a ransacked apartment.  You have no memory of who   *"
        + "\n* you are or why you are in this apartment.  You are not carrying any  *"
        + "\n* personal items because they have been taken from you.  You will soon *"
        + "\n* discover that there are friends and family whose lives are in danger *"
        + "\n* and very dangerous people want you dead.  You must travel through    *"
        + "\n* the city and collect the items that have been taken and find         *"
        + "\n* additional items to protect, heal, and help you solve the mystery    *"
        + "\n* of who you are and what you're involved in.                          *"
        + "\n*                                                                      *"
        + "\n************************************************************************"
        );
    }

    public void displayStartProgramView() {
        
        boolean done = false;
        do {
           // Prompt for and get the input
           String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) 
                return;

             //do requested action and display the next view
             done = this.doAction(playersName);
        } while (!done); 
        
    
    
}

    private String getPlayersName() {
        
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("\n Invalid value: value can not be blank.");
                continue;
            }
            
            break;
        }
        
        return value;
      
    }

    private boolean doAction(String playersName) {
        if (playersName.length() < 2) {
            System.out.println("\n Invalid player's name: " + "The name must be greater than one character in length.");
            return false;
        }
        
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) {
            System.out.println("\nError creating the player.");
            return false;
        }
        
        this.displayNextView(player);
        return true;
    }

    private void displayNextView(Player player) {
        System.out.println("\n===================================================="
                         + "\n Welcome to the game " + player.getName() 
                         + "\n Good Luck!"
                         + "\n====================================================");
        
        MainMenuView mainMenuView = new MainMenuView();
        
        mainMenuView.displayMainMenuView();
    }
}
