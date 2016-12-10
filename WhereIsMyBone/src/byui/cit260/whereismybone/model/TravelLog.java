package byui.cit260.whereismybone.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Maxi Cutler
 * 
 * 12/10/16 Maxi: cleaned up unused coding, comments and proper format
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
