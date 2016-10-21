/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.control;

/**
 *
 * @author Smith-Rick
 */
public class ComplexCalculationsControl {
    
    public double calcSqYard(int width, int length)
    {
        if (width <= 0)
        {
            return -1;    
        }
        if (length <= 0)
        {
            return -1;
        }

        double yard = width * length;

        return yard;
    }
     
    public double calcCubicInches(int width, int length, int height)
    {               
        //All Demensions must be greater than 0
        if (width <=0 || length <= 0 || height <= 0)
        {
            return -1;
        }

        //Input cannot be greater than 48in (4ft)
        if (width > 48 || length > 48 || height > 48)
        {
            return -1;    
        }
        
        double cubicInch = width * length * height;

        return cubicInch;
    }
}
