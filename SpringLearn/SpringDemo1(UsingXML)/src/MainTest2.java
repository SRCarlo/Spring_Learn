import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest2 {

	public static void main(String[] args) {
		ApplicationContext appc = new ClassPathXmlApplicationContext("Spring.xml");
		Student std = (Student) appc.getBean("stud");
		std.display();

	}

}
