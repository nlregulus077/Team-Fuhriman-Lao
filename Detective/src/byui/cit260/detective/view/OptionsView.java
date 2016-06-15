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
public class OptionsView extends View {
    
     private String menu;
    private String promptMessage;

    public OptionsView() {
             super("\n"
                  + "\n ---------------------------------------------------"
                  + "\n | Options                                  |"
                  + "\n ---------------------------------------------------"
                  + "\nD - Difficulty (1-5) = [Default 1]"
                  + "\nH - Hint = [Default off]"
                  + "\nM - Map = [Default on]"
                  + "\nE - Exit options menu"
                  + "\nC - Clear all saved data"
                  + "\n----------------------------------------------------");
    }
    
    
    @Override
    public boolean doAction(String choice) {
        
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