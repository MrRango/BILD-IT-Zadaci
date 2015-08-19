/*
 * (Sum ArrayList) Write the following method that returns the sum of all numbers
 * in an ArrayList:
 * public static double sum(ArrayList<Double> list)
 * Write a test program that prompts the user to enter 5 numbers, stores them in an
 * array list, and displays their sum.
 */

package zadaci_18_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		ArrayList<Double> list = new ArrayList<>();
		
		Scanner in = new Scanner(System.in);
		//unos 5 brojeva od strane korisnika
		System.out.println("Unesite 5 brojeva");
		for(int i = 0; i < 5; i++){
			list.add(in.nextDouble());
		}
		in.close();
		//pozivanje metode i stampanje rezultata
		System.out.println("Suma unesenih brojeva je: " + sum(list));
	}
	/*
	 * metoda za sabiranje elemenata liste
	 */
	public static double sum(ArrayList<Double> list){
		int suma = 0;
		//prolazak kroz listu i dodavanje elemenata na sumu
		for(int i = 0; i < list.size(); i++){
			suma += list.get(i);
		}
		return suma;
	}

}
