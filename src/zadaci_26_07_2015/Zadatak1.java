/*
 * Napisati program koji ispisuje tri nasumièna cijela broja te pita korisnika da unese njihov zbir. 
 * Ukoliko korisnik pogriješi, program ispisuje pitanje ponovo sve sa porukom da pokuša ponovo.  
 * Ukoliko korisnik unese taèan odgovor, program mu èestita i završava sa radom. 
 */

package zadaci_26_07_2015;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		//generisanje 3 jednocifrena broja
		int broj1 = (int)(Math.round(Math.random() * 9));
		int broj2 = (int)(Math.round(Math.random() * 9));
		int broj3 = (int)(Math.round(Math.random() * 9));
		//zbir generisanih brojeva
		int rezultat = broj1 + broj2 + broj3;
		int unos = 0;
		
		Scanner in = new Scanner(System.in);
		//dok korisnik ne unese tacan odgovor, pitanje se ponovo postavlja
		do{
			//postavljanje pitanja korisniku
			System.out.println("Koliko je : " + broj1 + " + " + broj2 + " + " + broj3);
			unos = in.nextInt();
			//ispitivanje da li je rezultat tacan
			if(unos == rezultat){
				System.out.println("Unijeli ste tacan rezultat!");
			}else{
				System.out.println("Niste unijeli tacan rezultat, pokusajte ponovo!");
			}
		}while (unos != rezultat);
		in.close();
	}

}
