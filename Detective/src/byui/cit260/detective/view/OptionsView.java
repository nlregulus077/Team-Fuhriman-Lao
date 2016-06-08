/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.view;

import java.util.Scanner;



/**
 *
 * @author Logan
 */
public class OptionsView {
    
     private String menu;
    private String promptMessage;

    public OptionsView() {
        this.promptMessage = "\nChoose an option";
        this.menu = "\n"
                  + "\n ---------------------------------------------------"
                  + "\n | Options                                  |"
                  + "\n ---------------------------------------------------"
                  + "\nD - Difficulty (1-5) = [Default 1]"
                  + "\nH - Hint = [Default off]"
                  + "\nM - Map = [Default on]"
                  + "\nE - Exit options menu"
                  + "\nC - Clear all saved data"
                  + "\n----------------------------------------------------";
    }
    
    void displayOptionsView() {
        
        boolean done = false;
        do {
            System.out.println(this.menu);
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("E"))
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
            case "D":
                this.Difficulty();
                break;
            case "H":
                this.Hints();
                break;
            case "M":
                this.Map();
                break;
            case "E":
                this.ExitMenu();
                break;
            case "C":
                this.ClearData();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
              
        }
        
        return false;
    }
    

    private void Difficulty() {
        System.out.println("\n*** Difficulty() called ***");
    }

    private void Hints() {
        System.out.println("\n*** Hints() called ***");
    }

    private void Map() {
        System.out.println("\n*** Map() called ***");
    }

    private void ExitMenu() {
        System.out.println("\n*** ExitMenu() called ***");
    }

    private void ClearData() {
        System.out.println("\n*** ClearData() called ***");
    }
}