package com.model;

public class Product {
	int pid;
	String pname;
	int qpty;

	public Product() {
		super();
	}

	public Product(int pid, String pname, int qpty) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.qpty = qpty;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getQpty() {
		return qpty;
	}

	public void setQpty(int qpty) {
		this.qpty = qpty;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", qpty=" + qpty + "]";
	}

}
