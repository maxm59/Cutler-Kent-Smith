package byui.cit260.whereismybone.view;

import byui.cit260.whereismybone.control.GameControl;

/**
 *
 * @author Smith-Rick
 * 
 * 12/10/16 Maxi: cleaned up unused coding, comments and proper format
 * 
 */
public class LoadGameView extends View{
    
    public LoadGameView(){
         super(
                  "==================================================" +
                "\n               WHERE IS MY BONE?                  " +
                "\n==================================================" +
                "\n             .-.               .-.                " +
                "\n            (   `-._________.-'   )               " +
                "\n             >=     _______     =<                " +
                "\n            (   ,-'`       `'-,   )               " +
                "\n             `-'               `-'                " +
                "\n  LOAD GAME:                                      " +
                "\n    Enter the file path where you want to save:   " + 
                "\n                                                  " +         
                "\n==================================================" +
                "\n                                                  " +
                "\n=================================================="  );         
    }

    @Override
    public boolean doAction(String filePath){           
        filePath = filePath.toUpperCase();
        boolean result = false;                
        try{            
            GameControl.getSaveGame(filePath);            
            result = true;            
        }
        catch(Exception ex){
            ErrorView.display(this.getClass().getName(),
                    "Load Game Error: " + ex.getMessage());
        }
        return result;  
    }
}
