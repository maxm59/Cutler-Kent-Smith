/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ricte
 */
public class MapControlTest {
    
    public MapControlTest() {
    }

    /**
     * Test of validLocation method, of class MapControl.
     */
    @Test
    public void testValidLocation() {
        System.out.println("validLocation");
        int row = 0;
        int column = 0;
        MapControl instance = new MapControl();
        boolean expResult = false;
        boolean result = instance.validLocation(row, column);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
