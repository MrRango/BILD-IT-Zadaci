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

public class Student extends Person {

	private final static String[] STATUSES = { "freshman", "sophomore", "junior", "senior" };
	private String status = STATUSES[0];
	
	//no-arg konstruktor
	public Student() {

	}
	//konstruktor sa argumentima
	public Student(String name, String address, String phoneNumber, String emailAddress, int status) {
		super(name, address, phoneNumber, emailAddress);
		this.status = STATUSES[status];
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	/*
	 * (non-Javadoc)
	 * @see zadaci_17_08_2015.Person#toString()
	 */
	public String toString() {
		return this.getClass() + " " + super.getName();
	}

}
