/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.view;

import static byui.cit260.detective.model.Character.Player_Detective;
import byui.cit260.detective.model.Game;
import byui.cit260.detective.model.Location;
import byui.cit260.detective.model.Map;
import byui.cit260.detective.model.Tool;
import detective.Detective;
import java.util.Scanner;

/**
 *
 * @author Nina
 */
public class GameMenuView extends View {
    

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
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
              
        }
        
        return false;
    }

    private void observeArea() {
        System.out.println("\n*** observeArea() stub function called ***");
    }

    private void viewInventory() {
        StringBuilder line;
        
        Game game = Detective.getCurrentGame();
        Tool[] tool = game.getToolList();
        
        System.out.println("\n      Inventory");
        line = new StringBuilder("                          ");
        line.insert(0, "Description");
        System.out.println(line.toString());
        
        for (Tool item: tool) {
            line = new StringBuilder("                           ");
            line.insert(0, item.getDescription());
            
            System.out.println(line.toString());
        }
        
    }

    private void takeItem() {
        System.out.println("\n*** takeItem() stub function called ***");
    }

    private void talkToCharacter() {
        System.out.println("\n*** talkToCharacter() stub function called ***");
    }

    private void enterCombat() {
        CombatView combatView = new CombatView();
        combatView.display();
    }

    private void viewMap() {
         /*
        BEGIN
            get the map locations from the current game
            DISPLAY title
            DISPLAY row of column numbers
            FOR every row in map
             DISPLAY row divider
             DISPLAY row number
                FOR every column in row
                DISPLAY column divider
                location = locations[row][column]
                IF location has been visited
                DISPLAY the map symbol for location
                ELSE
                DISPLAY " ?? "
                ENDIF
                 DISPLAY ending column divider
                 ENDFOR
                DISPLAY ending row divider 
        */
         
        Map gameMap = Detective.getCurrentGame().getMap();
        Location[][] locations = gameMap.getLocations();
        
        System.out.println("\n------------------------------------------" 
                          + "\n Undercity Map"
                          + "\n------------------------------------------"); 
        
        int numCol = gameMap.getColumnCount();
        int numRow = gameMap.getRowCount();
        
        System.out.println("    1     2     3     4     5");
        for (int row = 0; row < numRow; row++) {
            System.out.println(" --------------------------------");
            System.out.print((row + 1) + " ");
            for (int col = 0; col < numCol; col++) {
           
                
                    System.out.print("|");
                    System.out.print("  x  ");
               
            }
                
                System.out.print("|\n");
            }
        System.out.println(" --------------------------------");
            
        }
        
         
}
    
