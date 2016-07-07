/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.view;

import byui.cit260.detective.control.IntelligenceSceneControl;
import byui.cit260.detective.exceptions.IntelligenceSceneControlException;

/**
 *
 * @author Nina
 */
public class TempIntelView extends View {

    private String playerIntelSkill;
    private long intelSkillValue;
    int observation;
    
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
            
            System.out.println("Invalid value. Please enter again.");
        }
        
        try {
        observation = intelScene.calcMeetIntelSkillRequirements(intelSkillValue,4);
        } catch (IntelligenceSceneControlException nf){
            System.out.println("Invalid value.Please enter again.");
        }
        
       if (observation == 1){
           System.out.println ("\nYou found something.");
       }
       else if (observation == 0) {
           System.out.println("\nThere's nothing else here. It's time to go.");
       }
       else if (observation < 0){
           System.out.println("Not a valid value");
       }
       
       return true;
        
    }
    
    
}
