/* I implemented some of the principles of Object Oreinted Programming (OOP).
1. Inheritance
2. Polymorphism - Method Overloading and Overriding

*/

class Parent {
	
	// class attributes (fields)
	String firstName;
	String lastName;
	int age;
	String myOccupation;
	
	// constructor - that initialize objects
	public Parent(String fn, String ln, int myAge, String occupation) {
		this.firstName = fn;
		this.lastName = ln;
		this.age = myAge;
		this.myOccupation = occupation;
	}
	
	public String fullName() {
		return "my parent's full  name is " + this.firstName + this.lastName;
	
	}

	// method to retrieve the full name 
	public String getFullName() {
		return fullName();
	}
	
	// getter method for age
	public int getAge() {
		return this.age;
	}
	
	// setter method for age
	public void setAge(int age) {
		this.age = age;
	}
}
// child class inheriting properties of parent class
class Child extends Parent{

	public Child(String fn, String ln, int myAge, String occupation) {
		super(fn, ln, myAge, occupation);
		// TODO Auto-generated constructor stub
	}
	
	// implementing method overriding 
	@Override
	public String fullName() {
		return "my full name is " + this.firstName + " " + this.lastName;
	}
	
	@Override
	public String getFullName() {
		return fullName();
	}
	
	public String getOccupation() {
		return "My name is " + this.firstName + " and I am a Data Scientist";
	}
	
	public String getOccupation(String occupation) {
		if(this.myOccupation.equals(occupation)) {
			return "Yes, you are a " + this.myOccupation;
		}
		else {
			return "You are not correct";
		}
	}
	
	public int getChildAge() {
		return getAge();
	}
}
	

	