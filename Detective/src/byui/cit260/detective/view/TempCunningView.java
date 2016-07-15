/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.view;

import byui.cit260.detective.control.CunningSceneControl;
import byui.cit260.detective.exceptions.CunningSceneControlException;

/**
 *
 * @author Nina
 */
public class TempCunningView extends View {
    private String playerCunningSkill;
    private long cunningSkillValue;
    long charisma;
    
    public TempCunningView() {
        super("Please enter cunning skill.");
    }
    
    @Override
    public boolean doAction (String cunningSkill) {
        
    
        CunningSceneControl cunningScene = new CunningSceneControl();
        
        try {
        cunningSkillValue = Long.parseLong(cunningSkill);
        } catch (NumberFormatException nf){
            
            this.console.println("Invalid value. Please enter again.");
        }
        
        try {
        charisma = cunningScene.calcMeetCunningRequirements(cunningSkillValue,4);
        
        } catch (CunningSceneControlException nf){
            
            this.console.println("Invalid value.Please enter again.");
        }
        
       if (charisma == 1){
           this.console.println ("\nYou've managed to get more info.");
       }
       else if (charisma == 0) {
           this.console.println("\nThis person isn't willing to say more.");
       }
       else if (charisma < 0){
           this.console.println("Not a valid value");
       }
       
       return true;
    }
}
