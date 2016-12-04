package byui.cit260.whereismybone.view;

import byui.cit260.whereismybone.control.ComplexCalculationsControl;
import byui.cit260.whereismybone.exception.ComplexCalcException;
/**
 *
 * @author Maxi Cutler
 * 
 */
public class WattsView extends View {

    private int volts;
    private int amps;
    private int calcResult;

    public WattsView(){
        
        //this.displayMenu();
        
        super(
                  "==================================================" +
                "\n               WHERE IS MY BONE?                  " +
                "\n            Beware! Down Power Lines!             " +
                "\n==================================================" +
                "\n     We need to walk very carefully around here!  " +
                "\n     These electrical wires are dangerous.        " +
                "\n     Help me to know which wires are hot.         " +
                "\n                                                  " +
                "\n     Typlical High Tension Power lines have 400kV " +
                "\n     and 250 Amps running through them. Help me   " +
                "\n     calculate the Watts running through the line." +
                "\n                                                  " +
                "\n     Please enter your answer in Watts:           " +
                "\n                                                  " +         
                "\n==================================================" );           
        
    }

    @Override
    public boolean doAction(String value){
        
        ComplexCalculationsControl ccc = new ComplexCalculationsControl();
        try{          
            
            //Did the user guess the right answer? 100,000,000
            boolean result = ccc.validateWatts(value, 400000, 250);            
            
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
                "\n            Beware! Down Power Lines!             " +
                "\n==================================================" +
                "\n                                                  " +
                "\n                 -= CORRECT!!! =-       " +
                "\n                                                  " +
                "\n     Ah, I can see the wires that are sparking.   " +
                "\n     Thank you for your help. Oh, Oh, there is    " +
                "\n     cat DeVil laughing at me.                    " +
                "\n                                                  " +
                "\n     Volts: 100,000"                         +
                "\n     Amps: 250"                             +
                "\n                                                  " +
                "\n     Watts: 100,000,000 Watts" +
                "\n     Thats a lot of juice! Let's catch that cat!  " +         
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
