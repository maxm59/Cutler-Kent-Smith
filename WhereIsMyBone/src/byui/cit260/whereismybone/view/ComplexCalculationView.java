/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.view;

import java.util.Scanner;
/**
 *
 * @author Smith-Rick
 * 
 * This view class contains the views for the complex calculations performed
 * during the game. 
 * 
 * There are 4 main displays groups. 
 * 1) Volume of the cylinder - Team 
 * 2) Square foot area of the yard - Maxi
 * 3) Cubic Inches - Brian
 * 4) Energy Conversion - Rick
 */

public class ComplexCalculationView extends View{
    
    public ComplexCalculationView(){        
        super(
                  "==================================================" +
                "\n               WHERE IS MY BONE?                  " +
                "\n           CALCULATION TEST FOR CLUES             " +
                "\n==================================================" +
                "\n             .-.               .-.                " +
                "\n            (   `-._________.-'   )               " +
                "\n             >=     _______     =<                " +
                "\n            (   ,-'`       `'-,   )               " +
                "\n             `-'               `-'                " +
                "\n             A =   Size of a Box                  " +
                "\n             B =   Backyare Area                  " +
                "\n             C =   Size of a Pipe                 " +
                "\n             D =   Danger! Electrical Lines       " +
                "\n                                                  " +
                "\n             X =   Exit Testing View              " +
                "\n                                                  " +
                "\n             Please choose a test:                " +
                "\n                                                  " +
                "\n==================================================" +
                "\n= Game Creators - Rick S. | Maxine C. | Brian K. =" +
                "\n==================================================") ;  
    }
    
  
  @Override
    public boolean doAction(String choice){
          choice = choice.toUpperCase();
        switch (choice) {
            case "A": 
                this.displayCubicInchesView();
                break;
            case "B":  
                this.displaySqYardView();
                break;
            case "C": 
                this.displayCylinderAreaView();
                break;
             case "D": 
                this.displayWattsView();
                break; 
            default:
                this.console.println("\n***Invalid Selection*** Try again");
                break;
             
        }
        return false;  
    
    }
    
    
    public void displayCubicInchesView(){
        this.console.println("I see a big box. I wonder if my bone is in it?");
        CubicInchesView cubicInchesView = new CubicInchesView();
        cubicInchesView.display();
    }
    public void displaySqYardView(){
        this.console.println("Back in the yard. Where is my bone?");
        SqYardView sqYardView = new SqYardView();
        sqYardView.display();        
    }
    private void displayCylinderAreaView() {
        this.console.println("I see a big pipe. I wonder if my bone is in it?");
        CylinderAreaView cylinderAreaView = new CylinderAreaView();
        cylinderAreaView.display();        
    }
    public void displayWattsView(){
        //this.console.println("I see lots of power lines."); 
        WattsView wattsView = new WattsView();
        wattsView.display();        
    }
}

