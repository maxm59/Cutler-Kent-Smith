package byui.cit260.whereismybone.exception;

/**
 *
 * @author ricte
 * 
 * 12/10/16 Maxi: cleaned up unused coding, comments and proper format
 */
public class GameControlException extends Exception{

    public GameControlException(){
    }
    public GameControlException(String message){
        super(message);
    }
    public GameControlException(String message, Throwable cause){
        super(message, cause);
    }    
    public GameControlException(Throwable cause){
        super(cause);
    }    
    public GameControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
