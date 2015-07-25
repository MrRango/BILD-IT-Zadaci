/*
 * Ako imamo ubrzanje aviona a te brzinu pri kojoj avion uzlijeće v, možemo izračunati minimalnu dužinu piste potrebne da avion uzleti koristeći se sljedećom formulom: 
 * dužina = v * v / 2a. Napisati program koji pita korisnika da unese v u m/s i a u m/s² te ispisuje korisniku minimalnu dužinu piste. 
 * (Primjer: ukoliko unesemo 60 za brzinu i 3.5 za ubrzanje dužina piste je 514.286)
 */

package zadaci_25_07_2015;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//uzimanje od korisnika brzinu aviona
		System.out.println("Unesite brzinu aviona u m/s ");
		double brzina = in.nextDouble();
		//uzimanje od korisnika ubrzanje aviona
		System.out.println("Unesite ubrzanje aviona m/s² ");
		double ubrzanje = in.nextDouble();
		in.close();
		//izracunavanje minimalne duzine piste
		double duzinaPiste = (brzina * brzina) / (2 * ubrzanje);
		//stampanje rezultata
		System.out.println("Minimalna duzina piste potrebna za uzlijetanje je: " + (int)(duzinaPiste * 1000) / 1000.0);

	}

}
