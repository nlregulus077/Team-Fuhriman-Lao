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
public class IntelligenceSceneControlException extends Exception {

    public IntelligenceSceneControlException() {
    }

    public IntelligenceSceneControlException(String message) {
        super(message);
    }

    public IntelligenceSceneControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public IntelligenceSceneControlException(Throwable cause) {
        super(cause);
    }

    public IntelligenceSceneControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
