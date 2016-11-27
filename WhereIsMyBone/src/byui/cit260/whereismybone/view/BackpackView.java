/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.view;


/**
 *
 * @author Maxine Cutler
 * create list of items for the
 * backpack
 * 
 */
public class BackpackView extends View {
    
        public BackpackView(){
        super(
                  "==================================================" +
                "\n               WHERE IS MY BONE?                  " +
                "\n                   GAME MENU                      " +
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
                System.out.println("Steak Bone you just got it! And it's Gone!");
                break;
            case 'B':
                System.out.println("Ben puts your official K9 badge on.");
                break;
            case 'C':
                System.out.println("Bacon, Cat DiVil's favorit snack, too! Keep this.");
                break;
            case 'D':
                System.out.println("Its Cat DeVils Bell. She lost it here. Keep this.");
                break;
            case 'E':
                System.out.println("Lets keep the box for evidence. She was in it.");
                break;
            case 'F':
                System.out.println("Cat DeVil's red cat colar. Major evidence to keep.");
                break;
            case 'G':
                System.out.println("Cat DeVil's Hair. Need that for evidence.");
                break;
            case 'H':
                System.out.println("Fishbones! She was here! Need this for evidence!");
                break;                
            case 'I':
                System.out.println("Found the pipe! It smells like Cat DeVil napped here.");
                break;   
            case 'J':
                System.out.println("Yuk,Cat Hairballs. She spits out all over the place!!");
                break; 
                
            case 'X':
                System.out.println("Exit the Game Menu");
                return true;
            default:
                System.out.println("Invalid option");
                break;
        }
        return false;
    }
}
