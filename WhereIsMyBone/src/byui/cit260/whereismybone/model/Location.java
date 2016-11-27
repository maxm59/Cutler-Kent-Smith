/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.model;

import byui.cit260.whereismybone.enums.SceneType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Smith-Rick
 * 
 */
public class Location implements Serializable{
    
    //class instance variables
    private int rowCount;
    private int columnCount;
    private int row;
    private int col;
    private boolean visited;
    private Scene scene;
    private ArrayList<Actor> actors;
    private SceneType sceneType;
    private String name;
    
    public Location() {
        //Default Setting
        //sceneType = SceneType.Home; 
        this.visited = false;
        
    }
    
    public Location(Integer rowCount, Integer columnCount, String name) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        this.name = name;
        this.visited = false;
        
    }
    
    
    public Integer getRowCount() {
        return rowCount;
    }
    
    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

  public Integer getColumnCount() {
        return columnCount;
    }
      
    public void setColumnCount(Integer columnCount) {
        this.columnCount = columnCount;
    }
    
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
        this.name = scene.getName(); //used for debugging
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }
    
    public SceneType getSceneType() {
        return sceneType;
    }

    public void setSceneType(SceneType sceneType) {
        this.sceneType = sceneType;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.rowCount);
        hash = 59 * hash + Objects.hashCode(this.columnCount);
        hash = 59 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "rowCount=" + rowCount + ", columnCount=" + 
                columnCount + ", name=" + name + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.rowCount, other.rowCount)) {
            return false;
        }
        if (!Objects.equals(this.columnCount, other.columnCount)) {
            return false;
        }
        return true;
    }
    
    
}
