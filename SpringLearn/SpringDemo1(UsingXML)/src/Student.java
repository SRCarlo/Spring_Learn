
public class Student {

	int sid;
	String sname;
	static int cnt;

	public Student() {
		sid = ++cnt;

	}

	public Student(String sname) {
		this.sid = ++cnt;
		this.sname = sname;
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

	public void display() {
		System.out.println("Student Id : " + sid + ".");
		System.out.println("Student Name : " + sname + ".");
	}

}
