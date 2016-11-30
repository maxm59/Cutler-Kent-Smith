/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.view;

import byui.cit260.whereismybone.control.ComplexCalculationsControl;
import java.util.Scanner;

/**
 *
 * @author Brian Kent originator
 * 
 * @auther Maxi: Super class this view and
 * coded all equation and left some for Brian to do.
 * 11/26/16 checked equation still not working. I
 * finished the equation and ran test.
 * 
 */
public class CubicInchesView extends View {

    private int width;
    private int length;
    private int height;
    private double calcResult;
             
    public CubicInchesView() {

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
                "\n                                                  " + 
                "\n         Let's see if the bone will fit in        " +
                "\n         this box that we have found or if        " +
                "\n         there is evidence that Cat DeVil         " +
                "\n         was here. Please help by entering        " +
                "\n         width in inches:                         " +
                "\n                                                  " +
                "\n             X =   Exit This View                 " + 
                "\n                                                  " +
                "\n==================================================" +
                "\n== Game Creators - Rick S. | Maxi C. | Brian K. = " +
                "\n==================================================") ;        
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
        
        //Get Height
        promptForHeight();
        getHeight();
        
        //Run calculation
        ComplexCalculationsControl ccc = new ComplexCalculationsControl();
        this.calcResult = ccc.calcCubicInches(this.width, this.length, this.height);
        
        //Display results - Temporary... 
        showResult();
        
        return true;  
    
    }
    
    private void promptForWidth() {

        String prompt =
                  "==================================================" +
                "\n               WHERE IS MY BONE?                  " +
                "\n               Is it in the Box?                  " +
                "\n==================================================" +
                "\n             .-.               .-.                " +
                "\n            (   `-._________.-'   )               " +
                "\n             >=     _______     =<                " +
                "\n            (   ,-'`       `'-,   )               " +
                "\n             `-'               `-'                " +
                "\n                                                  " +          
                "\n      My keen senses says I might be able to      " +
                "\n      to see whats in the box, but I do need      " +
                "\n      the length of the box.                      " +
                "\n                                                  " +
                "\n      Width: " + Double.toString(this.width)        +
                "\n                                                  " +
                "\n      Please enter a number for the Length:       " +
                "\n                                                  " +         
                "\n==================================================" ;

        System.out.println(prompt);
    }
    
    public void getLength(){
        
        boolean exitMenu = false;
        String value;

        Integer iValue;
        try{
            while (!exitMenu){
                       
                value = keyboard.readLine();
                value = value.trim();

                //dValue = Double.parseDouble(value);  
                iValue = Integer.parseInt(value);

               if(iValue <= 0){
                    System.out.println("\nInvalid value: "
                        + "  The value must be greater than 0.");
                    continue;
                }
               else{
                   this.length = iValue;
               }
               break;
            } 
        }
        catch(Exception ex){
            System.out.println("Error reading input: " + ex.getMessage());
        }
          
          
    }
    
    private void promptForLength() {

        String prompt =
                  "==================================================" +
                "\n               WHERE IS MY BONE?                  " +
                "\n               Is it in the box?                  " +
                "\n==================================================" +
                "\n             .-.               .-.                " +
                "\n            (   `-._________.-'   )               " +
                "\n             >=     _______     =<                " +
                "\n            (   ,-'`       `'-,   )               " +
                "\n             `-'               `-'                " +   
                "\n     Oh, oh, I can't quite figure out if the      " +
                "\n     bone is in it. And I can smell Cat DeVil     " +
                "\n     was here. Do you think you can give me the   " +
                "\n     height of the box?                           " +
                "\n                                                  " +
                "\n     Width: " + this.width         +
                "\n     Length: " + this.length       +
                "\n                                                  " +
                "\n     Please enter a number for the Length:        " +
                "\n                                                  " +
                "\n     Result: " + Double.toString(this.calcResult)   +
                "\n                                                  " +
                "\n==================================================" ;    

        System.out.println(prompt);
    }
    
    public void getHeight(){
        
        boolean exitMenu = false;
        String value;

        Integer iValue;
        try{
            while (!exitMenu){
                       
                value = keyboard.readLine();
                value = value.trim();

                //dValue = Double.parseDouble(value);  
                iValue = Integer.parseInt(value);

               if(iValue <= 0){
                    System.out.println("\nInvalid value: "
                        + "  The value must be greater than 0.");
                    continue;
                }
               else{
                   this.height = iValue;
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
                "\n               Is it in the box?                  " +
                "\n==================================================" +
                "\n             .-.               .-.                " +
                "\n            (   `-._________.-'   )               " +
                "\n             >=     _______     =<                " +
                "\n            (   ,-'`       `'-,   )               " +
                "\n             `-'               `-'                " + 
                "\n     Oh, oh, I can't quite figure out if the      " +
                "\n     bone is in it. And I can smell Cat DeVil     " +
                "\n     was here. Do you think you can give me the   " +
                "\n     height of the box?                           " +
                "\n                                                  " +
                "\n             Width: " + this.width                  +
                "\n             Length: " + this.length                +
                "\n             Height: " + this.height                +
                "\n                                                  " +  
                "\n     Please enter a number for the Height:        " +
                "\n                                                  " +         
                "\n==================================================" ;

        System.out.println(prompt);
    }

    private void showResult() {
 
        String prompt =
                  "==================================================" +
                "\n               WHERE IS MY BONE?                  " +
                "\n               Is it in the box?                  " +
                "\n==================================================" +
                "\n             .-.               .-.                " +
                "\n            (   `-._________.-'   )               " +
                "\n             >=     _______     =<                " +
                "\n            (   ,-'`       `'-,   )               " +
                "\n             `-'               `-'                " +
                "\n                                                  " +   
                "\n     Oh, oh, I can't quite figure out if the      " +
                "\n     bone is in it. And I can smell Cat DeVil     " +
                "\n     was here. Do you think you can give me the   " +
                "\n     height of the box?                           " +
                "\n                                                  " +
                "\n             Width: " + this.width                  +
                "\n             Length: " + this.length                +
                "\n             Height: " + this.height                +
                "\n                                                  " +                
                "\n     Result: " + Double.toString(this.calcResult)   +
                "\n                                                  " +
                "\n                                                  " +         
                "\n==================================================" ;    

        System.out.println(prompt);
    }

}
