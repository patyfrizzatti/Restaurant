package model;
public class Table {

	private int tableNumber;
	private int capacity;
	private boolean booked;
	private Customer bookedBy;
	
	public Table(int tableNumber) { //default constructor 
		this.tableNumber = tableNumber;
		this.capacity = 4;
		this.booked = false; //by default the table is not booked
		this.bookedBy = null; //by default the customer is not defined
	}

	public int getTableNumber() {
		return tableNumber;
	}

//	public void setTableNumber(int tableNumber) {
//		this.tableNumber = tableNumber;
//	}
// we dont want to the table number be changed so we wont need this setter 
	//the setter is just changing the value of the variable
	
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public boolean isBooked() { //is because is a bolean but is the same as get idea
		return booked;
	}

//	public void setBooked(boolean booked) {
//		this.booked = booked;
//	}

	public Customer getBookedBy() {
		return bookedBy;
	}

//	public void setBookedBy(Customer bookedBy) {
//		this.bookedBy = bookedBy;
//	}
	
	public boolean book(Customer customer) {
		if (booked) {
			return false;
		}
		else {
			this.booked = true;
			this.bookedBy = customer;
			return true;
		}
	}
	
	public String toString() { //method
		String toReturn = "this is table number " + tableNumber + " for " + capacity + " people "; //string
		
		if (booked) {
			toReturn += "the table is booked by " + bookedBy;
		}
		
		return toReturn;
		
	//	return "this is table number " + tableNumber + " for " + capacity + " people ";
	}
}
