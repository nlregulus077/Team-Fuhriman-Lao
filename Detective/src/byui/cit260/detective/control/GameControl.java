/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.control;

import cit260.byui.detective.model.Player;
import detective.Detective;

/**
 *
 * @author Nina
 */
public class GameControl {

    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        Detective.setPlayer(player);
        
        return player;
    }
    
    public static void createNewGame(Player player) {
        System.out.println("\n*** createNewGame() stub function called ***");
    }

    public static void saveSkills() {
        System.out.println("\n*** saveSkills() stub function called***");
    }
}
