import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("Spring.xml");
		Employee e = (Employee) ac.getBean("emp");
		e.Display();
	}

}
