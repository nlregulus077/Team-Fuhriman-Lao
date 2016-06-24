/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.model;

import java.io.Serializable;
        
        

/**
 *
 * @author Logan
 */
import java.util.Objects;/**
 *
 * @author Logan
 */
public class Tool implements Serializable {
    
    private String name;
    private String type;
    private String description;

    public Tool() {
    }
 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.type);
        hash = 53 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tool other = (Tool) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tool{" + "name=" + name + ", type=" + type + ", description=" + description + '}';
    }

    private void setQuantityInStock(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setRequiredAmount(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public enum item{
        gun,
        knife,
        notepad,
        flashlight,
        badge,
        crowbar,  
        firstAidKit;
    
    }
    
    public static Tool[] createToolList() {
    
        Tool[] tool = 
        new Tool[7];
        
        Tool gun = new Tool();
        gun.setDescription("Gun");
        gun.setQuantityInStock(1);
        gun.setRequiredAmount(1);
        tool[item.gun.ordinal()] = gun; 
        
        Tool knife = new Tool();
        gun.setDescription("Knife");
        gun.setQuantityInStock(1);
        gun.setRequiredAmount(1);
        tool[item.knife.ordinal()] = knife; 
        
        Tool notepad = new Tool();
        gun.setDescription("Notepad");
        gun.setQuantityInStock(1);
        gun.setRequiredAmount(1);
        tool[item.notepad.ordinal()] = notepad; 
        
        
        Tool flashlight = new Tool();
        gun.setDescription("Flashlight");
        gun.setQuantityInStock(1);
        gun.setRequiredAmount(1);
        tool[item.flashlight.ordinal()] = flashlight; 
        
        Tool badge = new Tool();
        gun.setDescription("Badge");
        gun.setQuantityInStock(1);
        gun.setRequiredAmount(1);
        tool[item.badge.ordinal()] = badge; 
        
        Tool crowbar = new Tool();
        gun.setDescription("Crowbar");
        gun.setQuantityInStock(1);
        gun.setRequiredAmount(1);
        tool[item.crowbar.ordinal()] = crowbar; 
        
        Tool firstAidKit = new Tool();
        gun.setDescription("First Aid Kit");
        gun.setQuantityInStock(1);
        gun.setRequiredAmount(1);
        tool[item.firstAidKit.ordinal()] = firstAidKit; 
        
        return tool; 
    }
}
    

    
        
  
    
    
    
    

