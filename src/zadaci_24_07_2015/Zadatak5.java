/*
 * Napisati metodu koja broji slova u stringu. Metoda treba koristiti sljedeæi header: 
 * public static int countLetters(String s). 
 * Napisati program koji pita korisnika da unese neki string te mu vrati koliko taj string ima slova.
 */

package zadaci_24_07_2015;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//uzima se string od korisnika
		System.out.println("Unesite string ");
		String unos = in.nextLine();
		in.close();
		//pozivanje metode i stampanje rezultata
		System.out.println("U unesenom stringu ima " + countLetters(unos) + " slova");
	}
	/*
	 * metoda za brojanje slova u stringu
	 */
	public static int countLetters(String s){
		int brojSlova = 0;
		//prolazi se kroz citav string
		for(int i = 0; i < s.length(); i++){
			//svaki karakter u stringu se odvaja i testira posebno
			char karakter = s.toLowerCase().charAt(i);			
			//ako karakter slovo, brojac slova se uvecava
			if(karakter >= 'a' && karakter <= 'z'){
				brojSlova++;
			}
		}
		return brojSlova;
	}
	
}
