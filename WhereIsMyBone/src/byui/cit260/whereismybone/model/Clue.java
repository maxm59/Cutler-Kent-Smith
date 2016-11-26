/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.model;
import java.awt.Point;
import java.io.Serializable;
/**
 *
 * @author Brian Kent
 */
public enum Clue implements Serializable {
    
    Clue1("Cat paw prints are near your bowl. Your bone is missing."),
    Clue2("The birds chirped. They saw nothing."),
    clue3("Cat fur ball");
    
    //private String name;
    private final String description;
    private final Point coordinates;
    
    Clue(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }


    public String getDiscription() {
        return description;
    }

    public Point getCoorddinates(){
        return coordinates;
    }

//    @Override
//    public String toString() {
//        return "Actor{" + "name=" + name + ", discription=" + description + '}';
//    }

    
}
