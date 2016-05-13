/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.byui.detective.model;

/**
 *
 * @author Nina
 */
public class CunningScene extends Scene {
    private double cunningRequirement;

    public CunningScene() {
    }
    

    public double getCunningRequirement() {
        return cunningRequirement;
    }

    public void setCunningRequirement(double cunningRequirement) {
        this.cunningRequirement = cunningRequirement;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.cunningRequirement) ^ (Double.doubleToLongBits(this.cunningRequirement) >>> 32));
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
        final CunningScene other = (CunningScene) obj;
        if (Double.doubleToLongBits(this.cunningRequirement) != Double.doubleToLongBits(other.cunningRequirement)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "CunningScene{" + "cunningRequirement=" + cunningRequirement + '}';
    }
    
    
}
