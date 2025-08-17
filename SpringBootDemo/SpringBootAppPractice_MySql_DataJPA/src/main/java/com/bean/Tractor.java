package com.bean;

import jakarta.persistence.*;

@Entity
@Table(name = "TractorWorkShop")
public class Tractor {
	@Id
	@Column(name = "Tractor Id", length = 10)
	int tid;
	@Column(name = "Tractor Company Name", length = 30)
	String tname;
	@Column(name = "Tractor Model", length = 40)
	String tmname;
	@Column(name = "Tractor Color", length = 10)
	String tcolor;
	@Column(name = "Tractor Type", length = 10)
	String ttype;
	@Column(name = "Tyre Size", length = 10)
	int ttyre;

	public Tractor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tractor(int tid, String tname, String tmname, String tcolor, String ttype, int ttyre) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tmname = tmname;
		this.tcolor = tcolor;
		this.ttype = ttype;
		this.ttyre = ttyre;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTmname() {
		return tmname;
	}

	public void setTmname(String tmname) {
		this.tmname = tmname;
	}

	public String getTcolor() {
		return tcolor;
	}

	public void setTcolor(String tcolor) {
		this.tcolor = tcolor;
	}

	public String getTtype() {
		return ttype;
	}

	public void setTtype(String ttype) {
		this.ttype = ttype;
	}

	public int getTtyre() {
		return ttyre;
	}

	public void setTtyre(int ttyre) {
		this.ttyre = ttyre;
	}

	@Override
	public String toString() {
		return "Tractor [tid=" + tid + ", tname=" + tname + ", tmname=" + tmname + ", tcolor=" + tcolor + ", ttype="
				+ ttype + ", ttyre=" + ttyre + "]";
	}

}
