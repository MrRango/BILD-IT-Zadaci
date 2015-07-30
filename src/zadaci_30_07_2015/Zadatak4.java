/*
 * Napisati program koji pita korisnika da unese 3 cijela broja te mu ispiše ta ista tri broja u rastuæem redosljedu. 
 * Bonus: Napisati metodu koja prima tri cijela broja kao argumente te vraæa brojeve u rastuæem redosljedu. 
 */

package zadaci_30_07_2015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak4 {
	
	//lista za smijestanje brojeva
	static ArrayList<Integer>lista = new ArrayList<>();

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//uzimanje tri broja od korisnika
		System.out.println("Unesite tri broja");
		int broj1 = in.nextInt();
		int broj2 = in.nextInt();
		int broj3 = in.nextInt();
		in.close();
		//pozivanje metode za sortiranje tri broja i smijestanje rezultata u listu
		lista = sortiraj(broj1, broj2, broj3);
		//stampanje rezultata, tj. brojeva iz liste
		for(int i = 0; i < 3; i++){
			System.out.print(lista.get(i) + " ");
		}

	}
	/*
	 * metoda koja sortira tri broja od najmanjeg ka najvecem
	 */
	public static ArrayList<Integer> sortiraj(int a, int b, int c){
		//dodavanje tri broja u listu
		lista.add(a);
		lista.add(b);
		lista.add(c);
		//sortiranje liste
		Collections.sort(lista);
		//vracanje liste
		return lista;
	}

}
