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
public class GameMenuView {
    
    private String menu;
    private String promptAction;

    public GameMenuView() {
        this.promptAction = "\nWhat will you do?";
        this.menu = "\n"
                  + "\n---------------------------------------------------"
                  + "\n Actions                                          |"
                  + "\n---------------------------------------------------"
                  + "\n\tO - Observe"
                  + "\n\tU - Use an item"
                  + "\n\tI - Inventory"
                  + "\n\tM - View the Map"
                  + "\n\tTAKE - Take an item"
                  + "\n\tTALK - Talk to a person"
                  + "\n\tFIGHT - Enter combat mode"
                  + "\n\tQ - Quit"
                  + "\n---------------------------------------------------"
                ;
    }
    
    
    
    void displayMenu(){
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
            System.out.println("\n" + this.promptAction);
            
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
            case "O":
                this.observeArea();
                break;
            case "U":
                this.useItem();
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

    private void useItem() {
        System.out.println("\n*** useItem() stub function called ***");
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
