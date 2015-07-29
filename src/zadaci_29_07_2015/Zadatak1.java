/*
 * Napisati program koji pita korisnika da unese imena tri grada te ih ispiše u abecednom redu. 
 * Na primjer, ukoliko korisnik unese Chicago, Los Angeles i Atlanta kao gradove, program vraæa Atlanta, Chicago, Los Angeles.
 */

package zadaci_29_07_2015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		//lista za smijestanje gradova
		ArrayList<String> gradovi = new ArrayList<>();
		
		Scanner in = new Scanner(System.in);
		//unos imena tri grada od strane korisnika i njihovo smijestanje u listu
		System.out.println("Unesite imana tri grada");
		for(int i = 0; i < 3; i++){
			gradovi.add(in.nextLine());
		}
		in.close();
		//sortiranje liste gradova po abecednom redu
		Collections.sort(gradovi);
		//stampanje gradova slozenih po abecednom redu
		System.out.println(gradovi.toString());
	}

}
