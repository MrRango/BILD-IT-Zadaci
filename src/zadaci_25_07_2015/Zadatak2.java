/*
 * Napisati program koji ispisuje sve prijestupne godine, 10 po liniji, u rasponu godina koje korisnik unese. 
 * Program pita korisnika da unese poèetnu godinu, krajnju godinu te ispisuje sve godine u tom rasponu. Razmak izmeðu godina treba biti jedan space. 
 */

package zadaci_25_07_2015;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//uzimamo od korisnika pocetnu godinu
		System.out.println("Unesite pocetnu godinu");
		int pocetnaGodina = in.nextInt();
		//uzimamo od korisnika krajnju godinu
		System.out.println("Unesite krajnju godinu");
		int krajnjaGodina = in.nextInt();
		in.close();
		int brPrestupni = 0;
		//petlja koja ide od pocetne do krajnje godine 
		for(int i = pocetnaGodina; i <= krajnjaGodina; i++){
			//ispitivanje da li je godina prestupna
			//prestupna godina je ako je djeljiva sa 4 i ako nije djeljiva sa 100 ili je djeljiva sa 400
			if(i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)){
				//kad se ispise 10 godina, prelazi se u novi red
				if(brPrestupni != 0 && brPrestupni % 10 == 0){
					System.out.println();
				}
				//brojanje prestupnih godina
				brPrestupni++;
				//stampanje godina
				System.out.print(i + " ");
			}
		}
	}
}
