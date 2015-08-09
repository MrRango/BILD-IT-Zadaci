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

public class Zadatak3 {

	public static void main(String[] args) {
		
		int[] brojevi = new int[100000];
		//punjenje niza generisanim brojevima
		for(int i = 0; i < brojevi.length; i++){
			brojevi[i] = (int)(Math.random() * 100 + 1);
		}
		//instanciranje klase StopWatch
		StopWatch stopwatch = new StopWatch();
		//postavljanje pocetnog vremena
		stopwatch.start();
		//pozivanje metode za sortiranje niza
		doSelectionSort(brojevi);
		//postavljanje vremena kada je zavrseno sortiranje
		stopwatch.stop();
		//odredjivanje koliko je sortiranje trajalo
		long trajanje = stopwatch.getElapsedTime();
		//stampanje rezultata
		System.out.println("Za sortiranje 100,000 brojeva potrebno je: " + trajanje + " milisekundi");

	}
	
	/*
	 * metoda za sortiranje nizova (selection sort)
	 * preuzeo kod sa: java2novice.com/java-sorting-algorithms/selection-sort/
	 */
	public static int[] doSelectionSort(int[] arr){
        
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
      
            int smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
}
