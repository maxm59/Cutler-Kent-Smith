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
    Badge("You put your badge on."),
    Bacon("Donuts with bacon bits."),
    Bell("A cat colar bell."),
    Box("A box at the zoo."),
    Cages("Humm empty cages, I can smell the cat gang was here."),
    CatColar("A red cat colar. The he tag where the cat's name should be is all scratched out."),
    CatHair("Just a normal flashlight."),
    Cats("Lots of cats at the pond."),
    FishBones("Just a normal flashlight."),
    Hamburger("Your treat during your morning break."),
    Water("You are very thirsty, you lap-up some water."),
    
    Pipe("A hiding place for the bone."),

    None("Keep moving");
    
    //private String name;
    private final String description;

    Item(String description) {
        this.description = description;

    }

    public String getDiscription() {
        return description;
    }
 
}
