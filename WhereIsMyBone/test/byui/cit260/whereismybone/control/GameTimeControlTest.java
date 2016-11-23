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
public class GameTimeControlTest {
    
    public GameTimeControlTest() {
    }

    /**
     * Test of calcNewGameTime method, of class GameTimeControl.
     */
    @Test
    public void testCalcNewGameTime() {
        System.out.println("calcNewGameTime");
        
        /***********************
         * TEST CASE #1
         ***********************/
        System.out.println("\tTest case #1");      
        
        
        double currentTime = 10.0;
        double timeLoss = 0.5;
        double expResult = 9.5;
        double result = GameTimeControl.calcNewGameTime(currentTime, timeLoss);
        assertEquals(expResult, result, 0.0);
        
        
        /***********************
         * TEST CASE #2
         ***********************/
        System.out.println("\tTest case #2");      
        
        
        currentTime = -1;
        timeLoss = 0.5;
        expResult = 0;
        result = GameTimeControl.calcNewGameTime(currentTime, timeLoss);
        assertEquals(expResult, result, 0.0);
        
        
        /***********************
         * TEST CASE #3
         ***********************/
        System.out.println("\tTest case #3");      
        
        
        currentTime = 10;
        timeLoss = -1;
        expResult = 9.9;
        result = GameTimeControl.calcNewGameTime(currentTime, timeLoss);
        assertEquals(expResult, result, 0.0);
        
        
        /***********************
         * TEST CASE #4
         ***********************/
        System.out.println("\tTest case #4");      
        
        
        currentTime = 24;
        timeLoss = 0.01;
        expResult = 23.99;
        result = GameTimeControl.calcNewGameTime(currentTime, timeLoss);
        assertEquals(expResult, result, 0.0);
        
        
        /***********************
         * TEST CASE #5
         ***********************/
        System.out.println("\tTest case #5");      
        
        
        currentTime = 0.01;
        timeLoss = 5;
        expResult = 0;
        result = GameTimeControl.calcNewGameTime(currentTime, timeLoss);
        assertEquals(expResult, result, 0.0);
        
        
    }
    
    
}
