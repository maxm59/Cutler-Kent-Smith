package byui.cit260.whereismybone.model;

import java.io.Serializable;
import java.util.Objects;


/**
 *
 * @author Smith-Rick
 * Maxi: added backpack to player
 * 
 */
public class Player implements Serializable{
    
    private String name = "";
    private String gender = "";    
    private Location location;
    private String childType = ""; //Is set to son or daughter.
    private BackpackItem backpack;

    public Player() {
        
    }

    public Player(Location location, String backpack) {
        this.location = location;
    }
 
    public Player(Location location, BackpackItem backpack) {
        this.location = location;
        this.backpack = backpack;
    }

    public BackpackItem getBackpackItem() {
        return backpack;
    }

    public void setBackpackItem(BackpackItem backpack) {
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.gender);
        hash = 11 * hash + Objects.hashCode(this.location);
        hash = 11 * hash + Objects.hashCode(this.childType);
        hash = 11 * hash + Objects.hashCode(this.backpack);
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
        if (!Objects.equals(this.childType, other.childType)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.backpack, other.backpack)) {
            return false;
        }
        return true;
    }
            
}
