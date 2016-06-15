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
public class FundamentalsView extends View {
    

    public FundamentalsView() {
        super ("\n"
                  + "\n ---------------------------------------------------"
                  + "\n | Fundamentals                                    |"
                  + "\n ---------------------------------------------------"
                  + "\n\tW - What is the goal of the game"
                  + "\n\tM - How to Move"
                  + "\n\tTAKE - Collect an object from where you are"
                  + "\n\tU - Use an item"
                  + "\n\tI - Look at your inventory"
                  + "\n\tN - Look over your notes"
                  + "\n\tE - Use an equipment"
                  + "\n\tC - View clues"
                  + "\n\tO - Search for clues"
                  + "\n\tTALK - Talk to someone around you"
                  + "\n\tFIGHT - Enter combat mode"
                  + "\n----------------------------------------------------" 
        + "\n\nWhat do you need help with? (Just type Q to exit)");
    }
    
    @Override
    public boolean doAction(String choice) {
        
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
    
