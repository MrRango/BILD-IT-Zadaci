/*
 * (Maximum element in ArrayList) Write the following method that returns the
 * maximum value in an ArrayList of integers. The method returns null if the
 * list is null or the list size is 0.
 * public static Integer max(ArrayList<Integer> list)
 * Write a test program that prompts the user to enter a sequence of numbers ending
 * with 0, and invokes this method to return the largest number in the input.
 */

package zadaci_17_08_2015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		boolean uslov = true;
		System.out.println("Unesite brojeve: ");
		//unos brojeva u listu
		do{
			int broj = in.nextInt();
			//ako je unesen broj 0 unos se zavrsava
			if(broj == 0){
				uslov = false;
			}
			//ako je unesen broj razlicit od 0, broj se dodaje u listu
			else{
				list.add(broj);
			}
		}while(uslov);
		in.close();
		
		System.out.println("Najveci element u listi je: " + max(list));
	}
	/*
	 * metoda koja trazi najveci clan u nizu
	 */
	public static Integer max(ArrayList<Integer> list){
		Integer rez;
		//ispitivanje da li je lista prazna
		if(list.isEmpty()){
			rez = 0;
		}else{
			//sortiranje liste
			Collections.sort(list);
			//za najveci broj uzimamo zadnji element u listi
			rez = list.get(list.size() - 1);
		}
		return rez;
	}

}
