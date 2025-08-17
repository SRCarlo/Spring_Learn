import org.springframework.stereotype.Component;

@Component("Mustang")
public class Mustang implements Car {
	public void getCarName() {
		System.out.println("You Own Brand New Mustang.................");
	}

}