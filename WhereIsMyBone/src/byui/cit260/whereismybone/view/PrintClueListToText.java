package byui.cit260.whereismybone.view;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * 12.3.16 by Maxine Cutler
 * 
* 12/10/16 Maxi: cleaned up unused coding, comments and proper format
 * 
 */
public class PrintClueListToText extends View {

    public PrintClueListToText(){
        super(
              "==================================================" +
            "\n               WHERE IS MY BONE?                  " +
            "\n        Need to printout list? Do this.           " +
            "\n==================================================" +
            "\n             .-.               .-.                " +
            "\n            (   `-._________.-'   )               " +
            "\n             >=     _______     =<                " +
            "\n            (   ,-'`       `'-,   )               " +
            "\n             `-'               `-'                " +
            "\n      P  =  Printout Clue List to text file       " + 
            "\n                     and or                       " +
            "\n          Open text file and printout             " +  
            "\n                                                  " +  
            "\n                  X   =  Exit                     " +
            "\n==================================================" +
            "\n           Cat DeVil left lots of clues.          " +
            "\n   Lets see if you can remember all 14 of them    " +
            "\n==================================================" );
    }    

    @Override
    public boolean doAction(String choice){   
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "P":
                this.console.println("Saved file located in your file explorer.");
                this.saveClueListToText();
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
    
    private void saveClueListToText() {
        FileWriter outFile = null;
        String fileLocation = "Clue List.txt";
        try{
            //create and open a new file stream for the output file
            outFile = new FileWriter(fileLocation);

            //write each actor's description to the file plus a new line charactor
            outFile.write("\nClue 1     Cat paw prints are near your bowl. Your bone is missing.\r");
            outFile.write("\nClue 2     The paw prints around the area.\r");
            outFile.write("\nClue 3     Cat fur ball.\r");
            outFile.write("\nClue 4     Cat DeVil's favorite snack.\r");
            outFile.write("\nClue 5     A cat colar bell.\r");
            outFile.write("\nClue 6     A box at the zoo.\r");
            outFile.write("\nClue 7     Humm empty cages, I can smell the cat gang was here.\r");
            outFile.write("\nClue 8     A red cat colar. The he tag where the cat's name should be is all scratched out.\r");
            outFile.write("\nClue 9     A pipe at the zoo.\r");
            outFile.write("\nClue 10    Lots of cats at the pond.\r");
            outFile.write("\nClue 11    Cat Devil's eaten fishbones. Has her smell on it.\r");
            outFile.write("\nClue 12    Your treat during your morning break.\r");
            outFile.write("\nClue 13    You are very thirsty, you lap-up some water.\r");
            outFile.write("\nClue 14    A hiding place for the bone.\r");
            
            outFile.flush(); // flush pushes it to the harddrive
        }
        catch (IOException ex){
            this.console.println("Error: List of Clues;" + ex.getMessage());  
        }
        finally {
            if (outFile !=null) {
                try {
                    outFile.close();
                
                } catch (IOException ex){
                    this.console.println("Error closing;" + ex.getMessage());
                }
            }
        }
    }
        
}
