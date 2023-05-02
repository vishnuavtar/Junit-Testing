package date29_4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
    
    	Password passObj = context.getBean(Password.class);
		System.out.println("Password : " + passObj.getPassword());
    
		context.close(); // predestroy will get called when the bean instance is getting removed from context
    }
}