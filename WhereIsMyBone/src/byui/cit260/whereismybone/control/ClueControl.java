package byui.cit260.whereismybone.control;


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