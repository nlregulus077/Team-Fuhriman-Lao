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
    
    private boolean visited;
    private int row;
    private int column;
    private long requirement;
    private Scene scene; 
    private Character character; 
    
    
    
    
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

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public long getRequirement() {
        return requirement;
    }

    public void setRequirement(long requirement) {
        this.requirement = requirement;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }


    public long getRequirment() {
        return requirement;
    }

    public void setRequirment(long requirement) {
        this.requirement = requirement;
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


    public void setScene(Scene scene) {
        this.scene = scene;
    }
    
    
    
    
}
