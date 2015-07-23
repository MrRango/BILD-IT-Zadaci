/*
 * Napisati metodu koja printa 100 nasumiènih uppercase karaktera i 100 nasumiènih brojeva, 10 po liniji.
 */

package zadaci_23_07_2015;

public class Zadatak4 {

	public static void main(String[] args) {
		//pozivanje metode
		print();
			
	}
	/*
	 * metoda za stampanje 100 nasumicnih uppercase keraktera i 100 nasumicnih jednocifrenih brojeva
	 */
	public static void print(){	
		//generisanje i stampanje 100 nasumicnih uppercase karaktera
		for(int i = 0; i < 100; i++){
			//ako je odstampano 10 karaktera, prelazi se u novi red
			if(i % 10 == 0){
				System.out.println();
			}
			//generisanje nasumicnog uppercase karaktera
			char karakter = (char)(Math.random()*26 + 'A');
			//stampanje karaktera
			System.out.print(karakter + " ");
		}
		System.out.println();
		//generisanje i stampanje 100 nasumicnih jednocifrenih brojeva
		for(int i = 0; i < 100; i++){
			//ako je odstampano 10 brojeva, prelazi se u novi red
			if(i % 10 == 0){
				System.out.println();
			}
			//generisanje nasumicnog jednocifrenog broja
			int broj = (int)(Math.round(Math.random()*9));
			//stampanje broja
			System.out.print(broj + " ");
		}
	}
}
