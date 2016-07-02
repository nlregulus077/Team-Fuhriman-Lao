/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.control;

import byui.cit260.detective.model.Game;
import byui.cit260.detective.model.Location;
import byui.cit260.detective.model.Map;
import byui.cit260.detective.model.Player;
import byui.cit260.detective.model.Scene;
import byui.cit260.detective.model.Tool;
import byui.cit260.detective.model.Character;
import byui.cit260.detective.control.MapControl;
import byui.cit260.detective.exceptions.MapControlException;
import detective.Detective;
import java.awt.Point;

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
       
       Tool[] toolList = GameControl.createToolList();
       game.setToolList(toolList);
       
       Map map = MapControl.createMap();
       game.setMap(map);
       
       MapControl.moveActorsToStartingLocation(map);
       
    }
    
    public static void moveCharactersToStartingLocations(Map map)
                        throws MapControlException {
        Character[] characters = Character.values();
        
        for (Character npcs : characters) {
            Point coordinates = npcs.getLocation();
            MapControl.MoveCharacterToLocation(npcs, coordinates);
        }
        
        
    }

    public static void saveSkills() {
        System.out.println("\n*** saveSkills() stub function called***");
    }

    public static Tool[] createToolList() {
    
        Tool[] tools = 
        new Tool[7];
        
        Tool gun = new Tool();
        gun.setDescription("Gun");
        tools[Tool.item.gun.ordinal()] = gun; 
        
        Tool knife = new Tool();
        knife.setDescription("Knife");
        tools[Tool.item.knife.ordinal()] = knife; 
        
        Tool notepad = new Tool();
        notepad.setDescription("Notepad");
        tools[Tool.item.notepad.ordinal()] = notepad; 
        
        
        Tool flashlight = new Tool();
        flashlight.setDescription("Flashlight");
        tools[Tool.item.flashlight.ordinal()] = flashlight; 
        
        Tool badge = new Tool();
        badge.setDescription("Badge");
        tools[Tool.item.badge.ordinal()] = badge; 
        
        Tool crowbar = new Tool();
        crowbar.setDescription("Crowbar");
        tools[Tool.item.crowbar.ordinal()] = crowbar; 
        
        Tool firstAidKit = new Tool();
        firstAidKit.setDescription("First Aid Kit");
        tools[Tool.item.firstAidKit.ordinal()] = firstAidKit; 
        
        return tools; 
    }
        
    
}
