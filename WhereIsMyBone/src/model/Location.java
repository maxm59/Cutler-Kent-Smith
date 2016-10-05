/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author ricte
 */
public class Location implements Serializable{
    
    //class instance variables
    private Integer rowCount;
    private Integer columnCount;
    private String name;

    public Location(Integer rowCount, Integer columnCount, String name) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        this.name = name;
    }

    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    public void setColumnCount(Integer columnCount) {
        this.columnCount = columnCount;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Integer getRowCount() {
        return rowCount;
    }

      public Integer getColumnCount() {
        return columnCount;
    }

    public String getName() {
        return name;
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
