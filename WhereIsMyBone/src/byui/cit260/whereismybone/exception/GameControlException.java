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
public class GameControlException extends Exception{
    
    //Default Constructor
    public GameControlException(){
    }
    /////////////////////
    
    //Overriden Constructors
    public GameControlException(String message){
        super(message);
    }
    
    public GameControlException(String message, Throwable cause){
        super(message, cause);
    }
    
    public GameControlException(Throwable cause){
        super(cause);
    }
}