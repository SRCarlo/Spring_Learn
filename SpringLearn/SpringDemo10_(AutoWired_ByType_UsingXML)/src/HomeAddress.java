
public class HomeAddress {
	String city;
	String state;

	public HomeAddress() {
		super();
	}

	public HomeAddress(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "\ncity : " + city + "\nstate  :" + state + ".";
	}

}
