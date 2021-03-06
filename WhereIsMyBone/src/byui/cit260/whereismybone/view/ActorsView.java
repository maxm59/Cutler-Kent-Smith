package byui.cit260.whereismybone.view;

/**
 *
 * 12.1.16 by Maxi Cutler
 * for Week 12 Individual
 * 
 * 12/10/16 Maxi: cleaned up unused coding, comments and proper format
 * 
 */
public class ActorsView extends View {

    public ActorsView(){
       super(
              "==================================================" +
            "\n               WHERE IS MY BONE?                  " +
            "\n             Description of Actors                " +
            "\n==================================================" +
            "\n             .-.               .-.                " +
            "\n            (   `-._________.-'   )               " +
            "\n             >=     _______     =<                " +
            "\n            (   ,-'`       `'-,   )               " +
            "\n             `-'               `-'                " +
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
            "\n         S  =  Select option to printout          " +
            "\n               this List of Actor's               " + 
            "\n                                                  " +
            "\n        To begin, please enter your choice:       " +  
            "\n                                                  " +  
            "\n                   X   =  Exit                    " +
            "\n==================================================" +
            "\n     Find out who we are and Are we suspects?     " +
            "\n==================================================" );        
    }
    
    @Override
    public boolean doAction(String choice){   
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "A": 
                this.console.println("Tommy");
                this.console.println("I am 4yrs old and play at ParkLand with mommy.");
                break;
            case "B":
                this.console.println("Pete");
                this.console.println("I am Officer Pete, a K9 unit trainer.");
                break;
            case "C":
                this.console.println("Dr Mice");
                this.console.println("I love being the local veterinarian.");
                break;
            case "D":
                this.console.println("Mr Sam");
                this.console.println("I take of lost or unwanted animals.");
                break; 
            case "E":
                this.console.println("Mr Jones");
                this.console.println("As your baker, you love my bacon donuts.");
                break;
            case "F": 
                this.console.println("Mr Steele");
                this.console.println("I am the owner of this steak resturant.");
                break;
            case "G":
                this.console.println("Ms CoCo");           
                this.console.println("I am the owner of Tex Mix Drive Inn.");
                break;
            case "H":
                this.console.println("Ducks");
                this.console.println("I love gliding in the pond at ParkLand Park.");
                break;
            case "I":
                this.console.println("Miss Ellie");
                this.console.println("I am a System Admin. at Senior Care Living.");
                break; 
            case "J":
                this.console.println("The Smiths");
                this.console.println("We live in your neighborhood.");
                break;
            case "K":
                this.console.println("My Owners: Ben and Nancy");
                this.console.println("Ben is your K9 handler/officer. Nancy is his wife.");
                break;
            case "L":
                this.console.println("Mr Nono");
                this.console.println("I am a service animal technician.");
                break;
            case "M":
                this.console.println("Mr Catch");
                this.console.println("I am the owner of Seafood Eatery.");
                break;
            case "N":
                this.console.println("Zooland Animals");
                this.console.println("Elephants, Giraffes, and Tigers at ZooLand.");
                break; 
            case "O":
                this.console.println("Brad");
                this.console.println("I am 8 yrs old student at Trump Elementry.");
                break;
            case "P":
                this.console.println("Mr Sneed");
                this.console.println("I am a teacher at Trump Elementry School.");
                break;
            case "S":
                this.console.println("Select the P for Print to file.");
                this.displayPrintActorsListToText();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                    "\n***Invalid Selection*** Try again");
                break;   
        }
        return false;  
    }
    private void waitForEnter() { 
        boolean isValidEnter = false;
        String value = null;
        try{
            while (!isValidEnter){
                value = keyboard.readLine();
                if(value.length() >0){ //Name validation
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

    private void displayPrintActorsListToText() {
        PrintActorsToTextView printActorsToText = new PrintActorsToTextView();
        printActorsToText.display();
    }
}