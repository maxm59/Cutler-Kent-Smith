/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.control;

import byui.cit260.whereismybone.exception.ComplexCalcException;
import byui.cit260.whereismybone.view.ErrorView;

/**
 * Group Assignment
 * @author Smith-Rick 
 */
public class ComplexCalculationsControl {
    
    public double calcSqYard(int width, int length){
        
//        try{
            if (width <= 0)
                return -1;
//            } catch (Exception e) {
//                System.out.println("Input must be an integer and more than 0.");  
            if (length <= 0)
                return -1; 
            double yard = width * length;
            return yard; 
    }

     
    public double calcCubicInches(int width, int length, int height) //throws ComplexCalcException
    {               
        //All Demensions must be greater than 0
        if (width <=0 || length <= 0 || height <= 0)
        {
//            throw new ComplexCalcException("Invalid entry, value cannot be less"
//                    + " than 0. Please try again.");
            return -1;
        }

        //Input cannot be greater than 48in (4ft)
        if (width > 48 || length > 48 || height > 48)
        {
//            throw new ComplexCalcException("Invalid entry, value cannot be "
//                    + "greater than 48. Please try again.");
            return -1;    
        }
        
        double cubicInch = width * length * height;

        return cubicInch;
    }
    
    public double calcCylinderArea(int height, int diameter) //throws ComplexCalcException
    {
        
        if (height <= 0) 
        {
            //throw new ComplexCalcException("Invalid entry, height cannot be "
            //    + "less than or equal to zero. Please try again.");
            return -1;
        }
        
        if (diameter <= 0 || diameter > 36)
        {
            //throw new ComplexCalcException("Invalid entry, diameter cannot be "
            //    + "less than or equal to zero or greater than 36. "
            //        + "Please try again.");
            return -1;
        }
            
        double radius = diameter/2;
        double volume = (Math.PI * radius * radius * height)/1728;
        
        return volume;
    }
    
    public long calcWatts(int volts, int amps) 
    {
        
//        System.out.println("DEBUG - Entering Calc Watts");
//        System.out.println("DEBUG - Volts: " + volts);
//        System.out.println("DEBUG - Amps: " + amps);
        
        if(amps <= 0 || amps > 250)
        {

            //System.out.println("DEBUG - Failed Amps validation: " + amps);
            return -1;
        }
        
        if (volts <= 0 || volts > 400000)
        {

            //System.out.println("DEBUG - Failed Volgs validation: " + volts);
            return -1;
        }
        
        long watts = volts * amps;
        
        //System.out.println("DEBUG - Watts result: " + watts);
        return watts;
    }
    
    //This public boolean is to complete the assingment for L11
    public boolean validateWatts(String guess, int volts, int amps) 
            throws ComplexCalcException
    {
        
        System.out.println("DEBUG - Entering valdiate Watts");
        System.out.println("DEBUG - User Guessed: " + guess);
        try{
            Long answer = new Long(this.calcWatts(volts, amps));
            Integer i = Integer.parseInt(guess);
            
            Long lValue = new Long(i.longValue());
                       
            
            System.out.println("Expected Answer: " + answer);
            System.out.println("User Guessed: " + i);
            
            return lValue.compareTo(answer) == 0;
        }
        catch(NumberFormatException ex){
            
            //System.out.println("DEBUG - Number format Exception entered");
            ErrorView.display(this.getClass().getName(), "Error validating Watts: "
            + ex.getMessage());
            
            throw new ComplexCalcException("A numerical value is required.");
            
        }
    }
    
}