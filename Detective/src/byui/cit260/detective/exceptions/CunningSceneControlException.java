/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.exceptions;

/**
 *
 * @author Nina
 */
public class CunningSceneControlException extends Exception {

    public CunningSceneControlException() {
    }

    public CunningSceneControlException(String string) {
        super(string);
    }

    public CunningSceneControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public CunningSceneControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public CunningSceneControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
