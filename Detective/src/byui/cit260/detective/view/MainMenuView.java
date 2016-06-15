/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.view;

import byui.cit260.detective.control.GameControl;
import detective.Detective;
import java.util.Scanner;

/**
 *
 * @author Nina
 */
public class MainMenuView extends View {
    

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
                this.LoadFile();
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
                System.out.println("\n*** Invalid selection *** Try again");
                break;
              
        }
        
        return false;
    }

    private void StartNewGame() {
        SkillView skillView = new SkillView();
        skillView.displaySkillView();
        
        GameControl.saveSkills();
        GameControl.createNewGame(Detective.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void LoadFile() {
        System.out.println("\n*** LoadFile() called ***");
    }

    private void Options() {
         OptionsView optionsMenu = new OptionsView();
         optionsMenu.display();
    }

    private void Credits() {
        System.out.println("\n*** Credits() called ***");
    }

    private void Fundamentals() {
        FundamentalsView fundamentalsMenu = new FundamentalsView();
        fundamentalsMenu.display();
    }
    
}
