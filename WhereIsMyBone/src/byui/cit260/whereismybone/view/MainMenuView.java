/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.view;
import byui.cit260.whereismybone.control.GameControl;
import java.util.Scanner;
import whereismybone.WhereIsMyBone;

/**
 *
 * @author Maxi Cutler
 */
public class MainMenuView extends View {

    private int height;
    private int diameter;
    private double calcResult;

    public MainMenuView(){

       super(
                  "==================================================" +
                "\n               WHERE IS MY BONE?                  " +
                "\n                   MAIN MENU                      " +
                "\n==================================================" +
                "\n             .-.               .-.                " +
                "\n            (   `-._________.-'   )               " +
                "\n             >=     _______     =<                " +
                "\n            (   ,-'`       `'-,   )               " +
                "\n             `-'               `-'                " +
                "\n                                                  " + 
                "\n               N  =   New Game                    " +
                "\n               H  =   Help Menu                   " +
                "\n               L  =   Load Saved Game             " +
                "\n               S  =   Save Game                   " +
                "\n               X  =   Exit Game                   " +
                "\n                                                  " +
                "\n                                                  " +
                "\n                                                  " +
                "\n     To begin, please enter your choice:          " +
                "\n==================================================");       
    }

    private void displayBannerWarning(){
        
        String menuBanner = 
                  "==================================================" +
                "\n=============  WHERE IS MY BONE? =================" +
                "\n==================================================" +
                "\n             .-.               .-.                " +
                "\n            (   `-._________.-'   )               " +
                "\n             >=     _______     =<                " +
                "\n            (   ,-'`       `'-,   )               " +
                "\n             `-'               `-'                " +
                "\n                                                  " +
                "\n               ---  WARNING  ---                  " +
                "\n        You will lose all unsaved progress.       " +
                "\n                Proceed? (Y)es or (N)             " +
                "\n                                                  " +
                "\n             Please enter your choice:            " +
                "\n                                                  " +
                "\n==================================================" +
                "\n==================================================" ;
        
        System.out.println(menuBanner);
    }
    
    @Override
    public boolean doAction(String choice){
        
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
            default:
                System.out.println("\n***Invalid Selection*** Try again");
                break;
             
        }
        return false;  
    
    }
    private void startNewGame(){
        
        try{
            GameControl.createNewGame(WhereIsMyBone.getPlayer());
 
            //Display the Game Menu
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.display();  
        }
        catch (Exception ex){
            ErrorView.display(this.getClass().getName(), 
                    "Error starting New Game.");
        }
    }
    
    private void loadExistingGame(){
        
        try{
            //System.out.println("Load Existing Game");
            LoadGameView lgv = new LoadGameView();
            lgv.display();
            
        }
        catch(Exception ex)
        {
            ErrorView.display(this.getClass().getName(), 
                    "Error Loading Game.");
        }
    }
    
    private void saveGame(){
        
        try{
            //System.out.println("Save Game");
            SaveGameView sgv = new SaveGameView();
            sgv.display();
            
        }
        catch(Exception ex)
        {
            ErrorView.display(this.getClass().getName(), 
                    "Error Saving Game.");
        }
    }
    
    private void displayHelpMenu(){
        try{
            //System.out.println("Display Help Menu");
            HelpMenuView helpMenuView = new HelpMenuView();
            helpMenuView.display();
            
        }
        catch(Exception ex)
        {
            ErrorView.display(this.getClass().getName(), 
                    "Error with Help Menu.");
        }

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
    
    
}

