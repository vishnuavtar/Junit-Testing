package PostBeanProcessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean
	public MovieBeanPostProcessor MovieBeanPostProcessor() {
		return new MovieBeanPostProcessor();
	}

	@Bean
	public Movie Movie() {
		return new Movie(1, "EncodeIT");
	}
}
