/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whereismybone;

//import byui.cit260.whereismybone.model.Actor;
//import byui.cit260.whereismybone.model.BackPack;
//import byui.cit260.whereismybone.model.ClueLog;
import byui.cit260.whereismybone.model.Game;
//import byui.cit260.whereismybone.model.Location;
//import byui.cit260.whereismybone.model.Map;
import byui.cit260.whereismybone.model.Player;
//import byui.cit260.whereismybone.model.TravelLog;
import byui.cit260.whereismybone.view.StartProgramView;
//import java.util.HashSet;
//import java.util.Set;

public class WhereIsMyBone {
    
    private static Game currentGame = null;
    private static Player player = null;

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
    }
   
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        WhereIsMyBone.currentGame = currentGame;
    }
    
    public static Player getPlayer(){
        return player;
    }
    
    public static void setPlayer(Player player)
    {
        WhereIsMyBone.player = player;
    }
}
