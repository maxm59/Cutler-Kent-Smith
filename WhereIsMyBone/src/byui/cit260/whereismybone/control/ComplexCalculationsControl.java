/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.control;

import byui.cit260.whereismybone.exception.ComplexCalcException;

/**
 * Group Assignment
 * @author Smith-Rick 
 */
public class ComplexCalculationsControl {
    
    public double calcSqYard(int width, int length) //throws ComplexCalcException
    {
        if (width <= 0)
        {
            //throw new ComplexCalcException("Invalid width. Please try again.");
            return -1;    
        }
        if (length <= 0)
        {
            //throw new ComplexCalcException("Invalid length. Please try again.");
            return -1;
        }

        double yard = width * length;

        return yard;
    }
     
    public double calcCubicInches(int width, int length, int height) //throws ComplexCalcException
    {               
        //All Demensions must be greater than 0
        if (width <=0 || length <= 0 || height <= 0)
        {
            //throw new ComplexCalcException("Invalid entry, value cannot be less"
            //        + " than 0. Please try again.");
            return -1;
        }

        //Input cannot be greater than 48in (4ft)
        if (width > 48 || length > 48 || height > 48)
        {
            //throw new ComplexCalcException("Invalid entry, value cannot be "
            //        + "greater than 48. Please try again.");
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
    
    public int calcWatts(int volts, int amps) //throws ComplexCalcException
    {
        
        if(amps <= 0 | amps > 1000)
        {
            //throw new ComplexCalcException("Invalid entry, amps cannot be less "
            //        + "than 1 or more than 1000.");
            return -1;
        }
        
        if (volts <= 0 | volts > 14)
        {
            //throw new ComplexCalcException("Invalid entry, volts cannot be less "
            //        + "than 1 or more than 14.");
            return -1;
        }
        
        int watts = volts * amps;
        return watts;
    }
}