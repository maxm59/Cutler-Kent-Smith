package byui.cit260.whereismybone.view;

/**
 *
 * @author Smith-Rick
 */
public class GameWonView extends View{
    
    public GameWonView(){
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
                "\n           CONGRATULATIONS! YOU WON!              " +
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
