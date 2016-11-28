package byui.cit260.whereismybone.view;

import byui.cit260.whereismybone.control.ComplexCalculationsControl;
import byui.cit260.whereismybone.exception.ComplexCalcException;
import java.util.Scanner;
/**
 *
 * @author Maxi Cutler
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
            
            //System.out.println("DEBUG - User entered: " + value);
            
            //Did the user guess the right answer? 100,000,000
            boolean result = ccc.validateWatts(value, 400000, 250);
            //System.out.println("DEBUG - Result was: " + result);
            
            
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

        Scanner keyboard = new Scanner(System.in);

        while (!isValidEnter){
            String input = keyboard.nextLine();
            
            //Name validation
            if(input.length() >= 0)
            {
                isValidEnter = true;
            }
            else{
             System.out.println("Please press <ENTER>.");
            }
        }
    }
    
    //Commented out - changing question and answer to meet team assignments for L11.
    
//    public boolean doAction(String value){
//        
//        ComplexCalculationsControl ccc = new ComplexCalculationsControl();
//        
//        
//        //double dValue = Double.parseDouble(value);
//        int iValue = Integer.parseInt(value);
//        
//        
//        if(iValue <= 0){
//            System.out.println("\nInvalid value: "
//                    + "  The value must be greater than 0.");
//            return false;
//        }
//         
//        //Set Width
//        this.volts = iValue;
//        
//        //Get Length
//        promptForAmps();
//        getAmps();
//        
//        //Run calculation
//        this.calcResult = ccc.calcWatts(this.volts, this.amps);
//        
//        //Display results - Temporary... 
//        showResult();
//        
//        //TODO: Check for correct answer. If answer correct, show displayCorrect
//        //      else show displayIncorrect.
//                
//        return true;  
//    
//    }
    
//    public void getAmps()
//    {
//       Scanner keyboard = new Scanner(System.in);
//        
//        boolean exitMenu = false;
//        String value = "";
//        //Double dValue;
//        Integer iValue;
//        
//        while (!exitMenu){
//                       
//            value = keyboard.nextLine();
//            value = value.trim();
//            
//            //dValue = Double.parseDouble(value);  
//            iValue = Integer.parseInt(value);
//                    
//           if(iValue <= 0){
//                System.out.println("\nInvalid value: "
//                    + "  The value must be greater than 0.");
//                continue;
//            }
//           else
//           {
//               this.amps = iValue;
//           }
//            break;
//        }   
//          
//    }

//    private void promptForAmps() {
//
//        String prompt =
//                  "==================================================" +
//                "\n               WHERE IS MY BONE?                  " +
//                "\n            Beware! Down Power Lines!             " +
//                "\n==================================================" +
//                "\n             .-.               .-.                " +
//                "\n            (   `-._________.-'   )               " +
//                "\n             >=     _______     =<                " +
//                "\n            (   ,-'`       `'-,   )               " +
//                "\n             `-'               `-'                " +
//                "\n                                                  " +
//                "\n     Thank you, but I don't see the wires that    " +
//                "\n     are sparking. I don't want to step on a hot  " +
//                "\n     wire. Help me!!                              " +
//                "\n                                                  " +
//                "\n     Volts: " + this.volts         +
//                "\n                                                  " +
//                "\n     Please enter a number for the Amps:          " +
//                "\n                                                  " +         
//                "\n==================================================" ; 
//
//        System.out.println(prompt);
//    }
//    
//        private void showResult() {
//
//        String prompt =
//                  "==================================================" +
//                "\n               WHERE IS MY BONE?                  " +
//                "\n            Beware! Down Power Lines!             " +
//                "\n==================================================" +
//                "\n             .-.               .-.                " +
//                "\n            (   `-._________.-'   )               " +
//                "\n             >=     _______     =<                " +
//                "\n            (   ,-'`       `'-,   )               " +
//                "\n             `-'               `-'                " +
//                "\n                                                  " +
//                "\n     Ah, I can see the wires that are sparking.   " +
//                "\n     Thank you for your help. Oh, Oh, there is    " +
//                "\n     cat DeVil laughing at me.                    " +
//                "\n                                                  " +
//                "\n     Volts: " + this.volts                          +
//                "\n     Amps: " + this.amps                            +
//                "\n                                                  " +
//                "\n     Result: " + this.calcResult   +
//                "\n     I gotta catch that cat!                      " +         
//                "\n==================================================" ; 
//
//        System.out.println(prompt);
//    }
        
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

        System.out.println(display);
        this.waitForEnter();
    }
        
    private void showNotCorrect (){

        String display =
                  
                "\n        -= INCORRECT - PLEASE TRY AGAIN! =-       " ; 

        System.out.println(display);
    }
}
