/*
 * Pretpostavimo da su slova A, E, I, O i U samoglasnici. Napisati program koji pita korisnika 
 * da unese string te mu ispište broj samoglasnika i suglasnika u datom stringu.
 */

package zadaci_20_07_2015;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		int brSamoglasnika = 0, brSuglasnika = 0, brPraznih = 0;
		//niz samoglasnika
		char[]samoglasnici = {'a','e','i','o','u'};
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite rijec ili recenicu: ");
		//uneseni string se pretvara u sva mala slova
		String unos = in.nextLine().toLowerCase();
		in.close();
		//petlja prolazi kroz cijeli string i provjerava karakter po karakter
		for(int i = 0; i < unos.length(); i++){
			char karakter = unos.charAt(i);
			//ukoliko je karakter prazno mjesto, povecava brojac za prazna mjesta
			if(karakter == ' '){
				brPraznih++;
			}
			//ukoliko karakter nije prazno mjesto, uporedjuje ga sa samoglasnicima
			//ako je je karakter samoglasnik, povecava se brojac za samoglasnike
			else{
				for(int j = 0; j < samoglasnici.length; j++){
					if(karakter == samoglasnici[j]){
						brSamoglasnika++;
					}
				}
			}
		}
		//broj suglasnika se dobija jednostavnom racunicom
		brSuglasnika = unos.length() - brSamoglasnika - brPraznih;
		//stampanje rezultata
		System.out.println("U unesenoj rijeci/recenici ima " + brSamoglasnika + " samoglasnika, a " + brSuglasnika + " suglasnika.");
	}

}
