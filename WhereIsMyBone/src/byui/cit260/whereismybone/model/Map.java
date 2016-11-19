/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.model;

//
import java.io.Serializable;
import java.util.ArrayList;
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
    
    //composition 'has-a' relationship... to the Locations class
//    private ArrayList <Location> location;
    private int noOfRows;
    private int noOfColumns;
    
    private int currentRow = 0;
    private int currentColumn = 0;
    private Location currentLocation;
    
//    private Boolean visited;

    public Map() {
        //List Array of Location Objects
//        
//        
//        ArrayList<Location> location = new ArrayList<>();
//        location.add( new Location(1,1,"Park") );
//        location.add( new Location(1,2,"Bakery") );
//        location.add( new Location(1,3,"Care Home") );
//        location.add( new Location(1,4,"Zoo") );
//        location.add( new Location(1,5,"School Enterance") );
//        location.add( new Location(2,1,"Vacant House") );
//        location.add( new Location(2,2,"Restaurant") );
//        location.add( new Location(2,3,"Neighbor's House") );
//        location.add( new Location(2,4,"Fishmonger") );
//        location.add( new Location(2,5,"School Cafeteria") );
//        location.add( new Location(3,1,"Police Department") );
//        location.add( new Location(3,2,"Drive Inn") );
//        location.add( new Location(3,3,"Your House") );
//        location.add( new Location(3,4,"Zoo - Elephants") );
//        location.add( new Location(3,5,"School Playground") );
//        location.add( new Location(4,1,"Animal Hospital") );
//        location.add( new Location(4,2,"Lake") );
//        location.add( new Location(4,3,"Cat Devil's House") );
//        location.add( new Location(4,4,"Zoo - Kangaroos") );
//        location.add( new Location(4,5,"School Parking Lot") );
//        location.add( new Location(5,1,"Pound") );
//        location.add( new Location(5,2,"Cat Alley") );
//        location.add( new Location(5,3,"Grocery Store") );
//        location.add( new Location(5,4,"Zoo - Giraffes") );
//        location.add( new Location(5,5,"Zoo - Tigers") );
        
        //Test Location related items
        //Loop through each location object in the array.
//        for(Location loc: location){
//            System.out.println(loc);
//        }
        
    }
    
    public Map(int noOfRows, int noOfColumns){
        if (noOfRows < 1 || noOfColumns < 1){
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
                location.setRowCount(row);
                location.setVisited(false);

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
        if (!Objects.equals(this.currentLocation, other.currentLocation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "locations=" + locations + ", noOfRows=" + noOfRows + ", noOfColumns=" + noOfColumns + ", currentRow=" + currentRow + ", currentColumn=" + currentColumn + ", currentLocation=" + currentLocation + '}';
    }
}
