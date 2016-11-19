/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.whereismybone.model;
import java.awt.Point;
import java.io.Serializable;
/**
 *
 * @author Brian Kent
 * don't do coordinates here
 * @author Maxi Cutler
 * add more items
 * 
 * 
 */
public enum Item implements Serializable {
    
    Bone("Just a normal flashlight."),
    Box("A box at the zoo."),
    Bell("A cat colar bell."),
    CatColar("A red cat colar. The he tag where the cat's name should be is all scratched out."),
    CatHair("Just a normal flashlight."),
    FishBones("Just a normal flashlight."),
    Pipe("A hiding place for the bone.");
    
    //private String name;
    private final String description;

    Item(String description) {
        this.description = description;

    }

    public String getDiscription() {
        return description;
    }
 
}
