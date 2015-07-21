/*
 * Napišite program koji æe brojati broj karaktera, rijeèi i linija teksta u nekom fileu. 
 * Rijeèi trebaju biti odvojene jednim spaceom. Ime file proslijediti kao argument u vaš program
 */

package zadaci_21_07_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite ime fajla ");
		//uzimamo od korisnika ome fajla
		String imeFajla = in.nextLine();
		//pozivamo metodu za brojanje karaktera, linija i rijeci u fajlu
		prebrojavanje(imeFajla);
		in.close();

	}
	/*
	 * metoda za brojanje karaktera, linija i rijeci u fajlu
	 */
	public static void prebrojavanje(String imeFajla) throws FileNotFoundException{
		int brLinija = 0, brRijeci = 0, brKaraktera = 0;
		File file = new File(imeFajla);
		Scanner in = new Scanner(file);
		//petlja se vrti dok god ima redova u fajlu
		while(in.hasNextLine()){
			//uzima se jedna po jadna linija
			String linija = in.nextLine();
			//brojac linija se povecava
			brLinija++;
			//brojac rijeci se povecava za broj rijeci u svakoj recenici
			brRijeci += linija.split(" ").length;
			//brojac karaktera se povecava za broj karaktera u svakoj recenici
			brKaraktera += linija.length();
		}
		//stampanje rezultata
		System.out.println("U tekstu ima " + brLinija + " linija, " + brRijeci + " rijeci i " + brKaraktera + " karaktera.");
		in.close();
	}

}
