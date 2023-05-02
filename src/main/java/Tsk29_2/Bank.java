package Tsk29_2;

import org.springframework.beans.factory.annotation.Autowired;

public class Bank {
	
	private String bankName;
	
	@Autowired
	private Address address;
	
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