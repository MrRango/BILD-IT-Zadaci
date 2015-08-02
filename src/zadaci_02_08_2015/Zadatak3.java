/*
 * Napisati program koji pita korisnika da unese Social Security Number (SSN) u formatu DDD-DD-DDDD gdje D predstavlja broj. 
 * Program treba da provjerava da li je broj unesešen u ispravnom formatu. Ukoliko nije, program pita korisnika da pokuša ponovo. 
 * Ukoliko jeste unešen u pravom formatu, program završava sa radom.
 */

package zadaci_02_08_2015;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		char karakter = ' ';
		boolean uslov = true;

		Scanner in = new Scanner(System.in);

		do {
			//brojac karaktera
			int brojac = 0;
			//unos ssn broja od strane korisnika
			System.out.println("Unesite SSN");
			String ssn = in.nextLine();
			//prolazak kroz citav unos
			for (int i = 0; i < ssn.length(); i++) {
				//odvajanje svakog karaktera zbog testiranja
				karakter = ssn.charAt(i);
				//ako je karakter cifra, povecava se brojac
				if (karakter >= '0' && karakter <= '9') {
					brojac++;
				}
				//ako se na 4 i 7 mjestu nalazi crta(minus), brojac se povecava
				if (i == 3 || i == 6 || ssn.charAt(i) == '-'
						|| ssn.charAt(i) == '-') {
					brojac++;
				}
			}
			//ako je brojac izbrojao 11 karaktera i duzina unosa je 11, ssn broj je validan i program se zavrsava
			if (brojac == 11 && ssn.length() == 11) {
				System.out.println("Unijeli ste ispravan SSN");
				uslov = false;
			} else {
				//dok korisnik unosi pogresan broj, petlja se vrti i ispisuje poruku da pokusa ponovo
				System.out
						.println("Niste unijeli ispravan SSN, pokusajte ponovo");
			}
		} while (uslov);
		in.close();
	}

}
