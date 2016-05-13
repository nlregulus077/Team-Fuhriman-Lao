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
public class IntelligenceScene extends Scene{
    private double intelligenceRequirement;

    public IntelligenceScene() {
    }

    public double getIntelligenceRequirment() {
        return intelligenceRequirement;
    }

    public void setIntelligenceRequirment(double intelligenceRequirment) {
        this.intelligenceRequirement = intelligenceRequirment;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.intelligenceRequirement) ^ (Double.doubleToLongBits(this.intelligenceRequirement) >>> 32));
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
        final IntelligenceScene other = (IntelligenceScene) obj;
        if (Double.doubleToLongBits(this.intelligenceRequirement) != Double.doubleToLongBits(other.intelligenceRequirement)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "IntelligenceScene{" + "intelligenceRequirement=" + intelligenceRequirement + '}';
    }
    
    
}
