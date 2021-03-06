/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.control;

import byui.cit260.detective.exceptions.CunningSceneControlException;
import java.io.Serializable;

/**
 *
 * @author Nina
 */
public class CunningSceneControl implements Serializable {
    
    public int calcMeetCunningRequirements (long cunningSkill, long cunningRequirement) 
                throws CunningSceneControlException {
        
        if (cunningSkill < 0 || cunningSkill > 10){
            throw new CunningSceneControlException("Invalid values. Please enter a new value.");
        }
        
        double cunningResult = cunningSkill + 3 / 1.5;
        
        if (cunningResult >= cunningRequirement)
            return 1;
        else
            return 0;
    }
}
