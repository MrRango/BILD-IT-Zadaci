/*
 * (The Person, Student, Employee, Faculty, and Staff classes) Design a
 * class named Person and its two subclasses named Student and Employee.
 * Make Faculty and Staff subclasses of Employee. A person has a name,
 * address, phone number, and email address. A student has a class status (freshman,
 * sophomore, junior, or senior). Define the status as a constant. An employee has
 * an office, salary, and date hired. Use the MyDate class defined in Programming
 * Exercise 10.14 to create an object for date hired. A faculty member has office
 * hours and a rank. A staff member has a title. Override the toString method in
 * each class to display the class name and the person�s name.
 * Draw the UML diagram for the classes and implement them. Write a test program
 * that creates a Person, Student, Employee, Faculty, and Staff, and
 * invokes their toString() methods.
 */

package zadaci_17_08_2015;

public class Staff extends Employee{
	
	private String title;
	
	//no-arg konstruktor
	public Staff(){
		
	}
	//konstruktor sa argumentima
	public Staff(String name, String address, String phoneNumber, String emailAddress, int office, double sallary, String title) {
		super(name, address, phoneNumber, emailAddress, office, sallary);
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	/*
	 * (non-Javadoc)
	 * @see zadaci_17_08_2015.Employee#toString()
	 */
	public String toString(){
		return this.getClass() + " " + this.getName();
	}
}
