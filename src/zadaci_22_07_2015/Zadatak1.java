/*
 * Napisati metodu koja prima 2 argumenta: poèetni broj i krajnji broj te printa sve proste brojeve u zadanom rangu.
 * BONUS: metoda može primati i treæi argument, broj brojeva za isprintati po liniji.
 */

package zadaci_22_07_2015;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int pocetni, krajnji;
		boolean notLegit = true;;
		System.out.println("Unesite pocetni i krajnji broj ");
		//u slucaju da korisnik unese iste brojeve ili ukoliko je prvi veci od drugog, trazi se novi unos
		do{
			pocetni = in.nextInt();
			krajnji = in.nextInt();
			//ispituje se da li je prvi broj manji od drugog, ako jeste zadovoljava se uslov za izlazak iz petlje
			if(pocetni < krajnji){
				notLegit = false;
			}else{
				System.out.println("Prvi uneseni broj mora da bude manji od drugog!\nUnesite pocetni i krajnji broj ");
			}
			
		}while(notLegit);
		System.out.println("Koliko brojeva zelite da bude ispisano u jednoj liniji? ");
		int broj = in.nextInt();
		in.close();
		//pozivanje metode za stampanje prostih brojeva
		printajProste(pocetni, krajnji, broj);

	}
	/*
	 * metoda za stampanje prostih brojeva u rasponu od prvog unesenog broja do drugog
	 */
	public static void printajProste(int pocetni, int krajnji, int broj){
		int brProstih = 0;
		//petlja od pocetnog do krajnjeg unesenog broja
		for(int i = pocetni; i <= krajnji; i++){
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
					//ako je djeljiv sa unijetim brojem, prelazi se u novi red
					if(brProstih != 0 && brProstih % broj == 0){
						System.out.println();
					}
					//stampanje prostog broja
					System.out.print(i + " ");
					brProstih++;
				}
				
			}
		}
	}
}
