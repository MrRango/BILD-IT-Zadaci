/*
 * Napisati program koji ispisuje sve mogu�e kombinacije za biranje dva broja u rasponu od 1 do 7. Tako�er, program ispisuje broj svih mogu�ih kombinacija.  
 * Dakle, program treba da ispi�e sve mogu�e parove brojeva u datom rasponu, krenuv�i sa 1 2, 1 3, 1 4, itd. Broj mogu�ih kombinacija je 21. 
 */

package zadaci_28_07_2015;

public class Zadatak3 {

	public static void main(String[] args) {
		
		int brojac = 0;
		//pravljenje kombinacija pomocu dvije petlje
		for(int i = 1; i <= 7; i++){
			for(int j = 1; j < i; j++){
				//stampanje kombinacije
				System.out.println(j + " " + i);
				//brojanje kombinacija
				brojac++;
				
			}
		}
		//stampanje broja kombinacija
		System.out.println("Ukupan broj kombinacija je " + brojac);
	}

}
