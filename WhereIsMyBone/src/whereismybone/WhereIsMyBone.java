package whereismybone;

import byui.cit260.whereismybone.model.Game;
import byui.cit260.whereismybone.model.GameTime;
import byui.cit260.whereismybone.model.Player;
import byui.cit260.whereismybone.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WhereIsMyBone {
    
    private static Game currentGame = null;
    private static Player player = null;
    private static GameTime gameTime = null;
    
   //Week 12 assignment line 20 to line 80
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            //Open Character Stream files for end user input and output
            WhereIsMyBone.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));
            
            WhereIsMyBone.outFile = new PrintWriter(System.out, true);
            
            //Open the Log File
            // The filePath will be located in the same dir as the application
            // unless you specify the entire path string location.
            String filePath = "log.txt";
            WhereIsMyBone.logFile = new PrintWriter(filePath);
                        
            //Create StartProgramView and start the program
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.displayStartProgramView();
            
            return;
        
        }
        catch(Throwable ex){
            
            System.out.println("Exception: " + ex.toString()+
                    "\nCause: " + ex.getCause() +
                    "\nMessage: " + ex.getMessage());
            
            ex.printStackTrace();
        }
        finally{
            try {
                
                //If the files exists, close them.
                if (WhereIsMyBone.inFile != null)
                    WhereIsMyBone.inFile.close();
                
                if (WhereIsMyBone.outFile != null)
                    WhereIsMyBone.outFile.close();
                
                if (WhereIsMyBone.logFile != null)
                    WhereIsMyBone.logFile.close();
                
            } catch (IOException ex) {
                
                System.out.println("Error closing files");
                return;
                
            }
        }

    }
   
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        WhereIsMyBone.currentGame = currentGame;
    }
    
    public static Player getPlayer(){
        return player;
    }
    
    public static void setPlayer(Player player)
    {
        WhereIsMyBone.player = player;
    }
    public static GameTime getGameTime() {
        return gameTime;
    }

    public static void setGameTime(GameTime gameTime) {
        WhereIsMyBone.gameTime = gameTime;
    }
    //week 12 assignment from line 106 to line 126
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        WhereIsMyBone.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        WhereIsMyBone.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        WhereIsMyBone.logFile = logFile;
    }

}
