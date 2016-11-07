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
        
        //this.displayMenu();
        
        this.menuOptions =
                  "==================================================" +
                "\n               WHERE IS MY BONE?                  " +
                "\n           COMPLEX CALCULATION TEST               " +
                "\n==================================================" +
                "\n                                                  " +
                "\n                                                  " +
                "\n     A =   Cubic Inches                           " +
                "\n     B =   Square Yard                            " +
                "\n     C =   Cylinder Volume                        " +
                "\n     D =   Watt Power                             " +
                "\n                                                  " +
                "\n     X =   Exit Testing View                      " +
                "\n                                                  " +
                "\n  Please choose a test:                           " +
                "\n                                                  " +
                "\n==================================================" +
                "\n= Game Creators - Rick S. | Maxine C. | Brian K. =" +
                "\n==================================================" ; 
                
        
    }
    
    private void displayMenu() {
        
        menuOptions = getMenuOptions();
        
    }

//    public static void main (String[] args)
//   {
//	   Scanner scanner = new Scanner(System.in);
//          
//	   System.out.println("Enter the width of the backyard:");
//	   double width = scanner.nextDouble();
//           
//	   System.out.println("Enter the length of the backyard:");
//	   double length = scanner.nextDouble();
//         
//	   //yard = width * length;
//	   double yard = width * length;
//           
//	   System.out.println("Area of the Backyard is:"+yard);
//   }

    private String getMenuOptions() {
        
        boolean exitMenu = false;
        String menu = "";
        
        Scanner keyboard = new Scanner(System.in);
        
        while (!exitMenu){
            System.out.println(menuOptions);
            String input = keyboard.nextLine();

            if(input.length()  >= 1)
            {
                
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
            else{
             System.out.println("Your choice must be at least 1 character.");
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
                this.displaySquareYardView();
                break;
            case "C": 
                this.displayCylinderVolumeView();
                break;
             case "D": 
                this.displayWattPowerView();
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
        System.out.println("Debug: Display Cubic Inches View");
    }
    public void displaySquareYardView(){
        System.out.println("Debug: Display Square Yard View");
    }
    public void displayCylinderVolumeView(){
        System.out.println("Debug: Display Cylinder Volume View");
    }
    public void displayWattPowerView(){
        System.out.println("Debug: Display Watt Power View");
    }
}

