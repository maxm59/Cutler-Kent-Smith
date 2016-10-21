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
public class ComplexCalculationsControlTest {
    
    public ComplexCalculationsControlTest() {
    }

    /**
     * Test of calcSqYard method, of class ComplexCalculationsControl.
     */
    @Test
    public void testCalcSqYard() {
        System.out.println("calcSqYard");
        
        /***********************
         * TEST CASE #1
         ***********************/
        System.out.println("\tTest case #1");
        
        int width = 24;
        int length = 12;
        ComplexCalculationsControl instance = new ComplexCalculationsControl();
        double expResult = 288.0;
        double result = instance.calcSqYard(width, length);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /***********************
         * TEST CASE #2
         ***********************/
        System.out.println("\tTest case #2");
        
        width = -1;
        length = 12;
        expResult = -1.0;
        result = instance.calcSqYard(width, length);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /***********************
         * TEST CASE #3
         ***********************/
        System.out.println("\tTest case #3");
        
        width = 0;
        length = 0;
        expResult = -1.0;
        result = instance.calcSqYard(width, length);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /***********************
         * TEST CASE #4
         ***********************/
        System.out.println("\tTest case #4");
        
        width = 24;
        length = -1;
        expResult = -1.0;
        result = instance.calcSqYard(width, length);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /***********************
         * TEST CASE #5
         ***********************/
        System.out.println("\tTest case #5");
        
        width = 1;
        length = 12;
        expResult = 12.0;
        result = instance.calcSqYard(width, length);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /***********************
         * TEST CASE #6
         ***********************/
        System.out.println("\tTest case #6");
        
        width = 24;
        length = 1;
        expResult = 24.0;
        result = instance.calcSqYard(width, length);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /***********************
         * TEST CASE #7
         ***********************/
        System.out.println("\tTest case #7");
        
        width = 10;
        length = 5;
        expResult = 50.0;
        result = instance.calcSqYard(width, length);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        
        
    }
    
}