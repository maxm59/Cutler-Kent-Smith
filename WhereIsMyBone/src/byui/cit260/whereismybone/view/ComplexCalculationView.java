/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.view;

import byui.cit260.whereismybone.exception.ComplexCalcException;
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
                "\n             B =   Back yard Area                 " +
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
        try{
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
        }
        catch(Exception ex){
            
            ErrorView.display(this.getClass().getName(), 
                    "Error with doAction");  
                        
        }  
        return false;  
    
    }
    
    
    public void displayCubicInchesView() throws ComplexCalcException{
        CalcBoxView cbv = new CalcBoxView();
        try{
            cbv.display();
        } 
        catch(Exception ex){
            
            ErrorView.display(this.getClass().getName(), 
                    "Error displaying Cubic Inches View.");  
            throw new ComplexCalcException("ERROR: There was a problem with display "
                    + "Cubic Inches View.");
                        
        }
    }
    public void displaySqYardView() throws ComplexCalcException{
        SqYardView sqYardView = new SqYardView();
        try{
            sqYardView.display();   
        }
        catch(Exception ex){
            
            ErrorView.display(this.getClass().getName(), 
                    "Error displaying Cubic Inches View.");  
            throw new ComplexCalcException("ERROR: There was a problem with display "
                    + "Square Yard View.");
                        
        }
    }
    private void displayCylinderAreaView() throws ComplexCalcException {
        CylinderAreaView cylinderAreaView = new CylinderAreaView();
        try{
            cylinderAreaView.display();   
        }
        catch(Exception ex){
            
            ErrorView.display(this.getClass().getName(), 
                    "Error displaying Cylinder View.");  
            throw new ComplexCalcException("ERROR: There was a problem with display "
                    + "Cylinder View.");
                        
        }     
    }
    public void displayWattsView() throws ComplexCalcException{
        //this.console.println("I see lots of power lines."); 
        WattsView wattsView = new WattsView();
        try{
            wattsView.display();  
        }
        catch(Exception ex){
            
            ErrorView.display(this.getClass().getName(), 
                    "Error displaying Cubic Inches View.");  
            throw new ComplexCalcException("ERROR: There was a problem with display "
                    + "Watts View.");
                        
        }  
    }
}

