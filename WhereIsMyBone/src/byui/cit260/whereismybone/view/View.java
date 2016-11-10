/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.view;

import java.util.Scanner;

/**
 *
 * @author Maxine Cutler
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    public View(){
    
    }
    
   public View(String message){
       this.displayMessage = message;
   }
   
   @Override
   public void display(){
       
        boolean done = false; //set the flag to not done
        do{
            //prompt for menu option
            String value = this.getInput();
            
            if ( value.toUpperCase().equals("X"))//user wants to quit
                return; //exit the view
            
            //do the requested action and display the next view
            done = this.doAction(value);
            
        }while (!done);  
       
       
   }
   
    @Override
    public String getInput() {
                
        Scanner keyboard = new Scanner(System.in);
        
        boolean exitMenu = false;
        String value = null;
        
        while (!exitMenu){
            
            System.out.println("\n"+this.displayMessage);
            
            value = keyboard.nextLine();
            value = value.trim();

            if(value.length()  < 1)
            {
                //blank value entered
                System.out.println("\n*** You must enter a value ***");
            }
                
             break;
            
        }   
            
        return value;               
    }
    
    
}