package byui.cit260.whereismybone.model;

import java.io.Serializable;
/**
 *
 * @author Brian Kent
 * 
 * 11/26/16 Maxi finished all 14 clue requirements and 
 * sync with the MapControl.java and Scenes.java
 * The clues are now inserted in the map for player selection
 * per requirement for week 10
 * 
 * 12/10/16 Maxi: cleaned up unused coding, comments and proper format
 * 
 */
public enum Clue implements Serializable {
    
    Clue1("Cat paw prints are near your bowl. Your bone is missing."),
    Clue2("The paw prints around the area."),
    Clue3("Cat fur ball"),
    Clue4("Cat DeVil's favorite snack."),
    Clue5("A cat colar bell."),
    Clue6("A box at the zoo."),
    Clue7("Humm empty cages, I can smell the cat gang was here."),
    Clue8("A red cat colar. The he tag where the cat's name should be is all scratched out."),
    Clue9("A pipe at the zoo."),
    Clue10("Lots of cats at the pond."),
    Clue11("Cat Devil's eaten fishbones. Has her smell on it."),
    Clue12("Your treat during your morning break."),
    Clue13("You are very thirsty, you lap-up some water."),
    Clue14("A hiding place for the bone.");
    
    private final String description;
    private boolean clueFound = false;
    
    Clue(String description) {
        this.description = description;

    }
    public String getDescription() {
        return description;
    }
    
    public boolean getClueFound() {
        return clueFound;
    }

    public void setClueFound(boolean clueFound) {
        this.clueFound = clueFound;
    }    
}
