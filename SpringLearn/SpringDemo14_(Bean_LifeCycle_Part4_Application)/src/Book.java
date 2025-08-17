import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Book implements InitializingBean, DisposableBean {
	String bname;

	public Book() {
		System.out.println("Book Object Created:Book Available In shop...! ");
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	@Override
	public String toString() {
		return "Book [bname=" + bname + "]";
	}

	public void display() {
		System.out.println("Book [bname=" + bname + "]");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Using Interface:Purches notebook to write notes");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy-Interface:Keep in Bag ");
	}

	public void initxml() {
		System.out.println("Using xml:Purches Pen from shop...!!!");
	}

	public void destroyxml() {
		System.out.println("destroy-xml:Close bag");
	}

	@PostConstruct
	public void initAnnotation() {
		System.out.println("init-UsingAnnotation:Purches book from shop...!!!");
	}

	@PreDestroy
	public void destroyAnnotation() {
		System.out.println("destroy-UsingAnnotation: Close book");
	}
}