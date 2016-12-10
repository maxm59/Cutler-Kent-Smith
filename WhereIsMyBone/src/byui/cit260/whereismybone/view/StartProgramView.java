package byui.cit260.whereismybone.view;

import byui.cit260.whereismybone.control.GameControl;
import byui.cit260.whereismybone.exception.GameControlException;
import byui.cit260.whereismybone.model.Player;
import java.util.logging.Level;
import java.util.logging.Logger;
import whereismybone.WhereIsMyBone;

/**
 *
 * @author Smith-Rick
 * 
 * 12/10/16 Maxi: cleaned up unused coding, comments and proper format
 */
public class StartProgramView extends View{
    
    public StartProgramView(){
        this.displayBannerAndPrompt();
    }
    
    private void displayBannerAndPrompt() {
        String welcomeBanner = "";
        welcomeBanner = 
                  "==================================================" +
                "\n=============  WHERE IS MY BONE? =================" +
                "\n==================================================" +
                "\n             .-.               .-.                " +
                "\n            (   `-._________.-'   )               " +
                "\n             >=     _______     =<                " +
                "\n            (   ,-'`       `'-,   )               " +
                "\n             `-'               `-'                " +
                "\n This game is a Carmen Sandiego style game. You're" +
                "\n enemy is the Cat DeVil Gang. Members of that gang" +
                "\n have stolen your bone. Your job is to track down " +
                "\n clues to identify which gang member has stolen   " +
                "\n your bone. You only have 24 hours to collar the  " +
                "\n criminal or they will have gotten away.          " +
                "\n                                                  " +
                "\n  To begin, please enter your name:               " +
                "\n                                                  " +
                "\n==================================================" +
                "\n=  Game Creators - Rick S. | Maxi C. | Brian K.  =" +
                "\n==================================================" ;        
        this.console.println(welcomeBanner);
    }
    
    private void displayGenderPrompt(Player player) {
       String welcomeBanner = "";
        welcomeBanner = 
                  "==================================================" +
                "\n=============  WHERE IS MY BONE? =================" +
                "\n==================================================" +
                "\n             .-.               .-.                " +
                "\n            (   `-._________.-'   )               " +
                "\n             >=     _______     =<                " +
                "\n            (   ,-'`       `'-,   )               " +
                "\n             `-'               `-'                " +
                "\n   Welcome Detective " + player.getName() +
                "\n" +
                "\n   Are you (M)ale or (F)emale?" +
                "\n" +
                "\n==================================================" +
                "\n== Game Creators - Rick S. | Maxi C. | Brian K. ==" +
                "\n==================================================" ;        
        this.console.println(welcomeBanner);      
    }
    
    private void displayBannerWithIntro(Player player){        
        String welcomeBanner = "";
        welcomeBanner = 
                  "==================================================" +
                "\n=============  WHERE IS MY BONE? =================" +
                "\n==================================================" +
                "\n             .-.               .-.                " +
                "\n            (   `-._________.-'   )               " +
                "\n             >=     _______     =<                " +
                "\n            (   ,-'`       `'-,   )               " +
                "\n             `-'               `-'                " +
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
                "\n== Game Creators - Rick S. | Maxi C. | Brian K. ==" +
                "\n==================================================" ;        
        this.console.println(welcomeBanner);
    }
    
    public void displayStartProgramView() {        
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
        String value = null; //value to be returned
        boolean valid = false; //initialize to not valid        
        try{
            while(!valid){
                //loop while an invalid value is entered
                try{
                    //get the next line typed on the keyboard
                    value = this.keyboard.readLine(); 
                    //trim off leading and trailing blanks
                    value = value.trim();
                    if(value.length() < 1){
                        //value is blank
                        this.console.println("\nInvalid Value: value cannot be blank");
                        continue;        
                    }
                } catch(Exception ex){
                    ErrorView.display(this.getClass().getName(), 
                            "Error getting player name");              
                }
                break; //end the loop
            }   
        } catch(Exception ex){
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + ex.getMessage());
        }        
        return value; 
    }
    
    private void getPlayerGender(Player player) {
        boolean isValidGender = false;
        String gender = "";
        String input = null;
        try{
        //Keep Looping through until a valid name is entered.
            while (!isValidGender){
                input = this.keyboard.readLine();
                input = input.toUpperCase();
                //Name validation
                if(input.contentEquals("M") | input.contentEquals("F")){
                    isValidGender = true;
                    gender = input;
                    if(input.contentEquals("M") | input.contentEquals("m")){
                         player.setChildType("son");
                    }
                    else{
                        player.setChildType("daughter");
                    }
                }
                else{
                 this.console.println("Invalid Gender. Please type M or F.");
                }
            }
        }
        catch(Exception ex){
           ErrorView.display(this.getClass().getName(),
                   "Error reading input: " + ex.getMessage());
        }            
    }
    
    @Override
    public boolean doAction(String playersName) {        
        if(playersName.length() < 2 || playersName == null){
            this.console.println("\nInvalid players name: "
                    + "  The name must be greater than two character in lenght");
            return false;
        }        
        try {
            WhereIsMyBone.setPlayer(GameControl.createPlayer(playersName));
        } catch (GameControlException ex) {
            Logger.getLogger(StartProgramView.class.getName()).log(Level.SEVERE, null, ex);
        }       
        Player player = WhereIsMyBone.getPlayer();
        this.displayGenderPrompt(player);
        this.getPlayerGender(player);
        this.displayBannerWithIntro(player);
        this.waitForEnter();
        this.displayNextView(player);        
        return true;
    }

    private void waitForEnter(){
        boolean isValidEnter = false;
        String input = null;        
        try{
            while (!isValidEnter){
                input = keyboard.readLine();
                if(input.length() >= 0){
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
        
    private void displayNextView(Player player) {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
}
