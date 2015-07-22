/*
 * Nizovi niz1 i niz2 su striktno identièni ukoliko su svi njihovi elementi na istim pozicijama jednaki. 
 * Napisati metodu koja vraæa true ukoliko su nizovi niz1 i niz2 striktno identièni. Koristiti sljedeæi header:
 * public static boolean equals(int[ ] niz1, int[ ] niz2)
 * Napisati testni program koji pita korisnika da unese dva niza cijelih brojeva te provjerava da li su striktno identièni.
 */

package zadaci_22_07_2015;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//trazi se od korisnika da unese duzinu nizova
		System.out.println("Koliko zelite da nizovi budu dugi?");
		int duzina = in.nextInt();
		
		int[]niz1 = new int[duzina];
		int[]niz2 = new int[duzina];
		//unos clanova prvog niza
		System.out.println("Unesite clanove prvog niza");
		for(int i = 0; i < duzina; i++){
			niz1[i] = in.nextInt();
		}
		//unos clanova drugog niza
		System.out.println("Unesite clanove drugog niza");
		for(int i = 0; i < duzina; i++){
			niz2[i] = in.nextInt();
		}
		in.close();
		//stampanje rezultata poziva metode
		System.out.println("Jesu li dva unesena niza striktno identicni? " + equals(niz1, niz2));
		
	}
	/*
	 * metoda vraca true ili false u zavisnosti da li su uneseni nizovi striktno identicni
	 */
	public static boolean equals(int[ ] niz1, int[ ] niz2){
		boolean isEqual = true;
		//petlja pregleda nizove od pocetka do kraja
		for(int i = 0; i < niz1.length; i++){
			//porede se clanovi na istim pozicijama u nizovima
			if(niz1[i] != niz2[i]){
				//ako clanovi na istim pozicijama nisu isti, ispitivanje se prekida i metoda vraca vrijednost false
				isEqual = false;
				break;
			}
		}
		return isEqual;
	}

}
