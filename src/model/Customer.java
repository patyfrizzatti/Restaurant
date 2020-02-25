package model;

public class Customer {
	
	private String name;
	private String phone;
	
	public Customer() { //esse eh um constructor default 
		System.out.println("This is a new customer");
		this.name = "amilcar";
		this.phone = "14521454";
	}
	
	public Customer(String name, String number) { //esse eh um constructor with 2 parameters
		this.name = name;
		this.phone = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String toString() {
		return "this is the customer " + name;
	}
	
}
