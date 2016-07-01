/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Nina
 */
public enum Character implements Serializable {
    
    Player_Detective("..."),
    Jane("Hello. What can I get for you?"),
    Jack("Hello."),
    Blake("......."),
    Claire("What do you want?"),
    Thug("You're dead.");
    
    
    private final String dialogue;
    private final Point location;

    Character(String dialogue) {
        this.dialogue = dialogue;
        location = new Point(0,0);
        
    }

   

    public String getDialogue() {
        return dialogue;
    }

    

    public Point getLocation() {
        return location;
    }
}
