/*
 * (Pattern recognition: consecutive four equal numbers) Write the following
 * method that tests whether the array has four consecutive numbers with the same value.
 * public static boolean isConsecutiveFour(int[] values)
 * Write a test program that prompts the user to enter a series of integers and displays
 * if the series contains four consecutive numbers with the same value. Your
 * program should first prompt the user to enter the input size—i.e., the number of
 * values in the series.
 */

package zadaci_07_08_2015;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//unos duzine niza od strane korisnika
		System.out.println("Unesite duzinu niza");
		int duzina = in.nextInt();
		int[]values = new int[duzina];
		//unos elemenata niza od strane koriskina
		System.out.println("Unesite elemente niza");
		for(int i = 0; i < duzina; i++){
			values[i] = in.nextInt();
		}
		in.close();
		//pozivanje metode i stampanje rezultata
		if(isConsecutiveFour(values)){
			System.out.println("Uneseni niz sadrzi seriju od 4 ista broja");
		}
		else{
			System.out.println("Uneseni niz ne sadrzi seriju od 4 ista broja");
		}

	}
	/*
	 * metoda koja vraca true, ako u unesenom nizu postoji serija od 4 ista broja
	 */
	public static boolean isConsecutiveFour(int[] values){
		boolean isConsecutiveFour = false;
		//peljta za prolaz kroz niz
		for(int i = 0; i < values.length - 3; i++){
			//testiranje da li je trenutni broj isti kao i naredna 3
			if(values[i] == values[i + 1] && values[i] == values[i + 2] && values[i] == values[i + 3]){
				isConsecutiveFour = true;
			}
		}
		
		return isConsecutiveFour;
	}

}
