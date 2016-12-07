/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.view;

/**
 *
 * @author Smith-Rick
 */
public class PrintMenuView extends View{
    
    public PrintMenuView(){
        super(
                  "==================================================" +
                "\n                WHERE IS MY BONE?                 " +
                "\n                   PRINT MENU                     " +
                "\n==================================================" +                      
                "\n                                                  " +
                "\n         C   =  Clue List Print to File           " + 
                "\n         M   =  Print Map to File                 " +                      
                "\n                                                  " + 
                "\n         X   =  Exit Menu                         " +
                "\n                                                  " +
                "\n         Please make a selection:                 " +
                "\n                                                  "); 
    }

    @Override
    public boolean doAction(String value) {
        char charSel = value.toUpperCase().charAt(0);
   
        switch (charSel) { 
            case 'C':
                this.console.println("Select Optiong P to save list to text file.");
                this.showPrintClueListToText();
                break;
             case 'M':  //Print Map to File
                this.printMapToFileView();
                break;
            case 'X':
                return true;
            default:
                this.console.println("Invalid option");
                break;
        }
        return false;
    }
    
    private void showPrintClueListToText() {
        PrintClueListToText clueListView = new PrintClueListToText();
        clueListView.display();
    }
    
    private void printMapToFileView() {
        
        PrintMapToFileView pm = new PrintMapToFileView();   

        try{
            
            pm.display();

        }catch (Exception ex)
        {
            ErrorView.display(this.getClass().getName(), "Error: Problem with print"
                    + "map to file view.");
        }

    }    
        
    
}
