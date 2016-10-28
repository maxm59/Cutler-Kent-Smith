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
    
    //Class Variables 
    private String playerName = ""; //Players Name
    private String childType = ""; //Is set to son or daughter.
    
    public WelcomeScreenView() {
        
    }
    
    public void welcomeScreen(){
        
        //Display the initial banner
        displayBanner();
        
        //Prompt for username
        playerName = getPlayerName();
        
        //Display username and prompt for gender.
        displayBannerWithName();
        getPlayerGender();
        
        
        //Finally display the banner with the intro story.
        displayBannerWithIntro();
                
        waitForEnter();
                        
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
    
    private void displayBannerWithIntro()
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
                "\n  Welcome Detective " + playerName + "! You are   " +
                "\n  the " + childType + " of the famous Ruff McGruff " +
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
                
                if(input.contentEquals("M") || input.contentEquals("m")){
                    childType = "son";
                }
                else{
                    childType = "daughter";
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
    
    
}
