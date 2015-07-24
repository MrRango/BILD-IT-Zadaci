/*
 * Napisati program koji simulira nasumièno izvlaèenje karte iz špila od 52 karte. 
 * Program treba ispisati koja karta je izvuèena (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q ili K) te znak u kojem je data karta (srce, pik, djetelina, kocka). 
 * Primjer: Karta koju ste izvukli je 10 u znaku kocke. 
 */

package zadaci_24_07_2015;


public class Zadatak2 {

	public static void main(String[] args) {
		//spisak svih karti smejestenih u matricu
		String[][] karte = {{"A", "djetelina"}, {"A", "pik"}, {"A", "kocka"}, {"A", "srce"}, 
							{"2", "djetelina"}, {"2", "pik"}, {"2", "kocka"}, {"2", "srce"}, 
							{"3", "djetelina"}, {"3", "pik"}, {"3", "kocka"}, {"3", "srce"}, 
							{"4", "djetelina"}, {"4", "pik"}, {"4", "kocka"}, {"4", "srce"}, 
							{"5", "djetelina"}, {"5", "pik"}, {"5", "kocka"}, {"5", "srce"}, 
							{"6", "djetelina"}, {"6", "pik"}, {"6", "kocka"}, {"6", "srce"}, 
							{"7", "djetelina"}, {"7", "pik"}, {"7", "kocka"}, {"7", "srce"},
							{"8", "djetelina"}, {"8", "pik"}, {"8", "kocka"}, {"8", "srce"},
							{"9", "djetelina"}, {"9", "pik"}, {"9", "kocka"}, {"9", "srce"}, 
							{"10", "djetelina"}, {"10", "pik"},  {"10", "kocka"},  {"10", "srce"},  
							{"J", "djetelina"}, {"J", "pik"}, {"J", "kocka"}, {"J", "srce"}, 
							{"Q", "djetelina"}, {"Q", "pik"}, {"Q", "kocka"}, {"Q", "srce"}, 
							{"K", "djetelina"}, {"K", "pik"}, {"K", "kocka"}, {"K", "srce"}};
		//generisanje karte
		int broj = (int)(Math.round(Math.random() * 51));
		//stampanje rezultata 
		System.out.println("Karta koju ste izvukli je " + karte[broj][0] + " u znaku " + karte[broj][1]);

	}

}
