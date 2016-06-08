/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.model;

/**
 *
 * @author Nina
 */
public class CombatScene extends Scene{
    private double combatRequirement;

    public CombatScene() {
    }

    public double getCombatRequirement() {
        return combatRequirement;
    }

    public void setCombatRequirement(double combatRequirement) {
        this.combatRequirement = combatRequirement;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.combatRequirement) ^ (Double.doubleToLongBits(this.combatRequirement) >>> 32));
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
        final CombatScene other = (CombatScene) obj;
        if (Double.doubleToLongBits(this.combatRequirement) != Double.doubleToLongBits(other.combatRequirement)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "CombatScene{" + "combatRequirement=" + combatRequirement + '}';
    }
    
    
}
