package byui.cit260.whereismybone.view;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * 12.1.16 by Maxi Cutler
 * for Week 12 Individual due 12/3/16
 * 
 * 12/10/16 Maxi: cleaned up unused coding, comments and proper format
 * 
 */
public class PrintActorsToTextView extends View {

    public PrintActorsToTextView(){
       super(
              "==================================================" +
            "\n               WHERE IS MY BONE?                  " +
            "\n            Printout List of Actors               " +
            "\n==================================================" +
            "\n             .-.               .-.                " +
            "\n            (   `-._________.-'   )               " +
            "\n             >=     _______     =<                " +
            "\n            (   ,-'`       `'-,   )               " +
            "\n             `-'               `-'                " +
            "\n                                                  " +  
            "\n      P  =  Printout the List of Actor's          " +
            "\n            name and description to your          " +
            "\n            text file.                            " +  
            "\n                                                  " +
            "\n          Open text file and printout or          " +  
            "\n                   X   =  Exit                    " +
            "\n==================================================" +
            "\n     Find out who we are and Are we suspects?     " +
            "\n==================================================" );        
    }
    
    @Override
    public boolean doAction(String choice){   
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "P":
                this.console.println("Saved file located in File Exployer.");
                this.displayPrintActorsToTextView();
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
    
    private void displayPrintActorsToTextView() {
        FileWriter outFile = null;
        String fileLocation = "Actors List.txt";
        try{
            outFile = new FileWriter(fileLocation);

            outFile.write("\nTommy          I am 4 years old and play at ParkLand with Mommy.\r");
            outFile.write("\nPete           I am Officer Pete, a K9 unit trainer.\r");
            outFile.write("\nDr. Mice       I love being a local veterinarian.\r");
            outFile.write("\nMr. Sam        I take in lost or unwanted animals.\r");
            outFile.write("\nMr. Jones      As your baker, you love my bacon donuts.\r");
            outFile.write("\nMr. Steele     I am the owner of this steak resturant.\r");
            outFile.write("\nMs. CoCo       I am the owner of Tex Mix Drive Inn.\r");
            outFile.write("\nDucks          I love gliding in the pond at the ParkLand Park.\r");
            outFile.write("\nMiss Ellie     I am a System Administrator at Senior Care Living.\r");
            outFile.write("\nThe Smiths     We live in your neighborhood.\r");
            outFile.write("\nBen & Nancy    Ben is my K9 handler and a vetran police officer. He raised\r");
            outFile.write("\n               from a puppy, trained me, and I became top K9 officer in the\r");
            outFile.write("\n               nation. Nancy is his wife and have been married for a long time.\r");
            outFile.write("\nMr. Nono       I am a service animal technician.\r");
            outFile.write("\nMr. Catch      I am the owner of Seafood Eatery.\r");
            outFile.write("\nElephants      There are 3 of us living at the Zoo.\r");
            outFile.write("\nGiraffes       We are the tallest animals in the zoo.\r");
            outFile.write("\nTigers         We are top of the food chain. Beware when hanging out with us.\r");
            outFile.write("\nBrad           I am 8 years old and a student at Trump Elementry.\r");
            outFile.write("\nMr. Sneed      I am a teacher at Trump Elementary School.\r");
            outFile.write("\nCat DeVil      I am a notorius white persian cat with emeral green eyes.\r");
            outFile.write("\n               I am a ghostly figured cat who is the leader of the gang.\r");
            outFile.write("\nScarface       A gang member with a scare across his blue eyes.\r");
            outFile.write("\nFelix          I am a round overfed, overwieght, ball of fuzz.\r");
            outFile.write("\nToby           Your average tom cat.\r");
            outFile.write("\nRex            You know what a T-Rex is? I am the muscule in the group.\r");
            outFile.write("\nRats           We live in the vacant house and do our best to out run\r");
            outFile.write("\n               Cat DeVil and her gang. We are your allies.\r");
            
            outFile.flush();
        }
        catch (IOException ex){
            this.console.println("Error: List of Actors;" + ex.getMessage());  
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