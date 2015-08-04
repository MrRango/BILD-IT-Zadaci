/*
 * Napisati program koji prima ASCII kod (cijeli broj izmeðu 0 i 127) te ispisuje koji je to karakter. 
 * Na primjer, ukoliko korisnik unese 69 kao ASCII kod, program mu ispisuje da je karakter sa tim brojem karakter E.
 */

package zadaci_04_08_2015;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//unos ASCII koda od strane korisnika
		System.out.println("Unesite ASCII kod");
		int broj = in.nextInt();
		in.close();
		//stampanje unesenig broja i karaktera koji taj broj predstavlja
		System.out.println("ASCII broj " + broj + " odgovara karakteru " + (char)broj);

	}

}
