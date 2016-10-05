/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whereismybone;

import model.Map;

/**
 *
 * @author ricte
 */
public class WhereIsMyBone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Map related
        Map map = new Map();
        map.setColumnCount(5);
        map.setRowCount(5);
                
        //Test Map related items
        String mapInfo = map.toString();
        System.out.println(mapInfo);
        
    }
    
}
