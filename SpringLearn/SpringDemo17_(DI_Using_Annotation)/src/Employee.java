import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {

	int eid;
	String ename;
	@Autowired
	private Address address;

	public Employee() {
		super();
		eid = 101;
		ename = "Naoe";
	}

	public Employee(int eid, String ename, Address address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.address = address;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "\neid : " + eid + "." + "\nEname:" + ename + "." + "\nAddress : " + address + ".";
	}

}
