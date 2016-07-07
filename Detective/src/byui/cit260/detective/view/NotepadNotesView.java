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
public class NotepadNotesView extends View {

    public NotepadNotesView() {
         super("Write your notes here.  Type Q to quit.");
    }
    
        
     @Override
     public boolean doAction (String writtenNotes){
         this.console.println("*** SaveNotes() called ***");
         return true;
     }
    
}
