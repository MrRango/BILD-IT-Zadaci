/*
 * Napisati program koji prima 10 cijelih brojeva te ih ispisuje u obrnutom redosljedu. 
 */

package zadaci_24_07_2015;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		//niz duzine 10
		int[] brojevi = new int[10];
		
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite deset cijelih brojeva");
		//uzimanej od korisnika deset brojeva i njihovo upisivanje u niz
		for(int i = 0; i < 10; i++){
			brojevi[i] = in.nextInt();
		}
		in.close();
		//stampanje niza u od kraja ka pocetku
		for(int i = 9; i >= 0; i--){
			System.out.print(brojevi[i] + " ");
		}

	}

}
