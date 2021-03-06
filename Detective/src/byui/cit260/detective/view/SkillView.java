/*
 * The get input function here is quite different. I don't recommend implementing inheritance here.
 */
package byui.cit260.detective.view;

import byui.cit260.detective.control.GameControl;
import detective.Detective;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Nina
 */
public class SkillView implements Serializable{
    
    private String promptMessage;
    private String intelPrompt;
    private String cunningPrompt;
    private String combatPrompt;
    long intelligenceSkillValue;
    long cunningSkillValue;
    long combatSkillValue;
    
    protected final BufferedReader keyboard = Detective.getInFile();
    protected final PrintWriter console = Detective.getOutFile();
    

    public SkillView() {
        this.promptMessage = "Assign 10 skill points to the following values." + "\nEnter Intelligence Skill: ";
        this.intelPrompt = "Enter Intelligence Skill: ";
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
            this.console.println("\n" + this.promptMessage);
            this.promptMessage = this.intelPrompt;
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                this.console.println("\n Invalid value: value can not be blank.");
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
         
         
         String playerIntelligenceSkill = playerIntelSkill;
         
         
         
         try {
         intelligenceSkillValue = Long.parseLong(playerIntelligenceSkill);
         } catch (NumberFormatException nf){
             
             this.console.println("\nInvalid value.");
            
         }
         
         this.promptMessage = this.cunningPrompt;
         
         String playerCunningSkill = this.getSkillInput();
         
        
         
         try {
         cunningSkillValue = Long.parseLong(playerCunningSkill);
         } catch (NumberFormatException nf) {
             
             this.console.println("\nInvalid value.");
         }
         
         
         this.promptMessage = this.combatPrompt;
        
         String playerCombatSkill = this.getSkillInput();
         
         
         
         try {
         combatSkillValue = Long.parseLong(playerCombatSkill);
         } catch (NumberFormatException nf) {
             
             this.console.println("\nInvalid value");
         }
         
         
      if ((intelligenceSkillValue + cunningSkillValue + combatSkillValue) > 10) {
          this.console.println("You have more than 10 skill points.  Please reassign." + "\n");
          return false;
      }
      
      else if ((intelligenceSkillValue + cunningSkillValue + combatSkillValue) <= 0) {
          this.console.println("Invalid values.  Please reassign." + "\n");
          return false;
      }
      
      else if ((intelligenceSkillValue + cunningSkillValue + combatSkillValue) < 10) {
          this.console.println("You still have leftover points. Please reassign." + "\n");
          return false;
      }
      
      else {
          GameControl.saveSkills(intelligenceSkillValue, cunningSkillValue, combatSkillValue);
          return true;
      }
        
     }
     
}
