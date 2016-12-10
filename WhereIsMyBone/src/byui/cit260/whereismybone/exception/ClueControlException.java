package byui.cit260.whereismybone.exception;

/**
 *
 * @author Maxine Cutler = Week 11 Individual Assignment
 * 12/10/16 Maxi: cleaned up unused coding, comments and proper format
 * 
 */
public class ClueControlException extends Exception{

    public ClueControlException() {
    }
    
    public ClueControlException(String message) {
        super(message);
    }
    
    public ClueControlException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public ClueControlException(Throwable cause) {
        super(cause);
    }

    public ClueControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

