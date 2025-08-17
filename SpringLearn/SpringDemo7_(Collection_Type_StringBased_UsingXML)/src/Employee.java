import java.util.*;

public class Employee {
	int eid;
	String ename;
	List<String> Qualification;
	Set<String> Skillset;
	Map<String, String> idproof;

	public Employee() {
		super();
	}

	public Employee(int eid, String ename, List<String> qualification, Set<String> skillset,
			Map<String, String> idproof) {
		super();
		this.eid = eid;
		this.ename = ename;
		Qualification = qualification;
		Skillset = skillset;
		this.idproof = idproof;
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

	public List<String> getQualification() {
		return Qualification;
	}

	public void setQualification(List<String> qualification) {
		Qualification = qualification;
	}

	public Set<String> getSkillset() {
		return Skillset;
	}

	public void setSkillset(Set<String> skillset) {
		Skillset = skillset;
	}

	public Map<String, String> getIdproof() {
		return idproof;
	}

	public void setIdproof(Map<String, String> idproof) {
		this.idproof = idproof;
	}

	public void printData() {
		System.out.println("Employee Id:" + eid);
		System.out.println("Employee Name:" + ename);
		System.out.println("Employee Qualification:" + Qualification);
		System.out.println("Employee Skillset:" + Skillset);
		System.out.println("Employee idproof:" + idproof);
	}
}