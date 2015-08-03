/*
 * Napisati program koji pita korisnika da unese neki string te mu vraæa broj uppercase karaktera u unijetom stringu. 
 * Na primjer, ukoliko korisnik unese string "Dobrodošli u Dubai" program mu vraæa da je broj uppercase karaktera 2.
 */

package zadaci_03_08_2015;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		int brojac = 0;
		
		Scanner in = new Scanner(System.in);
		//unos stringa od strane korisnika
		System.out.println("Unesite string");
		String str = in.nextLine();
		in.close();
		//prolazak petljom kroz cijeli string
		for(int i = 0; i < str.length(); i++){
			//odvajanje karaktera iz stringa
			char karakter = str.charAt(i);
			//testiranje da li je karakter uppercase slovo
			if(karakter >= 'A' && karakter <= 'Z'){
				//povecavanje brojaca uppercase slova
				brojac++;
			}
		}
		//stampanje rezultata
		System.out.println("Broj uppercase karaktera u stringu je " + brojac);

	}

}
