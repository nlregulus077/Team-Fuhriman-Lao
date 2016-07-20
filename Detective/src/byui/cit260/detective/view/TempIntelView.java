/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.view;

import byui.cit260.detective.control.IntelligenceSceneControl;
import byui.cit260.detective.exceptions.IntelligenceSceneControlException;
import java.io.Serializable;

/**
 *
 * @author Nina
 */
public class TempIntelView extends View implements Serializable {

    private String playerIntelSkill;
    private long intelSkillValue;
    long observation;
    
    public TempIntelView() {
        super("Please enter intel skill.");
    }
    
    @Override
    public boolean doAction (String intelSkill)
            {
        IntelligenceSceneControl intelScene = new IntelligenceSceneControl();
        
        try {
        intelSkillValue = Long.parseLong(intelSkill);
        } catch (NumberFormatException nf){
            
            this.console.println("Invalid value. Please enter again.");
            return false;
        }
        
        try {
        observation = intelScene.calcMeetIntelSkillRequirements(intelSkillValue,4);
        } catch (IntelligenceSceneControlException nf){
            this.console.println("Invalid value.Please enter again.");
        }
        
       if (observation == 1){
           this.console.println ("\nYou found something.");
       }
       else if (observation == 0) {
           this.console.println("\nThere's nothing else here. It's time to go.");
       }
       else if (observation < 0){
           this.console.println("Not a valid value");
           return false;
       }
       
       return true;
        
    }
    
    
}
