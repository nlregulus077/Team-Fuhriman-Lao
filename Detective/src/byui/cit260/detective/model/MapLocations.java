/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Nina
 */
public enum MapLocations implements Serializable {
    
    Office(new Point(0,0)),
    South_Main_St(new Point(0,2)),
    North_Main_St(new Point(1,1));
    

   
    private final Point coordinates;
    
    MapLocations (Point coordinates) {
        this.coordinates = coordinates;
        
    }

    public Point getCoordinates() {
        return coordinates;
    }
   
    
}
