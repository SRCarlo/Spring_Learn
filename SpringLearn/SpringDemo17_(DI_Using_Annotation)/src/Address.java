
import org.springframework.stereotype.Component;

@Component
public class Address {
	String Street;
	String city;

	public Address() {
		Street = "Santra Market";
		city = "Nagpur";

	}

	public Address(String street, String city) {
		super();
		Street = street;
		this.city = city;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "\nStreet :" + Street + "." + "\nCity : " + city + ".";
	}

}
