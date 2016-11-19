/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.view;

import java.util.Scanner;
/**
 *
 * @author Maxine Cutler
 */
public class SceneView extends View {

    public SceneView() {

       super(
              "==================================================" +
            "\n               WHERE IS MY BONE?                  " +
            "\n             Description of Charactors            " +
            "\n==================================================" +
            "\n             .-.               .-.                " +
            "\n            (   `-._________.-'   )               " +
            "\n             >=     _______     =<                " +
            "\n            (   ,-'`       `'-,   )               " +
            "\n             `-'               `-'                " +
            "\n                                                  " + 
            "\n                A  =  ParkLand                    " + 
            "\n                B  =  K9 Precinct                 " + 
            "\n                C  =  Animal Care                 " + 
            "\n                D  =  Animal Shelter              " + 
            "\n                E  =  Jones Bakery                " + 
            "\n                F  =  Steak Heaven                " + 
            "\n                G  =  Tex Mix Drive Inn           " +  
            "\n                H  =  Senior Care                 " +  
            "\n                I  =  The Smiths Home                    " + 
            "\n                J  =  Home Sweet Home                       " + 
            "\n                K  =  ZooLand                     " +            
            "\n                L  =  Seafood Eatery              " +
            "\n                M  =  Trump School                " + 
            "\n                N  =  Cat Alley                   " +
            "\n                                                  " +
            "\n        To begin, please enter your choice:       " +  
            "\n                                                  " +
            "\n                   X   =  Exit                    " +
            "\n                                                  " +
            "\n==================================================" +
            "\n     Find out who we are and Are we suspects?     " +
            "\n==================================================" );        
    }
    
    @Override
    public boolean doAction(String choice){   
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "A": 
                this.displayScenea();
                break;
            case "B":
                this.displaySceneb();
                break;
            case "C":
                this.displayScenec();
                break;
            case "D":
                this.displayScened();
                break; 
            case "E":
                this.displayScenee();
                break;
            case "F": 
                this.displayScenef();
                break;
            case "G":
                this.displaySceneg();
                break;
            case "H":
                this.displaySceneh();
                break;
            case "I":
                this.displayScenei();
                break; 
            case "J":
                this.displayScenej();
                break;
            case "K": 
                this.displayScenek();
                break;
            case "L":
                this.displayScenel();
                break;
            case "M":
                this.displayScenem();
                break;
            case "N":
                this.displayScenen();
                break;
            default:
                System.out.println("\n***Invalid Selection*** Try again");
                break; 
                
        }
        return false;  
    
    }  

    private void displayScenea() {
        System.out.println("Work in progress.");
    }

   private void displaySceneb() {
        System.out.println("Work in progress.");
    }
   
    private void displayScenec() {
        System.out.println("Work in progress.");
    }
    
    private void displayScened() {
        System.out.println("Work in progress.");
    }
    
    private void displayScenee() {
        System.out.println("Work in progress.");
    }
    
    private void displayScenef() {
        System.out.println("Work in progress.");
    }
    
    private void displaySceneg() {
        System.out.println("Work in progress.");
    }
    
    private void displaySceneh() {
        System.out.println("Work in progress.");
    }
    
    private void displayScenei() {
        System.out.println("Work in progress.");
    }
    

    private void displayScenej() {
        System.out.println("Work in progress.");
    }
    
    private void displayScenek() {
        System.out.println("Work in progress.");
    }
    

    private void displayScenel() {
        System.out.println("Work in progress.");
    }
    
    private void displayScenem() {
        System.out.println("Work in progress.");
    }
    
    private void displayScenen() {
        System.out.println("Work in progress.");
    }
    
    private void waitForEnter() {
        
        boolean isValidEnter = false;

        Scanner keyboard = new Scanner(System.in);

        while (!isValidEnter){
            String input = keyboard.nextLine();
            
            //Name validation
            if(input.length() >0){
                System.out.println("Please press <ENTER>.");
            }
            else {
                isValidEnter = true;
            }
        }
    }

}
