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
import cit260.byui.detective.model.Player;
import cit260.byui.detective.model.Character;
import cit260.byui.detective.model.CombatScene;
import cit260.byui.detective.model.CunningScene;
import cit260.byui.detective.model.IntelligenceScene;
import cit260.byui.detective.model.Scene;
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
        startProgramView.displayStartProgramView();
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
