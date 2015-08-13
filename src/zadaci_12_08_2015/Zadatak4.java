/*
 * (Displaying the prime factors) Write a program that prompts the user to enter
 * a positive integer and displays all its smallest factors in decreasing order. For
 * example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2,
 * 2. Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and
 * retrieve and display them in reverse order.
 */

package zadaci_12_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//unos broja od strane korisnika
		System.out.println("Unesite neki cijeli broj ");
		
		int broj = in.nextInt();
		in.close();
		//kreiranje objekta
		StackOfIntegers stackOfIntegers = new StackOfIntegers(broj);
		//lista za smijestanje rezultata
		ArrayList <Integer> rez = new ArrayList<>();
		//pozivanje metode za dobijanje prime faktora
		rez = stackOfIntegers.getPrimeFactors();
		//stampanje rezultata
		for(int i = rez.size() - 1; i >= 0; i--){
			System.out.print(rez.get(i) + ", ");
		}
	}

}
