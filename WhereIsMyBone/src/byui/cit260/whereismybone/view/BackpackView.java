package byui.cit260.whereismybone.view;

import java.io.IOException;

/**
 *
 * @author Maxine Cutler
 * create list of items for the
 * backpack
 * 
 * 12/10/16 Maxi: cleaned up unused coding, comments and proper format
 * 
 */
public class BackpackView extends View {
    
        public BackpackView(){
        super(
                  "==================================================" +
                "\n               WHERE IS MY BONE?                  " +
                "\n      Pickup these clues for your backpack        " +
                "\n==================================================" +
                "\n             .-.               .-.                " +
                "\n            (   `-._________.-'   )               " +
                "\n             >=     _______     =<                " +
                "\n            (   ,-'`       `'-,   )               " +
                "\n             `-'               `-'                " +                         
                "\n                 A  =  Bone                       " +
                "\n                 B  =  Badge                      " +
                "\n                 C  =  Bacon                      " +
                "\n                 D  =  Bell                       " +
                "\n                 E  =  Box                        " +
                "\n                 F  =  CatColar                   " +
                "\n                 G  =  CatHair                    " +
                "\n                 H  =  FishBones                  " +
                "\n                 I  =  Pipe                       " +
                "\n                 J  =  Cat Hairballs              " +         
                "\n                                                  " +
                "\n                X  =  Exit Game                   " +
                "\n                                                  " +
                "\n              Please make a selection:            " +
                "\n==================================================" );     
    }
        
@Override

    public boolean doAction(String value) {
        
        char charSel = value.toUpperCase().charAt(0);
        
        switch (charSel) {
            case 'A':
                this.console.println("Steak Bone you just got it! And it's Gone!");
                break;
            case 'B':
                this.console.println("Ben puts your official K9 badge on.");
                break;
            case 'C':
                this.console.println("Bacon, Cat DiVil's favorit snack, too! Keep this.");
                break;
            case 'D':
                this.console.println("Its Cat DeVils Bell. She lost it here. Keep this.");
                break;
            case 'E':
                this.console.println("Lets keep the box for evidence. She was in it.");
                break;
            case 'F':
                this.console.println("Cat DeVil's red cat colar. Major evidence to keep.");
                break;
            case 'G':
                this.console.println("Cat DeVil's Hair. Need that for evidence.");
                break;
            case 'H':
                this.console.println("Fishbones! She was here! Need this for evidence!");
                break;                
            case 'I':
                this.console.println("Found the pipe! It smells like Cat DeVil napped here.");
                break;   
            case 'J':
                this.console.println("Yuk,Cat Hairballs. She spits out all over the place!!");
                break; 
            case 'X':
                this.console.println("Exit the Game Menu");
                return true;
            default:
                this.console.println("Invalid option");
                break;               
        }        
        this.waitForEnter(); 
        return false;
    }

    private void waitForEnter(){        
        this.console.println("Please press <ENTER> to continue.");
        boolean isValidEnter = false;
        String input = null;
        try{
            while (!isValidEnter){
                input = this.keyboard.readLine();
                if(input.length() >= 0){
                    isValidEnter = true;
                }
                else{
                 this.console.println("Please press <ENTER> to continue.");
                }
                break;
            }            
        }
        catch(IOException ex){            
            ErrorView.display(this.getClass().getName(), 
                    "Error waiting for enter.");                          
        }
    }
}
