/*
 * Napišite program koji generiše 100 nasumiènih cijelih brojeva izmeðu 0 i 9 te ispisuje koliko se puta koji broj ponovio.
 */

package zadaci_20_07_2015;

public class Zadatak4 {
	
	public static void main(String[] args) {
		//brojac za cifre od 0 do 9
		int[] brojac = new int[10];
		//petlja za generisanje 100 brojeva
		for(int i = 0; i < 100; i++){
			//generisanje broja od 0 do 9
			int broj = (int)(Math.round(Math.random()*9));
			//na odgovarajucoj poziciji u brojacu se uvecava vrijednost za generisani broj
			brojac[broj]++;
		}
		//ispis rezultata
		for(int j = 0; j < brojac.length; j++){
			System.out.println("Broj " + j + " se pojavio " + brojac[j] + " puta.");
		}
		
	}
}
