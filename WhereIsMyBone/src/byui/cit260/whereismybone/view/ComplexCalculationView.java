/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.view;

import java.util.Scanner;
/**
 *
 * @author Smith-Rick
 * 
 * This view class contains the views for the complex calculations performed
 * during the game. 
 * 
 * There are 4 main displays groups. 
 * 1) Volume of the cylinder - Team 
 * 2) Square foot area of the yard - Maxi
 * 3) Cubic Inches - Brian
 * 4) Energy Conversion - Rick
 */

public class ComplexCalculationView {
    
       public static void main (String[] args)
   {
	   Scanner scanner = new Scanner(System.in);
           
	   System.out.println("Enter the length of the back yard:");
	   double length = scanner.nextDouble();
           
	   System.out.println("Enter the width of the back yard:");
	   double width = scanner.nextDouble();
           
	   //Area = length*width;
	   double area = length*width;
           
	   System.out.println("Area of the Backyard is:"+area);
   }
}

