/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.view;
import java.util.Scanner;
/**
 *
 * @author Maxi Cutler
 */
public class MainMenuView {
    
    private String menuOptions = "";
    
    public MainMenuView() {

       this.menuOptions = 
                  "==================================================" +
                "\n               WHERE IS MY BONE?                  " +
                "\n                   MAIN MENU                      " +
                "\n==================================================" +
                "\n     .-.               .-.    " +
                "\n    (   `-._________.-'   )   " +
                "\n     >=     _______     =<    " +
                "\n    (   ,-'`       `'-,   )   " +
                "\n     `-'               `-'    " +
                "\n" + 
                "\n     N =   New Game          " +
                "\n     L =   Load a Saved Game " +
                "\n     S =   Save Game         " +
                "\n     H =   Get Help          " +
                "\n     X =   Exit Game         " +
                "\n" +
                "\n     C =   Complex Calculation View Test" +
                "\n" +
                "\n" +
                "\n  To begin, please enter your choice:" +
                "\n" +
                "\n==================================================" +
                "\n= Game Creators - Rick S. | Maxine C. | Brian K. = " +
                "\n==================================================" ;        
    }
    
    public void displayBanner()
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
            case "N": //Create and start a new game
                this.startNewGame();
                break;
            case "L":  //Load an existing game
                this.loadExistingGame();
                break;
            case "S": //save the current game
                this.saveGame();
                break;
             case "H": //display the help menu
                this.displayHelpMenu();
                break; 
             case "C": //Temporary display of Complex Calculation for testing
                 this.displayComplexCalculationView();
                 break;
            default:
                System.out.println("\n***Invalid Selection*** Try again");
                break;
             
        }
        return false;  
    
    }
    private void startNewGame(){
        System.out.println("Start new game menu");
    }
    
    private void loadExistingGame(){
        System.out.println("Load Existing Game");
    }
    
    private void saveGame(){
        System.out.println("Save Game");
    }
    
    private void displayHelpMenu(){
        System.out.println("Display Help Menu");
        //Display the MainMenuView 
        //Create MainMenuView object
        HelpMenuView helpMenuView = new HelpMenuView();
        //Display the main menu view
        helpMenuView.displayHelpMenuView();
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

    private void displayComplexCalculationView() {
        
        ComplexCalculationView complexCalculationView = new ComplexCalculationView();
        complexCalculationView.displayComplexCalculationView();
    
    }
}

