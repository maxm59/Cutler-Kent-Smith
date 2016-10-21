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
     
    
}
