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
 * @author Maxi Cutler
 * need 25 locations and brief descriptions
 * also put map position assignments
 * 
 */
public class Scene implements Serializable {

    private String description; //description of the location with sceneType
    private Actor actor;        //who is the actor at this location
    private String dialog;      //what the actor says to the user
    private String name;        //name of current scene
    private Item item;          //perhaps null, if there is an item, need dialog
    public String mapSymbol;    //already visted the spot
    public int minute;          //timed per location
    
    public Scene(){ 
        this.description = "";
    }
    
    public static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.Parkland.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.VacantHouse.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.K9Precinct.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.AnimalCare.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.AnimalShelter.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.JonesBakery.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.SeafoodEatery.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.TexMixDriveInn.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.Pond.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.CatsAlley.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.SeniorCare.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.SmithHouse.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.Home.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.DeVilHouse.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.SuperMax.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.Fishmonger.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.Zoo.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.ElephantsCage.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.GiraffesCage.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.TigerCage.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.SchoolFront.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.SchoolCafe.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.PlayGround.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.TrumpElementry.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.SteakHeaven.ordinal()]);
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", " +
                "actor=" + actor + ", " + "dialog=" + dialog + ", " +
                "name=" + name + ", " + "item=" + item + ", " +
                "mapSymbol=" + mapSymbol + ", " + "minute=" + minute + ", ";
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
        hash = 71 * hash + Objects.hashCode(this.minute);
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
        return this.item == other.item;
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
    
    public String getDescription() {
    return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    
    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        this.minute = minute;
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
}