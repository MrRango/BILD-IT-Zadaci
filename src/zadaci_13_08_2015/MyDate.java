/*
 * (The MyDate class) Design a class named MyDate. The class contains:
 * - The data fields year, month, and day that represent a date. month is
 * 0-based, i.e., 0 is for January.
 * - A no-arg constructor that creates a MyDate object for the current date.
 * - A constructor that constructs a MyDate object with a specified elapsed time
 * since midnight, January 1, 1970, in milliseconds.
 * - A constructor that constructs a MyDate object with the specified year, month, and day.
 * - Three getter methods for the data fields year, month, and day, respectively.
 * - A method named setDate(long elapsedTime) that sets a new date for
 * the object using the elapsed time.
 * Draw the UML diagram for the class and then implement the class. Write a
 * test program that creates two MyDate objects (using new MyDate() and new
 * MyDate(34355555133101L)) and displays their year, month, and day.
 * (Hint: The first two constructors will extract the year, month, and day from
 * he elapsed time. For example, if the elapsed time is 561555550000 milliseconds,
 * the year is 1987, the month is 9, and the day is 18. You may use the
 * GregorianCalendar class discussed in Programming Exercise 9.5 to simplify
 * coding.)
 */

package zadaci_13_08_2015;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
	
	private int year;
	private int month;
	private int day;
	
	//no-arg konstruktor kreira danasnji datum
	MyDate() {
		Calendar calendar = new GregorianCalendar();
		this.year = calendar.get(Calendar.YEAR);
		this.month = calendar.get(Calendar.MONTH) + 1;
		this.day = calendar.get(Calendar.DAY_OF_MONTH);
	}
	//konstruktor koji kreira datum na osnovu proteklih milisekundi od 1.1.1970.
	MyDate(long elapsedTime) {
		this.setElapsedTime(elapsedTime);
	}
	//konstruktor koji kreira datum sa konkretnim danom, mjesecom i godinom
	MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}
	
	/*
	 * metoda koja racuna datum na osnovu proteklih milisekundi od 1.1.1970.
	 */
	public void setElapsedTime(long elapsedTime) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTimeInMillis(elapsedTime);
		this.year = calendar.get(Calendar.YEAR);
		this.month = calendar.get(Calendar.MONTH);
		this.day = calendar.get(Calendar.DAY_OF_MONTH);
	}

}
