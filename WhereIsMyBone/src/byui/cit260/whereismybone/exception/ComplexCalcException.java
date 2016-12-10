package byui.cit260.whereismybone.exception;

/**
 *
 * @author ricte
 * 
 * 12/10/16 Maxi: cleaned up unused coding, comments and proper format
 * 
 */
public class ComplexCalcException extends Exception{
    //Default Constructor
    public ComplexCalcException(){
    }
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
