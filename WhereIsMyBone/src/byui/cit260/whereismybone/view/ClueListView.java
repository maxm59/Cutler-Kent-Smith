package byui.cit260.whereismybone.view;

/**
 *
 * 12.3.16 by Maxine Cutler
 * 
 */
public class ClueListView extends View {

    public ClueListView(){
        
        super(
              "==================================================" +
            "\n               WHERE IS MY BONE?                  " +
            "\n                 List of Clues                    " +
            "\n==================================================" +
            "\n             .-.               .-.                " +
            "\n            (   `-._________.-'   )               " +
            "\n             >=     _______     =<                " +
            "\n            (   ,-'`       `'-,   )               " +
            "\n             `-'               `-'                " +
            "\n                 A  =  Clue 1                     " + 
            "\n                 B  =  Clue 2                     " + 
            "\n                 C  =  Clue 3                     " + 
            "\n                 D  =  Clue 4                     " + 
            "\n                 E  =  Clue 5                     " + 
            "\n                 F  =  Clue 6                     " + 
            "\n                 G  =  Clue 7                     " + 
            "\n                 H  =  Clue 8                     " +   
            "\n                 I  =  Clue 9                     " + 
            "\n                 J  =  Clue 10                    " + 
            "\n                 K  =  Clue 11                    " + 
            "\n                 L  =  Clue 12                    " +  
            "\n                 M  =  Clue 13                    " + 
            "\n                 N  =  Clue 14                    " +  
            "\n                                                  " +
            "\n         P  =  Printout Clue List to text file    " + 
            "\n                                                  " +
            "\n        To begin, please enter your choice:       " +  
            "\n                                                  " +  
            "\n                   X   =  Exit                    " +
            "\n==================================================" +
            "\n           Cat DeVil left lots of clues.          " +
            "\n     Lets see if you can find all 14 of them      " +
            "\n==================================================" );
    }    

    @Override
    public boolean doAction(String choice){   
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "A": 
                this.console.println("Clue 1");
                this.console.println("Cat paw prints are near your bowl. Your bone is missing.");
                break;
            case "B":
                this.console.println("Clue 2");
                this.console.println("The paw prints around the area.");
                break;
            case "C":
                this.console.println("Clue 3");
                this.console.println("Cat fur ball");
                break;
            case "D":
                this.console.println("Clue 4");
                this.console.println("Cat DeVil's favorite snack.");
                break; 
            case "E":
                this.console.println("Clue 5");
                this.console.println("A cat colar bell.");
                break;
            case "F": 
                this.console.println("Clue 6");
                this.console.println("A box found at the zoo.");
                break;
            case "G":
                this.console.println("Clue 7");           
                this.console.println("Uh? Empty cages. You can smell the cat gang was here.");
                break;
            case "H":
                this.console.println("Clue 8");
                this.console.println("A red cat colar. The name on the tag is worn out.");
                break;
            case "I":
                this.console.println("Clue 9");
                this.console.println("A pipe at the zoo.");
                break; 
            case "J":
                this.console.println("Clue 10");
                this.console.println("Lots of cats at the pond.");
                break;
            case "K":
                this.console.println("Clue 11");
                this.console.println("Fishbones, Cat DeVil's leftovers, still fresh.");
                break;
            case "L":
                this.console.println("Clue 12");
                this.console.println("A treat? Found during your morning break.");
                break;
            case "M":
                this.console.println("Clue 13");
                this.console.println("Detective work makes you thirsty.");
                break;
            case "N":
                this.console.println("Clue 14");
                this.console.println("A hiding place for the bone.");
                break; 
            case "P":
                this.displayPrintClueListToText();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                    "\n***Invalid Selection*** Try again");
                break;   
        }
        this.waitForEnter();
        return false;  
    }
    
    private void waitForEnter() { 
        
        this.console.println("Please press <ENTER> to continue.");
        boolean isValidEnter = false;
        String value = null;
        try{
            while (!isValidEnter){
                value = keyboard.readLine();
                if(value.length() >0){ //Name validation
                    ErrorView.display(this.getClass().getName(),
                            "Please press <ENTER> to continue.");
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

    private void displayPrintClueListToText() {
        PrintClueListToText clueListView = new PrintClueListToText();
        clueListView.display();
    }
}
