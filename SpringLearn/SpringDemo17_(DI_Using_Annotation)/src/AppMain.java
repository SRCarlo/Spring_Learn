import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee emp = (Employee) ac.getBean("employee");

		System.out.println("Employee Details : " + emp);
	}

}
