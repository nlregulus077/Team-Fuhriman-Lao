/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.view;

import byui.cit260.detective.control.CombatSceneControl;
import byui.cit260.detective.exceptions.CombatSceneControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Logan
 */
public class CombatView extends View {

    private String promptMessage;
    private boolean skill;

    public CombatView() {
        super("\n Please enter your combat skill");
    }
    
    
    
    
    @Override
    public boolean doAction(String combatSkill) {
        // Call control function do combat
       CombatSceneControl combatScene = new CombatSceneControl();
       int fight = 0;
        try {
            fight = combatScene.calcMeetCombatSkillRequirements(2,4);
        } catch (CombatSceneControlException ex) {
            System.out.println("\nYou can't do that.");
            Logger.getLogger(CombatView.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       if (fight == 1){
           System.out.println ("\nYou win!!!");
       }
       else if (fight == 0) {
           System.out.println("\nYou are dead :(");
       }
       else if (fight == -1){
           System.out.println("\nPlease enter another number");
       }
       
    
        return true; 
}
}
        
    
        
   
