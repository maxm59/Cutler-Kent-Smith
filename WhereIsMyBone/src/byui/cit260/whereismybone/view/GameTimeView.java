package byui.cit260.whereismybone.view;

import whereismybone.WhereIsMyBone;

/**
 *
 * @author Smith-Rick
 * 
 * 12/10/16 Maxi: cleaned up unused coding, comments and proper format
 */
public class GameTimeView extends View{
    
    public GameTimeView() {
        
    }

    @Override
    public void display() {
        double currentTime = WhereIsMyBone.getCurrentGame().getGameTime().getTimeRemaining();
        String currentLoc = WhereIsMyBone.getCurrentGame().getPlayer().getLocation().getName();
                
        this.console.println(
                "==================================================" +
                "\n Your current location is: " + currentLoc +
                "\n You have " + currentTime + " time left." +
                "\n==================================================" 
        );
    }
    
    public void displayWhenNull(){
                this.console.println(
                "==================================================" +
                "\n  " +
                "\n==================================================");
    }

    @Override
    public boolean doAction(String value) {
        //do nothing
        return true;
    }
}
