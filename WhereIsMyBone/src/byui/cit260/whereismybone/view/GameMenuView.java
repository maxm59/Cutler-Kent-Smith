/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.view;

/**
 *
 * @author Smith-Rick
 */
public class GameMenuView extends View{

    public GameMenuView(){
        super(
                 "==================================================" +
                "\n               WHERE IS MY BONE?                 " +
                "\n                   GAME MENU                     " +
                "\n=================================================" +
                "\n                                                 " +
                "\n         B  =  Backpack Inventory                " +
                "\n         C  =  Clue List                         " +                         
                "\n         D  =  Display Map                       " +                         
                "\n         H  =  Display Help                      " +                       
                "\n         M  =  Move                              " +
                "\n         S  =  Search Location for Clues         " +
                "\n                                                 " +
                "\n         X  =  Exit Game                         " +
                "\n                                                 " +
                "\n         Please make a selection:                " +
                "\n                                                 ");
            
    }

    @Override
    public boolean doAction(String value) {
        
        char charSel = value.toUpperCase().charAt(0);
        
        switch (charSel) {
            
            case 'M':
                System.out.println("Display the Move Location View");
                movePlayer();
                break;
            case 'S':
                System.out.println("Search Location");
                searchLocation();
                break;
            case 'B':
                System.out.println("Display Backpack Inventory");
                showBackpack();
                break;
            case 'C':
                System.out.println("Display Clue List");
                showClues();
                break;
            case 'D':
                System.out.println("Display Map");
                showMap();
                break;
            case 'H':
                System.out.println("Display Help Menu");
                showHelpMenu();
                break;
            case 'X':
                System.out.println("Exit the Game Menu");
                return true;
            default:
                System.out.println("Invalid option");
                break;
        }
        return false;
    
    }

    private void showHelpMenu() {
        
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void movePlayer() {
                System.out.println("TODO - Display Move Player Prompt");
    }

    private void searchLocation() {
                System.out.println("TODO - Search Location Results");
    }

    private void showBackpack() {
                System.out.println("TODO - Display BackPack Inventory");
    }

    private void showClues() {
                System.out.println("TODO - Display Clue List");
    }

    private void showMap() {
                System.out.println("TODO - Display Map");
    }
}
