/*
 * Napisati metode sa sljedeæim headerima: public static int reverse(int number) i public static boolean isPalindrome(int number). 
 * Prva metoda prima cijeli broj kao argument i vraæa isti ispisan naopako. (npr. reverse(456) vraæa 654.) 
 * Druga metoda vraæa true ukoliko je broj palindrom a false ukoliko nije. Koristite reverse metodu da implementirate isPalindrome metodu. 
 * Napišite program koji pita korisnika da unese broj te mu vrati da li je broj palindrome ili ne. 
 */

package zadaci_25_07_2015;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//uzimanje broja od korisnika
		System.out.println("Unesite broj");
		int broj = in.nextInt();
		in.close();
		//pozivanje metode za provjeru da li je broj palindrome i stampanje rezultata
		System.out.println("Uneseni broj je palindrome? " + isPalindrome(broj));

	}
	/*
	 * metoda koja uzima broj i vraca taj broj ispisan naopako
	 */
	public static int reverse(int number){
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
		return newNumber;
	}
	/*
	 * metoda koja ispituje da li je broj polindrome
	 */
	public static boolean isPalindrome(int number){
		boolean isPalindrome = false;
		//uneseni broj se ispisuje naopako
		int reverse = reverse(number);
		//ako je broj jednak svom naopakom ispisu on je polindrome
		if(number == reverse){
			isPalindrome = true;
		}
		return isPalindrome;
	}
	

}
