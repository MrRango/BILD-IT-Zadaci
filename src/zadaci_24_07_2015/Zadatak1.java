/*
 * Pretpostavimo da uplatimo $100 svaki mjesec na štedni raèun koji ima godišnju interesnu stopu od 5%. 
 * Mjeseèna interesna stopa je stoga 0.05 / 12 = 0.00417. Nakon prvog mjeseca vrijednost na raèunu postaje 100 * (1 + 0.00417) = 100.417. 
 * Nakon drugog mjeseca, vrijednost na raèunu postaje (100 + 100.417) * (1 + 0.00417) = 201.252. 
 * Nakon treæeg mjeseca, vrijednost na raèunu postaje (100 + 201.252) * (1 + 0.00417) = 302.507 i tako dalje. 
 * Napisati program koji pita korisnika da unese mjeseèni iznos štednje te broj mjeseci nakon kojeg bi želio znati stanje raèuna. 
 */

package zadaci_24_07_2015;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		double stanjeRacuna = 0;
		Scanner in = new Scanner(System.in);
		//uzimamo od korisnika mjesecni iznos uplate 
		System.out.println("Unesite mjesecni iznos stednje ");
		double iznos = in.nextDouble();
		//uzimamo od korisnika broj mjeseci za obracun
		System.out.println("Unesite broj mjeseci nakon kojeg zelite znati stanje racuna ");
		int brMjeseci = in.nextInt();
		in.close();
		//ponavljamo operaciju racunanja za uneseni broj mjeseci
		for(int i = 0; i < brMjeseci; i++){
			//racunanje stanja racuna
			stanjeRacuna = (stanjeRacuna + iznos) * (1 + 0.00417);
		}
		//stampane rezultata
		System.out.println("Stanje racuna za unijeti broj mjeseci: " + (int)(stanjeRacuna * 1000)/1000.0);
	}

}
