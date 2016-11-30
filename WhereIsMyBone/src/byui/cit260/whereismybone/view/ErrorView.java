/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.view;

import byui.cit260.whereismybone.view.View;
import java.io.PrintWriter;
import whereismybone.WhereIsMyBone;

/**
 *
 * @author ricte
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
