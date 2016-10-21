/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.control;

/**
 *
 * @author ricte
 */
public class MapControl {
    
    public boolean validLocation(int row,int column){
        if (row < 1 || row > 5) {
                return false;
        }
        
        if (column < 1 || column >  5) {
                return false;
        }
        
        return true;
    }
    
    
}
