/*
 * Napisati program koji pita korisnika da unese broj minuta (npr. 1 milijardu) te ispiše korisniku koliko je to u godinama i danima. 
 * Zbog jednostavnosti, pretpostavimo da godina ima 365 dana.  
 */

package zadaci_29_07_2015;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//unos broja minuta
		System.out.println("Unesite broj minuta koje zelite da pretvorite u dane i godine");
		long minute = in.nextLong();
		in.close();
		//pretvaranje minuta u dane
		int ukupnoDana = (int) minute / 1440; 
		//racunanje ostatka, broj dana koji ne cine jednu cijelu godinu
		int dani = ukupnoDana % 365;
		//racunanje godina
		int godine = ukupnoDana / 360;
		//stampanje rezultata
		System.out.println(minute + " minuta je " + godine + " godina i " + dani + " dana.");

	}

}
