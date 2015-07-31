/*
 * Napišite metodu sa sljedeæim headerom koja vraæa naopako ispisan broj koji joj je proslijeðen kao argument: public static void reverse(int number). 
 * Na primjer, reverse(3456) treba da vrati 6543. Napisati program koji pita korisnika da unese neki cijeli broj te mu vrati isti ispisan naopako. 
 */

package zadaci_31_07_2015;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//unos broja od strane korisnika
		System.out.println("Unesite cijeli broj");
		int broj = in.nextInt();
		in.close();
		//pozivanje metode koja ispisuje broj naopako
		reverse(broj);

	}
	
	/*
	 * metoda koja ispisuje broj naopako
	 */
	public static void reverse(int number){
		int newNumber = 0;
		int cifra = 0;
		//petlja se ponavlja dok broj ne postane jednak 0, tj. dok se sve cifre ne obrade
		while(number != 0){
			//odvajanje zadnje cifre od broja
			cifra = number % 10;
			//pomjeranje zareza za jedno mjesto u lijevo kod unesenog broja
			number = number / 10;
			//pomjeranje zareza za jedno mjesto u desno kod novog broja
			newNumber = newNumber * 10;
			//dodavanje odvojene cifre novom broju
			newNumber += cifra;
		}
		System.out.println(newNumber);
	}
}
