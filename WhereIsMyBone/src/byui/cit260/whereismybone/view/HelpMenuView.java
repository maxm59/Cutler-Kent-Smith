/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.view;

import java.util.Scanner;

/**
 * @author Smith-Rick
 * @author Maxi Cutler
 */
public class HelpMenuView extends View{

//    private String menuOptions = "";
    
    public HelpMenuView() {

       super(
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
                "\n         O =   Object of the game                 " +
                "\n         C =   How to use Clues                   " +
                "\n         M =   How to move around                 " +        
                "\n         A =   Actors Details                     " +
                "\n         S =   Scenes Details                     " +   
                "\n         V =   Villains Details                   " +
                "\n         X =   Exit Help Menu                     " +
                "\n                                                  " +
                "\n         To begin, please enter your choice:      " +
                "\n                                                  " +
                "\n==================================================" +
                "\n==================================================" );        
    }


    private void displayObjectGameMenu(){
        String details = 
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


        this.console.println(details);
    }
    
    private void displayHowToMove(){
        String details = 
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
                "\n=    | Park  |Vacant | K9    |Animal | Animal|   =" +
                "\n=  1 |  Land | House | Police| Care  |Shelter|   =" +
                "\n= ___|_______|_______|_______|_______|_______|   =" +
                "\n=    |Jones  |Seafood| Tex   | Pond  |Cat    |   =" +
                "\n=  2 |Bakery | Eatery| Mix   |       | Alley |   =" +
                "\n= ___|_______|_______|_______|_______|_______|   =" +
                "\n=    |Senior |Smith  | Home  |DeVil  | Super |   =" +
                "\n=  3 | Care  | House | Start | House | Max   |   =" +
                "\n= ___|_______|_______|_______|_______|_______|   =" +
                "\n=    |Fish-  | Zoo   | Eleph | Tiger | Gir   |   =" +
                "\n=  4 | monger|       |  Cage |  Cage |  Cage |   =" +
                "\n= ___|_______|_______|_______|_______|_______|   =" +
                "\n=    |School |School |School |School | Steak |   =" +
                "\n=  5 | Front | Cafe  |Playgrd|Parking| Out   |   =" +
                "\n= ___|_______|_______|_______|_______|_______|   =" +
                "\n=                                                =" +
                "\n==================================================" ;


        this.console.println(details);
    }
    
    private void displayClues(){
        String details = 
                  "==================================================" +
                "\n== HELP: Clues ===================================" +
                "\n==================================================" +
                "\n=                                                =" +
                "\n= Clues help you identify where to move next, or =" +
                "\n= who the criminal might be. Check the clue log. =" +
                "\n=                                                =" +
                "\n==================================================" ;


        this.console.println(details);
    }
    private void displayVillans(){
        String details = 
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
                "\n= Toby                                           =" +
                "\n=  Your average tom cat.                         =" +
                "\n=                                                =" +
                "\n= Felix                                          =" +
                "\n=  This guy is a ball of fuzz.                   =" +
                "\n=                                                =" +
                "\n= Rex                                            =" +
                "\n=  You know Rex. T-Rex.                          =" +
                "\n=                                                =" +
                "\n==================================================" ;


       this.console.println(details);
    }
    
    private void waitForEnter()
    {
        boolean isValidEnter = false;
        String input = null;

        try{
            while (!isValidEnter){
                input = this.keyboard.readLine();

                //Name validation
                if(input.length() >= 0)
                {
                    isValidEnter = true;
                }
                else{
                 this.console.println("Please press <ENTER>.");
                }
                break;
            }            
        }
        catch(Exception ex){
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + ex.getMessage());
        }
        
    }
    
    public boolean doAction(String choice){
        
        choice = choice.toUpperCase();
        
        
        switch (choice) {
            case "O": //Display Game Objective
                this.displayObjectGameMenu();
                break;
            case "A": //Display List of Actors
                this.displayActorsView();
                break;
            case "S": //Display The 25 Scenes in the game.
                this.displaySceneView();
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
                this.console.println("\n***Invalid Selection*** Try again");
                break;
             
        }
        return false;  
    
    }

    private void displayActorsView() {
        
        ActorsView actorsView = new ActorsView();
        actorsView.display();

    }

    private void displaySceneView() {
        
        SceneView sceneView = new SceneView();
        sceneView.display();
    }
    
    private void displayMap(){
        
        MapView mapView = new MapView();
        mapView.display();
    }

}
