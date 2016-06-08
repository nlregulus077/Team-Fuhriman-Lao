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
public class CombatView {

    private String promptMessage;
    private boolean skill;

    public CombatView() {
        this.promptMessage = "/n Please enter yout combat skill";
    }
    
    
    
    
    void displayComabtView() {
        
        boolean done = false;
        do {
            
            String combatSkill = this.getComabtSkill();
            if (combatSkill.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(combatSkill);
        } while (!done);
}

    private String getComabtSkill() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("\n Invalid value: value can not be blank.");
                continue;
            }
            
            break;
        }
        
        return value;
    }

    private boolean doAction(String combatSkill) {
        // Call control function do combat
       CombatSceneControl combatScene = new CombatSceneControl();
       combatScene.calcMeetCombatSkillRequirements(4,4);
    
        return true; 
}
}
        
    
        
   
