/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.model;


/**
 *
 * @author Smith-Rick
 * Maxi: added backpack to player
 */
public class Player {
    
    private String name = "";
    private String gender = "";    
    private Location location;
    private String childType = ""; //Is set to son or daughter.
//    private Backpack backpack;

    public Player() {
//        backpack = new Backpack();
//        backpack.addItem(new BackpackItem("Bone", "Steak Bone"));
//        backpack.addItem(new BackpackItem("Bell", "Cat Devil's lost bell."));
    }
    
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getChildType(){
        return childType;
    }
    
    public void setChildType(String childType){
        this.childType = childType;
    }    
            
}
