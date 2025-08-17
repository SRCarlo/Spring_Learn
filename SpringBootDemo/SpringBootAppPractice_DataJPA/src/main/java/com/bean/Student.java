package com.bean;

import jakarta.persistence.*;

@Entity
@Table(name = "Students")
public class Student {
	@Id
	@Column(name = "Student Id", length = 3)
	int sid;
	@Column(name = "Student Name", length = 20)
	String sname;
	@Column(name = "Percentage", length = 7)
	double percentage;
	@Column(name = "Class", length = 20)
	int std;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname, double percentage, int std) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.percentage = percentage;
		this.std = std;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	@Override
	public String toString() {
		return "Student Details \nSid:" + sid + "\nSname:" + sname + "\nPercentage:" + percentage + "\nStd:" + std
				+ ".";
	}

}
