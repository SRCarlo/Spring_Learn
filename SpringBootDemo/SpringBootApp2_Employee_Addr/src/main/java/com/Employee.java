package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {
	int eid;
	String ename;
	int esal;
	@Autowired
	Address addr;

	public Employee() {
		eid = 101;
		ename = "Tom";
		esal = 290900;
	}

	public Employee(int eid, String ename, int esal, Address addr) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.addr = addr;
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

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "\n\nEmployee Details :\neid:" + eid + "\nename:" + ename + "\nsal:" + esal + addr + ".";
	}

}
