
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainTest1 {

	public static void main(String[] args) {
	
		Resource resource = new ClassPathResource("Spring.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Student std = (Student) factory.getBean("stud");
		std.display();
		Student std2 = (Student) factory.getBean("stud");
		std2.display();

	}

}
