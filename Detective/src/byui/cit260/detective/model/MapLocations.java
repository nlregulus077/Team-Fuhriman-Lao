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
    SouthMainSt(new Point(0,2)),
    EastMainSt(new Point(1,0)),
    TrainStation(new Point (0,2)),
    Chinatown(new Point(0,3)),
    LouFongDiner(new Point(0,4)),
    AbandonedBuilding(new Point(1,1)),
    DowntownDistrict(new Point(1,2)),
    LowerHighway(new Point(1,3)),
    ChinatownHunsHQ(new Point(1,4)),
    Alleyway(new Point(2,0)),
    UptownDistrict(new Point(2,1)),
    UpperHighway(new Point(2,2)),
    PoliceStation(new Point(2,3)),
    BackAlley(new Point(2,4)),
    Sewers(new Point(3,0)),
    OleIrishBar(new Point(3,1)),
    Pier(new Point(3,2)),
    Boardwalk(new Point(3,3)),
    Warehouse(new Point(3,4)),
    UptownRavensHQ(new Point(4,0)),
    OceanSide1(new Point(4,1)),
    FishingDocks(new Point(4,2)),
    Beach(new Point (4,3)),
    OceanSide2(new Point(4,4))
    ;
    

   
    private final Point coordinates;
    
    MapLocations (Point coordinates) {
        this.coordinates = coordinates;
        
    }

    public Point getCoordinates() {
        return coordinates;
    }
   
    
}
