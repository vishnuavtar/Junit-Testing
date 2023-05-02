package Taskk29;


import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) throws BeansException {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		Movie m = (Movie)context.getBean(Movie.class);

		System.out.println("New Movie : "+m.getName());
		
		context.close();
	
	}
}
