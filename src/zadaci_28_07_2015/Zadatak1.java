/*
 * Napisati metodu koja vraæa broj dana u godini. Metoda koristi sljedeæi header: public static int numberOfDayInAYear(int year). 
 * Napisati program koji pita korisnika da unese poèetnu godinu, krajnju godinu te ispisuje broj dana za svaku godinu u rasponu.
 */

package zadaci_28_07_2015;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		//unosenje pocetne i krajnje godine od strane korisnika
		System.out.println("Unesite pocetnu godinu");
		int pocetna = in.nextInt();
		System.out.println("Unesite krajnju godinu");
		int krajnja = in.nextInt();
		in.close();
		//pozivanje metode i stampanje rezultata za svaku godinu u rasponu od pocetne do krajnje godine
		for(int i = pocetna; i <= krajnja; i++){
			System.out.println(i + ". godina ima " + numberOfDayInAYear(i) + " dana");
		}

	}
	/*
	 * metoda koja odredjuje koliko dana ima u godini
	 */
	public static int numberOfDayInAYear(int year){
		int rez = 0;
		//ispituje se da li je godina prestupna
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
			//ako je godina prestupna ima 366 dana
			rez = 366;
		}else{
			//ako je godina prosta ima 365 dana
			rez = 365;
		}
		return rez;
	}

}
