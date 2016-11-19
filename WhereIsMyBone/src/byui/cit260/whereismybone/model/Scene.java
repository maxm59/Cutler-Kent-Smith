/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author Maxi Cutler
 * need 25 locations and brief descriptions
 * also put map position assignments
 * 
 */
public class Scene implements Serializable {

    private String description;
    private Actor actor;    
    private String dialog; //what the actor says to the user
    private String name; //name of current scene
    private Item item; //perhaps null, if there is an item, need dialog
    public String mapSymbol;
    public int minute;
    
    public Scene(){ 
        this.description = "";
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", actor=" + actor + ", dialog=" + dialog + ", name=" + name + ", item=" + item + ", mapSymbol=" + mapSymbol + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.description);
        hash = 71 * hash + Objects.hashCode(this.actor);
        hash = 71 * hash + Objects.hashCode(this.dialog);
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + Objects.hashCode(this.item);
        hash = 71 * hash + Objects.hashCode(this.mapSymbol);
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.dialog, other.dialog)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.mapSymbol, other.mapSymbol)) {
            return false;
        }
        if (this.actor != other.actor) {
            return false;
        }
        if (this.item != other.item) {
            return false;
        }
        return true;
    }
    
    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public String getDialog() {
        return dialog;
    }

    public void setDialog(String dialog) {
        this.dialog = dialog;
    }
    
    public void setDescription(String description){
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }
    
    
    public String getDescription() {
        return description;
    }
    
}
