/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.model;

import java.io.Serializable;

/**
 *
 * @author Smith-Rick-original creator
 * @author Maxi Cutler-added more actors for
 * interaction and dialog for each location.
 * 
 * 
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
    Elephants("There are 3 of us living at the Zoo."),
    Giraffes("A pair of long legs with long necks"),
    Tigers("We are top of the food chain. Beware when hanging out with us."),
    Brad("I am 8 years old and a student at Trump Elementry"),
    MrSneed("I am a teacher at Trump Elementary School."),
    MrsCatDeVil("I am a White with Green eyes illusive ghost cat."),
    Scarface("A gang member with a scare across his blue eyes."),
    Felix("I am a round overfed, overwieght, ball of fuzz."),
    Toby("Your average tom cat."),
    Rex("You know what a T-Rex is? I am the muscule in the group."), 
    Rats("We live in the vacant house.");
    
    private final String description;
  
    Actor(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    
}
