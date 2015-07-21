/*
 * Napisati metodu koja prima jedan argument te simulira bacanje novèiæa toliko puta. 
 * Nakon što se simulacija završi, program ispisuje koliko puta je novèiæ pokazao glavu a koliko puta pismo.
 */

package zadaci_21_07_2015;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Koliko zelite da se baca novcic? ");
		int brBacanja = in.nextInt();
		in.close();
		//pozivanje metode za testiranje bavanja novcica
		testirajBacanja(brBacanja);
	}
	/*
	 * metoda koja simulira bacanje novcica i broji koliko puta se pokazala glava, a koliko pismo
	 */
	public static void testirajBacanja(int brBacanja){
		int brGlava = 0;
		//petlja se vrti onoliko puta koliko korisnik unese da zeli da se novcic baca
		for(int i = 0; i < brBacanja; i++){
			//generise se jedan od dva moguca rjesenja(0 = glava, 1 = pismo)
			int rezultat = (int)(Math.round(Math.random()*1));
			//kad se generise 0, broj pokazivanja glava se povecava
			if(rezultat == 0){
				brGlava++;
			}
		}
		//stampanje rezultata
		System.out.println("Broj bacanja novcica: " + brBacanja + "\nNovcic pokazao glavu: " + brGlava + "\nNovcic pokazao pismo: " + (brBacanja - brGlava));
	}
}
