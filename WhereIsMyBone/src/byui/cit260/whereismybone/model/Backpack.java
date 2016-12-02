/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author Maxi Cutler
 * trying to connect the player to 
 * add items and remove items into the backpack
 * from the different locations on the map
 * 
 */
public class Backpack implements Serializable{
    
    private final ArrayList<BackpackItem> items;
           
    Backpack(){
        items = new ArrayList<>();
        
    }
    public void addItem(BackpackItem item){
        
        items.add(item);  
    }
    public void removeItem(String name) {
       
        for(BackpackItem item : items){
           
           if(item.getName().contains(name)) {
               items.remove(item);
           }
        }
   }
    //gives you the total no of items in the backpack follow the code on mapcontrol on line 401
    public int TotalNoOfItem(){
        int count = 0;
        
        for(BackpackItem item : items){
            count++;
        }
        return count;
    }
    
    public BackpackItem getItem(int index){
        int count = 0;
        
        for(BackpackItem item : items){
            if(count == index)
                return item;            
            count++;
            
        }
        return null; 
    }

    //not sure if we still need the hashcode and equals functions
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.items);
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
        final Backpack other = (Backpack) obj;
        if (!Objects.equals(this.items, other.items)) {
            return false;
        }
        return true;
    }
    
}