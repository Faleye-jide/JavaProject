import java.util.Scanner;

public class Main {
		
		public static void main(String[] args) {
			// create an instance of the class
//			Parent parent = new Parent(null, null, 0);
			// assign a firstname that override the one declared in the constructor
//			parent.firstName = "Abiodun";
			
			// declare a child object
			Child child = new Child("Jide", "Faleye", 28, "Data Scientist");
//			System.out.print(child.getFullName());
//			System.out.println();
//			System.out.println(child.getOccupation("Data Scientist"));
			// invoke the age setter method 
			child.setAge(29);
			int age = child.getAge();
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("The threshold age for an adult is: ");
			int minimumAge = scanner.nextInt();
			if(minimumAge > 18) {
				System.out.print("The threshold adult age cannot be greater than 18");
			}
			else if (minimumAge < 18) {
				System.out.print("The age is below teenager's age");
			} 
			else {
				if(age > 18) {
					System.out.print("You are an adult");
				}
				else {
					System.out.print("You are not an adult");
				}
			}
		}
}

	
