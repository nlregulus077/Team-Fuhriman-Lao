/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.control;

import byui.cit260.detective.model.Game;
import byui.cit260.detective.model.Map;
import byui.cit260.detective.model.Player;
import byui.cit260.detective.model.Tool;
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
       Game game = new Game();
       Detective.setCurrentGame(game);
       
       game.setPlayer(player);
       
       Tool[] toolList = GameControl.createTool();
       game.setToolList(toolList);
       
       Map map = MapControl.createMap();
       game.setMap(map);
       
       MapControl.moveActorsToStartingLocation(map);
       
    }

    public static void saveSkills() {
        System.out.println("\n*** saveSkills() stub function called***");
    }
}
