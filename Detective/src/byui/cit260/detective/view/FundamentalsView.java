/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.view;

import java.util.Scanner;

/**
 *
 * @author Nina
 */
public class FundamentalsView {
    
    private String menu;
    private String promptMessage;

    public FundamentalsView() {
        this.promptMessage = "\nWhat will you do?";
        this.menu = "\n"
                  + "\n ---------------------------------------------------"
                  + "\n | Fundamentals                                    |"
                  + "\n ---------------------------------------------------"
                  + "\nW - What is the goal of the game"
                  + "\nM - How to Move"
                  + "\nTAKE - Collect an object from where you are"
                  + "\nU - Use an item"
                  + "\nI - Look at your inventory"
                  + "\nN - Look over your notes"
                  + "\nE - Use an equipment"
                  + "\nC - View clues"
                  + "\nO - Search for clues"
                  + "\nTALK - Talk to someone around you"
                  + "\nFIGHT - Enter combat mode"
                  + "\n----------------------------------------------------";
    }
    
    void displayFundamentalView() {
        
        boolean done = false;
        do {
            System.out.println(this.menu);
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
        } while (!done);
    
    }
    
    private String getMenuOption() {
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
    
    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "W":
                this.GoalGame();
                break;
            case "M":
                this.HowToMove();
                break;
            case "TAKE":
                this.HowToCollect();
                break;
            case "U":
                this.UseItem();
                break;
            case "I":
                this.InventoryInstructions();
                break;
            case "N":
                this.ViewNotes();
                break; 
            case "E":
                this.EquipmentUse();
                break;
            case "C":
                this.ViewClues();
                break;
            case "O":
                this.SearchClues();
                break;
            case "TALK":
                this.HowToTalk();
                break;
            case "FIGHT":
                this.HowToFight();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
              
        }
        
        return false;
    }

    private void GoalGame() {
        System.out.println("\n*** GoalGame() stub function called ***");
    }

    private void HowToMove() {
        System.out.println("\n*** HowToMove() stub function called ***");
    }

    private void HowToCollect() {
        System.out.println("\n*** HowToCollect() stub function called ***");
    }

    private void UseItem() {
        System.out.println("\n*** UseItem() stub function called ***");
    }

    private void InventoryInstructions() {
        System.out.println("\n*** InventoryInstructions() stub function called ***");    
    }

    private void ViewNotes() {
        System.out.println("\n*** ViewNotes() stub function called ***"); 
    }

    private void EquipmentUse() {
        System.out.println("\n*** EquipmentUse() stub function called ***");
    }

    private void ViewClues() {
        System.out.println("\n*** ViewClues() stub function called ***");
    }

    private void SearchClues() {
        System.out.println("\n*** SearchClues() stub function called ***");
    }

    private void HowToTalk() {
        System.out.println("\n*** HowToTalk() stub function called ***");
    }

    private void HowToFight() {
        System.out.println("\n*** HowToFight() stub function called ***");
    }
}
    
