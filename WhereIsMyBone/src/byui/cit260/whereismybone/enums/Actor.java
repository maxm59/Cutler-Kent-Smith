/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.enums;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Smith-Rick
 */
public enum Actor implements Serializable{
    
    Tommy("I am 4 years old and play at ParkLand with Mommy."),
    Pete("I am Officer Pete, a K9 unit trainer."),
    DrMice("I love being a local veterinarian."),
    MrSam("I take in lost or unwanted animals."),
    MrJones("As your baker, you love my bacon donuts."),
    MrSteele("I am the owner of this steak resturant."),
    MsCoCo("I am the owner of Tex Mix Drive Inn."),
    Ducks("I love gliding in the pond at the ParkLand Park."),
    MissEllie("I am a System Administrator at Senior Care Living."),
    TheSmiths("We live in your neighborhood."),
    BenAndNancy("Ben is your K9 handler/officer. Nancy is his wife."),
    MrNono("I am a service animal technician."),
    MrCatch("I am the owner of Seafood Eatery"),
    Animals("Elephants, Giraffes, and Tigers at ZooLand."),
    Brad("I am 8 years old and a student at Trump Elementry"),
    MrSneed("I am a teacher at Trump Elementary School.");
    
    private final String description;
    private final Point coordinates;
  
    Actor(String description){
        this.description = description;
        coordinates = new Point(1,1);
    }

    public String getDescription() {
        return description;
    }
    public Point getCoordinates() {
        return coordinates;
    }
    
}
