/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.model;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Smith-Rick
 */
public class Player {
    
    private String name = "";
    private String gender = "";
    private int[][] currentLocation; //Not sure how to get this part to work.
    private String childType = ""; //Is set to son or daughter.

    public Player() {
        
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

    public int[][] getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(int[][] currentLocation) {
        this.currentLocation = currentLocation;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.name);
        hash = 19 * hash + Objects.hashCode(this.gender);
        hash = 19 * hash + Arrays.deepHashCode(this.currentLocation);
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.gender, other.gender)) {
            return false;
        }
        if (!Arrays.deepEquals(this.currentLocation, other.currentLocation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", gender=" + gender + ", currentLocation=" + currentLocation + '}';
    }
            
}
