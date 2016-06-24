/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Nina
 */
public enum Character implements Serializable {
    
    Jane("Hello. What can I get for you?"),
    Jack("Hello."),
    Blake(".......");
    
    
    private final String dialogue;
    private final Point location;

    Character(String dialogue) {
        this.dialogue = dialogue;
        location = New Point(1,1);
    }

   

    public String getDialogue() {
        return dialogue;
    }

    

    public String getLocation() {
        return location;
    }
}
