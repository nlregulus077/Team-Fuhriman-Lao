/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.view;

import byui.cit260.detective.control.CombatSceneControl;
import byui.cit260.detective.exceptions.CombatSceneControlException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Logan
 */
public class CombatView extends View implements Serializable {

    private String promptMessage;
    private boolean skill;
    private int combatSkillValue;
       

    public CombatView() {
        super("\n Please enter your combat skill");
    }
    
    
    
    
    @Override
    public boolean doAction(String combatSkill)  {
        // Call control function do combat
       CombatSceneControl combatScene = new CombatSceneControl();
       
       
       int fight = 0;
        try {
       combatSkillValue = Integer.parseInt(combatSkill);
          
        } catch (NumberFormatException ex) {
            this.console.println("\nPlease don't do that.");
            return false;
        }
          
        try {
        
           fight = combatScene.calcMeetCombatSkillRequirements(combatSkillValue, 4);
           
        } catch (CombatSceneControlException ex) {
            this.console.println("\nYou can't do that.");
            return false;
        }
            
       
           
       
       if (fight == 1){
           this.console.println ("\nYou win!!!");
       }
       else if (fight == 0) {
           this.console.println("\nYou are dead :(");
       }
       else if (fight == -1){
           this.console.println("\nPlease enter another number");
       }
       
    
        return true; 
}
}
        
    
        
   
