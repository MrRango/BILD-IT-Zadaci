/*
 *  Napisati sljedeæu metodu koja vraæa najveæu vrijednosti u ArrayListu Integera. 
 *  Metoda vraæa null ukoliko je lista null ili ukoliko lista sadrži 0 elemenata.
 */

package zadaci_20_07_2015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList <>();
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
		System.out.println("Najveca unesena vrijednost je: " + max(list));

	}
	/*
	 * metoda za pronalazenje najveceg broja u listi
	 */
	public static Integer max(ArrayList<Integer> list){
		//ako u listu nisu uneseni brojevi, vraca se vrijednost null
		if(list.size() < 1){
			return null;
		}
		//ako u listi ima brojeva, lista se sortira i vraca se broj sa kraja liste
		else{
			Collections.sort(list);
			return list.get(list.size() - 1);
		}
	}
}
