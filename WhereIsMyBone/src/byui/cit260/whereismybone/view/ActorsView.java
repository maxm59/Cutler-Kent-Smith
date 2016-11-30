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
 * 
 */
public class ActorsView extends View {

    public ActorsView(){

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
            "\n             A  =  Tommy, ParkLand                " + 
            "\n             B  =  Pete, K9 Precinct              " + 
            "\n             C  =  Dr. Mice, Animal Care          " + 
            "\n             D  =  Mr Sam, Animal Shelter         " + 
            "\n             E  =  Mr Jones, Jones Bakery         " + 
            "\n             F  =  Mr Steele, Steak Heaven        " + 
            "\n             G  =  Ms CoCo, Tex Mix Drive Inn     " +  
            "\n             H  =  Ducks, ParkLand                " + 
            "\n             I  =  Miss Ellie, Senior Care        " +  
            "\n             J  =  The Smiths, Neighbor           " + 
            "\n             K  =  Ben & Nancy,Owners             " + 
            "\n             L  =  Mr Nono, ZooLand               " +            
            "\n             M  =  Mr Catch, Seafood Eatery       " +
            "\n             N  =  Animals, Zooland               " + 
            "\n             O  =  Brad, Trump School             " + 
            "\n             P  =  Mr Sneed, Trump School         " + 
            "\n                                                  " +
            "\n      To begin, please enter your choice:         " +  
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
                this.displayActora();
                break;
            case "B":
                this.displayActorb();
                break;
            case "C":
                this.displayActorc();
                break;
            case "D":
                this.displayActord();
                break; 
            case "E":
                this.displayActore();
                break;
            case "F": 
                this.displayActorf();
                break;
            case "G":
                this.displayActorg();
                break;
            case "H":
                this.displayActorh();
                break;
            case "I":
                this.displayActori();
                break; 
            case "J":
                this.displayActorj();
                break;
            case "K": 
                this.displayActork();
                break;
            case "L":
                this.displayActorl();
                break;
            case "M":
                this.displayActorm();
                break;
            case "N":
                this.displayActorn();
                break; 
            case "O":
                this.displayActoro();
                break;
            case "P":
                this.displayActorp();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n***Invalid Selection*** Try again");
                break; 
                
        }
        return false;  
    
    }

    private void displayActora() {
        this.console.println("I am 4yrs old and play at ParkLand with mommy.");
    }

    private void displayActorb() {
        this.console.println("I am Officer Pete, a K9 unit trainer.");
    }

    private void displayActorc() {
        this.console.println("I love being the local veterinarian.");
    }

    private void displayActord() {
        this.console.println("I take of lost or unwanted animals.");
    }

    private void displayActore() {
        this.console.println("As your baker, you love my bacon donuts.");
    }

    private void displayActorf() {
        this.console.println("I am the owner of this steak resturant.");
    }

    private void displayActorg() {
        this.console.println("I am the owner of Tex Mix Drive Inn.");
    }

    private void displayActorh() {
        this.console.println("I love gliding in the pond at ParkLand Park.");
    }

    private void displayActori() {
        this.console.println("I am a System Admin. at Senior Care Living.");
    }

    private void displayActorj() {
        this.console.println("We live in your neighborhood.");
    }

    private void displayActork() {
        this.console.println("Ben is your K9 handler/officer. Nancy is his wife.");
    }

    private void displayActorl() {
        this.console.println("I am a service animal technician.");
    }

    private void displayActorm() {
        this.console.println("I am the owner of Seafood Eatery.");
    }

    private void displayActorn() {
        this.console.println("Elephants, Giraffes, and Tigers at ZooLand.");
    }

    private void displayActoro() {
        this.console.println("I am 8 yrs old student at Trump Elementry.");
    }

    private void displayActorp() {
        this.console.println("I am a teacher at Trump Elementry School.");
    }

    private void waitForEnter() {
        
        boolean isValidEnter = false;
        String value = null;

        try{
            while (!isValidEnter){
                value = keyboard.readLine();

                //Name validation
                if(value.length() >0){
                    ErrorView.display(this.getClass().getName(),
                            "Please press <ENTER>.");
                }
                else {
                    isValidEnter = true;
                }
                break;
            }   
        }
        catch(Exception ex){
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + ex.getMessage());
        }

    }
}
