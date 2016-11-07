/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.view;

import byui.cit260.whereismybone.control.GameControl;
import byui.cit260.whereismybone.model.Player;
import java.util.Scanner;

/**
 *
 * @author Smith-Rick
 */
public class StartProgramView {
    
    //private String promptMessage;
    
    
    public StartProgramView(){
    
        //Our banner contains the banner plus username prompt/ 
        this.displayBannerAndPrompt();
        
    
    }

    
    private void displayBannerAndPrompt() {
        String welcomeBanner = "";
        welcomeBanner = 
                  "===================================================" +
                "\n=============  WHERE IS MY BONE? ==================" +
                "\n===================================================" +
                "\n     .-.               .-.                         " +
                "\n    (   `-._________.-'   )                        " +
                "\n     >=     _______     =<                         " +
                "\n    (   ,-'`       `'-,   )                        " +
                "\n     `-'               `-'                         " +
                "\n  This game is a Carmen Sandiego style game. You're" +
                "\n  enemy is the Cat DeVil Gang. Members of that gang" +
                "\n  have stolen your bone. Your job is to track down " +
                "\n  clues to identify which gang member has stolen   " +
                "\n  your bone. You only have 24 hours to collar the  " +
                "\n  criminal or they will have gotten away.          " +
                "\n                                                   " +
                "\n  To begin, please enter your name:                " +
                "\n                                                   " +
                "\n===================================================" +
                "\n= Game Creators - Rick S. | Maxine C. | Brian K. ==" +
                "\n===================================================" ;   
        System.out.println(welcomeBanner);
        
        
    }
    
    private void displayGenderPrompt(Player player) {
       String welcomeBanner = "";
        welcomeBanner = 
                  "==================================================" +
                "\n=============  WHERE IS MY BONE? =================" +
                "\n==================================================" +
                "\n     .-.               .-.    " +
                "\n    (   `-._________.-'   )   " +
                "\n     >=     _______     =<    " +
                "\n    (   ,-'`       `'-,   )   " +
                "\n     `-'               `-'    " +
                "\n" +
                "\n" +
                "\n  Welcome Detective " + player.getName() +
                "\n" +
                "\n  Are you (M)ale or (F)emale?" +
                "\n" +
                "\n==================================================" +
                "\n= Game Creators - Rick S. | Maxine C. | Brian K. = " +
                "\n==================================================" ;
        
        System.out.println(welcomeBanner);      
    }
    
    private void displayBannerWithIntro(Player player)
    {
        
        String welcomeBanner = "";
        welcomeBanner = 
                  "==================================================" +
                "\n=============  WHERE IS MY BONE? =================" +
                "\n==================================================" +
                "\n     .-.               .-.    " +
                "\n    (   `-._________.-'   )   " +
                "\n     >=     _______     =<    " +
                "\n    (   ,-'`       `'-,   )   " +
                "\n     `-'               `-'    " +
                "\n" +
                "\n" +
                "\n  Welcome Detective " + player.getName() + "! You are   " +
                "\n  the " + player.getChildType() + " of the famous Ruff McGruff " +
                "\n  crime dog who now works for the FBI. You are top" +
                "\n  dawg, police dog, of K9 City. Are you ready to  " +
                "\n  take a bite out of crime?" +
                "\n" +
                "\n         Press ANY key to continue..." +
                "\n" +
                "\n==================================================" +
                "\n= Game Creators - Rick S. | Maxine C. | Brian K. = " +
                "\n==================================================" ;
        
        System.out.println(welcomeBanner);
    }
    
    public void displayStartProgramView() {
        //System.out.println("\n*** displayStartProgram() function called***");
        
        boolean done = false; //set the flag to not done
        do{
            //prompt for and get players name.
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q"))//user wants to quit
            return; //exit the game
            
            //do the requested action and display the next view
            done = this.doAction(playersName);
            
        }while (!done);
        
        
    }

    private String getPlayersName() {
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while(!valid){
            //loop while an invalid value is entered
            
            //System.out.println("\n" + this.promptMessage);  
            
            value = keyboard.nextLine(); //get the next line typed on the keyboard
            value = value.trim(); //trim off leading and trailing blanks
            
            if(value.length() < 1)
            {
                //value is blank
                System.out.println("\nInvalid Value: value cannot be blank");
                continue;        
            }
            
            break; //end the loop
        }
        return value; //return the value entered     
        
        
    }
    private void getPlayerGender(Player player) {
        //We want to prompt for the gender and then set the player gender 
        // attribute.
        boolean isValidGender = false;
        String gender = "";
        
        //Scanner is to read the users input from the keybaord.
        Scanner keyboard = new Scanner(System.in);
        
        //Keep Looping through until a valid name is entered.
        while (!isValidGender){
            String input = keyboard.nextLine();
            
            //Name validation
            if(input == null || input.length() == 1 || input.contentEquals("M")
                    || input.contentEquals("F"))
            {
                isValidGender = true;
                gender = input;
                
                if(input.contentEquals("M") || input.contentEquals("m")){
                     player.setChildType("son");
                }
                else{
                    player.setChildType("daughter");
                }
                
            }
            else{
             System.out.println("Invalid Gender. Please type M or F.");
            }
        }
            //
            //TODO::Set player gender attribute in player instance. 
            //
            
        }
    
    private boolean doAction(String playersName) {
        
        if(playersName.length() < 2){
            System.out.println("\nInvalid players name: "
                    + "  The name must be greater than two character in lenght");
            return false;
        }
        
        //call createPLayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null){
            //if unsuccessful
            System.out.println("\nError creating the player.");
            return false;
        }
        
               
        //Gender prompt. 
        this.displayGenderPrompt(player);
        this.getPlayerGender(player);
        
        //Nice Banner with story Detail
        this.displayBannerWithIntro(player);
        this.waitForEnter();
        
        //Display mainMenuView || display next view
        this.displayNextView(player);
        
        return true;
    }

    private void waitForEnter()
    {
        boolean isValidEnter = false;
        
        //Scanner is to read the users input from the keybaord.
        Scanner keyboard = new Scanner(System.in);
        
        //Keep Looping through until Enter or any key is pressed.
        //We really do not care what key they press.
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
        
    private void displayNextView(Player player) {
        
        //NOTE: Do not need to display custom welcome message here.
        // we are handling this already outside of this method.
        
        //Display the MainMenuView 
        //Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        //Display the main menu view
        mainMenuView.displayMainMenuView();
    }
    
    
}
