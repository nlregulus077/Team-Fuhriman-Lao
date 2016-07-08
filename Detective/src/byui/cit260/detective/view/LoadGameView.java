/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.view;

import byui.cit260.detective.exceptions.GameControlException;
import byui.cit260.detective.model.Game;
import detective.Detective;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author Nina
 */
public class LoadGameView extends View {

    public LoadGameView(String message) {
        super("Enter the filepath where your text file is located");
    }
    
    @Override
    public boolean doAction (String filepath) 
         throws GameControlException {
         Game game = null;
        
        try ( FileInputStream fips = new FileInputStream(filepath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject();
        }
        catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
        Detective.setCurrentGame(game);
        return false;
    }
    
}
