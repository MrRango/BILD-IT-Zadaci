/*
 * (Sort ArrayList) Write the following method that sorts an ArrayList of numbers:
 * public static void sort(ArrayList<Integer> list)
 * Write a test program that prompts the user to enter 5 numbers, stores them in an
 * array list, and displays them in increasing order.

 */

package zadaci_18_08_2015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		Scanner in = new Scanner(System.in);
		//unos 5 brojeva od strane korisnika
		System.out.println("Unesite 5 brojeva");
		for(int i = 0; i < 5; i++){
			list.add(in.nextInt());
		}
		in.close();
		//pozivanje metode za sortiranje
		sort(list);
		//stampanje rezultata
		for(int i = 0; i < 5; i++){
			System.out.print(list.get(i) + " ");
		}
	}
	/*
	 * metoda za sortiranje liste
	 */
	public static void sort(ArrayList<Integer> list){
		//mozivanje metode sort iz collectionsa (nije receno da ne smijemo korisniti :D)
		Collections.sort(list);
		
	}

}
