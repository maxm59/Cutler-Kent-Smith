package byui.cit260.whereismybone.view;

import byui.cit260.whereismybone.control.ComplexCalculationsControl;
import java.util.Scanner;
/**
 *
 * @author Maxine Cutler
 * 
 * This view class contains the view for
 * the square area calculation of the backyard.
 * 
 */
public class SqYardView extends View{
    
    private int width;
    private int length;
    private double calcResult;

    public SqYardView(){
        
        //this.displayMenu();
        
        super(
                  "***************************************************" +
                "\n*                                                 *" +
                "\n*     This is my backyard. My bone has to be      *" +
                "\n*     here, buried in some hole. Can you help     *" +
                "\n*     find it? Lets figure out the square area    *" +
                "\n*     of my backyard. To reveal the secret spot.  *" +
                "\n*                                                 *" +
                "\n*     Please enter a number for the width:        *" +
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
        this.width = iValue;
        
        //Get Length
        promptForLength();
        getLength();
        
        //Run calculation
        ComplexCalculationsControl ccc = new ComplexCalculationsControl();
        this.calcResult = ccc.calcSqYard(this.width, this.length);
        
        //Display results - Temporary... 
        showResult();
        
        //TODO: Check for correct answer. If answer correct, show displayCorrect
        //      else show displayIncorrect.
                
        return true;  
    
    }
    
    public void getLength()
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
               this.length = iValue;
           }
            break;
        }   
          
    }

    private void promptForLength() {

        String prompt =
                  "***************************************************" +
                "\n*                                                 *" +
                "\n*     This is my backyard. My bone has to be      *" +
                "\n*     here, buried in some hole. Can you help     *" +
                "\n*     find it? Lets figure out the square area    *" +
                "\n*     of my backyard. To reveal the secret spot.  *" +
                "\n*                                                 *" +
                "\n*     Width: " + Double.toString(this.width)         +
                "\n*                                                 *" +
                "\n*     Please enter a number for the Lenght:       *" +
                "\n                                                  *" +         
                "\n*==================================================" ; 

        System.out.println(prompt);
    }
    
        private void showResult() {

        String prompt =
                  "***************************************************" +
                "\n*                                                 *" +
                "\n*     This is my backyard. My bone has to be      *" +
                "\n*     here, buried in some hole. Can you help     *" +
                "\n*     find it? Lets figure out the square area    *" +
                "\n*     of my backyard. To reveal the secret spot.  *" +
                "\n*                                                 *" +
                "\n*     Width: " + this.width         +
                "\n*     Length: " + this.length       +
                "\n*                                                 *" +
                "\n*     Result: " + Double.toString(this.calcResult)   +
                "\n                                                  *" +         
                "\n*==================================================" ; 

        System.out.println(prompt);
    }
}


