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
 * per Brother Jones remove coordinates
 * 
 * @author Maxi Cutler
 * added 12 items.
 * 
 * 
 */
public enum Item implements Serializable {
    
    Bone("Steak Bone you just got."),
    Badge("You put your badge on."),
    Bacon("Donuts with bacon bits."),
    Bell("A cat colar bell."),
    Box("A box at the zoo."),
    Cages("Humm empty cages, I can smell the cat gang was here."),
    CatColar("A red cat colar. The he tag where the cat's name should be is all scratched out."),
    CatHair("Cat DeVil's hair."),
    Cats("Lots of cats at the pond."),
    FishBones("Cat Devil's eaten fishbones. Has her smell on it."),
    Hamburger("Your treat during your morning break."),
    Water("You are very thirsty, you lap-up some water."),
    Pipe("A hiding place for the bone."),
    None("Keep moving");

    private final String description;

    Item(String description) {
        this.description = description;
    }
    
    public String getDiscription() {
        return description;
    }
 
}
