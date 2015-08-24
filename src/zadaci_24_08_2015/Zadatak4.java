/*
 * (Shuffle ArrayList) Write the following method that shuffles an ArrayList of numbers:
 * public static void shuffle(ArrayList<Number> list)
 */

package zadaci_24_08_2015;

import java.util.ArrayList;
import java.util.Collections;

public class Zadatak4 {

	public static void main(String[] args) {
		//lista za smijestanje objekata Number
		ArrayList<Number> list = new ArrayList<>();
		//pravljenje objekata
		Number n1 = new Integer(6);
		Number n2 = new Integer(7);
		Number n3 = new Integer(13);
		Number n4 = new Integer(22);
		Number n5 = new Integer(30);
		//smijestanje objekata u listu
		list.add(n1);
		list.add(n2);
		list.add(n3);
		list.add(n4);
		list.add(n5);
		
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
	public static void shuffle(ArrayList<Number> list){
		//mijesanje elemenata u listi
		Collections.shuffle(list);
	}

}
