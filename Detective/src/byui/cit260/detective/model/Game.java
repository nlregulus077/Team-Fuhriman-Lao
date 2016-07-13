/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.model;

import java.io.Serializable;

/**
 *
 * @author Logan
 */
public class Game implements Serializable {
    
    private Player player;
    private double highScore; 
    private Map map;
    private Tool[] toolList;
    

   

    public Game() {
        
    }
    
     public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    public double getHighScore() {
        return highScore;
    }

    public void setHighScore(double highScore) {
        this.highScore = highScore;
    }
    
     public Tool[] getToolList() {
        return toolList;
    }

    public void setToolList(Tool[] toolList) {
        this.toolList = toolList;
    }
    
    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    
   
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.highScore) ^ (Double.doubleToLongBits(this.highScore) >>> 32));
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.highScore) != Double.doubleToLongBits(other.highScore)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "highScore=" + highScore + '}';
    }
    
    
    
    
    
    
    
}
