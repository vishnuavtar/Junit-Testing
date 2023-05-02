package date29_4;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Password {
	
	private String password;
	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@PostConstruct
	private void init() {
		System.out.println("Password : Verifying Resources Post Construction");
		this.password="tempPassword";
	}

	@PreDestroy
	private void shutdown() {
		System.out.println("Password : Shutdown All Resources Pre Destroying");
		this.password=null;
		System.out.println("Password in shut down:"+this.password);
		
	}

}