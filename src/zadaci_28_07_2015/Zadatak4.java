/*
 * Napisati metodu koja pronalazi broj ponavljanja odreðenog karaktera u stringu. Metoda treba da koristi sljedeæi header: public static int count(String str, char a). 
 * Na primjer, ukoliko pozovemo metodu na sljedeæi naèin: count("Welcome", e) metoda treba da vrati 2. 
 * Napisati program koji pita korisnika da unese string i koji karakter želi da prebroji u datom stringu te mu ispiše koliko se puta odreðeni karakter ponovio u zadatom stringu.
 */

package zadaci_28_07_2015;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//uzimanje stringa od korisnika
		System.out.println("Unesite string");
		String str = in.nextLine();
		//uzimanje karaktera od korisnika
		System.out.println("Unesite karakter kojeg zelite da prebrojite u stringu");
		char karakter = in.next().charAt(0);
		in.close();
		//ispisivanje rezultata i pozivanje metode za prebrojavanje pojavljivanja karaktera u stringu
		System.out.println("Karakter '" + karakter + "' se u unijetom stringu ponavlja " + count(str, karakter) + " puta.");

	}
	/*
	 * metoda za prebrojavanje broja pojavljivanja karaktera u stringu
	 */
	public static int count(String str, char a){
		
		int brojac = 0;
		//prolazak kroz citav string
		for(int i = 0; i < str.length(); i++){
			//odvajanje karaktera iz stringa
			char karakter = str.charAt(i);
			//ako je karakter jednak karakteru ciji broj pojavljivanja zelimo da prebrojimo, brojac se povecava
			if(karakter == a){
				brojac++;
			}
		}
		
		return brojac;
		
	}

}
