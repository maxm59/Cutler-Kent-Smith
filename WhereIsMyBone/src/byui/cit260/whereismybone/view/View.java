package byui.cit260.whereismybone.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import whereismybone.WhereIsMyBone;

/**
 *
 * @author Maxi Cutler
 * @author Smith-Rick
 * 
 * 12/10/16 Maxi: cleaned up unused coding, comments and proper format
 * 
 */
public abstract class View implements ViewInterface {    
    protected String displayMessage;    
    protected final BufferedReader keyboard = WhereIsMyBone.getInFile();
    protected final PrintWriter console = WhereIsMyBone.getOutFile();
        
    public View(){    
    }
    
   public View(String message){
       this.displayMessage = message;
   }
   
   @Override
   public void display(){       
        boolean done = false;
        do{
            String value = this.getInput();            
            if ( value.toUpperCase().equals("X"))
                return; 
            done = this.doAction(value);            
        }while (!done);         
        if(WhereIsMyBone.getCurrentGame().getGameTime().getTimeRemaining() <= 0){
            GameOverView go = new GameOverView();
            go.display();
        }       
   }
   
    @Override
    public String getInput() {         
        boolean exitMenu = false;
        String value = null;        
        try{
            while (!exitMenu){
                this.console.println("\n"+this.displayMessage);
                this.showGameTime();
                value = keyboard.readLine();
                value = value.trim();
                if(value.length()  < 1){
                    this.console.println("\n*** You must enter a value ***");
                }
                 break;
            }   
        }
        catch (Exception ex){
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + ex.getMessage());
        }        
        return value;               
    }
    
    protected void showGameTime(){        
        GameTimeView gt = new GameTimeView();        
        try{
            gt.display();
        }
        catch(Exception ex){
            gt.displayWhenNull();
        }
    }    
}
