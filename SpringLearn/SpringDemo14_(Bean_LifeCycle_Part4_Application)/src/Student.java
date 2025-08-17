public class Student {
	String sname;
	Book book;

	public Student() {
		super();
		System.out.println("Student Object is Created...!");
	}

	public Student(String sname, Book book) {
		super();
		this.sname = sname;
		this.book = book;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		System.out.println("SetterInjection:Book Object set in Student Object");
		this.book = book;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + ", book=" + book + "]";
	}

	public void display() {
		System.out.println("Studnet Display Method is called:Read Book:" + book.getBname());
	}

}