/*
 * (Combine two lists) Write a method that returns the union of two array lists of
 * integers using the following header:
 * public static ArrayList<Integer> union(
 * ArrayList<Integer> list1, ArrayList<Integer> list2)
 * For example, the union of two array lists {2, 3, 1, 5} and {3, 4, 6} is
 * {2, 3, 1, 5, 3, 4, 6}. Write a test program that prompts the user to enter two lists,
 * each with five integers, and displays their union. The numbers are separated by
 * exactly one space in the output.
 */

package zadaci_18_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		Scanner in = new Scanner(System.in);
		//unos 5 brojeva od strane korisnika
		System.out.println("Unesite 5 brojeva u listu1");
		for(int i = 0; i < 5; i++){
			list1.add(in.nextInt());
		}
		//unos 5 brojeva od strane korisnika
		System.out.println("Unesite 5 brojeva u listu2");
		for(int i = 0; i < 5; i++){
			list2.add(in.nextInt());
		}
		in.close();
		//pozivanje metode
		list1 = union(list1, list2);
		//stampanje rezultata
		for(int i = 0; i < list1.size(); i++){
			System.out.print(list1.get(i) + " ");
		}

	}
	/*
	 * metoda za spajanje dvije liste
	 */
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
		//dodavanje elementata druge liste u prvu listu
		list1.addAll(list2);
		
		return list1;
		
	}

}
