/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.view;

import detective.Detective;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Nina
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = Detective.getInFile();
    protected final PrintWriter console = Detective.getOutFile();

    
        
    public View(String message) {
        this.displayMessage = message;
        
    }
    
    
    @Override
    public void display() {
       
        boolean done = false;
        do {
            console.println(displayMessage);
            String menuOption = this.getInput();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
        } while (!done);
    }
    
    @Override
    public String getInput() {
        boolean valid = false;
        String selection = null;
        
        try {
        while (!valid) {
            
            selection = this.keyboard.readLine();
            selection = selection.trim();
            
            if (selection.length() < 1) {
                this.console.println("\n Invalid value: value can not be blank.");
                continue;
            }
            
            break;
        }
        } catch (Exception e) {
            this.console.println("Error reading input: " + e.getMessage());
        }
        
        return selection;
    }


}
