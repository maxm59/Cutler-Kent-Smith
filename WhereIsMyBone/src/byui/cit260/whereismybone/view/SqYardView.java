package byui.cit260.whereismybone.view;

import byui.cit260.whereismybone.control.ComplexCalculationsControl;
import java.util.Scanner;
/**
 *
 * @author Maxi Cutler
 * This view class contains the view for the square area 
 * calculation of the backyard.
 * 
 */
public class SqYardView extends View{
    
    private int width;
    private int length;
    private double calcResult;

    public SqYardView(){
        
        super(
                  "==================================================" +
                "\n               WHERE IS MY BONE?                  " +
                "\n              This is my backyard                 " +
                "\n==================================================" +
                "\n             .-.               .-.                " +
                "\n            (   `-._________.-'   )               " +
                "\n             >=     _______     =<                " +
                "\n            (   ,-'`       `'-,   )               " +
                "\n             `-'               `-'                " +
                "\n                                                  " +          
                "\n     My bone has to be here, buried in a hole.    " +
                "\n     Can you help me find it? Lets figure out     " +
                "\n     the square area of my backyard, to reveal    " +
                "\n     the secret spot.                             " +
                "\n                                                  " +
                "\n     Please enter a number for the width:         " +
                "\n                                                  " +         
                "\n==================================================") ;           
        
    }

    @Override
    public boolean doAction(String value){
        int iValue = Integer.parseInt(value);
        try{
            if(iValue <= 0){
                return false;
                }         
                this.width = iValue;
            
                ComplexCalculationsControl ccc = new ComplexCalculationsControl();
                this.calcResult = ccc.calcSqYard(this.width, this.length);
            
                promptForLength();
                getLength();        
                showResult();
        }
        catch(Exception e){
            ErrorView.display(this.getClass().getName(),
                    "The number must be greater than 0.");
        }
        return true;
    }
    
    public void getLength(){
   
        boolean exitMenu = false;   
        Integer iValue;
        String value = null;
        
        try{
            while (!exitMenu){
            value = keyboard.readLine();
            value = value.trim();
            //dValue = Double.parseDouble(value);  
                iValue = Integer.parseInt(value);

                if(iValue <= 0){
                    continue;
                    }
                    else 
                    {
                        this.length = iValue;
                    }
                break;
            } 
        }
        catch(Exception ex){
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + ex.getMessage());
        }
    }
        

    private void promptForLength() {

        String prompt =
                  "==================================================" +
                "\n               WHERE IS MY BONE?                  " +
                "\n              This is my backyard                 " +
                "\n==================================================" +
                "\n             .-.               .-.                " +
                "\n            (   `-._________.-'   )               " +
                "\n             >=     _______     =<                " +
                "\n            (   ,-'`       `'-,   )               " +
                "\n             `-'               `-'                " +
                "\n                                                  " +          
                "\n      I just sniffed out the width of the yard.   " +
                "\n      I don't find it. Can you help me find       " +
                "\n      the length of the yard?                     " +
                "\n                                                  " +
                "\n      Width: " + Double.toString(this.width)        +
                "\n                                                  " +
                "\n      Please enter a number for the Length:       " +
                "\n                                                  " +         
                "\n==================================================" ;

        this.console.println(prompt);
    }
    
        private void showResult() {

        String prompt =
                  "==================================================" +
                "\n               WHERE IS MY BONE?                  " +
                "\n              This is my backyard                 " +
                "\n==================================================" +
                "\n             .-.               .-.                " +
                "\n            (   `-._________.-'   )               " +
                "\n             >=     _______     =<                " +
                "\n            (   ,-'`       `'-,   )               " +
                "\n             `-'               `-'                " +
                "\n                                                  " +   
                "\n     I just finished walking and smelling the     " +
                "\n     entire backyard. I didn't know my yard was   " +
                "\n     that big. I don't see cat DeVil anywhere!    " +
                "\n     But, WAIT! what is that? There's my BONE!    " +
                "\n                                                  " +
                "\n     Width: " + this.width         +
                "\n     Length: " + this.length       +
                "\n                                                   " +
                "\n     Result: " + Double.toString(this.calcResult)    +
                "\n     Wow great Job!                                " +
                "\n                                                   " +         
                "\n===================================================" ;    

        this.console.println(prompt);
    }
}


