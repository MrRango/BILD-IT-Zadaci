/*
 * (Stopwatch) Design a class named StopWatch. The class contains:
 * - Private data fields startTime and endTime with getter methods.
 * - A no-arg constructor that initializes startTime with the current time.
 * - A method named start() that resets the startTime to the current time.
 * - A method named stop() that sets the endTime to the current time.
 * - A method named getElapsedTime() that returns the elapsed time for the
 * stopwatch in milliseconds.
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that measures the execution time of sorting 100,000 numbers using
 * selection sort.
 */

package zadaci_09_08_2015;

public class StopWatch {
	
	private long startTime = 0;
	private long endTime = 0;
	
	public long getStartTime() {
		return startTime;
	}
	public long getEndTime() {
		return endTime;
	}
	
	/*
	 * no-arg konstruktor
	 */
	StopWatch(){

	}
	/*
	 * metoda za uzimanje vremena na pocetku
	 */
	public void start(){
		startTime = System.currentTimeMillis();
	}
	/*
	 * metoda za uzimanje vremena na kraju
	 */
	public void stop(){
		endTime = System.currentTimeMillis();
	}
	/*
	 * metoda koja vraca razliku izmedju pocetnog i krajnjeg vremena
	 */
	public long getElapsedTime(){
		return endTime - startTime;
	}

}
