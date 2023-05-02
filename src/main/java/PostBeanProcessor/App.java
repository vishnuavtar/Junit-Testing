package PostBeanProcessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		Movie m = context.getBean(Movie.class);

		System.out.println("New Employer : "+m.getName());
		
		context.close();
	
	}
}
