
import java.util.*;
import javax.persistence.*;

	@Entity
	public class Chemist {

	    @Id
	    private String ssn;
	    private String name;
	    private String phoneNo;
	    private int age;
	    private String address;

	    public Chemist() {
	    }

	    public Chemist(String ssn, String name, String phoneNo, int age, String address) {
	        this.ssn = ssn;
	        this.name = name;
	        this.phoneNo = phoneNo;
	        this.age = age;
	        this.address = address;
	    }

	    public String getSsn() {
	        return ssn;
	    }

	    public void setSsn(String ssn) {
	        this.ssn = ssn;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getPhoneNo() {
	        return phoneNo;
	    }

	    public void setPhoneNo(String phoneNo) {
	        this.phoneNo = phoneNo;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    @Override
	    public String toString() {
	        return "Chemist [SSN:" + ssn + ", Name:" + name + ", Phone No:" + phoneNo + ", Age:" + age + ", Address:" + address + "]";
	    }
	}
