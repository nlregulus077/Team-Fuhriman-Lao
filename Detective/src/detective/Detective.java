/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detective;

import cit260.byui.detective.model.Player;
import cit260.byui.detective.model.Character;
import cit260.byui.detective.model.CombatScene;
import cit260.byui.detective.model.Scene;
/**
 *
 * @author Nina
 */
public class Detective {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // user
        Player playerOne = new Player();
        
        playerOne.setName("Jack Black");
        playerOne.setIntelligenceSkill(5.0);
        playerOne.setCombatSkill(5.0);
        playerOne.setCunningSkill(5.0);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        // npc
        Character nonPlayerOne = new Character();
        
        nonPlayerOne.setName("Trisha");
        nonPlayerOne.setLocation("Diner");
        nonPlayerOne.setDescription("Trisha is a waitress working at the local diner.  Many have asked her out on a date.");
        nonPlayerOne.setDialogue("I saw someone with a gun.  Please be careful.");
        
        String npcInfo = nonPlayerOne.toString();
        System.out.println(npcInfo);
        
        // generic scene
        Scene dinerScene = new Scene();
        
        dinerScene.setLocation("Diner");
        dinerScene.setDescription("You have arrived at the diner.  There aren't many customers, and there's only one waitress on duty.");
        dinerScene.setOptions("Use\n");
        
        String dinerSceneInfo = dinerScene.toString();
        System.out.println(dinerSceneInfo);
        
        // combat
        CombatScene combat = new CombatScene();
        
        combat.setLocation("Alleyway");
        combat.setDescription("You have arrived at an alleyway.  You are ambushed by an armed thug.");
        combat.setOptions("Fight\n Use\n");
        combat.setCombatRequirement(4.0);
        
        String combatInfo = combat.toString();
        System.out.println(combatInfo);
    }
    
}
