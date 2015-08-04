/*
 * Napisati program koji uèitava 10 brojeva te ispisuje koilko je jedinstvenih brojeva unijeto te sve jedinstvene brojeve koji su unijeti, razmaknute jednim spaceom. 
 * Ukoliko se neki broj pojavljuje više puta, broj treba ispisati samo jednom.
 */

package zadaci_04_08_2015;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		//niz duzine 10 kao brojac za cifre
		int[] brojevi = new int[10];
		//lista za smijestanje cifara koje se pojavljuju
		ArrayList<Integer> jedinstveni = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite 10 brojeva");
		//unos 10 brojeva od strane korisnika
		for(int i = 0; i < 10; i++){
			int broj = in.nextInt();
			//povecavanje brojaca za odgovarajuci broj
			brojevi[broj]++;
		}
		in.close();
		//unos brojeva koji su se pojavili u listu i njihovo stampanje
		for(int i = 0; i < 10; i++){
			//ako se broj pojavio barem jednom, dodaje se u listu i stampa
			if(brojevi[i] > 0){
				System.out.print(i + " ");
				jedinstveni.add(i);
			}
		}
		//stampanje broja jedinstvenih brojeva
		System.out.println("\nBroj jedinstvenih brojeva je " + jedinstveni.size());
	}

}
