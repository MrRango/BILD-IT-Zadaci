/*
 * (Count single digits) Write a program that generates 100 random integers between
 * 0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,
 * say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
 */

package zadaci_07_08_2015;

public class Zadatak1 {

	public static void main(String[] args) {
		//niz za brojanje pojavljivanja jednocifrenih brojeva
		int[]brojevi = new int[10];
		//generisanje 100 jednocifrenih brojeva i njihovo brojanje
		for(int i = 0; i < 100; i++){
			int broj = (int)(Math.random() * 10);
			brojevi[broj]++;
		}
		//stampanje niza 
		for(int i = 0; i < brojevi.length; i++){
			System.out.println(i + " se pojavljuje " + brojevi[i]);
		}
	}

}
