import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	int sid;
	String sname;

	public Student() {
		super();
		sid = 101;
		sname = "Cyber";

	}

	public Student(int sid, String sname) {
		super();
		this.sid = sid;
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

	@Override
	public String toString() {
		return "Student Details : \nid: " + sid + "\nsname : " + sname + ".";
	}

}
