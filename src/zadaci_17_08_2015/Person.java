/*
 * (The Person, Student, Employee, Faculty, and Staff classes) Design a
 * class named Person and its two subclasses named Student and Employee.
 * Make Faculty and Staff subclasses of Employee. A person has a name,
 * address, phone number, and email address. A student has a class status (freshman,
 * sophomore, junior, or senior). Define the status as a constant. An employee has
 * an office, salary, and date hired. Use the MyDate class defined in Programming
 * Exercise 10.14 to create an object for date hired. A faculty member has office
 * hours and a rank. A staff member has a title. Override the toString method in
 * each class to display the class name and the person’s name.
 * Draw the UML diagram for the classes and implement them. Write a test program
 * that creates a Person, Student, Employee, Faculty, and Staff, and
 * invokes their toString() methods.
 */


package zadaci_17_08_2015;

public class Person {
	
	private String name;
	private String address;
	private String phoneNumber;
	private String emailAddress;
	
	//no-arg konstruktor
	public Person(){
	}
	//konstruktor sa argumentima
	public Person(String name, String address, String phoneNumber, String emailAddress) {
		super();
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.address = address;
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return this.getClass()+ " " + this.name;
	}

}
