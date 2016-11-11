/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.view;

import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class CubicInchesView {
    private String menuOptions = "";
    
    public CubicInchesView() {

       this.menuOptions = 
                  "==================================================" +
                "\n               WHERE IS MY BONE?                  " +
                "\n               Is it in the Box?                  " +
                "\n==================================================" +
                "\n     .-.               .-.    " +
                "\n    (   `-._________.-'   )   " +
                "\n     >=     _______     =<    " +
                "\n    (   ,-'`       `'-,   )   " +
                "\n     `-'               `-'    " +
                "\n" + 
                "\n     Let's see if the bone   " +
                "\n     will fit in this box    " +
                "\n     that we have found      " +
                "\n                             " +
                "\n     Please enter the size   " +
                "\n     of the box.             " +
                "\n" +
                "\n     X =   Exit This View    " + 
                "\n" +
                "\n==================================================" +
                "\n= Game Creators - Rick S. | Maxine C. | Brian K. = " +
                "\n==================================================" ;        
    }
    
    public void display()
    {
        
        menuOptions = getMenuOptions();

    }

    private void displayBannerWarning()
    {
        String menuBanner = "==================================================" +
                "\n=============  WHERE IS MY BONE? =================" +
                "\n==================================================" +
                "\n     .-.               .-.    " +
                "\n    (   `-._________.-'   )   " +
                "\n     >=     _______     =<    " +
                "\n    (   ,-'`       `'-,   )   " +
                "\n     `-'               `-'    " +
                "\n" +
                "\n" +
                "\n  WARNING - You will lose all unsaved progress. +" +
                "    Proceed? (Y)es or (N)" +
                "\n" +
                "\n" +
                "\n  Please enter your choice:" +
                "\n" +
                "\n==================================================" +
                "\n" +
                "\n==================================================" ;
        
        System.out.println(menuBanner);
    }
    
    private String getMenuOptions() {
        
        boolean exitMenu = false;
        String menu = "";
        
        Scanner keyboard = new Scanner(System.in);
        
        while (!exitMenu){
            System.out.println(menuOptions);
            String input = keyboard.nextLine();

            if(input.length()  >= 1)
            {
                
                char keyEntered = input.toUpperCase().charAt(0);
                
                if(keyEntered == 'X'){
                    //User wants to exit
                    System.exit(0);
                }
                else{
                    
                    exitMenu = doAction(input);
                }
                
            }
            else{
             System.out.println("Your choice must be at least 1 character.");
            }
        }   
            return menu;               
        }
    
    private boolean doAction(String choice){
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "W": //Show width of box
                this.displayWidthOfBox();
                break;
            case "L":  //Show length of box
                this.displayLengthOfBox();
                break;
            case "H": //Show height of box
                this.displayHeightOfBox();
                break;
            default:
                System.out.println("\n***Invalid Selection*** Try again");
                break;
             
        }
        return false;  
    
    }
    private void displayWidthOfBox() {
        System.out.println("The Width of the box is");
    }
    
    private void displayLengthOfBox(){
        System.out.println("The Length of the box is");
    }
    
    private void displayHeightOfBox(){
        System.out.println("The Height of the box is");
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

    public void displayMainMenuView() {
       
        boolean done = false; //set the flag to not done
        do{
            //prompt for menu option
            String menuOption = this.getMenuOptions();
            
            if (menuOption.toUpperCase().equals("X"))//user wants to quit
                return; //exit the game
            
            //do the requested action and display the next view
            done = this.doAction(menuOption);
            
        }while (!done);  
    }

    public void displayCubicInchesView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


      
    
}
