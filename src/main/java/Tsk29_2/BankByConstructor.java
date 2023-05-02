package Tsk29_2;

import org.springframework.beans.factory.annotation.Autowired;

public class BankByConstructor {
	
	private String bankName;
	private Address address;
	
	@Autowired
	public BankByConstructor(String bankName, Address address) {
		super();
		this.bankName = bankName;
		this.address = address;
	}
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}