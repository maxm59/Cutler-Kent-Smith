/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.model;

//
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Smith-Rick
 */
public class Map implements Serializable{
        
    //class instance variables
    private int rowCount;
    private int columnCount;
    private Location[][] locations;
    
    //composition 'has-a' relationship... to the Locations class
    private ArrayList <Location> location;
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
                location.setColumnCount(columnCount);
                location.setRowCount(rowCount);
                location.setVisited(false);

                //Assign the Location object to the current position in array
                locations[row][column] = location;                
            }            
        }        
    }

    public ArrayList<Location> getLocation() {
        return location;
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
    
//    public Boolean getVisited() {
//        return visited;
//    }
//
//    public void setVisited(Boolean visited) {
//        this.visited = visited;
//    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.rowCount);
        hash = 11 * hash + Objects.hashCode(this.columnCount);
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + 
                columnCount + '}';
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
        if (!Objects.equals(this.rowCount, other.rowCount)) {
            return false;
        }
        if (!Objects.equals(this.columnCount, other.columnCount)) {
            return false;
        }
        return true;
    }

    public Location[][] getLocations() {
            System.out.println("Called Location[][]");
            return this.locations;
    }

    public void setCurrentLocation(Location location) {
            System.out.println("Called setCurrentLocation.");
    }

    public Object getCurrentLocation() {
        return location;
    }

    public void setCurrentRow(int row) {
            System.out.println("Called LsetCirremtRow");
            this.currentRow = row;
    }

    public void setCurrentColumn(int column) {
            System.out.println("Called LsetCirremtColumn");
            this.currentColumn = column;
    }

    
    
}
