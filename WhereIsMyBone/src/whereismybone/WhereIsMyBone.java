package whereismybone;

import byui.cit260.whereismybone.model.Game;
import byui.cit260.whereismybone.model.Player;
import byui.cit260.whereismybone.view.StartProgramView;

public class WhereIsMyBone {
    
    private static Game currentGame = null;
    private static Player player = null;

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
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

}
