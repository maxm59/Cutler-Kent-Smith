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

       this.menuOptions = "==================================================" +
                "\n=============  WHERE IS MY BONE? =================" +
                "\n==================================================" +
                "\n================== MAIN MENU =====================" +
                "\n==================================================" +
                "\n     .-.               .-.    " +
                "\n    (   `-._________.-'   )   " +
                "\n     >=     _______     =<    " +
                "\n    (   ,-'`       `'-,   )   " +
                "\n     `-'               `-'    " +
                "\n" +
                "\n" +                
                "\n                             " +
                "\n     N =   New Game          " +
                "\n     L =   Load a Saved Game " +
                "\n     S =   Save Game         " +
                "\n     H =   Help              " +
                "\n     X =   Exit              " +
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
                exitMenu = doAction(input);
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
                //this.startNewGame();
                break;
            case "S": //save the current game
                //this.startNewGame();
                break;
             case "H": //display the help menu
                //this.startNewGame();
                break;                                               
            case "X": //quit the game
                return true;
            default:
                System.out.println("invalid selection");
             
        }
        return false;  
    
    }
    private void startNewGame(){
        System.out.println("start new game menu");
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
}
