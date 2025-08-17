import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// For
		
		/*
		 * String files[] = new String[] { "hdd.xml", "computer.xml" };
		 * ApplicationContext ac = new ClassPathXmlApplicationContext(files); 
		 * Computer c = (Computer) ac.getBean("cp"); c.printData();
		 */

//		.........................................OR.............(for Context InnerBeanApproach)

		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContextInnerBeanApproach.xml");

		Computer c = (Computer) ac.getBean("cp");
		c.printData();
	}

}
