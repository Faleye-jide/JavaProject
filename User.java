import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User {
	
	String firstName;
	String lastName;
	int age;
	
//	public User(String fn, String ln, int myAge) {
//		this.firstName = fn;
//		this.lastName = ln;
//		this.age = myAge;
//	}
	
	public String getFirstName() {
		
		// TODO Auto-generated constructor stub
		return firstName;
		
	}
	public void setFirstName(String name) {
		this.firstName = name;
	}
	
	public String getFullName() {
		return "My first name is " + this.firstName + " and my last name is " + this.lastName;
	}
	
	public static void main(String[] args) {
		User user1 = new User();
		user1.firstName = "Jide";
		user1.lastName = "Faleye";
		
		// second user
		User user2 = new User();
		user2.firstName = "Alex";
		user2.lastName = "Faleye";
		
//
		List<User>users = new ArrayList<User>();
		users.add(user1);
		users.add(user2);
//		
//		// print out users full names
		String fullname = user1.getFullName();
		System.out.print(fullname);
		
		
		
	}
	
	
}
