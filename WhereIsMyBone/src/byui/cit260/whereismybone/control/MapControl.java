/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.control;

import byui.cit260.whereismybone.model.Map;

/**
 *
 * @author Rick Smith
 */
public class MapControl {

    public static Map createMap() {
        
        //create the map
        Map map = null;
        
        System.out.println("\n*** called createMap() in MapControl ***");
        return map;
    }

    static void moveActorsToStartingLocation(Map map) {
        System.out.println("\n*** called moveActorsToStartingLocation() in MapControl ***");
    }
    
    public boolean validLocation(int row,int column){
        if (row < 1 || row > 5) {
                return false;
        }
        
        if (column < 1 || column >  5) {
                return false;
        }
        
        return true;
    }
    
    public int[] movePlayer(int nRow, int nCol)
    {
       if(!validLocation(nRow, nCol))
       {
           //int[] resultFail = null;
           return null;
       }
       
       int[] newLoc = {nRow, nCol};
       return newLoc;
       
    }
    
}
