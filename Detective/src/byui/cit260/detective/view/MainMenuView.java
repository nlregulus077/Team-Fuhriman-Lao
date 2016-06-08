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
public class MainMenuView {
    
    private String menu;
    private String promptMessage;

    public MainMenuView() {
        this.promptMessage = "\nWhat will you do?";
        this.menu = "\n"
                  + "\n ---------------------------------------------------"
                  + "\n | Main Menu                                       |"
                  + "\n ---------------------------------------------------"
                  + "\nS - Start New Game"
                  + "\nL - Load File"
                  + "\nO - Options"
                  + "\nF - Fundamentals"
                  + "\nC - Credits"
                  + "\nQ - Quit"
                  + "\n----------------------------------------------------";
    }

   

    void displayMainMenuView() {
        
        boolean done = false;
        do {
            System.out.println(this.menu);
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
        } while (!done);
        
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("\n Invalid value: value can not be blank.");
                continue;
            }
            
            break;
        }
        
        return value;
    }

    private boolean doAction(String choice) {
        
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
        gameMenu.displayMenu();
    }

    private void LoadFile() {
        System.out.println("\n*** LoadFile() called ***");
    }

    private void Options() {
        System.out.println("\n*** Options() called ***");
    }

    private void Credits() {
        System.out.println("\n*** Credits() called ***");
    }

    private void Fundamentals() {
        FundamentalsView fundamentalsMenu = new FundamentalsView();
        fundamentalsMenu.displayFundamentalView();
    }
    
}
