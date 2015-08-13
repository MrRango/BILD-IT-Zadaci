/*
 * (Displaying the prime numbers) Write a program that displays all the prime
 * numbers less than 120 in decreasing order. Use the StackOfIntegers class
 * to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them in
 * reverse order.
 */

package zadaci_12_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

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
		//pozivanje metode za dobijanje prostih brojeva
		rez = stackOfIntegers.getPrimeNumbes();
		//stampanje rezultata
		for(int i = 0; i < rez.size(); i++){
			System.out.print(rez.get(i) + ", ");
		}

	}

}
