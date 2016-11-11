package byui.cit260.whereismybone.view;

import byui.cit260.whereismybone.control.ComplexCalculationsControl;
import java.util.Scanner;
/**
 *
 * @author Maxi Cutler
 */
public class CylinderAreaView extends View {

    private int height;
    private int diameter;
    private double calcResult;

    public CylinderAreaView(){
        
        //this.displayMenu();
        
        super(
                  "==================================================" +
                "\n               WHERE IS MY BONE?                  " +
                "\n               I found this pipe                  " +
                "\n==================================================" +
                "\n     .-.               .-.    " +
                "\n    (   `-._________.-'   )   " +
                "\n     >=     _______     =<    " +
                "\n    (   ,-'`       `'-,   )   " +
                "\n     `-'               `-'    " +
                "\n                                                  " +  
                "\n      I saw this pipe. I wonder if my bone is     " +
                "\n      in here?       Can you help me?             " +
                "\n      Lets see if I fit.                          " +
                "\n                                                  " +
                "\n      Please enter a number for the height:       " +
                "\n                                                  " +         
                "\n==================================================" );           
        
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
         
        //Set height
        this.height = iValue;
        
        //Get diameter
        promptForDiameter();
        getDiameter();
        
        //Run calculation
        ComplexCalculationsControl ccc = new ComplexCalculationsControl();
        this.calcResult = ccc.calcCylinderArea(this.height, this.diameter);
        
        //Display results - Temporary... 
        showResult();
        
        //TODO: Check for correct answer. If answer correct, show displayCorrect
        //      else show displayIncorrect.
                
        return true;  
    
    }
    
    public void getDiameter()
    {
       Scanner keyboard = new Scanner(System.in);
        
        boolean exitMenu = false;
        String value;

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
               this.diameter = iValue;
           }
            break;
        }   
          
    }

    private void promptForDiameter() {

        String prompt =
                  "==================================================" +
                "\n               WHERE IS MY BONE?                  " +
                "\n               I found this pipe                  " +
                "\n==================================================" +
                "\n     .-.               .-.    " +
                "\n    (   `-._________.-'   )   " +
                "\n     >=     _______     =<    " +
                "\n    (   ,-'`       `'-,   )   " +
                "\n     `-'               `-'    " +
                "\n                                                  " +  
                "\n      Well, the height looks good, but I need     " +
                "\n      the diameter. Does my body fit?             " +
                "\n                                                  " +
                "\n                                                  " +
                "\n      Height: " + Double.toString(this.height)      +
                "\n                                                  " +
                "\n      Please enter a number for the Diameter:     " +
                "\n                                                  " +         
                "\n==================================================" ; 

        System.out.println(prompt);
    }
    
        private void showResult() {

        String prompt =
                  "==================================================" +
                "\n               WHERE IS MY BONE?                  " +
                "\n               I found this pipe                  " +
                "\n==================================================" +
                "\n     .-.               .-.    " +
                "\n    (   `-._________.-'   )   " +
                "\n     >=     _______     =<    " +
                "\n    (   ,-'`       `'-,   )   " +
                "\n     `-'               `-'    " +
                "\n                                                  " +              
                "\n      I can fit and looked inside, ah no bone.    " +
                "\n      Thank you for your help. I wonder where     " +
                "\n      cat DeVille is now. Let's go.               " +
                "\n                                                  " +
                "\n                                                  " +
                "\n      Height: " + this.height                       +
                "\n      Diameter: " + this.diameter                   +
                "\n                                                  " +
                "\n      Result: " + Double.toString(this.calcResult)  +
                "\n      Great Job. Gotta keep on moving.            " +   
                "\n                                                  " +
                "\n==================================================" ; 

        System.out.println(prompt);
    }
}
