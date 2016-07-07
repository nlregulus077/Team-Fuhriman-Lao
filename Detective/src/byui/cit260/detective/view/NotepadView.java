/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.view;

/**
 *
 * @author Nina
 */
public class NotepadView extends View {

    public NotepadView() {
        super("\n"
                  + "\n ---------------------------------------------------"
                  + "\n | Notepad                                          |"
                  + "\n ---------------------------------------------------"
                  + "\n\tV - View Notes"
                  + "\n\tA - Add Notes"
                  + "\n\tQ - Quit"
                  + "\n----------------------------------------------------");
    }   
    
    @Override
     public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "V":
                this.viewNotes();
                break;
            case "A":
                this.addNotes();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
    
}
        return false;
    }

    private void viewNotes() {
        this.console.println("*** viewNotes() stub function called. ***");
    }

    private void addNotes() {
        NotepadNotesView addedNotes = new NotepadNotesView();
        addedNotes.display();
    }
}
