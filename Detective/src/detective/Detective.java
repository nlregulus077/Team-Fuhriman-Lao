/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detective;

import byui.cit260.detective.model.Game;
import byui.cit260.detective.model.Location;
import byui.cit260.detective.model.Map;
import byui.cit260.detective.model.Tool;
import cit260.byui.detective.model.Player;

/**
 *
 * @author Nina
 */
public class Detective {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Jack Black");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Game newGame = new Game();
        newGame.setHighScore(5.0);
        
        String gameInfo = newGame.toString();
        System.out.println(gameInfo);
        
        Map newMap = new Map();
        newMap.setRowCount(6.0);
        newMap.setColumnCount(6.0);
        
        String mapInfo = newMap.toString();
        System.out.println(mapInfo);
        
        Tool newTool = new Tool();
        newTool.setName("Gun");
        newTool.setType("Revolver");
        newTool.setDescription("Big");
        
        String toolInfo = newTool.toString();
        System.out.println(toolInfo);
        
        Location newLocation = new Location();
        newLocation.setVisited("Visited");
        newLocation.setRow(4.0);
        newLocation.setColumn(4.0);
        
        String locationInfo = newLocation.toString();
        System.out.println(locationInfo);
    }
    
}
