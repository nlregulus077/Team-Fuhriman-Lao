/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detective;

import byui.cit260.detective.model.Game;
import byui.cit260.detective.model.Location;
import byui.cit260.detective.model.Map;
import byui.cit260.detective.model.Tool;
import byui.cit260.detective.view.StartProgramView;
import byui.cit260.detective.model.Player;
import byui.cit260.detective.model.Character;
import byui.cit260.detective.model.CombatScene;
import byui.cit260.detective.model.CunningScene;
import byui.cit260.detective.model.IntelligenceScene;
import byui.cit260.detective.model.Scene;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Nina
 */
public class Detective {

    /**
     * @param args the command line arguments
     */
    
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
    public final BufferedReader keyboard = Detective.getInFile();
    public final PrintWriter console = Detective.getOutFile();

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Detective.logFile = logFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Detective.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Detective.inFile = inFile;
    }
    
    
    public static void main(String[] args) {
        
        StartProgramView startProgramView = null;
        try {
       
        
        Detective.inFile = 
                new BufferedReader(new InputStreamReader(System.in));
        Detective.outFile = new PrintWriter(System.out, true);
         startProgramView = new StartProgramView();
         startProgramView.display();
        
        try {
        String filePath = "log.txt";
        Detective.logFile = new PrintWriter(filePath);
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString() +
                                "\nCause: " + e.getCause() +
                                "\nMessage: " + e.getMessage());
        }
        
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.display();
        }
        
        finally {
           
            try {
                if (Detective.inFile != null)
                    Detective.inFile.close();
                
                if (Detective.outFile != null)
                    Detective.outFile.close();
                
                if (Detective.logFile != null)
                    Detective.logFile.close();
                
            } catch (IOException ex) {
                System.out.println("Error closing files.");
                return;
            }
            
        }
    }       

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Detective.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Detective.player = player;
    }
}
