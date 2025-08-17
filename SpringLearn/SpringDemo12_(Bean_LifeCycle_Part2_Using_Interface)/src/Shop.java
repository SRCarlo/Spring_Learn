import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Shop implements InitializingBean, DisposableBean {
	public Shop() {
		System.out.println("Shop Bean Created..!!");
	}

	public void greetCustomer() {
		System.out.println("Welcome ! to Shop...!");
	}

	@Override
	public void destroy() {
		System.out.println("Shop: destroy method call...!");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean:afterPropertiesSet() method call..! ");
	}
}// end class