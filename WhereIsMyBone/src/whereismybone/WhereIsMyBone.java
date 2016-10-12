/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whereismybone;

import byui.cit260.whereismybone.model.Actor;
import byui.cit260.whereismybone.model.BackPack;
import byui.cit260.whereismybone.model.ClueLog;
import byui.cit260.whereismybone.model.Game;
import byui.cit260.whereismybone.model.Location;
import byui.cit260.whereismybone.model.Map;
import byui.cit260.whereismybone.model.Player;
import byui.cit260.whereismybone.model.TravelLog;
import byui.cit260.whereismybone.view.WelcomeScreenView;
import java.util.HashSet;
import java.util.Set;

public class WhereIsMyBone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Welcome Screen
        WelcomeScreenView welcomeScreen = new WelcomeScreenView();
        welcomeScreen.welcomeScreen();
        
        
        //TESTING - TESTING
        //Display Map to string and display Location Array.
        
        String debugMesg = 
                "\n==================================================" +
                "\n=============  DEBUGGING         =================" +
                "\n==================================================" +
                "\n";
        
        String debugBreak = 
                "\n==================================================" +
                "\n";
        
        System.out.println(debugMesg);
        //Player related
        Player player = new Player();
        player.setName("TesT");
        player.setGender("M");
        
        String playerInfo = player.toString();
        System.out.println(playerInfo);
        
        System.out.println(debugBreak);
                
        //Game related
        Game game = new Game();
        game.setTotalTime(24.0);
        
        String gameInfo = game.toString();
        System.out.print(gameInfo);
        
        System.out.println(debugBreak);
        
        //Actor related
        Actor catDeVil = new Actor();
        catDeVil.setName("Cat DeVil");
        catDeVil.setDiscription("The Main Bad Guy");
        
        String catDeVilInfo = catDeVil.toString();
        System.out.println(catDeVilInfo);
        
        System.out.println(debugBreak);
        
        //ClueLog related
        ClueLog clueOne = new ClueLog();
        clueOne.setDescripton("You have gotten this clue");
                
        String clueOneInfo = clueOne.toString();
        System.out.println(clueOneInfo);
        
        System.out.println(debugBreak);
        
        
        //TravelLog related
        TravelLog entryOne = new TravelLog();
        entryOne.setLocationHistoryDetails("You visited the park.");
        
        String entryOneInfo = entryOne.toString();
        System.out.println(entryOneInfo);
        
        System.out.println(debugBreak);
        
        //BackPack related
        BackPack backPack = new BackPack();
        backPack.setItem("Cat Colar");
        
        String backPackInfo = backPack.toString();
        System.out.println(backPackInfo);
        
        System.out.println(debugBreak);
        
        //Map related
        Map map = new Map();
        map.setColumnCount(5);
        map.setRowCount(5);                
        
        String mapInfo = map.toString();
        System.out.println(mapInfo);

        System.out.println(debugMesg);
        
        //Location related
        Location location = new Location();
        location.setName("Park");
        location.setColumnCount(1);
        location.setRowCount(1);
        
        String locationInfo = location.toString();
        System.out.println(locationInfo);
                
        System.out.println(debugMesg);
        
    }
    
}
