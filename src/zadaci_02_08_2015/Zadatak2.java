/*
 * Napisati program koji pita korisnika da unese neki string te mu ispisuje dužinu tog stringa kao i prvo slovo stringa. 
 */

package zadaci_02_08_2015;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//uzimanje stringa od korisnika
		System.out.println("Unesite string");
		String str = in.nextLine();
		in.close();
		//odredjivanje prvog slova u stringu
		char prvoSlovo = str.charAt(0);
		//stampanje duzine stringa i prvog slova
		System.out.println("Duzina unijetog stringa je " + str.length() + "\nPrvo slovo je " + prvoSlovo);
		
	}

}
