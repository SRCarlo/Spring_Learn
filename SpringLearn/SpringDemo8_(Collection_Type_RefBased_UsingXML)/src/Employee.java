import java.util.*;

public class Employee {
	int eid;
	String ename;
	List<PersonalCard> pc;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, List<PersonalCard> pc) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.pc = pc;
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

	public List<PersonalCard> getPc() {
		return pc;
	}

	public void setPc(List<PersonalCard> pc) {
		this.pc = pc;
	}

	public void printData() {
		System.out.println("Employee Id : " + eid);
		System.out.println("Employee Name : " + ename);
		System.out.println("Personal Card : " + pc);
	}

}
