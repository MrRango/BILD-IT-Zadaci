/*
 * Napisati metodu koja pretavara milisekunde u sate, minute i sekunde. Metoda treba da koristi sljedeæi header: public static String convertMillis(long millis). 
 * Metoda treba da vraæa vrijeme kao string u formatu sati:minute:sekunde.  Na primjer convertMillis(100000) treba da vrati 0:1:40.
 */
package zadaci_27_07_2015;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		//uzimanje broja milisekundi od korisnika
		System.out.println("Unesite broj milisekundi");
		long milisekunde = in.nextLong();
		in.close();
		//pozivanje metode za pretvaranje
		System.out.println(convertMillis(milisekunde));

	}
	/*
	 * metoda za pretvaranje milisekundi u sate, minute i sekunde
	 */
	public static String convertMillis(long millis){
		String rez = null;
		//pretvaranje milisekundi u sekunde
		int ukupnoSekundi = (int) millis / 1000;
		//odvajanje ostatka sekundi
		int sekunde = ukupnoSekundi % 60;		
		//pretvaranje sekundi u minute
		int ukupnoMinuta = ukupnoSekundi / 60;
		//odvajanje ostatka minuta
		int minute = ukupnoMinuta % 60;
		//pretvaranje minuta u sate
		int sati = ukupnoMinuta / 60;
		//sastavljanje stringa od ukupnog broja sati, ostatka minuta i ostatka sekundi
		rez = sati + ":" + minute + ":" +sekunde;
		return rez;
	}
}
