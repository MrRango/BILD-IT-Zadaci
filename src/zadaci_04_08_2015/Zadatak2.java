/*
 * Napisati program koji prima karakter te vraæa njegov Unicode. Primjer: ukoliko korisnik unese karakter E program mu vraæa 69 kao unicode za taj karakter.
 */

package zadaci_04_08_2015;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//unos karaktera od strane korisnika
		System.out.println("Unesite karakter");
		char karakter = in.next().charAt(0);
		in.close();
		//stampanje karaktera i unicodea koji taj karakter predstavlja
		System.out.println("Unicode za karakter " + karakter + " je " + (int)karakter);

	}

}
