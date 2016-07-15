/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.control;
import byui.cit260.detective.model.Character;
import byui.cit260.detective.model.Location;
import byui.cit260.detective.model.Map;
import byui.cit260.detective.model.Scene;
import byui.cit260.detective.control.MapControl;
import byui.cit260.detective.control.GameControl;
import byui.cit260.detective.exceptions.MapControlException;
import detective.Detective;
import java.awt.Point;
import java.io.Serializable;


/**
 *
 * @author Nina
 */
class MapControl implements Serializable {
    
    


    static void moveActorsToStartingLocation(Map map) {
        // move characters to point
        // assign character to location
        
        Location[][] locations = detective.Detective.getCurrentGame().getMap().getLocations();
        
        Character.Player_Detective.getLocation().x = 0;
        Character.Player_Detective.getLocation().y = 0;
        
        Character.Blake.getLocation().x = 2;
        Character.Blake.getLocation().y = 3;
        
        Character.Jack.getLocation().x = 1;
        Character.Jack.getLocation().y = 3;
        
        Character.Jane.getLocation().x = 3;
        Character.Jane.getLocation().y = 2;
        
        Character.Claire.getLocation().x = 3;
        Character.Claire.getLocation().y = 3;
        
        Character.Thug.getLocation().x = 1;
        Character.Thug.getLocation().y = 2;
        
        locations[0][0].setCharacter(Character.Player_Detective);
        locations[2][3].setCharacter(Character.Blake);
        locations[1][3].setCharacter(Character.Jack);
        locations[3][2].setCharacter(Character.Jane);
        locations[3][3].setCharacter(Character.Claire);
        locations[1][2].setCharacter(Character.Thug);
        
    }
    
    static Map createMap () throws MapControlException {
        
        Map map = new Map(5, 5);
        
        Scene[] scenes = createScenes(); 
        
        MapControl.assignScenesToLocations(map, scenes);
        
        return map; 
}
    
    private static Scene[] createScenes() {
    
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                                  "We heard that there has been a murder. After with consulting with"
                                + "with the boss, we believe this is the best place to start. Here"
                                + " is where the body was left. Lets figure out who has committed "
                                + "this murder.");
        startingScene.setMapSymbol("Start");
        startingScene.setBlocked(false); 
        scenes[SceneType.start.ordinal()] = startingScene; 
        
        Scene fightScene = new Scene();
        fightScene.setDescription(
                                  "Oh no there is an man who is trying to kill me. I don't want"
                                + "to kill him, but it looks like it is my only option.");
        fightScene.setMapSymbol("Fight");
        fightScene.setBlocked(false); 
        scenes[SceneType.fight.ordinal()] = fightScene; 
        
        Scene interactionScene = new Scene();
        interactionScene.setDescription(
                                  "Look there are some people up ahead. Maybe they will be able to "
                                + "help me out.");
        interactionScene.setMapSymbol("Interaction");
        interactionScene.setBlocked(false); 
        scenes[SceneType.interaction.ordinal()] = interactionScene; 
        
        Scene choiceScene = new Scene();
        choiceScene.setDescription(
                                  "I have came to an intersection and i need to figure out what direction"
                                + "should I head?");
        choiceScene.setMapSymbol("Choice");
        choiceScene.setBlocked(false); 
        scenes[SceneType.choice.ordinal()] = choiceScene; 
        
        Scene investigationScene = new Scene();
        investigationScene.setDescription(
                                  "We heard that there has been a murder. After with consulting with"
                                + "with the boss, we believe this is the best place to start. Here"
                                + " is where the body was left. Lets figure out who has committed "
                                + "this murder.");
        investigationScene.setMapSymbol("Investigation");
        investigationScene.setBlocked(false); 
        scenes[SceneType.investigation.ordinal()] = investigationScene;
        
        Scene blockScene = new Scene();
        blockScene.setDescription(
                                  "Looks like i can't go this direction, I need to choose another way.");
        blockScene.setBlocked(true); 
        scenes[SceneType.block.ordinal()] = blockScene; 
        
        Scene solveScene = new Scene();
        solveScene.setDescription(
                                  "Look there is a man covered up in blood. We have solved the mystery."
                                + "We have found the murderer!!!");
        solveScene.setBlocked(false); 
        scenes[SceneType.solve.ordinal()] = solveScene; 
        
        
        return scenes;
    }

    
    
    public enum SceneType {
    
        start,
        fight,
        interaction,
        choice,
        investigation,
        block,
        solve
        
    }
    
    private static void assignScenesToLocations(Map map, Scene[] scenes){
        Location[] [] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[MapControl.SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[MapControl.SceneType.choice.ordinal()]);
        locations[0][2].setScene(scenes[MapControl.SceneType.investigation.ordinal()]);
        locations[0][3].setScene(scenes[MapControl.SceneType.investigation.ordinal()]);
        locations[0][4].setScene(scenes[MapControl.SceneType.fight.ordinal()]);
        locations[1][0].setScene(scenes[MapControl.SceneType.choice.ordinal()]);
        locations[1][1].setScene(scenes[MapControl.SceneType.block.ordinal()]);
        locations[1][2].setScene(scenes[MapControl.SceneType.choice.ordinal()]);
        locations[1][3].setScene(scenes[MapControl.SceneType.interaction.ordinal()]);
        locations[1][4].setScene(scenes[MapControl.SceneType.block.ordinal()]);
        locations[2][0].setScene(scenes[MapControl.SceneType.fight.ordinal()]);
        locations[2][1].setScene(scenes[MapControl.SceneType.choice.ordinal()]);
        locations[2][2].setScene(scenes[MapControl.SceneType.choice.ordinal()]);
        locations[2][3].setScene(scenes[MapControl.SceneType.interaction.ordinal()]);
        locations[2][4].setScene(scenes[MapControl.SceneType.investigation.ordinal()]);
        locations[3][0].setScene(scenes[MapControl.SceneType.fight.ordinal()]);
        locations[3][1].setScene(scenes[MapControl.SceneType.choice.ordinal()]);
        locations[3][2].setScene(scenes[MapControl.SceneType.interaction.ordinal()]);
        locations[3][3].setScene(scenes[MapControl.SceneType.interaction.ordinal()]);
        locations[3][4].setScene(scenes[MapControl.SceneType.solve.ordinal()]);
        locations[4][0].setScene(scenes[MapControl.SceneType.investigation.ordinal()]);
        locations[4][1].setScene(scenes[MapControl.SceneType.fight.ordinal()]);
        locations[4][2].setScene(scenes[MapControl.SceneType.choice.ordinal()]);
        locations[4][3].setScene(scenes[MapControl.SceneType.investigation.ordinal()]);
        locations[4][4].setScene(scenes[MapControl.SceneType.block.ordinal()]);
    
    }
    
    public static void moveCharacterToLocation (Character player, Point coordinates) 
                    throws MapControlException {
        
        
        Map gameMap = Detective.getCurrentGame().getMap();
        int newRows = coordinates.x - 1;
        int newCols = coordinates.y - 1;
        
        if (newRows < 0 || newRows >= gameMap.getRowCount() 
                || newCols < 0 || newCols >= gameMap.getColumnCount()) {
            throw new MapControlException("Can't move to this location "
            + coordinates.x + ", " +coordinates.y + " because it's not on the map.");
        }
        
        
        
    }
}
