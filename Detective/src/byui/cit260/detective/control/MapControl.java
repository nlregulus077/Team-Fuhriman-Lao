/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.control;

import byui.cit260.detective.model.Location;
import byui.cit260.detective.model.Map;
import byui.cit260.detective.model.Scene;

/**
 *
 * @author Nina
 */
class MapControl {


    static void moveActorsToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    static Map createMap () {
        
        Map map = new Map(5, 5);
        
        Scene[] scenes = createScenes(); 
        
        GameControl.assignScenesToLocations(map, scenes);
        
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
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene; 
        
        Scene fightScene = new Scene();
        fightScene.setDescription(
                                  "Oh no there is an man who is trying to kill me. I don't want"
                                + "to kill him, but it looks like it is my only option.");
        fightScene.setMapSymbol("Fight");
        fightScene.setBlocked(false); 
        fightScene.setTravelTime(240);
        scenes[SceneType.fight.ordinal()] = fightScene; 
        
        Scene interactionScene = new Scene();
        interactionScene.setDescription(
                                  "Look there are some people up ahead. Maybe they will be able to "
                                + "help me out.");
        interactionScene.setMapSymbol("Interaction");
        interactionScene.setBlocked(false); 
        interactionScene.setTravelTime(240);
        scenes[SceneType.interaction.ordinal()] = interactionScene; 
        
        Scene choiceScene = new Scene();
        choiceScene.setDescription(
                                  "I have came to an intersection and i need to figure out what direction"
                                + "should I head?");
        choiceScene.setMapSymbol("Choice");
        choiceScene.setBlocked(false); 
        choiceScene.setTravelTime(240);
        scenes[SceneType.choice.ordinal()] = choiceScene; 
        
        Scene investigationScene = new Scene();
        investigationScene.setDescription(
                                  "We heard that there has been a murder. After with consulting with"
                                + "with the boss, we believe this is the best place to start. Here"
                                + " is where the body was left. Lets figure out who has committed "
                                + "this murder.");
        investigationScene.setMapSymbol("Investigation");
        investigationScene.setBlocked(false); 
        investigationScene.setTravelTime(240);
        scenes[SceneType.investigation.ordinal()] = investigationScene;
        
        Scene blockScene = new Scene();
        blockScene.setDescription(
                                  "Looks like i can't go this direction, I need to choose another way.");
        blockScene.setBlocked(false); 
        blockScene.setTravelTime(240);
        scenes[SceneType.block.ordinal()] = blockScene; 
        
        Scene solveScene = new Scene();
        solveScene.setDescription(
                                  "Look there is a man covered up in blood. We have solved the mystery."
                                + "We have found the murderer!!!");
        solveScene.setBlocked(false); 
        solveScene.setTravelTime(240);
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
    
    private static void assignScenesLocation(Map map, Scene[] scenes){
        Location[] [] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.choice.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.investigation.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.investigation.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.fight.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.choice.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.block.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.choice.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.interaction.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.block.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.fight.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.choice.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.choice.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.interaction.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.investigation.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.fight.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.choice.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.interaction.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.interaction.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.solve.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.investigation.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.fight.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.choice.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.investigation.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.block.ordinal()]);
    
    }
}
