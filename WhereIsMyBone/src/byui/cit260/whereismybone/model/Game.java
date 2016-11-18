/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Smit-Rick
 */
public class Game implements Serializable{

    //Starts at 24 hours. It can be reduced by hole numbers or fractions of a 
    //  number, which is why we use a Double vs an Integer.
    private Double totalTime; 
    
    private Player player;
    private Map map;
    private Clue[] clueList;
    private Item[] itemList;

    public Item[] getItemList() {
        return itemList;
    }

    public void setItemList(Item[] itemList) {
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
    
    
    public Game() {
                
    }

    public Double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Double totalTime) {
        this.totalTime = totalTime;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.totalTime);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.totalTime, other.totalTime)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + '}';
    }
    
    
    
    
    
}
