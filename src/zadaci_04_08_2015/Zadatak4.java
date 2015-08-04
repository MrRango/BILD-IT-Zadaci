/*
 * Napisati metodu sa sljedeæim headerom: public static String format(int number, int width) koja vraæa string broja sa prefiksom od jedne ili više nula. 
 * Velièina stringa je width argument. Na primjer, ukoliko pozovemo metodu format(34, 4) metoda vraæa 0034, ukoliko pozovemo format(34, 5) metoda vraæa 00034. 
 * Ukoliko je uneseni broj veæi nego width argument, metoda vraæa samo string broja. Npr. ukoliko pozovemo format(34, 1) metoda vraæa 34.
 */

package zadaci_04_08_2015;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//unos broja od strane korisnika
		System.out.println("Unesite broj");
		int broj = in.nextInt();
		//unos broja cifara od strane korisnika
		System.out.println("Unesite broj cifara");
		int brojCifara = in.nextInt();
		in.close();
		//pozivanje metode i stampanje rezultata
		System.out.println(format(broj, brojCifara));

	}
	/*
	 * metoda koja formatira broj
	 */
	public static String format(int number, int width){
		
		String broj = number + "";
		String rezultat = "";
		//ispitivanje da li treba dodavati nule ispred broja
		if(width > broj.length()){
			//koliko treba dodati nula je razlika izmedju trazenog broja cifara i broja cifara koliko ih broj ima
			for(int i = 0; i < width - broj.length(); i++){
				rezultat += "0";
			}
		}
		//dodavanje broja nulama
		rezultat += broj;
		//vracanje rezultata
		return rezultat;
	}

}
