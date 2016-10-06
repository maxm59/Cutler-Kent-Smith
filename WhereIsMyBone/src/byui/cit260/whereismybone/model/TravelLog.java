/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.whereismybone.model;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Maxine Cutler
 */
public class TravelLog implements Serializable {
    
    private String locationHistoryDetails;

    public TravelLog() {
    }

    public String getLocationHistoryDetails() {
        return locationHistoryDetails;
    }

    public void setLocationHistoryDetails(String locationHistoryDetails) {
        this.locationHistoryDetails = locationHistoryDetails;
    }

    @Override
    public String toString() {
        return "TravelLog{" + "locationHistoryDetails=" + locationHistoryDetails + '}';
    }

    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.locationHistoryDetails);
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
        final TravelLog other = (TravelLog) obj;
        if (!Objects.equals(this.locationHistoryDetails, other.locationHistoryDetails)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
