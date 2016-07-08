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
import byui.cit260.detective.exceptions.GameControlException;
import byui.cit260.detective.exceptions.MapControlException;
import detective.Detective;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author Nina
 */
public class GameControl {
    
    public final BufferedReader keyboard = Detective.getInFile();
    public final PrintWriter console = Detective.getOutFile();

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
            MapControl.moveCharacterToLocation(npcs, coordinates);
        }
        
        
    }

    public static void saveSkills() {
        
    }

    public static Tool[] createToolList() {
    
        Tool[] tools = 
        new Tool[7];
        
        Tool gun = new Tool();
        gun.setName("G - Gun");
        gun.setDescription("It's a gun.");
        tools[Tool.item.gun.ordinal()] = gun; 
        
        Tool knife = new Tool();
        knife.setName("K - Knife");
        knife.setDescription("It's sharp");
        tools[Tool.item.knife.ordinal()] = knife; 
        
        Tool notepad = new Tool();
        notepad.setName("N - Notepad");
        notepad.setDescription("Record your notes.");
        tools[Tool.item.notepad.ordinal()] = notepad; 
        
        
        Tool flashlight = new Tool();
        flashlight.setName("F - Flashlight");
        flashlight.setDescription("Could come in handy.");
        tools[Tool.item.flashlight.ordinal()] = flashlight; 
        
        Tool badge = new Tool();
        badge.setName("Badge");
        badge.setDescription("Proof of your position as a detective.");
        tools[Tool.item.badge.ordinal()] = badge; 
        
        Tool crowbar = new Tool();
        crowbar.setDescription("C - Crowbar");
        crowbar.setDescription("Blunt and heavy.  Careful where you swing it.");
        tools[Tool.item.crowbar.ordinal()] = crowbar; 
        
        Tool firstAidKit = new Tool();
        firstAidKit.setName("FA - First Aid Kit");
        firstAidKit.setDescription("In case you're bleeding to death.");
        tools[Tool.item.firstAidKit.ordinal()] = firstAidKit; 
        
        return tools; 
    }
    
    public static void saveGame (Game game, String filepath)
            throws GameControlException {
        
        try (FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game);
        }
        catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }
    
        
    
}
