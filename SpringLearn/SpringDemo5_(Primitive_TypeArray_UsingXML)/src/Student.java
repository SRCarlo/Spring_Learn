public class Student {

	String sname[];

	public String[] getSname() {
		return sname;
	}

	public void setSname(String[] sname) {
		this.sname = sname;
	}

	public void display() {
		System.out.println("Student Names are : ");
		for (int i = 0; i < sname.length; i++) {
			System.out.println(" " + sname[i]);
		}
	}
}
