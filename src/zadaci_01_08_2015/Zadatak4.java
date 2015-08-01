/*
 * Napisati metodu koja izraèunava zbir svih brojeva u cijelom broju. Koristite sljedeæi header: public static int sumDigits(long n). 
 * Na primjer, ako pozovemo metodu i proslijedimo joj broj 234 (sumDigits(234)) metoda treba da vrati 9. (2 + 3 + 4 = 9)
 */

package zadaci_01_08_2015;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//unos broja od strane korisnika
		System.out.println("Unesite broj");
		long broj = in.nextLong();
		in.close();
		//pozivanje metode i stampanje rezultata
		System.out.println("Zbir cifara unesenog broja je: " + sumDigits(broj));

	}
	/*
	 * metoda za sabiranje cifara unesenog broja
	 */
	public static int sumDigits(long n){
		int rez = 0;
		//petlja se ponavlja dok broj ne postane jednak 0, tj. dok se sve cifre ne obrade
		while(n != 0){
			//odvajanje zadnje cifre od broja i dodavanje na rezultat
			rez += (int) n % 10;
			//pomjeranje zareza za jedno mjesto u lijevo kod unesenog broja
			n = n / 10;
		}
		return rez;
	}

}
