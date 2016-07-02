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
    
    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        
        try {
        startProgramView.displayStartProgramView();
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.displayStartProgramView();
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
