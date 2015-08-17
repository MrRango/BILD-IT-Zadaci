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

public class Zadatak2 {

	public static void main(String[] args) {
		
		//pravljenje objekata person
		Person person = new Person("Goran Arsenic", "Kakmuz Bare", "065458159", "goranarsenic@gmail.com");
		System.out.println(person.toString());
		//pravljenje objekata student
		Person person1 = new Student("Pero Peric", "Kakmuz Bare", "065455416", "peroperic@gmail.com", 2);
		System.out.println(person1.toString());
		//pravljenje objekata employee
		Person person2 = new Employee("Simo Simic", "Kakmuz Bare", "065258452", "simosimic@gmail.com", 23, 5000);
		System.out.println(person2.toString());
		//pravljenje objekata faculty
		Person person3 = new Faculty("Marko Markovic", "Kakmuz Bare", "065987524", "markomarkovic@gmail.com", 4, 5800, 40, "Nastavnilk");
		System.out.println(person3.toString());
		//pravljenje objekata staff
		Person person4 = new Staff("Stevo Stevic", "Kakmuz Bare", "065657524", "stevostevic@gmail.com", 13, 800, "Portir");
		System.out.println(person4.toString());
	}

}
