/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.view;

import whereismybone.WhereIsMyBone;


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
                //System.out.println("Display the Move Location View");
                this.movePlayer();
                break;
            case 'S':
                System.out.println("Search Location");
                this.searchLocation();
                break;
            case 'B':
                System.out.println("Display Backpack Inventory");
                this.showBackpack();
                break;
            case 'C':
                System.out.println("Display Clue List");
                this.showClues();
                break;
            case 'D':
                //System.out.println("Display Map");
                this.showMap();
                break;
            case 'H':
                System.out.println("Display Help Menu");
                this.showHelpMenu();
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
        //System.out.println("TODO - Search Location Results");
        
        MapView mapView = new MapView();
        mapView.display();
        
        
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
                //System.out.println("DEBUG: Display Map");
                MapView mapView = new MapView();
                mapView.displayMap();
    }    
    
}
