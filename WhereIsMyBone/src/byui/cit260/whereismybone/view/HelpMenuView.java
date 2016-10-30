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
                "\n         C =   Clues.                             " +
                "\n         B =   Bad Guys.                          " +
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
                char keyEntered = input.toUpperCase().charAt(0);
                
                if(keyEntered == 'X'){
                    //User wants to exit
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
        
        //Debugging 
        System.out.println("DoAction Switch case on: " + choice);
        
        switch (choice) {
            case "O": //Display Game Objective
                this.displayObjectGameMenu();
                break;
            case "H": //Display How TO Play Details
                this.displayHowToMenu();
                break;
            case "M": //Display info on how to move
                this.displayHowToMove();
                break;
            case "C": //display Clue info
                this.displayClues();
                break;                                               
            case "V": //display Villan info
                this.displayVillans();
                break;                                               
            default:
                System.out.println("\n***Invalid Selection*** Try again");
                break;
             
        }
        return false;  
    
    }
    private void displayObjectGameMenu(){
        System.out.println("Display Game Objective");
    }
    
    private void displayHowToMenu(){
        System.out.println("Display How TO Play Details");
    }
    
    private void displayHowToMove(){
        System.out.println("Display info on how to move");
    }
    
    private void displayClues(){
        System.out.println("Display Clue info");
    }
    private void displayVillans(){
        System.out.println("Display Villan info");
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