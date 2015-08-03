/*
 * Napisati program koji pita korisnika da unese slovo te provjerava da li je unijeti karakter samoglasnik ili suglasnik. 
 * Na primjer, ukoliko korisnik unese B, program vraæa da je dati karakter suglasnik. Ukoliko unese A, program vraæa da je dati karakter samoglasnik.
 */

package zadaci_03_08_2015;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		//niz svih samoglasnika
		char[] samoglasnici = {'A', 'E', 'I', 'O', 'U'};
		//unos karaktera od strane korisnika
		Scanner in = new Scanner(System.in);
		char unos = in.next().toUpperCase().charAt(0);
		in.close();
		//prolazak kroz niz samoglasnika
		for(int i = 0; i < samoglasnici.length; i++){
			//ako je unijeti karakter jednak nekom od clanova niza samoglasnici, unijeti karakter je samoglasnik
			if(unos == samoglasnici[i]){
				System.out.println("Unijeti karakter je samoglasnik");
				break;
			}
			//ako se dodje do kraja niza samoglasnici, a unos nije jednak ni jednom clanu iz niza, unijeti karakter je suglasnik
			if(i == samoglasnici.length - 1){
				System.out.println("Unijeti karakter je suglasnik");
			}
		}

	}

}
