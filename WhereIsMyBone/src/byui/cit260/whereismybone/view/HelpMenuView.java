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
public class HelpMenuView {

    private String menuOptions = "";
    
    public HelpMenuView() {

       this.menuOptions = "==================================================" +
                "\n               WHERE IS MY BONE?                  " +
                "\n                   Help Menu                      " +
                "\n==================================================" +
                "\n             .-.               .-.                " +
                "\n            (   `-._________.-'   )               " +
                "\n             >=     _______     =<                " +
                "\n            (   ,-'`       `'-,   )               " +
                "\n             `-'               `-'                " +
                "\n" + 
                "\n         O =   Obeject of the game.               " +
                "\n         H =   How to play the game.              " +
                "\n         M =   How to move around.                " +
                "\n         C =   Your back pack Clues.              " +
                "\n         B =   Bad Guys in the game.              " +
                "\n         X =   Exit Help Menu.                    " +
                "\n" +
                "\n         To begin, please enter your choice:" +
                "\n" +
                "\n==================================================" +
                "\n= Game Creators - Rick S. | Maxine C. | Brian K. = " +
                "\n==================================================" ;        
    }
    
    public void displayBanner()
    {
        
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
                this.loadExistingGame();
                break;
            case "S": //save the current game
                this.saveGame();
                break;
             case "H": //display the help menu
                this.displayHelpMenu();
                break;                                               
            case "X": //quit the game
                return true;
            default:
                System.out.println("\n***Invalid Selection*** Try again");
             
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

    public void displayHelpMenuView() {
       
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