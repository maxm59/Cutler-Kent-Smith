/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.exception;

/**
 *
 * @author ricte
 */
public class ComplexCalcException extends Exception{
    
    //Default Constructor
    public ComplexCalcException(){
    }
    /////////////////////
    
    //Overriden Constructors
    public ComplexCalcException(String message){
        super(message);
    }
    
    public ComplexCalcException(String message, Throwable cause){
        super(message, cause);
    }
    
    public ComplexCalcException(Throwable cause){
        super(cause);
    }
    
    public ComplexCalcException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
