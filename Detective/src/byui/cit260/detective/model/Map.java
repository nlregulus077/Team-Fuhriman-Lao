/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.model;

import byui.cit260.detective.control.GameControl;
import java.io.Serializable;

/**
 *
 * @author Logan
 */
public class Map implements Serializable {

    
    private double rowCount;
    private double columnCount;
    private Location[] [] locations;
    private int noOfRows;
    private int noOfCOlumns;

    public Map() {
    }

    public Map(int noOfRows, int noOfColumns) {
        
        if (noOfRows < 1 || noOfColumns < 1) {
            System.out.println("The numbers of rows and columns must be greater than 0");
        return;
            
        }
    
    this.noOfRows = noOfRows;
    this.noOfCOlumns = noOfColumns; 
    
    this.locations = new Location[noOfRows] [noOfColumns];
    
    for (int row = 0; row < noOfRows; row++) {
        for (int column = 0; column < noOfColumns; column++){
            
            Location location = new Location();
            location.setColumn(column);
            location.setRow(row);
            location.setVisited(false);
            
            locations[row] [column] = location; 
        }
    }
    
    }
    
    
    
    

    public double getRowCount() {
        return rowCount;
    }

    public void setRowCount(double rowCount) {
        this.rowCount = rowCount;
    }

    public double getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(double columnCount) {
        this.columnCount = columnCount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.rowCount) ^ (Double.doubleToLongBits(this.rowCount) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.columnCount) ^ (Double.doubleToLongBits(this.columnCount) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.rowCount) != Double.doubleToLongBits(other.rowCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.columnCount) != Double.doubleToLongBits(other.columnCount)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }

    public Location[][] getLocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    }
    
    
    
    
    
    
    


