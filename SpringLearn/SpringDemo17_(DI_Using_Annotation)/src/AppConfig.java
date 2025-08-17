import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class AppConfig {
	@Bean(name = "employee")
	public Employee EmployeeConfig() {
		return new Employee();

	}

	@Bean
	public Address AddressConfig() {
		return new Address();

	}

}
