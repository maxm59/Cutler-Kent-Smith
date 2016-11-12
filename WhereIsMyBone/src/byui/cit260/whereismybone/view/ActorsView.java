/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.view;
import byui.cit260.whereismybone.control.GameControl;
import java.util.Scanner;
import whereismybone.WhereIsMyBone;

/**
 *
 * @author Maxine Cutler
 */
public class ActorsView extends View {

    public ActorsView(){

       super(
                  "==================================================" +
                "\n               WHERE IS MY BONE?                  " +
                "\n             Description of Charactors            " +
                "\n==================================================" +
                "\n                .-.               .-.             " +
                "\n               (   `-._________.-'   )            " +
                "\n                >=     _______     =<             " +
                "\n               (   ,-'`       `'-,   )            " +
                "\n                `-'               `-'             " +
                "\n                                                  " + 
                "\n             Tommy        =  ParkLand             " + 
                "\n             Pete         =  K9 Precinct          " + 
                "\n             Dr Mice      =  Animal Care          " + 
                "\n             Mr Sam       =  Animal Selter        " + 
                "\n             Mr Jones     =  Jones Bakery         " + 
                "\n             Mr Steele    =  Steak Heaven         " + 
                "\n             Ms Coco      =  Tex Mix Drive Inn    " +  
                "\n             Ducks        =  ParkLand             " + 
                "\n             Miss Ellie   =  Senior Care          " +  
                "\n             The Smiths   =  Neighbor             " + 
                "\n             Ben & Nancy  =  Owners               " + 
                "\n             Mr Nono      =  ZooLand              " +            
                "\n             Mr Catch     =  Seafood Eatery       " +
                "\n             Animals      =  Zooland              " + 
                "\n             Brad         =  Trump School         " + 
                "\n             Mr Sneed     =  Trump School         " + 
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
            case "Tommy": 
                this.displayActora();
                break;
            case "Pete":
                this.displayActorb();
                break;
            case "Dr Mice":
                this.displayActorc();
                break;
            case "Mr Sam":
                this.displayActord();
                break; 
            case "Mr Jones":
                this.displayActore();
                break;
            case "Mr Steele": 
                this.displayActorf();
                break;
            case "Ms Coco":
                this.displayActorg();
                break;
            case "Ducks":
                this.displayActorh();
                break;
            case "Miss Ellie":
                this.displayActori();
                break; 
            case "The Smiths":
                this.displayActorj();
                break;
            case "Ben & Nancy": 
                this.displayActork();
                break;
            case "Mr NonoPete":
                this.displayActorl();
                break;
            case "Mr Catch":
                this.displayActorm();
                break;
            case "Animals":
                this.displayActorn();
                break; 
            case "Brad":
                this.displayActoro();
                break;
            case "Mr Sneed":
                this.displayActorp();
            default:
                System.out.println("\n***Invalid Selection*** Try again");
                break; 
                
        }
        return false;  
    
    }

    private void displayActora() {
        System.out.println("I am a 4 yrs old and love to play in the park with my mommy.");
    }

    private void displayActorb() {
        System.out.println("At K9 Precinct, I am Officer Pete. I train K9 units to be the best.");
    }

    private void displayActorc() {
        System.out.println("I love my job as the local veterinarian here at the local Animal Care Hospital.");
    }

    private void displayActord() {
        System.out.println("Do you know what happens to lost cats and dogs? You might checheck with me. I work at the Animal Shelter.");
    }

    private void displayActore() {
        System.out.println("The smell of fresh baked bread, donuts, and cakes. I am your local baker at a bakery called, Jones Bakery.");
    }

    private void displayActorf() {
        System.out.println("K9's everywhere love me. I love steaks! and own a resturant called, Steak Heaven. Join us for Prime Rib Night.");
    }

    private void displayActorg() {
        System.out.println("Are you in a hurry, but hungry? Tex Mix Drive Inn is the place to eat at my drive inn. See our everyday specials made fresh and fast.");
    }

    private void displayActorh() {
        System.out.println("Quaks, Quacks, I love gliding in the pond at ParkLand Park. I even see a little boy name, Tommy.");
    }

    private void displayActori() {
        System.out.println("I am a System Administrator at Senior Care Living. We provide elderly care with 24hrs nursing care and an in-house physician.");
    }

    private void displayActorj() {
        System.out.println("We are the Smiths and live in your neighborhood.");
    }

    private void displayActork() {
        System.out.println("Ben is a police officer at the K9 Precinct and Nancy is his wife. They are your handlers and owners. They take real good care of me.");
    }

    private void displayActorl() {
        System.out.println("ZooLand is a popular place to visit and as a K9 police dog, I am able to see all the animals that live there. Mr Nono is one of many service animal technician that works there.");
    }

    private void displayActorm() {
        System.out.println("Seafood Eatery the best in town, thats what most people tell me. I am the owner and Cat DeVil loves to visit my place daily.");
    }

    private void displayActorn() {
        System.out.println("Elephants, Giraffes, and Tigers. We live in our enclosed area at ZooLand. Mr Nono loves to take care of us, too.");
    }

    private void displayActoro() {
        System.out.println("I am 10 yrs old and attend Trump Elementry School. I love to see you when you make your weekly rounds here at the school.");
    }

    private void displayActorp() {
        System.out.println("I am a teacher at Trump Elementry School.");
    }

    private void waitForEnter() {
        
        boolean isValidEnter = false;

        Scanner keyboard = new Scanner(System.in);

        while (!isValidEnter){
            String input = keyboard.nextLine();
            
            //Name validation
            if(input.length() <= 0){
                isValidEnter = true;
            }
            else {
             System.out.println("Please press <ENTER>.");
            }
        }
    }
    
    
}
