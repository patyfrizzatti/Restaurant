import model.Customer;
import model.Table;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer("antonio", "12345789");

		
		System.out.println(c1.getName());
		System.out.println(c1.getPhone());
		
		
		c2.setName("Joseph");
		
		System.out.println(c2.getName());		
		System.out.println(c2.getPhone());

		System.out.println(c3.getName());		
		System.out.println(c3.getPhone());
		
		Table t1 = new Table(10);
		Table t2 = new Table(15);
		Table t3 = new Table(20);
		Table t4 = new Table(25);

		System.out.println(t1.isBooked());
		System.out.println(t1.getBookedBy());

	//	t1.book(c1); //here im booking the table 1 for the customer c1
		
		boolean result;
		result = t1.book(c1);
		System.out.println("the booking was " + result);
		
		
		System.out.println(t1.isBooked());
		System.out.println(t1.getBookedBy());

		result = t1.book(c2);
		System.out.println("the booking was " + result);
		
		
		System.out.println(t1.isBooked());
		System.out.println(t1.getBookedBy());
		
		t2.book(c3);
		
		//print status of the tables 
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
	}

}
