/*
 * (Remove duplicates) Write a method that removes the duplicate elements from
 * an array list of integers using the following header:
 * public static void removeDuplicate(ArrayList<Integer> list)
 * Write a test program that prompts the user to enter 10 integers to a list and displays
 * the distinct integers separated by exactly one space.
 */

package zadaci_18_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		

		ArrayList<Integer> list = new ArrayList<>();
		
		Scanner in = new Scanner(System.in);
		//unos 10 brojeva od strane korisnika
		System.out.println("Unesite 10 brojeva");
		for(int i = 0; i < 10; i++){
			list.add(in.nextInt());
		}
		in.close();
		//pozivanje metode
		removeDuplicate(list);

	}
	/*
	 * metoda za uklanjanje duplikata iz liste
	 */
	public static void removeDuplicate(ArrayList<Integer> list){
		//kreiranje nove liste za smijestenje unikata
		ArrayList<Integer> listaBezDuplikata = new ArrayList<>();
		//dodavanje prvog elementa iz liste u listu unikata
		listaBezDuplikata.add(list.get(0));
		//prolazak kroz listu i listu unikata
		for(int i = 0; i < list.size(); i++){
			for(int j = 0; j < listaBezDuplikata.size(); j++){
				//ako je element iz liste jednak elementu iz liste unikata, preskacemo ga
				if(list.get(i) == listaBezDuplikata.get(j)){
					break;
				}
				//kad se dodje do kraja liste unikata, a elemenat iz liste se ne nalaui u listi unikata, taj elemenata se dodaje u listu unikata
				if(j == listaBezDuplikata.size() - 1){
					listaBezDuplikata.add(list.get(i));
				}
				
			}
		}
		//stampanje liste unikata
		System.out.println("Lista bez duplikata: ");
		for(int i = 0; i < listaBezDuplikata.size(); i++){
			System.out.print(listaBezDuplikata.get(i) + " ");
		}
		
	}

}
