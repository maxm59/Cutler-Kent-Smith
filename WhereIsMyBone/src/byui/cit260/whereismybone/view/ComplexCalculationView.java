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

public class ComplexCalculationView {
    
    private String menuOptions = "";
    
    public ComplexCalculationView(){        
        this.menuOptions =
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
                "\n==================================================" ;  
    }
    
    private void displayMenu() {
        menuOptions = getMenuOptions(); 
    }
    
    private String getMenuOptions() {
        
        boolean exitMenu = false;
        String menu = "";
        
        Scanner keyboard = new Scanner(System.in);
        
        while (!exitMenu){
            System.out.println(menuOptions);
            String input = keyboard.nextLine();

            if(input.length()  >= 1){
                char keyEntered = input.toUpperCase().charAt(0);
                if(keyEntered == 'X'){
                    //User wants to exit
                    menu = "X";
                    exitMenu = true;
                }
                else{
                    exitMenu = doAction(input);
                }
            }
        }    
        return menu;               
    }
    
    private boolean doAction(String choice){
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
                System.out.println("\n***Invalid Selection*** Try again");
                break;
             
        }
        return false;  
    
    }
    public void displayComplexCalculationView() {
       
        boolean done = false; //set the flag to not done
        do{
            //prompt for menu option
            String menuOption = this.getMenuOptions();
            
            if (menuOption.toUpperCase().equals("X"))//user wants to quit
                return; //exit the game
            
            //do the requested action and display the next view
            done = this.doAction(menuOption);
            
        }while (!done);  
    }
    
    public void displayCubicInchesView(){
        System.out.println("I see a big box. I wonder if my bone is in it?");
        CubicInchesView cubicInchesView = new CubicInchesView();
        cubicInchesView.display();
    }
    public void displaySqYardView(){
        System.out.println("Back in the yard. Where is my bone?");
        SqYardView sqYardView = new SqYardView();
        sqYardView.display();        
    }
    private void displayCylinderAreaView() {
        System.out.println("I see a big pipe. I wonder if my bone is in it?");
        CylinderAreaView cylinderAreaView = new CylinderAreaView();
        cylinderAreaView.display();        
    }
    public void displayWattsView(){
        //System.out.println("I see lots of power lines."); 
        WattsView wattsView = new WattsView();
        wattsView.display();        
    }
}

