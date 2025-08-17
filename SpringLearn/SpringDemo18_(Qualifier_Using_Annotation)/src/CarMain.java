import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext abc = new AnnotationConfigApplicationContext(AppConfig.class);
		Bond bond = (Bond) abc.getBean("bond");
		bond.showCar();
	}
}
