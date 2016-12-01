/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.model;

import java.io.Serializable;

/**
 *
 * @author Smit-Rick
 */
public class Game implements Serializable{

    //Starts at 24 hours. It can be reduced by hole numbers or fractions of a 
    //  number, which is why we use a Double vs an Integer.
//    private Double totalTime; - Using GameTime & GameTimeControl
    
    private Player player;
    private Map map;
    private Clue[] clueList;
    private BackpackItem[] itemList; 
    private GameTime gameTime;
   

    public Game() {
                
    }
    
    public BackpackItem[] getBackpackItemList() {
        return itemList;
    }

    public void setBackpackItemList(BackpackItem[] itemList) {
        this.itemList = itemList;
    }

    public Clue[] getClueList() {
        return clueList;
    }

    public void setClueList(Clue[] clueList) {
        this.clueList = clueList;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public GameTime getGameTime() {
        return gameTime;
    }

    public void setGameTime(GameTime gameTime) {
        this.gameTime = gameTime;
    }
}
