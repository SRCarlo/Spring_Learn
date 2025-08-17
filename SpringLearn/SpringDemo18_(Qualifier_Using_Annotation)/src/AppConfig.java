import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class AppConfig {
	@Bean(name = "Ferrari")
	public Ferrari FerrariConfig() {
		return new Ferrari();
	}

	@Bean(name = "Mustang")
	public Mustang MustangConfig() {
		return new Mustang();
	}

	@Bean(name = "bond")
	public Bond BondConfig() {
		return new Bond();

	}

}
