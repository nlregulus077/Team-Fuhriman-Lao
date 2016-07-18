/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.control;

import byui.cit260.detective.exceptions.MoveControlException;
import byui.cit260.detective.model.MapLocations;
import java.awt.Point;
import byui.cit260.detective.model.Character;

/**
 *
 * @author Nina
 */
public class MoveControl {
    
    public void movePlayerCharacter (String locationName) throws IllegalArgumentException {
        
        MapLocations roomLocation = Enum.valueOf(MapLocations.class, locationName);
        
        Point coord = roomLocation.getCoordinates();
        
        Character.Player_Detective.getLocation().x = coord.x;
        Character.Player_Detective.getLocation().y = coord.y;
        
        
    }
}
