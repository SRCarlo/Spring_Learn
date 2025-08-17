import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class AppConfig {

	@Bean(name = "employee")
	public Employee getEmployee() {
		return new Employee();
	}

	@Bean(name = "student")
	public Student getStudent() {
		return new Student();
	}

}
