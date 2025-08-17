
public class Employee {
	int eid;
	String ename;
	int esal;
	Address oaddr;
	Address haddr;
	Address taddr;
	static int cnt;

	public Employee() {
		eid = ++cnt;
	}

	public Employee(String ename, int esal, Address oaddr, Address haddr, Address taddr) {
		this.ename = ename;
		this.esal = esal;
		this.oaddr = oaddr;
		this.haddr = haddr;
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

	public Address getOaddr() {
		return oaddr;
	}

	public void setOaddr(Address oaddr) {
		this.oaddr = oaddr;
	}

	public Address getHaddr() {
		return haddr;
	}

	public void setHaddr(Address haddr) {
		this.haddr = haddr;
	}

	public Address getTaddr() {
		return taddr;
	}

	public void setTaddr(Address taddr) {
		this.taddr = taddr;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", oaddr=" + oaddr + ", haddr=" + haddr
				+ ", taddr=" + taddr + "]";
	}

}
