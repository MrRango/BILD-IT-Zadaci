/*
 * Napišite program koji pita korisnika da unese cijeli broj i ispiše njegov ekvivalent u binarnom kodu. 
 * Za ovaj program NE smijemo koristiti Integer.toBinaryString(int) metodu.
 */

package zadaci_03_08_2015;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

		String rezultat = "";
		
		Scanner in = new Scanner(System.in);
		//unos broja od strane korisnika
		System.out.println("Unesite cijeli broj");
		int broj = in.nextInt();
		in.close();
		
		System.out.print(broj + " = "); 
		//petlja se ponavlja dok je broj veci od nula
		while (broj > 0) {
			//cifru binarnog broja dobijamo kao ostatak dijeljenja sa dva
			rezultat += broj % 2;
			broj = broj / 2;
		}
		//buduci da cifre binarnog broja dobijemo od kraja ka pocetku, stampamo ih u obrnutom redoslijedu
		for (int i = rezultat.length() - 1; i >= 0; i--) {
			System.out.print(rezultat.charAt(i));	
		}

	}

}
