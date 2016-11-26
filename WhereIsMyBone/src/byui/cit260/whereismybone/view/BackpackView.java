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
                "\n                                                  " +
                "\n                 A  =  Bone                       " +
                "\n                 B  =  Badge                      " +
                "\n                 C  =  Bacon                      " +
                "\n                 D  =  Bell                       " +
                "\n                 E  =  Box                        " +
                "\n                 F  =  CatColar                   " +
                "\n                 G  =  CatHair                    " +
                "\n                 H  =  FishBones                  " +
                "\n                 I  =  Pipe                       " +
                "\n                                                  " +
                "\n                X  =  Exit Game                   " +
                "\n                                                  " +
                "\n              Please make a selection:            " +
                "\n                                                  ");     
    }

@Override

    public boolean doAction(String value) {
        
        char charSel = value.toUpperCase().charAt(0);
        
        switch (charSel) {
            case 'A':
                System.out.println("Steak Bone you just got and is gone!");
                break;
            case 'B':
                System.out.println("Ben puts on your official K9 badge on.");
                break;
            case 'C':
                System.out.println("Bacon is Cat DiVil's favorit snack.");
                break;
            case 'D':
                System.out.println("Its Cat DeVils Bell. She lost it here.");
                break;
            case 'E':
                System.out.println("Lets keep the box for evidence. She was here.");
                break;
            case 'F':
                System.out.println("Cat DeVil's red cat colar. Lets keep this.");
                break;
            case 'G':
                System.out.println("Cat DeVil's Hair. Need that for evidence.");
                break;
            case 'H':
                System.out.println("Fishbones. Her favorite too");
                break;                
            case 'I':
                System.out.println("Found the pipe, put this in the backpack");
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
