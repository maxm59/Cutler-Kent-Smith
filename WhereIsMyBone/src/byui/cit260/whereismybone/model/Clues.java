/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.model;
import com.sun.org.apache.xpath.internal.operations.Bool;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author Brian
 */
public class Clues implements Serializable {
    
    private String Description;
    private Bool isFound;

    public Clues() {
    }

    public String getDescription() {
        return Description;
    }

    public Bool getIsFound() {
        return isFound;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setIsFound(Bool isFound) {
        this.isFound = isFound;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.Description);
        hash = 41 * hash + Objects.hashCode(this.isFound);
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
        final Clues other = (Clues) obj;
        if (!Objects.equals(this.Description, other.Description)) {
            return false;
        }
        if (!Objects.equals(this.isFound, other.isFound)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
