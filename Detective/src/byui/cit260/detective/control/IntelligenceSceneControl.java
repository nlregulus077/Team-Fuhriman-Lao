/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.control;

import byui.cit260.detective.exceptions.IntelligenceSceneControlException;

/**
 *
 * @author Nina
 */
public class IntelligenceSceneControl {
    
    public int calcMeetIntelSkillRequirements(long intelSkill, long intelRequirement) 
    throws IntelligenceSceneControlException {
        
        if (intelSkill < 0 || intelSkill > 10) {
            throw new IntelligenceSceneControlException("Invalid values. Please enter new value.");
        }
        
        double intelResult = (intelSkill + 2) * 0.5;
    
        if (intelResult >= intelRequirement) 
            return 1;
        else
            return 0;
    }
    
}
