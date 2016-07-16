/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.view;


import byui.cit260.detective.control.MoveControl;
import byui.cit260.detective.exceptions.MoveControlException;
import byui.cit260.detective.model.MapLocations;

/**
 *
 * @author Nina
 */
public class MapView extends View {

    public MapView() {
        super("\nWhere do you want to go?");
        
        MapLocations[] mapLocations = MapLocations.values();
        
        this.console.println("\nLocation List: ");
        for (MapLocations places:mapLocations) {
            this.console.println(places);
        }
        
    }
    
    @Override
    public boolean doAction(String locationInput){
        
        try {
            
        MoveControl moveControl = new MoveControl();
        moveControl.movePlayerCharacter(locationInput);
        } catch (MoveControlException ex) {
            this.console.println("Please type the location as you see it.");
            
        }
        
        return false;
        
        }
    
    }