import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee emp = (Employee) ac.getBean("employee");
		Student stud = (Student) ac.getBean("student");
		System.out.println(emp);
		System.out.println("----------------------------------------------------");
		System.out.println(stud);
	}

}
