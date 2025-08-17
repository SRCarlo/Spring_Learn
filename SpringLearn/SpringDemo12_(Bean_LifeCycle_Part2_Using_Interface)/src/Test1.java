import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Shop shobj = (Shop) ac.getBean("shbean");
		shobj.greetCustomer();
		((AbstractApplicationContext) ac).registerShutdownHook();
	}
}