package Tsk29_2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) 
    {
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
    	Bank employerByName = (Bank) context.getBean("bankByName");
		System.out.println("Autowire ByName");
		System.out.println("Employer Name : "+employerByName.getBankName());
		System.out.println("City : "+employerByName.getAddress().getCity());
		System.out.println("State : "+employerByName.getAddress().getState());
		
		
		System.out.println("Autowire ByType");
		BankByType bankByType = (BankByType) context.getBean("bankByType");
		System.out.println("Employer Name : "+bankByType.getBankName());
		System.out.println("City : "+bankByType.getAddress().getCity());
		System.out.println("State : "+bankByType.getAddress().getState());
		
		
		System.out.println("Autowire usingConstructor");
		BankByConstructor bankByCustructor = (BankByConstructor) context.getBean("bankByConstructor");
		System.out.println("Employer Name : "+bankByCustructor.getBankName());
		System.out.println("City : "+bankByCustructor.getAddress().getCity());
		System.out.println("State : "+bankByCustructor.getAddress().getState());
		
		context.close();
    }
}