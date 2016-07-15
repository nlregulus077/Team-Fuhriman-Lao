/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.view;

/**
 *
 * @author Nina
 */
public class MapView extends View {

    public MapView() {
        super("Where do you want to go?");
    }
    
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            
              
        }
        
        return false;
    }
}
