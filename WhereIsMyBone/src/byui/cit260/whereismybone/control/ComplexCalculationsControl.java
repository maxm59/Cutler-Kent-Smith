/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.control;

import byui.cit260.whereismybone.exception.ComplexCalcException;
import byui.cit260.whereismybone.view.ErrorView;
import java.text.DecimalFormat;

/**
 * Group Assignment
 * @author Smith-Rick 
 */
public class ComplexCalculationsControl {
    
    public int calcSqYard(int width, int length){
        
            if (width <= 0)
                return -1;
            if (length <= 0)
                return -1; 
            int yard = width * length;
            return yard; 
    }

     
    public int calcCubicInches(int width, int length, int height) //throws ComplexCalcException
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
        
        int cubicInch = width * length * height;

        return cubicInch;
    }
    
    public long calcCylinderArea(int height, int diameter) //throws ComplexCalcException
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
            
        int radius = diameter/2;
        double volume = (Math.PI * radius * radius * height);
        
        //Need to format the number so the answer is to the nearest 10th.
        DecimalFormat df = new DecimalFormat("#.#"); 
        volume = Double.valueOf(df.format(volume));
        
        long l = (new Double(volume)).longValue();
        
        //Answer rounded to the nearest 10th
        //18.8
        return l;
    }
    
    public long calcWatts(int volts, int amps) 
    {                
        if(amps <= 0 || amps > 250)
        {

            return -1;
        }
        
        if (volts <= 0 || volts > 400000)
        {

            return -1;
        }
        
        long watts = volts * amps;
        
        return watts;
    }
    
    //This public boolean is to complete the assingment for L11
    public boolean validateWatts(String guess, int volts, int amps) 
            throws ComplexCalcException
    {
        
        try{
            Long answer = new Long(this.calcWatts(volts, amps));
            Integer i = Integer.parseInt(guess);
            
            Long lValue = new Long(i.longValue());
                        
            return lValue.compareTo(answer) == 0;
        }
        catch(NumberFormatException ex){
            
            ErrorView.display(this.getClass().getName(), "Error validating Watts: "
            + ex.getMessage());
            
            throw new ComplexCalcException("A numerical value is required.");
            
        }
    }
    
    public boolean validateCubicInches(String guess, int width, int length, int height) 
            throws ComplexCalcException
    {
        
        try{
            int answer = this.calcCubicInches(width, length, height);
            
            Integer i = Integer.parseInt(guess);
                                    
            return i.compareTo(answer) == 0;
        }
        catch(NumberFormatException ex){
            
            ErrorView.display(this.getClass().getName(), "Error validating "
                    + "Cubic Inches: " + ex.getMessage());
            
            throw new ComplexCalcException("A numerical value is required.");
            
        }
    }
    
    public boolean validateSqYard(String guess, int length, int width) 
            throws ComplexCalcException
    {
        
        try{
            int answer = this.calcSqYard(length, width);

            Integer i = Integer.parseInt(guess);
            
            return i.compareTo(answer) == 0;
        }
        catch(NumberFormatException ex){
            
            ErrorView.display(this.getClass().getName(), "Error validating "
                    + "Square Yard: " + ex.getMessage());
            
            throw new ComplexCalcException("A numerical value is required.");
            
        }
    }
    
    public boolean validateCylindarVolume(String guess, int height, int diameter) 
            throws ComplexCalcException
    {
        
        try{
            Long answer = new Long(this.calcCylinderArea(height, diameter));
            Double i = Double.parseDouble(guess);
            Long lValue = new Long(i.longValue());
           
            return lValue.compareTo(answer) == 0;
        }
        catch(NumberFormatException ex){
            
            ErrorView.display(this.getClass().getName(), "Error validating "
                    + "Cubic Inches: " + ex.getMessage());
            
            throw new ComplexCalcException("A numerical value is required.");
            
        }
    }
    
}