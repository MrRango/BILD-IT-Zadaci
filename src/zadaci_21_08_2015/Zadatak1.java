/*
 * (NumberFormatException) Write the bin2Dec(String binaryString)
 * method to convert a binary string into a decimal number. Implement the
 * bin2Dec method to throw a NumberFormatException if the string is not a
 * binary string.
 */

package zadaci_21_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		//unos binarnog broja u vidu stringa od strane korisnika
		System.out.println("Unesite binarni broj");
		String binaryString = in.next();
		in.close();
		//pozivanje metode 
		bin2Dec(binaryString);
	}

	/*
	 * metoda za pretvaranje binarnog stringa u decimalni broj
	 */
	public static void bin2Dec(String binaryString) {
		int rezultat = 0;
		//lista za smijestanje cifara binarnog broja
		ArrayList<Integer> cifre = new ArrayList<>();
		try {
			//prolazak kroz string sa kraja prema pocetku
			for (int i = binaryString.length() - 1; i >= 0; i--) {
				//izdvajanje karaktera iz stringa
				char karakter = binaryString.charAt(i);
				//ako je karakter '0', u listu se dodaje broj 0
				if (karakter == '0') {
					cifre.add(0);
				//ako je karakter '1', u listu se dodaje broj 1
				} else if (karakter == '1') {
					cifre.add(1);
				//ako karakter nije ni '0' ni '1', baca se izuzetak
				} else {

					throw new NumberFormatException("error");

				}
			}
			//pretvaranje binarnog broja u decimalni
			for (int i = 0; i < cifre.size(); i++) {
				if (cifre.get(i) == 1) {
					rezultat += Math.pow(2, i);
				}
			}
			//stampanje rezultata
			System.out.println(binaryString + " = " + rezultat);
		}
		//u slucaju da se desi izuzetak, ispisuje se poruka
		catch (NumberFormatException ex) {
			System.out.println("Unijeli ste string koji ne sadrzi samo binarne brojeve");
		}
	}

}
