/*
 * Pretpostavimo da se registarska tablica za auto sastoji od tri uppercase karaktera i 4 broja u sljedeæem formatu AAA-1234. 
 * Napisati program koji nasumièno generiše tablicu.
 */

package zadaci_30_07_2015;

public class Zadatak1 {

	public static void main(String[] args) {
		//generisanje tri uppercase karaktera
		char karakter1 = (char)(Math.random()*26 + 'A');
		char karakter2 = (char)(Math.random()*26 + 'A');
		char karakter3 = (char)(Math.random()*26 + 'A');
		//generisanje cetri broja
		int broj1 = (int)(Math.round(Math.random()*9));
		int broj2 = (int)(Math.round(Math.random()*9));
		int broj3 = (int)(Math.round(Math.random()*9));
		int broj4 = (int)(Math.round(Math.random()*9));
	
		//stampanje rezultata
		System.out.println("Generisana tablica: " + karakter1 + karakter2 + karakter3 + "-" + broj1 + broj2 + broj3 + broj4);

	}

}
