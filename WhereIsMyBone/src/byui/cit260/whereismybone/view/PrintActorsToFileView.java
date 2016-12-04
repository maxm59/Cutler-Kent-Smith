package byui.cit260.whereismybone.view;

import java.io.FileWriter;
import java.io.IOException;
import whereismybone.WhereIsMyBone;

/**
 *
 * @author Maxine Cutler
 * 
 */
public class PrintActorsToFileView extends View{
    
    public PrintActorsToFileView(){
        super("\nWhere would you like to save the printed map file?");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        try{
            this.PrintActorsToFile(value);
            return true;
        }catch (Exception ex){
            ErrorView.display(this.getClass().getName(), "Error writing to file.\r"
                    + ex.getMessage());   
        }
        return false;
    }
//    private void saveActorsDescription() {
//        FileWriter outFile = null;
//        String fileLocation = "Actor's Description.txt";
//        try{
//            
//        }
    private void PrintActorsToFile(String fileLocation) throws IOException {

        try(FileWriter outputStream = new FileWriter(fileLocation)) {  //printout list of Actors and description as a text file in file explorer
            
            String stringActor;
            stringActor = (String) WhereIsMyBone.getCurrentGame().getActor();
            
            outputStream.write(stringActor);
            
            this.console.println("Actors name and description was successfully written to the file.");
            
        }catch (Exception ex){
            
            ErrorView.display(this.getClass().getName(), "There was an error printing"
                    + "the file: " + ex.getMessage());
        }
    }   
}
