

import java.util.*;
import javax.persistence.*;

@Entity
public class Assignment {

    @Id
    @GeneratedValue
    private int id;
    private Date assignDate; 
    private double totalHours; 
    private double averageHours;   

    public Assignment() {
    }

    public Assignment(Date assignDate, double totalHours, double averageHours) {
        this.assignDate = assignDate;
        this.totalHours = totalHours;
        this.averageHours = averageHours;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getAssignDate() {
        return assignDate;
    }

    public void setAssignDate(Date assignDate) {
        this.assignDate = assignDate;
    }

    public double getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(double totalHours) {
        this.totalHours = totalHours;
    }

    public double getAverageHours() {
        return averageHours;
    }

    public void setAverageHours(double averageHours) {
        this.averageHours = averageHours;
    }

    @Override
    public String toString() {
        return "Assignment [id:" + id + ", assignDate:" + assignDate + ", totalHours:" + totalHours 
                + ", averageHours:" + averageHours + "]";
    }
}