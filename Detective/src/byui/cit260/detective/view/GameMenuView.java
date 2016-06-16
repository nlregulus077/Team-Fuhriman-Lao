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
public class GameMenuView extends View {
    

    public GameMenuView() {
        super ("\n"
                  + "\n---------------------------------------------------"
                  + "\n Actions                                          |"
                  + "\n---------------------------------------------------"
                  + "\n\tO - Observe"
                  + "\n\tI - Inventory"
                  + "\n\tM - View the Map"
                  + "\n\tTAKE - Take an item"
                  + "\n\tTALK - Talk to a person"
                  + "\n\tFIGHT - Enter combat mode"
                  + "\n\tQ - Quit"
                  + "\n---------------------------------------------------" +
                "\n\nWhat will you do?")
                ;
    }
    
    @Override
     public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "O":
                this.observeArea();
                break;
            case "I":
                this.viewInventory();
                break;
            case "M":
                this.viewMap();
                break;
            case "TAKE":
                this.takeItem();
                break;
            case "TALK":
                this.talkToCharacter();
                break;
            case "FIGHT":
                this.enterCombat();
                break; 
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
              
        }
        
        return false;
    }

    private void observeArea() {
        System.out.println("\n*** observeArea() stub function called ***");
    }

    private void viewInventory() {
        System.out.println("\n*** viewInventory() stub function called ***");
    }

    private void takeItem() {
        System.out.println("\n*** takeItem() stub function called ***");
    }

    private void talkToCharacter() {
        System.out.println("\n*** talkToCharacter() stub function called ***");
    }

    private void enterCombat() {
        CombatView combatView = new CombatView();
        combatView.display();
    }

    private void viewMap() {
         System.out.println("\n*** viewMap() stub function called ***");
    }
}
