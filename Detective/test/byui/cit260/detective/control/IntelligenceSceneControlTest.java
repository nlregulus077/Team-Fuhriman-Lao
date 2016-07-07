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
 * @author Nina
 */
public class IntelligenceSceneControlTest {
    
    public IntelligenceSceneControlTest() {
    }

    /**
     * Test of calcMeetIntelSkillRequirements method, of class IntelligenceSceneControl.
     */
    @Test
    public void testCalcMeetIntelSkillRequirements() {
        
        // Test Case 1
        this.console.println("Test Case 1");
        long intelSkill = 4;
        long intelRequirement = 4;
        IntelligenceSceneControl instance = new IntelligenceSceneControl();
        int expResult = 0;
        int result = instance.calcMeetIntelSkillRequirements(intelSkill, intelRequirement);
        assertEquals(expResult, result);
        
         // Test Case 2
        this.console.println("Test Case 2");
        intelSkill = 6;
        intelRequirement = 4;
        expResult = 1;
        result = instance.calcMeetIntelSkillRequirements(intelSkill, intelRequirement);
        assertEquals(expResult, result);
        
        // Test Case 3
        this.console.println("Test Case 3");
        intelSkill = -6;
        intelRequirement = 4;
        expResult = -1;
        result = instance.calcMeetIntelSkillRequirements(intelSkill, intelRequirement);
        assertEquals(expResult, result);
        
        // Test Case 4
        this.console.println("Test Case 4");
        intelSkill = 11;
        intelRequirement = 4;
        expResult = -1;
        result = instance.calcMeetIntelSkillRequirements(intelSkill, intelRequirement);
        assertEquals(expResult, result);
        
        // Test Case 5
        this.console.println("Test Case 5");
        intelSkill = 0;
        intelRequirement = 4;
        expResult = 0;
        result = instance.calcMeetIntelSkillRequirements(intelSkill, intelRequirement);
        assertEquals(expResult, result);
        
        // Test Case 6
        this.console.println("Test Case 6");
        intelSkill = 10;
        intelRequirement = 4;
        expResult = 1;
        result = instance.calcMeetIntelSkillRequirements(intelSkill, intelRequirement);
        assertEquals(expResult, result);
    }
    
}
