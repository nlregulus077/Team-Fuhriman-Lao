/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.view;

import byui.cit260.detective.control.GameControl;
import byui.cit260.detective.model.Player;
import detective.Detective;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Nina
 */
public class StartProgramView extends View {
    
    private String promptMessage;
    
   

    public StartProgramView() {
        
         super("\nYou have a vague memory of your name since waking up in the ransacked apartment." 
                + "\nWhat is it?");
        // display the banner when the view is created
        this.displayBanner();
    }

    private void displayBanner() {
       
        this.console.println(
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

     
        
    
    


    

    @Override
    public boolean doAction(String playersName) {
        if (playersName.length() < 2) {
            this.console.println("\n Invalid player's name: " + "The name must be greater than one character in length.");
            return false;
        }
        
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) {
            this.console.println("\nError creating the player.");
            return false;
        }
        
        this.displayNextView(player);
        return true;
    }

    private void displayNextView(Player player) {
        this.console.println("\n===================================================="
                         + "\n Welcome to the game " + player.getName() 
                         + "\n Good Luck!"
                         + "\n====================================================");
        
        MainMenuView mainMenuView = new MainMenuView();
        
        mainMenuView.display();
    }
}
