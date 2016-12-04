package byui.cit260.whereismybone.view;

import java.io.FileWriter;
import java.io.IOException;
import whereismybone.WhereIsMyBone;

/**
 *
 * @author ricte
 * 
 */
public class PrintMapToFileView extends View{
    
    
    public PrintMapToFileView(){
        super("\nWhere would you like to save the printed map file?");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        try{
            
            this.PrintMapToFile(value);
            
            return true;
            
        }catch (Exception ex){
            
            ErrorView.display(this.getClass().getName(), "Error writing to file. " + ex.getMessage());
            
        }

        return false;
    
    }

    private void PrintMapToFile(String filePath) throws IOException {
        
        FileWriter outputStream = null;

        //Print the map to the file specified
        try{
            outputStream = new FileWriter(filePath);
            
            String strMap = WhereIsMyBone.getCurrentGame().getMap().getMapString();
            
            outputStream.write(strMap);
            
            this.console.println("The map was successfully written to the file.");

        }catch (Exception ex){
            
            ErrorView.display(this.getClass().getName(), "There was an error writting"
                    + "the file: " + ex.getMessage());

        }
        finally{
            //Close our streams
            if(outputStream != null)
                outputStream.close();
        
        }
    
    }
    
}
