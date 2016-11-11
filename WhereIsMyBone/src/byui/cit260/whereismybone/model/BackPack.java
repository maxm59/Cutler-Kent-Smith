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
 * @author Maxi Cutler
 */
public class BackPack implements Serializable{

    private String item;

    public BackPack() {
    }
    
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }  

    @Override
    public String toString() {
        return "BackPack{" + "item=" + item + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.item);
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
        final BackPack other = (BackPack) obj;
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        return true;
    }
    
}
