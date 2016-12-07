package byui.cit260.whereismybone.view;

import byui.cit260.whereismybone.control.ComplexCalculationsControl;
import byui.cit260.whereismybone.exception.ComplexCalcException;
/**
 *
 * @author Maxi Cutler
 * 
 */
public class SqYardView extends View {

    private int width;
    private int length;
    private int calcResult;

    public SqYardView(){

        super(
                  "==================================================" +
                "\n               WHERE IS MY BONE?                  " +
                "\n     Back in the yard. Where is my bone?          " +
                "\n==================================================" +
                "\n             .-.               .-.                " +
                "\n            (   `-._________.-'   )               " +
                "\n             >=     _______     =<                " +
                "\n            (   ,-'`       `'-,   )               " +
                "\n             `-'               `-'                " +
                "\n            We found a box that might contain     " +
                "\n            the bone or Cat DeVil, herself.       " +
                "\n            The box is approx. 10 feet wide      " +
                "\n            and 33 feet long.       " +
                "\n                                                  " +
                "\n            Please enter the square area of       " +
                "\n            my yard:                              " +
                "\n                                                  " +          
                "\n             X =   Exit This View                 " + 
                "\n                                                  " +
                "\n==================================================" +
                "\n== Game Creators - Rick S. | Maxi C. | Brian K. = " +
                "\n==================================================") ;  
    }

    @Override
    public boolean doAction(String value){        
        ComplexCalculationsControl ccc = new ComplexCalculationsControl();
        try{          
            boolean result = ccc.validateSqYard(value, 33, 10);//User input validation 
            if(result) {
                this.showCorrect(); //If validation is true, they got it right
                return true;
            } else {
                this.showNotCorrect();
                return false;
            } 
        } catch(ComplexCalcException ex){ //control
            ErrorView.display(this.getClass().getName(), ex.getMessage());
            return false;
        }
    }
    
    private void waitForEnter() {
        boolean isValidEnter = false;
        String input = null;
        try{
            while (!isValidEnter){
                input = this.keyboard.readLine();
                if(input.length() >= 0){ //Name validation
                    isValidEnter = true;
                }
                else{
                 this.console.println("Please press <ENTER>.");
                }
                break;
            }
        } catch(Exception ex){
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + ex.getMessage());
        }
    }
        
    private void showCorrect() {

        String display =
                  "==================================================" +
                "\n               WHERE IS MY BONE?                  " +
                "\n               Is it in the Box?                  " +
                "\n==================================================" +
                "\n                                                  " +
                "\n                 -= CORRECT!!! =-                 " +
                "\n                                                  " +
                "\n==================================================" +
                "\n           Press <ENTER> to continue...           " +
                "\n==================================================" ; 

        this.console.println(display);
        this.waitForEnter();
    }
        
    private void showNotCorrect (){
        String display =
                "\n        -= INCORRECT - PLEASE TRY AGAIN! =-       " ; 
        
        this.console.println(display);
    }
}
