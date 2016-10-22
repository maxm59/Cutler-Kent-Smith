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

    /**
     * Test of calcCubicInches method, of class ComplexCalculationsControl.
     */
    @Test
    public void testCalcCubicInches() {
        System.out.println("calcCubicInches");

        /***********************
         * TEST CASE #1
         ***********************/
        System.out.println("\tTest case #1");
        int width = 11;
        int length = 5;
        int height = 7;
        ComplexCalculationsControl instance = new ComplexCalculationsControl();
        double expResult = 385.0;
        double result = instance.calcCubicInches(width, length, height);
        assertEquals(expResult, result, 0.0);

        /***********************
         * TEST CASE #2
         ***********************/
        System.out.println("\tTest case #2");
        width = 12;
        length = 5;
        height = 0;
        expResult = -1;
        result = instance.calcCubicInches(width, length, height);
        assertEquals(expResult, result, 0.0);

        
        /***********************
         * TEST CASE #3
         ***********************/
        System.out.println("\tTest case #3");
        width = 0;
        length = 5;
        height = 12;
        expResult = -1.0;
        result = instance.calcCubicInches(width, length, height);
        assertEquals(expResult, result, 0.0);

        /***********************
         * TEST CASE #4
         ***********************/
        System.out.println("\tTest case #4");
        width = 5;
        length = 0;
        height = 12;
        expResult = -1.0;
        result = instance.calcCubicInches(width, length, height);
        assertEquals(expResult, result, 0.0);

        /***********************
         * TEST CASE #5
         ***********************/
        System.out.println("\tTest case #5");
        width = 30;
        length = 50;
        height = 20;
        expResult = -1.0;
        result = instance.calcCubicInches(width, length, height);
        assertEquals(expResult, result, 0.0);

        /***********************
         * TEST CASE #6
         ***********************/
        System.out.println("\tTest case #6");
        width = 11;
        length = 5;
        height = 1;
        expResult = 55.0;
        result = instance.calcCubicInches(width, length, height);
        assertEquals(expResult, result, 0.0);

        /***********************
         * TEST CASE #7
         ***********************/
        System.out.println("\tTest case #7");
        width = 1;
        length = 5;
        height = 11;
        expResult = 55.0;
        result = instance.calcCubicInches(width, length, height);
        assertEquals(expResult, result, 0.0);

        
        /***********************
         * TEST CASE #8
         ***********************/
        System.out.println("\tTest case #8");
        width = 5;
        length = 1;
        height = 11;
        expResult = 55.0;
        result = instance.calcCubicInches(width, length, height);
        assertEquals(expResult, result, 0.0);

        /***********************
         * TEST CASE #9
         ***********************/
        System.out.println("\tTest case #9");
        width = 48;
        length = 48;
        height = 48;
        expResult = 110592.0;
        result = instance.calcCubicInches(width, length, height);
        assertEquals(expResult, result, 0.0);

        
    }

    /**
     * Test of calcCylinderArea method, of class ComplexCalculationsControl.
     */
    @Test
    public void testCalcCylinderArea() {
        System.out.println("calcCylinderArea");
        
        /***********************
         * TEST CASE #1
         ***********************/
        System.out.println("\tTest case #1");
        int height = 24;
        int diameter = 12;
        ComplexCalculationsControl instance = new ComplexCalculationsControl();
        double expResult = 1.5707963267948966;
        double result = instance.calcCylinderArea(height, diameter);
        assertEquals(expResult, result, 0.0);

        /***********************
         * TEST CASE #2
         ***********************/
        System.out.println("\tTest case #2");
        height = -1;
        diameter = 12;
        expResult = -1;
        result = instance.calcCylinderArea(height, diameter);
        assertEquals(expResult, result, 0.0);
    
        /***********************
         * TEST CASE #3
         ***********************/
        System.out.println("\tTest case #3");
        height = 12;
        diameter = -1;
        expResult = -1;
        result = instance.calcCylinderArea(height, diameter);
        assertEquals(expResult, result, 0.0);

        /***********************
         * TEST CASE #4
         ***********************/
        System.out.println("\tTest case #4");
        height = 24;
        diameter = 37;
        expResult = -1;
        result = instance.calcCylinderArea(height, diameter);
        assertEquals(expResult, result, 0.0);
        
        /***********************
         * TEST CASE #5
         ***********************/
        System.out.println("\tTest case #5");
        height = 0;
        diameter = 12;
        expResult = -1;
        result = instance.calcCylinderArea(height, diameter);
        assertEquals(expResult, result, 0.0);

        /***********************
         * TEST CASE #6
         ***********************/
        System.out.println("\tTest case #6");
        height = 24;
        diameter = 0;
        expResult = -1;
        result = instance.calcCylinderArea(height, diameter);
        assertEquals(expResult, result, 0.0);

        /***********************
         * TEST CASE #7
         ***********************/
        System.out.println("\tTest case #7");
        height = 24;
        diameter = 36;
        expResult = 14.137166941154069;
        result = instance.calcCylinderArea(height, diameter);
        assertEquals(expResult, result, 0.0);
    }
    
}
