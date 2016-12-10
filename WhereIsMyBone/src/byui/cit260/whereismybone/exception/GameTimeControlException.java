package byui.cit260.whereismybone.exception;

/**
 *
 * @author ricte
 * 
 * 12/10/16 Maxi: cleaned up unused coding, comments and proper format
 */
public class GameTimeControlException extends Exception{
    //Default Constructor
    public GameTimeControlException(){
    }
    public GameTimeControlException(String message){
        super(message);
    }    
    public GameTimeControlException(String message, Throwable cause){
        super(message, cause);
    }    
    public GameTimeControlException(Throwable cause){
        super(cause);
    }    
    public GameTimeControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
