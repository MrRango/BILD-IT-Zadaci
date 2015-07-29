/*
 * Napisati program koji ispisuje sve proste brojeve od 2 do 1000, ukljuæujuæi i 2 i 1000. 
 * Program treba da ispiše 8 brojeva po liniji te razmak izmeðu brojeva treba da bude jedan space.
 */

package zadaci_29_07_2015;

public class Zadatak2 {

	public static void main(String[] args) {
		
		int brojac = 0;
		//petlja od pocetne do krajnje vrjednosti
		for(int i = 2; i <= 1000; i++){
			//petlja koja se vrti do vrijednosti koja je trenutno u prvoj petlji
			for(int j = 2; j <= i; j++){
				//testiranje da li je broj djeljiv sa bilo kojim manjim brojem
				//ako je uslov tacan, broj nije prost i on se preskace
				if(i % j == 0 && i != j){
					break;
				}
				//ako su vrijednosti prve i druge petlje jednake broj je prost
				if(i == j){
					//ispituje se koliko se puta printao prost broj
					//ako je djeljiv sa 8, prelazi se u novi red
					if(brojac != 0 && brojac % 8 == 0){
						System.out.println();
					}
					//stampanje prostog broja
					System.out.print(i + " ");
					brojac++;
				}
				
			}
		}

	}

}
