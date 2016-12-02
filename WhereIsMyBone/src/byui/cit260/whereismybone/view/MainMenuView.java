/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.view;
import byui.cit260.whereismybone.control.GameControl;
import byui.cit260.whereismybone.exception.GameControlException;
import java.io.IOException;
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
        
        this.console.println(menuBanner);
    }
    
    @Override
    public boolean doAction(String choice){
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "N": //Create and start a new game
                this.startNewGame();
                break;
            case "L":  //Load or get and start an existing game
                this.loadSavedGame();
                break;
            case "S": //save the current game
                this.saveCurrentGame();
                //this.saveGame2();
                break;
             case "H": //display the help menu
                this.displayHelpMenu();
                break; 
            default:
                //updated for Week 12 team assignment
                ErrorView.display("MainMenuView",
                        "***Invalid Selection*** Try again");
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
                    "Error in Starting a New Game.");
        }
    }
    
    private void loadExistingGame(){
        
        try{
            LoadGameView lgv = new LoadGameView();
            lgv.display();
            
        }
        catch(Exception ex)
        {
            ErrorView.display(this.getClass().getName(), 
                    "Error in Loading an Existing Game.");
        }
    }
    
    private void saveGame(){
        
        try{
            SaveGameView sgv = new SaveGameView();
            sgv.display();
            
        }
        catch(Exception ex)
        {
            ErrorView.display(this.getClass().getName(), 
                    "Error in Saving this Game.");
        }
    }
    
    private void displayHelpMenu(){
        
        try{
            HelpMenuView helpMenuView = new HelpMenuView();
            helpMenuView.display();
            
        }
        catch(Exception ex)
        {
            ErrorView.display(this.getClass().getName(), 
                    "Error displaying the Help Menu.");
        }

    }

    private void waitForEnter()
    {
        boolean isValidEnter = false;
        String input = null;

        try{
            while (!isValidEnter){
                input = keyboard.readLine();

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

    private void loadSavedGame() {
        //week 12 assignment
        console.println("Enter file name: ");
        
        try {
            String fileName = keyboard.readLine();
            GameControl.getSaveGame(fileName);
            GameMenuView gmv = new GameMenuView();
            gmv.display();
        } catch (IOException | GameControlException e) {
            ErrorView.display(this.getClass().getName(), "Error loading game");
            this.console.println(e.toString());
        }
    }

    private void saveCurrentGame() {
        //week 12 assignment
        console.println("Enter file name: ");
        
        try {
            String fileName = keyboard.readLine();
            GameControl.saveGame(WhereIsMyBone.getCurrentGame(),
                fileName);
        } catch (IOException | GameControlException e) {
            ErrorView.display(this.getClass().getName(), "Error saving game");
            this.console.println(e.toString());
        }
    }
    
//    //Week 12 print to text file
//    public static void saveGame(Game game, String gamefolder)
//            throws GameControlException{
//        
//        String filepath;
//        
//        try(FileOutputStream fops = new FileOutputStream(filepath)){
//            ObjectOutputStream output = new ObjectOutputStream(fops);
//            
//            output.writeObject(game);
//        }
//        catch(Exception e){
//            throw new GameControlException(e.getMessage());
//        }
//    }
    
    
}

