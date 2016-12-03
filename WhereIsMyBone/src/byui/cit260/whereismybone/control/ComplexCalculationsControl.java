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
    
    public int calcSqYard(int width, int length)
    throws ComplexCalcException{
        
        Integer yard = null;
        
        try{
        
            if (width <= 0)
                return -1;
            if (length <= 0)
                return -1; 
            
            yard = width * length;
        }
        catch(Exception ex){
                                    
            throw new ComplexCalcException("ERROR: There was a problem with "
                    + "calculating square yard.");
        }
        
        return yard; 
    }

     
    public int calcCubicInches(int width, int length, int height) throws ComplexCalcException //throws ComplexCalcException
    {  
        Integer cubicInch = null;
        
        try{
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

            cubicInch = width * length * height;
        }
        catch(Exception ex){
                                    
            throw new ComplexCalcException("ERROR: There was a problem with "
                    + "calculating cubic inch.");
        }
        
        return cubicInch;
    }
    
    public long calcCylinderArea(int height, int diameter) throws ComplexCalcException //throws ComplexCalcException
    {
        Long l = null;
        
        try{

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

            l = (new Double(volume)).longValue();
        }
        catch(Exception ex){
                                    
            throw new ComplexCalcException("ERROR: There was a problem with "
                    + "calculating cylinder.");
        }
        
        //Answer rounded to the nearest 10th
        //18.8
        return l;
    }
    
    public long calcWatts(int volts, int amps) throws ComplexCalcException 
    {
        
        Long watts = null;
        
        try{

            if(amps <= 0 || amps > 250)
            {

                return -1;
            }

            if (volts <= 0 || volts > 400000)
            {

                return -1;
            }
            
            Integer result = volts * amps;

            watts = result.longValue();
        }
        catch(Exception ex){
                                    
            throw new ComplexCalcException("ERROR: There was a problem with "
                    + "calculating cubic inch.");
        }
        
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