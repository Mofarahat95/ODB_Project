
import java.util.*;
import javax.persistence.*;

   @Entity
  public class Project {

    @Id
    @GeneratedValue
    
    private int id; 
    private String PName;
   
    private Date Start_Date;

    public Project() {
    }

    public Project(String PName, Date Start_Date) {
        this.PName = PName;
        this.Start_Date = Start_Date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPName() {
        return PName;
    }

    public void setPName(String PName) {
        this.PName = PName;
    }

    public Date getStart_Date() {
        return Start_Date;
    }

    public void setStart_Date(Date Start_Date) {
        this.Start_Date = Start_Date;
    }

    @Override
    public String toString() {
        return "Project [id:" + id + ", PName:" + PName + ", Start_Date:" + Start_Date + "]";
    }
}


	