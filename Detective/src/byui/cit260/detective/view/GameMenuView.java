/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.view;

import byui.cit260.detective.control.GameControl;
import byui.cit260.detective.model.Game;
import byui.cit260.detective.model.Location;
import byui.cit260.detective.model.Map;
import byui.cit260.detective.model.Tool;
import detective.Detective;
import java.io.Serializable;

/**
 *
 * @author Nina
 */
public class GameMenuView extends View implements Serializable {
    

    public GameMenuView() {
        super ("\n"
                  + "\n---------------------------------------------------"
                  + "\n Actions                                          |"
                  + "\n---------------------------------------------------"
                  + "\n\tO - Observe"
                  + "\n\tI - Inventory"
                  + "\n\tM - View the Map"
                  + "\n\tTAKE - Take an item"
                  + "\n\tTALK - Talk to a person"
                  + "\n\tFIGHT - Enter combat mode"
                  + "\n\tS - Save"
                  + "\n\tQ - Quit"
                  + "\n---------------------------------------------------" +
                "\n\nWhat will you do?")
                ;
    }
    
    @Override
     public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "O":
                this.observeArea();
                break;
            case "I":
                this.viewInventory();
                break;
            case "M":
                this.viewMap();
                break;
            case "TAKE":
                this.takeItem();
                break;
            case "TALK":
                this.talkToCharacter();
                break;
            case "FIGHT":
                this.enterCombat();
                break; 
            case "S":
                this.saveGame();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
              
        }
        
        return false;
    }

    private void observeArea() {
       TempIntelView tempIntelView =  new TempIntelView();
       tempIntelView.display();
    }

    private void viewInventory() {
        InventoryView inventoryView = new InventoryView();
        inventoryView.display();
    }

    private void takeItem() {
        this.console.println("\n*** takeItem() stub function called ***");
    }

    private void talkToCharacter() {
        CharacterView characterView = new CharacterView();
        characterView.display();
    }

    private void enterCombat() {
        CombatView combatView = new CombatView();
        combatView.display();
    }

    private void viewMap() {
         
        Map gameMap = Detective.getCurrentGame().getMap();
        Location[][] locations = gameMap.getLocations();
        
        this.console.println("\n------------------------------------------" 
                          + "\n Undercity Map"
                          + "\n------------------------------------------"); 
        
        int numCol = gameMap.getColumnCount();
        int numRow = gameMap.getRowCount();
        
        this.console.println("     1     2     3     4     5");
        for (int row = 0; row < numRow; row++) {
            this.console.println(" --------------------------------");
            this.console.print((row + 1) + " ");
            for (int col = 0; col < numCol; col++) {
           
                
                    this.console.print("|");
                    this.console.print("  x  ");
               
            }
                
                this.console.print("|\n");
            }
        this.console.println(" --------------------------------");
        
        MapView mapView = new MapView();
        mapView.display();
            
        }

    private void saveGame() {
        this.console.println("\n\nWhere do you want to save your game? (Enter filepath here.)");
        String filePath = this.getInput();
        
        try {
            GameControl.saveGame(Detective.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
    }
    
    
        
         
}
    
