/*
 * (Sort ArrayList) Write the following method that sorts an ArrayList of numbers.
 * public static void sort(ArrayList<Number> list)
 */

package zadaci_24_08_2015;

import java.util.ArrayList;
import java.util.Collections;

public class Zadatak5 {

	public static void main(String[] args) {
		// lista za smijestanje objekata Number
		ArrayList<Number> list = new ArrayList<>();
		// pravljenje objekata
		Number n1 = new Integer(16);
		Number n2 = new Integer(7);
		Number n3 = new Integer(3);
		Number n4 = new Integer(22);
		Number n5 = new Integer(10);
		// smijestanje objekata u listu
		list.add(n1);
		list.add(n2);
		list.add(n3);
		list.add(n4);
		list.add(n5);

		// stampanje liste prije sortiranja
		System.out.println("Prije sortiranja:");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		// pozivanje metode za sortiranje
		sortiraj(list);

		// stampanje liste poslije sortiranja
		System.out.println("\nPoslije sortiranja: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

	}

	/*
	 * metoda koja sortira elemente u listi
	 */
	public static void sortiraj(ArrayList<Number> list) {
		// lista za smijestanje vrijednosti objekata Number iz liste 'list'
		ArrayList<Integer> listInt = new ArrayList<>();
		// punjenje liste sa vrijednostima
		for (int i = 0; i < list.size(); i++) {
			listInt.add(list.get(i).intValue());
		}
		// sortiranje liste sa vrijednostima
		Collections.sort(listInt);
		// prolazak kroz listu sa vrijednostima
		for (int i = 0; i < listInt.size(); i++) {
			// prolazak kroz listu objekata
			for (int j = 0; j < list.size(); j++) {
				// ako su elementi lista iste vrijednosti
				if (listInt.get(i) == list.get(j).intValue()) {
					// trenutni Number objekat se stavlja na kraj liste
					list.add(list.get(j));
					// trenutno Number objekat se brise sa prethodne pozicije
					list.remove(j);
				}
			}
		}
	}

}
