/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.control;

/**
 *
 * @author Nina
 */
public class CunningSceneControl {
    
    public int calcMeetCunningRequirements (long cunningSkill, long cunningRequirement) {
        
        if (cunningSkill < 0 || cunningSkill > 10){
            return -1;
        }
        
        double cunningResult = cunningSkill + 3 / 1.5;
        
        if (cunningResult >= cunningRequirement)
            return 1;
        else
            return 0;
    }
}
