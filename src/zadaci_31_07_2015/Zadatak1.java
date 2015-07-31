/*
 * Napisati program koji uèitava ukupan iznos raèuna koji treba uplatiti kao i procenat tog raèuna kojeg želimo platiti kao napojnicu te izraèunava ukupan raèun i napojnicu.
 * Na primjer, ukoliko korisnik unese 10 kao raèun i 15 % kao procenat za napojnicu program treba da ispiše da je ukupan raèun za uplatiti 11.5 a napojnica 1.5.
 */

package zadaci_31_07_2015;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//unos iznosa racuna od strane korisnika
		System.out.println("Unesite iznos racuna");
		double iznosRacuna = in.nextDouble();
		//unos procenta za napojnicu od strane korisnika
		System.out.println("Unesite procenat za napojnicu");
		int procenatZaNapojnicu = in.nextInt();
		in.close();
		//izracunavanje iznosa napojnice
		double iznosNapojnice = iznosRacuna * (procenatZaNapojnicu / 100.0);
		//izracunavanje ukupnog iznosa racuna 
		double ukupanIznosRacuna = iznosRacuna + iznosNapojnice;
		//stampanje rezultata
		System.out.println("Ukupan racun za uplatiti: " + ukupanIznosRacuna + ", a napojnica je: " + iznosNapojnice);
	}

}
