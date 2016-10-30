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

       this.menuOptions = 
                  "==================================================" +
                "\n               WHERE IS MY BONE?                  " +
                "\n                   Help Menu                      " +
                "\n==================================================" +
                "\n             .-.               .-.                " +
                "\n            (   `-._________.-'   )               " +
                "\n             >=     _______     =<                " +
                "\n            (   ,-'`       `'-,   )               " +
                "\n             `-'               `-'                " +
                "\n                                                  " + 
                "\n         O =   Obeject of the game.               " +
                "\n         H =   How to play the game.              " +
                "\n         M =   How to move around.                " +
                "\n         C =   How to use Clues.                  " +
                "\n         V =   Villains Details                    " +
                "\n         X =   Exit Help Menu.                    " +
                "\n                                                  " +
                "\n         To begin, please enter your choice:      " +
                "\n                                                  " +
                "\n==================================================" +
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
               String details = "";
        details = 
                  "==================================================" +
                "\n== HELP: Game Objectives =========================" +
                "\n==================================================" +
                "\n=                                                =" +
                "\n=  Your favorite bone has been stolen and you    =" +
                "\n=  suspect it is one of the members in the Cat   =" +
                "\n=  DeVil Gang, but who took it and where is it?  =" +
                "\n=                                                =" +
                "\n=  Your mission is to find bone and aprehend the =" +
                "\n=  theif. You only have 24 hours to do so or     =" +
                "\n=  they will have gotten away free and clear.    =" +
                "\n=                                                =" +
                "\n=  Search for clues, pick up items that might    =" +
                "\n=  help you along the way. Interview suspects    =" +
                "\n=  and witnesses.                                =" +
                "\n=                                                =" +
                "\n=  Avoid Duh Catcher. If you encounter him, you  =" +
                "\n=  will be forced back to your previous location.=" +
                "\n=                                                =" +
                "\n=  If time runs out, you will lose the game.     =" +
                "\n=                                                =" +
                "\n==================================================" ;


        System.out.println(details);
    }
    
    private void displayHowToMenu(){
        System.out.println("Display How TO Play Details");
               String details = "";
        details = 
                  "==================================================" +
                "\n== HELP: How to Play =============================" +
                "\n==================================================" +
                "\n=                                                =" +
                "\n= EVALUATING IF THIS IS NEEDED. SEEMS REDUNDANT  =" +
                "\n= TO THE OBJECTIVE MENU.                         =" +
                "\n=                                                =" +
                "\n=                                                =" +
                "\n=                                                =" +
                "\n==================================================" ;


        System.out.println(details);
    }
    
    private void displayHowToMove(){
        System.out.println("Display info on how to move");
               String details = "";
        details = 
                  "==================================================" +
                "\n== HELP: How To Move =============================" +
                "\n==================================================" +
                "\n=                                                =" +
                "\n= When you are ready to move, bring up the MAP   =" +
                "\n= menu. You will be given a list of options.     =" +
                "\n= Select the 'Move' option and enter a 2 digit   =" +
                "\n= code to move.                                  =" +
                "\n=                                                =" +
                "\n= ___________________________________________   =" +
                "\n=    |   1   |   2   |   3   |   4   |   5   |   =" +
                "\n= ___|-------|-------|-------|-------|-------|   =" +
                "\n=    | Park  |Vacant |Police |Animal | Pound |   =" +
                "\n=  1 |       | House | Office| Care  |       |   =" +
                "\n= ___|_______|_______|_______|_______|_______|   =" +
                "\n=    |Bakery |Food   |Drive  |Da Lake|Cat    |   =" +
                "\n=  2 |       | Place | Inn   |       | Alley |   =" +
                "\n= ___|_______|_______|_______|_______|_______|   =" +
                "\n=    |Care   |Smith  |  YOUR |DeVil  |Grocery|   =" +
                "\n=  3 | Home  | House |  HOME | House | Store |   =" +
                "\n= ___|_______|_______|_______|_______|_______|   =" +
                "\n=    |Fish-  |Zoo    |Zoo    |Zoo    |Zoo    |   =" +
                "\n=  4 | monger|       |       |       |       |   =" +
                "\n= ___|_______|_______|_______|_______|_______|   =" +
                "\n=    |School |School |School |School |Zoo    |   =" +
                "\n=  5 | Front | Cafe  |Playgrd|Parking|       |   =" +
                "\n= ___|_______|_______|_______|_______|_______|   =" +
                "\n=                                                =" +
                "\n==================================================" ;


        System.out.println(details);
    }
    
    private void displayClues(){
        System.out.println("Display Clue info");       
        String details = "";
        details = 
                  "==================================================" +
                "\n== HELP: Clues ===================================" +
                "\n==================================================" +
                "\n=                                                =" +
                "\n= Clues help you identify where to move next, or =" +
                "\n= who the criminal might be. Check the clue log. =" +
                "\n=                                                =" +
                "\n==================================================" ;


        System.out.println(details);
    }
    private void displayVillans(){
        System.out.println("Display Villan info");
        
        String details = "";
        details = 
                  "==================================================" +
                "\n== HELP: Villain Details =========================" +
                "\n==================================================" +
                "\n= Mrs. Cat DeVil                                 =" +
                "\n=  Mrs. DeVil is the leader of the Cat DeVil     =" +
                "\n=  Gang. She and her mangy crew don't like water.=" +
                "\n=  Instead they simply lick the filth off of     =" +
                "\n=  their backs and the cough up hair balls all   =" +
                "\n=  over town without a care in the world. Few    =" +
                "\n=  have ever seen her. She is an illusive cat. A =" +
                "\n=  lot of people say she has white fur and green =" +
                "\n=  eyes.                                         =" +
                "\n=                                                =" +
                "\n= Duh Catcher                                    =" +
                "\n=  Mr. Catcher is one of the DeVil's henchmen.   =" +
                "\n=  He will randomly float around the map. If you =" +
                "\n=  find him, run. He is the equivalent to moving =" +
                "\n=  back 1 space, which will cost you time.       =" +
                "\n=                                                =" +
                "\n= Scarface                                       =" +
                "\n=  Just another mangy cat gang member with a     =" +
                "\n=  scar across his right eye. His one good blue  =" +
                "\n=  eye will pierce you to the bone. He is the    =" +
                "\n=  blackest of the alley cats.                   =" +
                "\n=                                                =" +
                "\n= Tom                                            =" +
                "\n=  Your average tom cat.                         =" +
                "\n=                                                =" +
                "\n= Kit                                            =" +
                "\n=  This guy is a ball of fuzz.                   =" +
                "\n=                                                =" +
                "\n= Rex                                            =" +
                "\n=  You know Rex. T-Rex.                          =" +
                "\n=                                                =" +
                "\n==================================================" ;


        System.out.println(details);
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