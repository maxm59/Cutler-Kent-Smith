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
 * @author Smith-Rick
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
                       
        /***********************
         * TEST CASE #1
         ***********************/
        System.out.println("\tTest case #1");
        
        int row = 3;
        int column = 3;
        MapControl instance = new MapControl();
        boolean expResult = true;
        boolean result = instance.validLocation(row, column);
        assertEquals(expResult, result);
                       
         /***********************
         * TEST CASE #2
         ***********************/
        System.out.println("\tTest case #2");
        
        row = -1;
        column = 3;
        expResult = false;
        result = instance.validLocation(row, column);
        assertEquals(expResult, result);
                
         /***********************
         * TEST CASE #3
         ***********************/
        System.out.println("\tTest case #3");
        
        row = 3;
        column = -1;
        expResult = false;
        result = instance.validLocation(row, column);
        assertEquals(expResult, result);
        
                
         /***********************
         * TEST CASE #4
         ***********************/
        System.out.println("\tTest case #4");
        
        row = 3;
        column = 6;
        expResult = false;
        result = instance.validLocation(row, column);
        assertEquals(expResult, result);
                
         /***********************
         * TEST CASE #5
         ***********************/
        System.out.println("\tTest case #5");
        
        row = 1;
        column = 1;
        expResult = true;
        result = instance.validLocation(row, column);
        assertEquals(expResult, result);
                
         /***********************
         * TEST CASE #6
         ***********************/
        System.out.println("\tTest case #6");
        
        row = 5;
        column = 1;
        expResult = true;
        result = instance.validLocation(row, column);
        assertEquals(expResult, result);
                
         /***********************
         * TEST CASE #7
         ***********************/
        System.out.println("\tTest case #7");
        
        row = 1;
        column = 5;
        expResult = true;
        result = instance.validLocation(row, column);
        assertEquals(expResult, result);
        
    }
//    /**
//     * Test of movePlayer method, of class MapControl.
//     */
//    @Test
//    public void testMovePlayer() {
//        System.out.println("movePlayer");
//        
//        /***********************
//         * TEST CASE #1
//         ***********************/
//        System.out.println("\tTest case #1");
//        
//        int nRow = 3;
//        int nCol = 3;
//        MapControl instance = new MapControl();
//        int[] expResult = [3,3];
//        int[] result = instance.movePlayer(nRow, nCol);
//        assertArrayEquals(expResult, result);
//
//        /***********************
//         * TEST CASE #2
//         ***********************/
//        System.out.println("\tTest case #2");
//        
//        nRow = -1;
//        nCol = 3;
//        expResult = null;
//        result = instance.movePlayer(nRow, nCol);
//        assertArrayEquals(expResult, result);
//        
//        /***********************
//         * TEST CASE #3
//         ***********************/
//        System.out.println("\tTest case #3");
//        
//        nRow = 3;
//        nCol = -1;
//        expResult = null;
//        result = instance.movePlayer(nRow, nCol);
//        assertArrayEquals(expResult, result);
//        
//        /***********************
//         * TEST CASE #4
//         ***********************/
//        System.out.println("\tTest case #4");
//        
//        nRow = 3;
//        nCol = 6;
//        expResult = null;
//        result = instance.movePlayer(nRow, nCol);
//        assertArrayEquals(expResult, result);
//        
//        /***********************
//         * TEST CASE #5
//         ***********************/
//        System.out.println("\tTest case #5");
//        
//        nRow = 1;
//        nCol = 1;
//        expResult = {1,1};
//        result = instance.movePlayer(nRow, nCol);
//        assertArrayEquals(expResult, result);
//        
//        /***********************
//         * TEST CASE #6
//         ***********************/
//        System.out.println("\tTest case #6");
//        
//        nRow = 0;
//        nCol = 0;
//        expResult = null;
//        result = instance.movePlayer(nRow, nCol);
//        assertArrayEquals(expResult, result);
//        
//        /***********************
//         * TEST CASE #7
//         ***********************/
//        System.out.println("\tTest case #7");
//        
//        nRow = 0;
//        nCol = 0;
//        expResult = null;
//        result = instance.movePlayer(nRow, nCol);
//        assertArrayEquals(expResult, result);
//
//
//
//
//    }
    
}
