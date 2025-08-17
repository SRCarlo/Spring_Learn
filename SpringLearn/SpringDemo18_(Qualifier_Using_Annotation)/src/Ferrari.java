import org.springframework.stereotype.Component;

@Component("Ferrari")
public class Ferrari implements Car {
	public void getCarName() {
		System.out.println("You Own Brand New Ferrari.................");
	}

}
