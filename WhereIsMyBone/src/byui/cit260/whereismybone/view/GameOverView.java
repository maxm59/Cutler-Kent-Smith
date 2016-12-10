package byui.cit260.whereismybone.view;

/**
 *
 * @author Smith-Rick
 * 
 * 12/10/16 Maxi: cleaned up unused coding, comments and proper format
 * 
 */
public class GameOverView extends View{
    
    public GameOverView(){
         super(
                  "==================================================" +
                "\n               WHERE IS MY BONE?                  " +
                "\n==================================================" +
                "\n             .-.               .-.                " +
                "\n            (   `-._________.-'   )               " +
                "\n             >=     _______     =<                " +
                "\n            (   ,-'`       `'-,   )               " +
                "\n             `-'               `-'                " +
                "\n                                                  " +
                "\n      -= GAME OVER - YOU RAN OUT OF TIME =-       " +
                "\n                                                  " +         
                "\n==================================================" +
                "\n  Please Q to quit.                               " +
                "\n=================================================="  );         
    }

    @Override
    public boolean doAction(String choice) {           
        choice = choice.toUpperCase();        
        switch (choice) {            
            case "Q":
                System.exit(0);
                break;
            default:
                this.console.println("\n***Invalid Selection*** Try again");
                break; 
                
        }
        return false;  
    }    
}
