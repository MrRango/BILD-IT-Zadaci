/*
 * Napisati program koji uèitava iznos investicije, godišnju interesnu stopu i broj godina te vraæa buduæu vrijednost investicije koristeæi se sljedeæom formulom: 
 * buducaVrijednostInvesticije = iznosInvesticije * (1 + mjesecnaInteresnaStopa)^brojGodina*12. 
 * Na primjer, ukoliko uneste kao iznos investicije 1000, 3.25 kao godišnju interesnu stopu i 1 kao broj godina program vam vraæa 1032.98 kao buducu vrijednost investicije.
 */

package zadaci_25_07_2015;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//uzimanje podataka od korisnika
		System.out.println("Unesite iznos investicije ");
		double iznosInvesticije = in.nextDouble();							
		System.out.println("Unesite godisnju interesnu stopu ");
		double godisnjaInteresnaStopa = in.nextDouble() / 100;			//godisnja interesna stopa se dijeli sa 100 da se dobije procenat
		System.out.println("Unesite broj godina ");
		int brojGodina = in.nextInt();
		in.close();
		// buducu vrijednost investicije se racuna po datoj formuli
		double buducaVrijednostInvesticije = iznosInvesticije * Math.pow((1 + godisnjaInteresnaStopa / 12), brojGodina * 12);
		//stampanje rezultata		
		System.out.println("Buduca vrijednos investicije je: " + (int)(buducaVrijednostInvesticije * 100) / 100.0);		
	}

}
