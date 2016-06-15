/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.view;

import byui.cit260.detective.control.CombatSceneControl;
import java.util.Scanner;

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
       int fight = combatScene.calcMeetCombatSkillRequirements(2,4);
       
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
        
    
        
   
