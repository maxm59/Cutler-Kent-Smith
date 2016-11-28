/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.view;

import byui.cit260.whereismybone.view.View;

/**
 *
 * @author ricte
 */
public class ErrorView extends View{
    
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
        
        System.out.println(str);
                
    }

    @Override
    public boolean doAction(String value) {
        //Nothing to do, just return.
        return true;
    }
    
    
}
