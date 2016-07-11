/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.view;

import byui.cit260.detective.model.Tool;
import detective.Detective;
import java.io.Serializable;


/**
 *
 * @author Logan
 */
public class InventoryView extends View implements Serializable {
    
    private String menu;
    private String promptMessage;

    public InventoryView() {
             super("\n\nWhich one do you need?");
             this.console.println("\n"
                  + "\n ---------------------------------------------------"
                  + "\n | Inventory                                  |"
                  + "\n ---------------------------------------------------");
             
             Tool[] tool = Detective.getCurrentGame().getToolList();
             
             for (Tool item: tool) {
                
                this.console.println("\n" + item.getName() + "                     " + item.getDescription());
             }
                 
              this.console.println ("\n----------------------------------------------------");
             
             
    }
    
     @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "G":
                this.useGun();
                break;
            case "K":
                this.useKnife();
                break;
            case "N":
                this.useNotepad();
                break;
            case "F":
                this.useFlashlight();
                break;
            case "B":
                this.useBadge();
                break;
            case "C":
                this.useCrowbar();
                break;
            case "A":
                this.useFirstAIdKit();
                break;
            case "CLUE":
                this.viewClue();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
    
}
        return false;
    }

    private void useGun() {
        this.console.println("\n*** useGun() called ***");
    }

    private void useKnife() {
        this.console.println("\n*** useKnife() called ***");
    }

    private void useNotepad() {
        NotepadView notepadView = new NotepadView();
        notepadView.display();
    }

    private void useFlashlight() {
        this.console.println("\n*** useFlashlight() called ***");
    }

    private void useBadge() {
        this.console.println("\n*** useBadge() called ***");
    }

    private void useCrowbar() {
        this.console.println("\n*** useCrowbar() called ***");
    }

    private void useFirstAIdKit() {
        this.console.println("\n*** useFirstAidKit() called ***");
    }

    private void viewClue() {
        this.console.println("\n*** viewClue() called ***");
    }
}
    