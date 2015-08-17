/*
 * (Shuffle ArrayList) Write the following method that shuffles the elements in
 * an ArrayList of integers.
 * public static void shuffle(ArrayList<Integer> list)
 */
package zadaci_17_08_2015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak5 {

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
		//pozivanje metode
		shuffle(list);
		//stampanje liste
		for(int i = 0; i < list.size(); i++){
			System.out.print(list.get(i) + " ");
		}

	}
	/*
	 * metoda koja mijenja mijesta elementima u listi
	 */
	public static void shuffle(ArrayList<Integer> list){
		//mijesanje elemenata u listi
		Collections.shuffle(list);
	}

}
