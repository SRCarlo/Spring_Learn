import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) {

		ApplicationContext appct = new ClassPathXmlApplicationContext("Spring.xml");
		Employee e = (Employee) appct.getBean("emp");
		e.display();
	}

}
