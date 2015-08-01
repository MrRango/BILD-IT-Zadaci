/*
 * Napisati program koji sabira sljedeæu seriju 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 ..... + 95/97 + 97/99.
 */

package zadaci_01_08_2015;

public class Zadatak3 {

	public static void main(String[] args) {
		
		double rezultat = 0;
		//racunanje po zadatom sablonu
		for(int i = 1; i <= 97; i += 2){
			rezultat += i / (double)(i + 2); 
		}
		//stampanje rezultata
		System.out.print(rezultat);
	}

}
