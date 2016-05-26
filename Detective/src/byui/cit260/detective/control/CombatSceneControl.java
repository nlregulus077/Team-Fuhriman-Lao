/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.control;

/**
 *
 * @author Logan
 */
public class CombatSceneControl {
    
    public int calcMeetComabatSkillRequirements(long combatSkill, long combatRequirement) {
        
        if (combatSkill < 0 || combatSkill > 10) {
            return -1;
        }
        
        double combatResult = (combatSkill + 4) / 2;
    
        if (combatResult >= combatRequirement) 
            return 1;
        else
            return 0;
    }
}
