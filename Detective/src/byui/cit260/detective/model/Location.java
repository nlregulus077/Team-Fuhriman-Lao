/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.model;


import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Logan
 */
public class Location implements Serializable {
    
    private String visited;
    private int row;
    private int column;
    private long requirement;
    private Scene scene; 
    private Enum<Character> character; 
    
    
    
    public Location() {
    }
    
     public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getVisited() {
        return visited;
    }

    public void setVisited(String visited) {
        this.visited = visited;
    }


    public long getRequirment() {
        return requirement;
    }

    public void setRequirment(long requirment) {
        this.requirement = requirment;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.visited);
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
        final Location other = (Location) obj;
       
        return Objects.equals(this.visited, other.visited);
    }

    @Override
    public String toString() {
        return "Location{" + "visited=" + visited + '}';
    }

    void setVisited(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setScene(Scene scene) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
