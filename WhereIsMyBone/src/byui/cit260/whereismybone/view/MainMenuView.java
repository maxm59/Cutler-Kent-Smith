/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.view;
import byui.cit260.whereismybone.control.GameControl;
import byui.cit260.whereismybone.exception.GameControlException;
import byui.cit260.whereismybone.exception.MapControlException;
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
                "\n     .-.               .-.    " +
                "\n    (   `-._________.-'   )   " +
                "\n     >=     _______     =<    " +
                "\n    (   ,-'`       `'-,   )   " +
                "\n     `-'               `-'    " +
                "\n" + 
                "\n     N =   New Game          " +
                "\n     H =   Get Help          " +
                "\n     L =   Load a Saved Game " +
                "\n     S =   Save Game         " +
                "\n     X =   Exit Game         " +
                "\n" +
                "\n     C =   Complex Calculation View Test" +
                "\n" +
                "\n" +
                "\n     To begin, please enter your choice:" +
                "\n");        
    }

    private void displayBannerWarning()
    {
        String menuBanner = 
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
             case "C": //Temporary display of Complex Calculation for testing
                 this.displayComplexCalculationView();
                 break;
            default:
                System.out.println("\n***Invalid Selection*** Try again");
                break;
             
        }
        return false;  
    
    }
    private void startNewGame(){
        
        GameControl.createNewGame(WhereIsMyBone.getPlayer());
 
        //Display the Game Menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
    
    private void loadExistingGame(){
        System.out.println("Load Existing Game");
    }
    
    private void saveGame(){
        System.out.println("Save Game");
    }
    
    private void displayHelpMenu(){
        System.out.println("Display Help Menu");
        //Display the MainMenuView 
        //Create MainMenuView object
        HelpMenuView helpMenuView = new HelpMenuView();
        //Display the main menu view
        helpMenuView.display();
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
    
    private void displayComplexCalculationView() {
        
        ComplexCalculationView complexCalculationView = new ComplexCalculationView();
        complexCalculationView.displayComplexCalculationView();
    
    }
}

