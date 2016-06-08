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
 * @author Nina
 */
public class Player implements Serializable
{
    // class instance variables
    private String name;
    private double intelligenceSkill;
    private double combatSkill;
    private double cunningSkill;
    

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIntelligenceSkill() {
        return intelligenceSkill;
    }

    public void setIntelligenceSkill(double intelligenceSkill) {
        this.intelligenceSkill = intelligenceSkill;
    }

    public double getCombatSkill() {
        return combatSkill;
    }

    public void setCombatSkill(double combatSkill) {
        this.combatSkill = combatSkill;
    }

    public double getCunningSkill() {
        return cunningSkill;
    }

    public void setCunningSkill(double cunningSkill) {
        this.cunningSkill = cunningSkill;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.intelligenceSkill) ^ (Double.doubleToLongBits(this.intelligenceSkill) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.combatSkill) ^ (Double.doubleToLongBits(this.combatSkill) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.cunningSkill) ^ (Double.doubleToLongBits(this.cunningSkill) >>> 32));
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
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.intelligenceSkill) != Double.doubleToLongBits(other.intelligenceSkill)) {
            return false;
        }
        if (Double.doubleToLongBits(this.combatSkill) != Double.doubleToLongBits(other.combatSkill)) {
            return false;
        }
        if (Double.doubleToLongBits(this.cunningSkill) != Double.doubleToLongBits(other.cunningSkill)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", intelligenceSkill=" + intelligenceSkill + ", combatSkill=" + combatSkill + ", cunningSkill=" + cunningSkill + '}';
    }

    
    
    
    
}
