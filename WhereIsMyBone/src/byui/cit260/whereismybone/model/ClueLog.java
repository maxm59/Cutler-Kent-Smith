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
 * @author Brian
 * corrected Clues to ClueLog by Maxine
 * according to UML Model and fix all the errors
 * errors and add this class to the main
 */
public class ClueLog implements Serializable {
    
    private String clueFound;
    private String description;

    public ClueLog() {
    }
    
    public String getClueFound() {
        return clueFound;
    }

    public void setClueFound(String clueFound) {
        this.clueFound = clueFound;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ClueLog{" + "clueFound=" + clueFound + ", description=" + description + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.clueFound);
        hash = 41 * hash + Objects.hashCode(this.description);
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
        final ClueLog other = (ClueLog) obj;
        if (!Objects.equals(this.clueFound, other.clueFound)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    
    
}
