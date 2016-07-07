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
public class CunningSceneControlTest {
    
    public CunningSceneControlTest() {
    }

    /**
     * Test of calcMeetCunningRequirements method, of class CunningSceneControl.
     */
    @Test
    public void testCalcMeetCunningRequirements() {
        
        // Test Case 1
        this.console.println("Test Case 1");
        long cunningSkill = 3;
        long cunningRequirement = 4;
        CunningSceneControl instance = new CunningSceneControl();
        int expResult = 1;
        int result = instance.calcMeetCunningRequirements(cunningSkill, cunningRequirement);
        assertEquals(expResult, result);
       
        // Test Case 2
        this.console.println("Test Case 2");
        cunningSkill = 1;
        cunningRequirement = 4;
        expResult = 0;
        result = instance.calcMeetCunningRequirements(cunningSkill, cunningRequirement);
        assertEquals(expResult, result);
        
        // Test Case 3
        this.console.println("Test Case 3");
        cunningSkill = -6;
        cunningRequirement = 4;
        expResult = -1;
        result = instance.calcMeetCunningRequirements(cunningSkill, cunningRequirement);
        assertEquals(expResult, result);
        
        // Test Case 4
        this.console.println("Test Case 4");
        cunningSkill = 11;
        cunningRequirement = 4;
        expResult = -1;
        result = instance.calcMeetCunningRequirements(cunningSkill, cunningRequirement);
        assertEquals(expResult, result);
        
        // Test Case 5
        this.console.println("Test Case 5");
        cunningSkill = 0;
        cunningRequirement = 4;
        expResult = 0;
        result = instance.calcMeetCunningRequirements(cunningSkill, cunningRequirement);
        assertEquals(expResult, result);
        
        // Test Case 6
        this.console.println("Test Case 6");
        cunningSkill = 10;
        cunningRequirement = 4;
        expResult = 1;
        result = instance.calcMeetCunningRequirements(cunningSkill, cunningRequirement);
        assertEquals(expResult, result);
    }
    
}
