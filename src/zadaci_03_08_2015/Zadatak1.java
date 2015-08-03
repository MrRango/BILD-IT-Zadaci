/*
 * Napisati program koji pita korisnika da unese neki string te mu vraæa taj isti string naopako.
 */

package zadaci_03_08_2015;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//unos stringa od strane korisnika
		System.out.println("Unesite strinig");
		String str = in.nextLine();
		in.close();
		//petljom se prolazi kroz string, od kraja prema pocetku
		for(int i = str.length() - 1; i >= 0; i--){
			//odvajanje karaktera iz stringa
			char karakter = str.charAt(i);
			//stampanje karaktera
			System.out.print(karakter);
		}

	}

}
