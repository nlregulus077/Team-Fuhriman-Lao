/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.view;

import byui.cit260.detective.control.GameControl;
import cit260.byui.detective.model.Player;
import java.util.Scanner;

/**
 *
 * @author Nina
 */
public class SkillView {
    
    private String promptMessage;
    private String intelPrompt;
    private String cunningPrompt;
    private String combatPrompt;
    

    public SkillView() {
        this.promptMessage = "Assign 10 skill points to the following values."
                + "\n Enter intelligence: ";
        this.cunningPrompt = "Enter Cunning Skill: " ;
        this.combatPrompt = "Enter Combat Skill: ";
    }
    
    public void displaySkillView() {
        
        boolean done = false;
        do {
           // Prompt for and get the inputs
            String playerIntelSkill = this.getSkillInput();
            

             //do requested action and display the next view
             done = this.doAction(playerIntelSkill);
        } while (!done); 
        
}
     private String getSkillInput() {
        
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
     
     private boolean doAction(String playerIntelSkill) {
         /*
         prompt for combat skill
         
         
         prompt for cunning skill
         assign intel skill to player
         assign combat skill to player
         assign cunning skill to player
         */
         
         this.promptMessage = this.cunningPrompt;
         
         String playerCunningSkill = this.getSkillInput();
         
         
         this.promptMessage = this.combatPrompt;
        
         String playerCombatSkill = this.getSkillInput();
         
     
        
        return true;
}
     
}
