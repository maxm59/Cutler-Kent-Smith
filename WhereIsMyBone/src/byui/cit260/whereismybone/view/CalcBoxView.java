package byui.cit260.whereismybone.view;

import byui.cit260.whereismybone.control.ComplexCalculationsControl;
import byui.cit260.whereismybone.exception.ComplexCalcException;
/**
 *
 * @author Maxi Cutler
 */
public class CalcBoxView extends View {

    private int width;
    private int length;
    private int height;
    private int calcResult;

    public CalcBoxView(){
        
        //this.displayMenu();
        
        super(
                  "==================================================" +
                "\n               WHERE IS MY BONE?                  " +
                "\n               Is it in the Box?                  " +
                "\n==================================================" +
                "\n             .-.               .-.                " +
                "\n            (   `-._________.-'   )               " +
                "\n             >=     _______     =<                " +
                "\n            (   ,-'`       `'-,   )               " +
                "\n             `-'               `-'                " +
                "\n            We found a box that might contain     " +
                "\n            the bone or Cat DeVil, herself.       " +
                "\n            The box is approx. 6 inches wide      " +
                "\n            9 inches high and 22 in length.       " +
                "\n                                                  " +
                "\n            Please enter the square area of       " +
                "\n            the box:                              " +
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
            
            //Did the user guess the right answer? 100
            boolean result = ccc.validateCubicInches(value, 6, 22, 9);
            
            if(result)
            {
                //they got it right
                this.showCorrect();
                return true;
            }
            else
            {
                this.showNotCorrect();
                return false;
            }
            
        }
        catch(ComplexCalcException ex){
            ErrorView.display(this.getClass().getName(), ex.getMessage());
            return false;
        }
    }
    
    private void waitForEnter()
    {
        boolean isValidEnter = false;
        String input = null;
        
        try{
            while (!isValidEnter){
                input = this.keyboard.readLine();

                //Name validation
                if(input.length() >= 0)
                {
                    isValidEnter = true;
                }
                else{
                 this.console.println("Please press <ENTER>.");
                }
                break;
            }
        }
        catch(Exception ex){
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
                "\n                 -= CORRECT!!! =-       " +
                "\n                                                  " +
                "\n==================================================" +
                "\n   Press <ENTER> to continue...                   " +
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
