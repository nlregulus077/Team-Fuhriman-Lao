/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.view;

import java.io.Serializable;



/**
 *
 * @author Logan
 */
public class OptionsView extends View implements Serializable {
    
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
                this.console.println("\n*** Invalid selection *** Try again");
                break;
              
        }
        
        return false;
    }
    

    private void Difficulty() {
        this.console.println("\n*** Difficulty() called ***");
    }

    private void Hints() {
        this.console.println("\n*** Hints() called ***");
    }

    private void Map() {
        this.console.println("\n*** Map() called ***");
    }

    private void ExitMenu() {
        this.console.println("\n*** ExitMenu() called ***");
    }

    private void ClearData() {
        this.console.println("\n*** ClearData() called ***");
    }
}