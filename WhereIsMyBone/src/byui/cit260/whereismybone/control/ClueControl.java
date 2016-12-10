package byui.cit260.whereismybone.control;

import byui.cit260.whereismybone.exception.ClueControlException;
import byui.cit260.whereismybone.model.Clue;
import byui.cit260.whereismybone.view.ErrorView;
import java.util.List;
import whereismybone.WhereIsMyBone;


/**
 *
 * @author Brian Kent-work in progress
 * 
 * 11/27/16 Maxi: added more code
 * still working out test matric for this class
 * 
 * 
 */
public class ClueControl {

    public ClueControl() {
        
    }
    
    public void AddClueToInvnetory(Clue c) throws ClueControlException{
        
        if(c == null)
            throw new ClueControlException();
        
        try{
            List<Clue> cList = WhereIsMyBone.getCurrentGame().getClueList();
            
            cList.add(c);
            
            int i = cList.indexOf(c) + 1;
            //System.out.println("Debug index " + i);
                        
            WhereIsMyBone.getCurrentGame().setClueList(cList);
        }
        catch(Exception ex){
            ErrorView.display(this.getClass().getName(), "Error adding clue to "
                + "Clue List: " + ex.getMessage());
            
            throw new ClueControlException();
        }
    }
    
    /// Everything below this seems like it belongs in the Clue.java class
    public static void Clue(String description){
        
    }

  
    
    private static class clue {

        private static boolean clueListType;
        private String name;
        private String description;

        public clue() {

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return "ClueControl{" + "name=" + name + ", description=" + description + '}';
        }
        
    } 
    
}

// CODE BELOW TO USE LATER
//            ClueLog input = new ClueLog();
//            input.setClueLog(); 