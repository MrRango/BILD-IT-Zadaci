/*
 * Napišite program koji ispisuje sve brojeve, od 100 do 1000, 10 brojeva po liniji, koji su djeljivi i sa 5 i sa 6. Razmak izmeðu brojeva treba biti taèno jedan space. 
 */

package zadaci_27_07_2015;

public class Zadatak3 {

	public static void main(String[] args) {
		
		int brojac = 0;
		//petlja se vrti od 100 do 1000 i testira sve brojeve izmedju ove dvije vrijednosti, ukljucujuci i njih
		for(int i = 100; i <= 1000; i++){
			//testiranje da li je trenutni broj djeljiv sa 5 i sa 6
			if(i % 5 == 0 && i % 6 == 0){
				//prelazak u novi red ako je vec odstampano 10 brojeva
				if(brojac != 0 && brojac % 10 == 0){
					System.out.println();
				}
				//stampanje broja djeljivog sa 5 i sa 6
				System.out.print(i + " ");
				//povecavanje brojaca koji broji koliko je brojeva odstampano
				brojac++;
			}
		}

	}

}
