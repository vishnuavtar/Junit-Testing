
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import PostBeanProcessor.EmployerBeanPostProcessor;

@Configuration
public class Config {
	@Bean
	public EmployerBeanPostProcessor employerBeanPostProcessor() {
		return new EmployerBeanPostProcessor();
	}

	@Bean
	public Movie employer() {
		return new Movie(1, "EncodeIT");
	}
}
