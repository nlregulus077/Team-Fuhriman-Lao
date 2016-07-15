/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.view;

import byui.cit260.detective.control.GameControl;
import byui.cit260.detective.exceptions.MapControlException;
import detective.Detective;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nina
 */
public class MainMenuView extends View implements Serializable {
    

    public MainMenuView() {
        super ("\n"
                  + "\n ---------------------------------------------------"
                  + "\n | Main Menu                                       |"
                  + "\n ---------------------------------------------------"
                  + "\n\tS - Start New Game"
                  + "\n\tL - Load File"
                  + "\n\tO - Options"
                  + "\n\tF - Fundamentals"
                  + "\n\tC - Credits"
                  + "\n\tQ - Quit"
                  + "\n----------------------------------------------------" +
                "\n\nWhat will you do?");
    }

   

   

   
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "S":
                this.StartNewGame();
                break;
            case "L":
                this.loadFile();
                break;
            case "O":
                this.Options();
                break;
            case "C":
                this.Credits();
                break;
            case "F":
                this.Fundamentals();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
              
        }
        
        return false;
    }

    private void StartNewGame() {
        SkillView skillView = new SkillView();
        skillView.displaySkillView();
        
        GameControl.saveSkills();
        try {
            GameControl.createNewGame(Detective.getPlayer());
        } catch (MapControlException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void loadFile() {
        LoadGameView loadGameView = new LoadGameView();
        loadGameView.display();     
    }

    private void Options() {
         OptionsView optionsMenu = new OptionsView();
         optionsMenu.display();
    }

    private void Credits() {
        this.console.println("\nThis game was created for Br. Jackson's CIT 260 class." +
                "\nProgram created by Logan Fuhriman and Jeanina Lao.");
    }

    private void Fundamentals() {
        FundamentalsView fundamentalsMenu = new FundamentalsView();
        fundamentalsMenu.display();
    }
    
}
