/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Smith-Rick
 * 
 */
public class Map implements Serializable{
        
    //class instance variables
    private Location[][] locations;
    private Location currentLocation;
    
    //composition 'has-a' relationship... to the Locations class
    //private ArrayList <Location> location;
    public int noOfRows = 5;
    public int noOfColumns = 5;
    
    private int currentRow = 0;
    private int currentColumn = 0;
    
//    private Boolean visited;    
    
//    public Map() {
//        location = new Location[noOfRows][noOfColumns];
//    }
    
    //Default Constructor
    public Map(){
    }
    
    //Overload
    public Map(int noOfRows, int noOfColumns){
        locations = new Location[noOfRows][noOfColumns];
        if (noOfRows < 0 || noOfColumns < 0){
            System.out.println("The number of rows and columns must be > zero");
            return;
        }
        
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        //create 2-D array for Location objects;
        this.locations = new Location[noOfRows][noOfColumns];
        
        for (int row = 0; row < noOfRows; row++){
            for (int column = 0; column < noOfColumns; column++){
                //create and initialize new Location object instance
                Location location = new Location();
                location.setColumnCount(column);
                location.setRow(row);
                location.setVisited(true);

                //Assign the Location object to the current position in array
                locations[row][column] = location;                
            }            
        }
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public int getNoOfRows() {
        return noOfRows;
    }

    public void setNoOfRows(int noOfRows) {
        this.noOfRows = noOfRows;
    }

    public int getNoOfColumns() {
        return noOfColumns;
    }

    public void setNoOfColumns(int noOfColumns) {
        this.noOfColumns = noOfColumns;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public int getCurrentColumn() {
        return currentColumn;
    }

    public void setCurrentColumn(int currentColumn) {
        this.currentColumn = currentColumn;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Arrays.deepHashCode(this.locations);
        hash = 29 * hash + this.noOfRows;
        hash = 29 * hash + this.noOfColumns;
        hash = 29 * hash + this.currentRow;
        hash = 29 * hash + this.currentColumn;
        hash = 29 * hash + Objects.hashCode(this.currentLocation);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        } 
        else {
        }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Map other = (Map) obj;
            if (this.noOfRows != other.noOfRows) {
                return false;
            }
            if (this.noOfColumns != other.noOfColumns) {
                return false;
            }
            if (this.currentRow != other.currentRow) {
                return false;
            }
            if (this.currentColumn != other.currentColumn) {
                return false;
            }
            if (!Arrays.deepEquals(this.locations, other.locations)) {
                return false;
        }
        return Objects.equals(this.currentLocation, other.currentLocation);
    }

    @Override
    public String toString() {
        return "Map{" + "locations=" + locations + ", noOfRows=" + noOfRows + ", noOfColumns=" + noOfColumns + ", currentRow=" + currentRow + ", currentColumn=" + currentColumn + ", currentLocation=" + currentLocation + '}';
    
//        String strMap = "Where Is My bone Map\r\n,1,2,3,4,5\r\n";
//        for (int row = 0; row < noOfRows; row++) {
//            strMap += Integer.toString(row + 1) + ",";
//            for (int col = 0; col < noOfColumns; col++) {                
//                
//                strMap += location[row][col].getSceneType() + ",";
//            }
//            strMap += "\r\n";
//        }
//        return strMap;       
    
    }

//    private void init() {
//        System.out.println("Map init() called");
//    }    
}
