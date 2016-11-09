package byui.cit260.whereismybone.view;

import java.util.Scanner;
/**
 *
 * @author Maxine Cutler
 * 
 * This view class contains the view for
 * the square area calculation of the backyard.
 * 
 */
        
public class SqYardView {
    
    private String menuOptions = "";
    
    public SqYardView(){
        
        //this.displayMenu();
        
        this.menuOptions =
                  "==================================================" +
                "\n             Is my bone here?                     " +
                "\n           COMPLEX CALCULATION TEST               " +
                "\n" +
                "\n                                                  " +
                "\n" +
                "\n                                                  " +
                "\n==================================================" +
                "\n" +
                "\n==================================================" ;           
        
    }
    
    private void displayMenu() {
        
        menuOptions = getMenuOptions();
        
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
                    menu = "X";
                    exitMenu = true;
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
            case "W": 
                this.displayWidthOfTheYard();
                break;
            case "L":  
                this.displayLengthOfTheYard();
                break;
            default:
                System.out.println("\n***Invalid Selection*** Try again");
                break;
             
        }
        return false;  
    
    }
    public void displayComplexCalculationView() {
       
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
    
    public void displayWidthOfTheYard(){
        System.out.println("Debug: Display Cubic Inches View");
    }
    public void displayLengthOfTheYard(){
        System.out.println("Debug: Display Square Yard View");
    }
    
    
    private void displaySqYardView() {
        
        ComplexCalculationView complexCalculationView = new ComplexCalculationView();
        complexCalculationView.displayComplexCalculationView();
    
    }
}


