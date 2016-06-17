/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.view;

/**
 *
 * @author Logan
 */
public class InventoryView extends View {
    
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
                System.out.println("\n*** Invalid selection *** Try again");
                break;
    
}
        return false;
    }

    private void useGun() {
        System.out.println("\n*** useGun() called ***");
    }

    private void useKnife() {
        System.out.println("\n*** useKnife() called ***");
    }

    private void useNotepad() {
        NotepadView notepadView = new NotepadView();
        notepadView.display();
    }

    private void useFlashlight() {
        System.out.println("\n*** useFlashlight() called ***");
    }

    private void useBadge() {
        System.out.println("\n*** useBadge() called ***");
    }

    private void useCrowbar() {
        System.out.println("\n*** useCrowbar() called ***");
    }

    private void useFirstAIdKit() {
        System.out.println("\n*** useFirstAidKit() called ***");
    }

    private void viewClue() {
        System.out.println("\n*** viewClue() called ***");
    }
}
    