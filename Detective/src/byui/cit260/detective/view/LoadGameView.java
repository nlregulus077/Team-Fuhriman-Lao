/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.view;

import byui.cit260.detective.control.GameControl;
import byui.cit260.detective.exceptions.GameControlException;
import java.io.Serializable;

/**
 *
 * @author Nina
 */
public class LoadGameView extends View implements Serializable {

    public LoadGameView() {
        super("Enter the filepath where your text file is located");
    }

    
    @Override
    public boolean doAction (String filepath) {
        try {
            GameControl.loadFile(filepath);
        } catch (GameControlException ex) {
            this.console.println(ex.getMessage());
            return false;
        }

        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
        
        return true;
    }
    
}
