/*
 * (Count characters, words, and lines in a file) Write a program that will count
 * the number of characters, words, and lines in a file. Words are separated by
 * hitespace characters. The file name should be passed as a command-line
 * argument, as shown in Figure 12.13.
 */

package zadaci_21_08_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak4 {

public static void main(String[] args) throws FileNotFoundException {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite ime fajla ");
		//uzimamo od korisnika ime fajla
		String imeFajla = in.nextLine();
		//pozivamo metodu za brojanje karaktera, linija i rijeci u fajlu
		try{
			prebrojavanje(imeFajla);
		}
		//u slucaju da uneseni fajl ne postoji, ispisuje se poruka
		catch (FileNotFoundException ex){
			System.out.println("Fajl nije pronadjen");
		}
		in.close();

	}
	/*
	 * metoda za brojanje karaktera, linija i rijeci u fajlu
	 */
	public static void prebrojavanje(String imeFajla) throws FileNotFoundException{
		int brLinija = 0, brRijeci = 0, brKaraktera = 0;
		File file = new File(imeFajla);
		Scanner in = new Scanner(file);
		//petlja se vrti dok ima redova u fajlu
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
