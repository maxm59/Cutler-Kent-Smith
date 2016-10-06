/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * The welcome screen is the first screen to be displayed when the user starts
 * the game. We want to display the game welcome banner and prompt the user for
 * a name.
 *
 * NOTE: Welcome Screen is the same as the StartProgramView
*/


package byui.cit260.whereismybone.view;

import java.util.Scanner;

/**
 *
 * @author Smith-Rick
 */
public class WelcomeScreenView {
    
    private String playerName = "";
    
    public WelcomeScreenView() {
        
    }
    
    public void welcomeScreen(){
        
        displayBanner();
        
        playerName = getPlayerName();
        
        displayBannerWithName();
        
        getPlayerGender();
                        
    }
    
    public void displayBanner()
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
                "\n  To begin, please enter your name:" +
                "\n" +
                "\n" +
                "\n" +
                "\n==================================================" +
                "\n= Game Creators - Rick S. | Maxine C. | Brian K. = " +
                "\n==================================================" ;
        
        System.out.println(welcomeBanner);
    }

    private void displayBannerWithName()
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
                "\n  Welcome Detective " + playerName +
                "\n" +
                "\n  Are you (M)ale or (F)emale?" +
                "\n" +
                "\n==================================================" +
                "\n= Game Creators - Rick S. | Maxine C. | Brian K. = " +
                "\n==================================================" ;
        
        System.out.println(welcomeBanner);
    }
    
    private String getPlayerName() {
        
        boolean isValidName = false;
        String name = "";
        
        //Scanner is to read the users input from the keybaord.
        Scanner keyboard = new Scanner(System.in);
        
        //Keep Looping through until a valid name is entered.
        while (!isValidName){
            String input = keyboard.nextLine();
            
            //Name validation
            if(input == null || input.length()  >= 2)
            {
                isValidName = true;
                name = input;
            }
            else{
             System.out.println("Your name must be at least 2 characters.");
            }
        }
        
            //TODO::Set player name attribute in player instance. 
            
            return name;
                        
        }
        

    private void getPlayerGender() {
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
            }
            else{
             System.out.println("Invalid Gender. Please type M or F.");
            }
        }
        
            //TODO::Set player gender attribute in player instance. 
                                    
        }
    
    }
