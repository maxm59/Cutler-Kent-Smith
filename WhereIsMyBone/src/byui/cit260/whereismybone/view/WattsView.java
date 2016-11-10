package byui.cit260.whereismybone.view;

import byui.cit260.whereismybone.control.ComplexCalculationsControl;
import java.util.Scanner;
/**
 *
 * @author Maxine Cutler
 */
public class WattsView extends View {

    private int volts;
    private int amps;
    private double calcResult;

    public WattsView(){
        
        //this.displayMenu();
        
        super(
                  "***************************************************" +
                "\n*                                                 *" +
                "\n*     We need to walk very carefully around here! *" +
                "\n*     These electrical wires are dangerous.       *" +
                "\n*     Help me to know which wires are hot.        *" +
                "\n*                                                 *" +
                "\n*     Please enter a number for the volts:        *" +
                "\n                                                   " +         
                "\n*==================================================" );           
        
    }

    @Override
    public boolean doAction(String value){
        
        //double dValue = Double.parseDouble(value);
        int iValue = Integer.parseInt(value);
        
        
        if(iValue <= 0){
            System.out.println("\nInvalid value: "
                    + "  The value must be greater than 0.");
            return false;
        }
         
        //Set Width
        this.volts = iValue;
        
        //Get Length
        promptForAmps();
        getAmps();
        
        //Run calculation
        ComplexCalculationsControl ccc = new ComplexCalculationsControl();
        this.calcResult = ccc.calcSqYard(this.volts, this.amps);
        
        //Display results - Temporary... 
        showResult();
        
        //TODO: Check for correct answer. If answer correct, show displayCorrect
        //      else show displayIncorrect.
                
        return true;  
    
    }
    
    public void getAmps()
    {
       Scanner keyboard = new Scanner(System.in);
        
        boolean exitMenu = false;
        String value = "";
        //Double dValue;
        Integer iValue;
        
        while (!exitMenu){
                       
            value = keyboard.nextLine();
            value = value.trim();
            
            //dValue = Double.parseDouble(value);  
            iValue = Integer.parseInt(value);
                    
           if(iValue <= 0){
                System.out.println("\nInvalid value: "
                    + "  The value must be greater than 0.");
                continue;
            }
           else
           {
               this.amps = iValue;
           }
            break;
        }   
          
    }

    private void promptForAmps() {

        String prompt =
                  "***************************************************" +
                "\n*                                                 *" +
                "\n*     We need to walk very carefully around here! *" +
                "\n*     These electrical wires are dangerous.       *" +
                "\n*     Help me to know which wires are hot.        *" +
                "\n*                                                 *" +
                "\n*     Volts: " + Double.toString(this.volts)         +
                "\n*                                                 *" +
                "\n*     Please enter a number for the Amps:         *" +
                "\n                                                  *" +         
                "\n*==================================================" ; 

        System.out.println(prompt);
    }
    
        private void showResult() {

        String prompt =
                  "***************************************************" +
                "\n*                                                 *" +
                "\n*     Ah, I see now. Thank you for your help.     *" +
                "\n*     Now, just walk very carefully. I see        *" +
                "\n*     cat DeVille laughing at me.                 *" +
                "\n*                                                 *" +
                "\n*     Volts: " + this.volts                          +
                "\n*     Amps: " + this.amps                            +
                "\n*                                                 *" +
                "\n*     Result: " + Double.toString(this.calcResult)   +
                "\n                                                  *" +         
                "\n*==================================================" ; 

        System.out.println(prompt);
    }
}