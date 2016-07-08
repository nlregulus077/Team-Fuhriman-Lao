/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.view;

import detective.Detective;
import java.io.PrintWriter;
import java.io.Serializable;

/**
 *
 * @author Nina
 */
public class ErrorView implements Serializable {
    
    private static final PrintWriter errorFile = Detective.getOutFile();
    private static final PrintWriter logFile = Detective.getLogFile();
    
    public static void display (String className, String errorMessage) {
        
        errorFile.println("***********************************************" 
                + "\n - ERROR -" + errorMessage
                + "\n***********************************************");
        
        logFile.println(className + " - " + errorMessage);
    }
}
