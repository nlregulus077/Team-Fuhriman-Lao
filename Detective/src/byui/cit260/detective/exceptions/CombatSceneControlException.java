/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.exceptions;

/**
 *
 * @author Logan
 */
public class CombatSceneControlException extends Exception {

    public CombatSceneControlException() {
    }

    public CombatSceneControlException(String string) {
        super(string);
    }

    public CombatSceneControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public CombatSceneControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public CombatSceneControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
    
    
}
