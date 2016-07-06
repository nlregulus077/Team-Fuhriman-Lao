/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.control;

import byui.cit260.detective.exceptions.CombatSceneControlException;

/**
 *
 * @author Logan
 */
public class CombatSceneControl {
    
    public int calcMeetCombatSkillRequirements(long combatSkill, long combatRequirement) 
            throws CombatSceneControlException {
        
        
        if (combatSkill < 0 || combatSkill > 10) {
            throw new CombatSceneControlException("Can't calcuate combat skill");
        }
        
        double combatResult = (combatSkill + 4) / 2;
    
        if (combatResult >= combatRequirement) 
            throw new CombatSceneControlException("Can't calcuate combat skill");
            else
            return 0;
    }
}
