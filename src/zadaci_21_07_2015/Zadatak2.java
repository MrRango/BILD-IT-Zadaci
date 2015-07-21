/*
 * Napisati metodu koja prima jedan argument, broj pitanja, te generiše toliko nasumiènih, jednostavnih pitanja oduzimanja tipa : „Koliko je 5 - 2 ?“. 
 * Metoda treba da broji broj taènih i netaènih odgovora te ih ispiše korisniku.
 */
package zadaci_21_07_2015;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Koliko zelite pitanja? ");
		int brPitanja = in.nextInt();
		//pozivanje metode za testiranje 
		testOduzimanje(brPitanja);
		in.close();
	}
	/*
	 * metoda koja generise uneseni broj jednostavnih pitanja oduzimanja
	 */
	public static void testOduzimanje (int brPitanja){
		
		int brTacnih = 0, privremena;
		Scanner in = new Scanner(System.in);
		//petlja se vrti do unesene vrijednosti(zeljenog broja pitanja)
		for(int i = 0; i < brPitanja; i++){
			//generisanje dva jednocifrena broja
			int brJedan = (int)(Math.round(Math.random()*9));
			int brDva = (int)(Math.round(Math.random()*9));
			//ukoliko je drugi broj veci od prvog, mijenjamo im mjesta da rezultat ne ide u minus
			if(brDva > brJedan){
				privremena = brJedan;
				brJedan = brDva;
				brDva = privremena;
			}
			//postavljanje pitanja
			System.out.println("Koliko je " + brJedan + " - " + brDva + " ?");
			//uzimanje odgovora od korisnika
			int odgovor = in.nextInt();
			//ako je unesen tacan odgovor brojac tacnih odgovora se povecava
			if(odgovor == (brJedan - brDva)){
				brTacnih ++;
			}
		}
		in.close();
		//stampanje rezultata
		System.out.println("Broj tacnih odgovora je: " + brTacnih + "\nBroj netacnih odgovora je: " + (brPitanja - brTacnih));
		
	}

}
