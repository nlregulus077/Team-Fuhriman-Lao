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
public class InventoryView extends View implements Serializable {
    
    private String menu;
    private String promptMessage;

    public InventoryView() {
             super("\n"
                  + "\n ---------------------------------------------------"
                  + "\n | Inventory                                  |"
                  + "\n ---------------------------------------------------"
                  + "\nG- Gun"
                  + "\nK- Knife"
                  + "\nN- Notpad"
                  + "\nF- Flashlight"
                  + "\nB- Badge"
                  + "\nC- Crowbar"
                  + "\nA- First Aid Kit"
                  + "\nCLUE- Clue"
                  + "\nQ- Quit"
                  + "\n----------------------------------------------------" + 
                     "\n\nWhich one do you need?");
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
    