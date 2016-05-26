/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Logan
 */
public class CombatSceneControlTest {
    
    public CombatSceneControlTest() {
    }

    /**
     * Test of calcMeetComabatSkillRequirements method, of class CombatSceneControl.
     */
    @Test
    public void testCalcMeetComabatSkillRequirements() {
        
        //Test Case 1
        System.out.println("Test Case 1");
        long combatSkill = 2;
        long combatRequirement = 5;
        CombatSceneControl instance = new CombatSceneControl();
        int expResult = 0;
        int result = instance.calcMeetComabatSkillRequirements(combatSkill, combatRequirement);
        assertEquals(expResult, result);
        
         //Test Case 2
        System.out.println("Test Case 2");
        combatSkill = 8;
        combatRequirement = 5;
        expResult = 1;
        result = instance.calcMeetComabatSkillRequirements(combatSkill, combatRequirement);
        assertEquals(expResult, result);
        
         //Test Case 3
        System.out.println("Test Case 3");
        combatSkill = -8;
        combatRequirement = 5;
        expResult = -1;
        result = instance.calcMeetComabatSkillRequirements(combatSkill, combatRequirement);
        assertEquals(expResult, result);
        
         //Test Case 4
        System.out.println("Test Case 4");
        combatSkill =11;
        combatRequirement = 5;
        expResult = -1;
        result = instance.calcMeetComabatSkillRequirements(combatSkill, combatRequirement);
        assertEquals(expResult, result);
        
         //Test Case 5
        System.out.println("Test Case 5");
        combatSkill = 0;
        combatRequirement = 5;
        expResult = 0;
        result = instance.calcMeetComabatSkillRequirements(combatSkill, combatRequirement);
        assertEquals(expResult, result);
        
         //Test Case 6
        System.out.println("Test Case 6");
        combatSkill = 10;
        combatRequirement = 5;
        expResult = 1;
        result = instance.calcMeetComabatSkillRequirements(combatSkill, combatRequirement);
        assertEquals(expResult, result);
        
    }
    
}
