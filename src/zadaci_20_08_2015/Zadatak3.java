/*
 * (InputMismatchException) Write a program that prompts the user to read
 * two integers and displays their sum. Your program should prompt the user to
 * read the number again if the input is incorrect.
 */

package zadaci_20_08_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		boolean uslov = true;
		int broj1 = 0;
		int broj2 = 0;
		//petlja se vrti dok unos nije ispravan (dva cijela broja)
		do {
			try {
				//uzimanje od korisnika dva cijela broja
				System.out.println("Unesite dva cijela broja");
				broj1 = in.nextInt();
				broj2 = in.nextInt();
				//uslov za izlazak iz petlje
				uslov = false;
			//ako je doslo do izuzetka prilikom unosa brojeva
			} catch (InputMismatchException ex) {
				//ispisuje se poruka da je unos pogresan
				System.out.println("Pogresan unos, pokusajte ponovo");
				in.nextLine();
			}
			
		} while (uslov);
		in.close();
		//stampanje sume dva unesena cijela broja
		System.out.println("Suma unesenih brojeva je: " + (broj1 + broj2));
	}
}
