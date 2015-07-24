/*
 * Pretpostavimo da uplatimo $100 svaki mjesec na �tedni ra�un koji ima godi�nju interesnu stopu od 5%. 
 * Mjese�na interesna stopa je stoga 0.05 / 12 = 0.00417. Nakon prvog mjeseca vrijednost na ra�unu postaje 100 * (1 + 0.00417) = 100.417. 
 * Nakon drugog mjeseca, vrijednost na ra�unu postaje (100 + 100.417) * (1 + 0.00417) = 201.252. 
 * Nakon tre�eg mjeseca, vrijednost na ra�unu postaje (100 + 201.252) * (1 + 0.00417) = 302.507 i tako dalje. 
 * Napisati program koji pita korisnika da unese mjese�ni iznos �tednje te broj mjeseci nakon kojeg bi �elio znati stanje ra�una. 
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
