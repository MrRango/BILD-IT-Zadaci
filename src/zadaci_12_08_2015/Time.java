/*
 * (The Time class) Design a class named Time. The class contains:
 * - The data fields hour, minute, and second that represent a time.
 * - A no-arg constructor that creates a Time object for the current time. (The
 * values of the data fields will represent the current time.)
 * - A constructor that constructs a Time object with a specified elapsed time
 * since midnight, January 1, 1970, in milliseconds. (The values of the data
 * fields will represent this time.)
 * - A constructor that constructs a Time object with the specified hour, minute, and second.
 * - Three getter methods for the data fields hour, minute, and second, respectively.
 * - A method named setTime(long elapseTime) that sets a new time
 * for the object using the elapsed time. For example, if the elapsed time is
 * 555550000 milliseconds, the hour is 10, the minute is 19, and the second is 10.
 * Draw the UML diagram for the class and then implement the class. Write
 * a test program that creates two Time objects (using new Time() and new
 * Time(555550000)) and displays their hour, minute, and second in the format hour:minute:second.
 * (Hint: The first two constructors will extract the hour, minute, and second
 * from the elapsed time. For the no-arg constructor, the current time can be
 * obtained using System.currentTimeMillis(), as shown in Listing 2.7,
 * ShowCurrentTime.java.)
 */

package zadaci_12_08_2015;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Time {
	
	private int hour = 0;
	private int minute = 0;
	private int second = 0;
	
	//no-arg konstruktor, vraca trenutno vrijeme
	public Time() {
		Calendar calendar = new GregorianCalendar();
		this.hour = calendar.get(Calendar.HOUR_OF_DAY);
		this.minute = calendar.get(Calendar.MINUTE);
		this.second = calendar.get(Calendar.SECOND);
	}

	//konstruktor koji postavlja novo vrijeme pomocu unosa proteklih milisekundi od ponoci, januara 1, 1970
	public Time(long elapsedTime) {
		this.setTime(elapsedTime);
	}

	//konstruktor koji prima konkretne sate, minute sekunde
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	/*
	 * metoda koja setuje vrijeme
	 */
	public void setTime(long elapsedTime) {
		//pretvaranje milisekundi u sekunde
		int ukupnoSekundi = (int) elapsedTime / 1000;
		//odvajanje ostatka sekundi
		this.second = ukupnoSekundi % 60;		
		//pretvaranje sekundi u minute
		int ukupnoMinuta = ukupnoSekundi / 60;
		//odvajanje ostatka minuta
		this.minute = ukupnoMinuta % 60;
		//pretvaranje minuta u sate
		this.hour = (ukupnoMinuta / 60) % 24;
	}
}
