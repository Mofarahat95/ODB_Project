
import java.util.*;
import javax.persistence.*;


 @Entity
public class Equipment {

    @Id
    private String  serialNo;
    private double cost;     
    private String type;     
    private boolean isAvailable;
    
    public Equipment() {
    }

    public Equipment(String serialNo, double cost, String type, boolean isAvailable) {
        this.serialNo = serialNo;
        this.cost = cost;
        this.type = type;
        this.isAvailable = isAvailable;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public boolean getisAvailable() {
        return isAvailable;
    }

    
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "Equipment [Serial No:" + serialNo + ", Cost:" + cost + ", Type:" + type + "]";
    }
}



