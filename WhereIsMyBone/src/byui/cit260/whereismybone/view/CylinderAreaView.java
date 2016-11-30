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
        
        super(
                  "==================================================" +
                "\n               WHERE IS MY BONE?                  " +
                "\n               I found this pipe                  " +
                "\n==================================================" +
                "\n             .-.               .-.                " +
                "\n            (   `-._________.-'   )               " +
                "\n             >=     _______     =<                " +
                "\n            (   ,-'`       `'-,   )               " +
                "\n             `-'               `-'                " +
                "\n                                                  " +  
                "\n      I saw this pipe. I wonder if my bone        " +
                "\n      is in here? Can you help me find it?        " +
                "\n      First, lets see if I fit in it.             " +
                "\n                                                  " +
                "\n   Please enter a number for height in inches:    " +
                "\n                                                  " +         
                "\n" );           
        
    }

    @Override
    public boolean doAction(String value){

        int iValue = Integer.parseInt(value);
        
        if(iValue <= 0){
            System.out.println("\nInvalid value: "
                    + "  The value must be greater than 0.");
            return false;
        }  
        this.height = iValue;

        promptForDiameter();
        getDiameter();
        showResult();
        
        ComplexCalculationsControl ccc = new ComplexCalculationsControl();
        this.calcResult = ccc.calcCylinderArea(this.height, this.diameter);

        return true;  
    }
    
    public void getHeight() {
               
        boolean exitMenu = false;
        String value = null;

        Integer iValue;
        try{
            while (!exitMenu){

                value = this.keyboard.readLine();
                value = value.trim();

                //dValue = Double.parseDouble(value);  
                iValue = Integer.parseInt(value);

                if(iValue <= 0){
                    System.out.println("\nInvalid value: "
                        + "  The value must be greater than 0.");
                    continue;
                }
                else {
                   this.diameter = iValue;
               }
                break;
            }   
        }
        catch(Exception ex){
            System.out.println("Error reading input: " + ex.getMessage());
        }
    }

    private void promptForHeight() {

        String prompt =
                  "==================================================" +
                "\n               WHERE IS MY BONE?                  " +
                "\n               I found this pipe                  " +
                "\n==================================================" +
                "\n             .-.               .-.                " +
                "\n            (   `-._________.-'   )               " +
                "\n             >=     _______     =<                " +
                "\n            (   ,-'`       `'-,   )               " +
                "\n             `-'               `-'                " +
                "\n                                                  " +  
                "\n      Well, the height looks good, but I need     " +
                "\n      the diameter. Does my body fit?             " +
                "\n                                                  " +
                "\n                                                  " +
                "\n      Height: " + Double.toString(this.height) + "inches. "+
                "\n                                                  " +
                "\n         Please enter a number for the            " +
                "\n           Diameter in inches:                     " +
                "\n                                                  " +         
                "\n" ; 

        System.out.println(prompt);
    }
    
    public void getDiameter() {
        
        boolean exitMenu = false;
        String value = null;

        Integer iValue;
        try{
            
            while (!exitMenu){
                       
                value = this.keyboard.readLine();
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
        catch(Exception ex){
            System.out.println("Error reading input: " + ex.getMessage());
        }
          
    }

    private void promptForDiameter() {

        String prompt =
                  "==================================================" +
                "\n               WHERE IS MY BONE?                  " +
                "\n               I found this pipe                  " +
                "\n==================================================" +
                "\n             .-.               .-.                " +
                "\n            (   `-._________.-'   )               " +
                "\n             >=     _______     =<                " +
                "\n            (   ,-'`       `'-,   )               " +
                "\n             `-'               `-'                " +
                "\n                                                  " +  
                "\n      Well, the height looks good, but I need     " +
                "\n      the diameter. Does my body fit?             " +
                "\n                                                  " +
                "\n      Height: " + this.height                       +
                "\n      Diameter: " + Double.toString(this.diameter)+ "inches  " +
                "\n                                                  " +
                "\n        Please enter a number for the             " +
                "\n             Diameter in inches:                  " +
                "\n" +
                "\n" ; 

        System.out.println(prompt);
    }
    
    private void showResult() {

        String prompt =
                  "==================================================" +
                "\n               WHERE IS MY BONE?                  " +
                "\n               I found this pipe                  " +
                "\n==================================================" +
                "\n             .-.               .-.                " +
                "\n            (   `-._________.-'   )               " +
                "\n             >=     _______     =<                " +
                "\n            (   ,-'`       `'-,   )               " +
                "\n             `-'               `-'                " +
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
                "\n==================================================" + 
                "\n==================================================" ; 

        System.out.println(prompt);
    }
}
