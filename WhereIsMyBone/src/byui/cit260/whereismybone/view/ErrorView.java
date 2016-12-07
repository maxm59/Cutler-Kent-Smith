package byui.cit260.whereismybone.view;

import java.io.PrintWriter;
import whereismybone.WhereIsMyBone;

/**
 *
 * @author ricte
 * Team Assignment for Week 12
 * 
 */
public class ErrorView extends View{
    
    private static final PrintWriter errorFile = WhereIsMyBone.getOutFile();
    private static final PrintWriter logFile = WhereIsMyBone.getLogFile();
    
    //Constructor
    public ErrorView(){
        super("");
    }
    
    //overload
    public static void display(String className, String errorMsg){
        
        String str = 
                "\n==================================================" +
                "\n ERROR - " + className + " - " + errorMsg +
                "\n==================================================" ;
        
        errorFile.println(str);
        
        //log error
        logFile.println(className + " - " + errorMsg);
                
    }

    @Override
    public boolean doAction(String value) {
        //Nothing to do, just return.
        return true;
    }
    
    
}
