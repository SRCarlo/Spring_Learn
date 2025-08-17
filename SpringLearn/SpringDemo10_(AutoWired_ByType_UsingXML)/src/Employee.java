
public class Employee {
	int eid;
	String ename;
	int esal;
	HomeAddress haddr;
	OfficeAddress oaddr;
	TempAddress taddr;

	static int cnt;

	public Employee() {

		this.eid = ++cnt;
	}

	public Employee(String ename, int esal, HomeAddress haddr, OfficeAddress oaddr, TempAddress taddr) {
		super();
		this.ename = ename;
		this.esal = esal;
		this.haddr = haddr;
		this.oaddr = oaddr;
		this.taddr = taddr;
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

	public int getEsal() {
		return esal;
	}

	public void setEsal(int esal) {
		this.esal = esal;
	}

	public HomeAddress getHaddr() {
		return haddr;
	}

	public void setHaddr(HomeAddress haddr) {
		this.haddr = haddr;
	}

	public OfficeAddress getOaddr() {
		return oaddr;
	}

	public void setOaddr(OfficeAddress oaddr) {
		this.oaddr = oaddr;
	}

	public TempAddress getTaddr() {
		return taddr;
	}

	public void setTaddr(TempAddress taddr) {
		this.taddr = taddr;
	}

	public void Display() {
		System.out.println("--------Employee Details---------");
		System.out.println("Employee Id  : " + eid + ".");
		System.out.println("Employee Name : " + ename + ".");
		System.out.println("Employee Salary is : " + esal + ".");
		System.out.println("-------Employee Addresses--------");
		System.out.println("Employee Home Address : " + haddr);
		System.out.println("Employee Office Address : " + oaddr);
		System.out.println("Employee Temp Address : " + taddr);

	}
}
