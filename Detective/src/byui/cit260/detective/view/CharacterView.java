/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.detective.view;
import byui.cit260.detective.model.Character;

/**
 *
 * @author Nina
 */
public class CharacterView extends View {

    public CharacterView() {
         super("\nTalk to who? (Type the person's name to interact or type S to save this list or type Q to quit.)");
         this.console.println("\n"
                  + "\n ---------------------------------------------------"
                  + "\n | People to talk to...                             |"
                  + "\n ---------------------------------------------------");
         
         Character[] npcList = Character.values();
         
         for (Character npc : npcList){
             
             this.console.println(npc);
         }
        
    }

        
    @Override
            
    public boolean doAction(String choice){
    choice = choice.toUpperCase();
        
        switch (choice) {
            case "JANE":
                this.talkToJane();
                break;
            case "JACK":
                this.talkToJack();
                break;
            case "BLAKE":
                this.talkToBlake();
                break;
            case "CLAIRE":
                this.talkToClaire();
                break;
            case "THUG":
                this.beatTheCrudOutOfTheThug();
                break;
            case "DETECTIVE":
                this.thinkToYourself();
                break;
            case "S":
                this.saveList();
                break;
           
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
    
}
        return false;
    }

    private void talkToJane() {
        this.console.println(Character.Jane.getDialogue());
       
    }

    private void talkToJack() {
        this.console.println(Character.Jack.getDialogue());
    }

    private void talkToBlake() {
        this.console.println(Character.Blake.getDialogue());
        this.console.println("It seems that she knows something.");
        
        TempCunningView cunningView = new TempCunningView();
        cunningView.display();
        
    }

    private void talkToClaire() {
        this.console.println(Character.Claire.getDialogue());
    }

    private void beatTheCrudOutOfTheThug() {
        this.console.println(Character.Thug.getDialogue());
    }

    private void thinkToYourself() {
        this.console.println(Character.Player_Detective.getDialogue());
    }

    private void saveList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
