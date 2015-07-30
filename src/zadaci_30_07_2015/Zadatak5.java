/*
 * Napisati program koji uèitava cijele brojeve u rasponu od 1 do 100 te broji i ispisuje koliko je koji broj puta unijet. Pretpostavimo da nula prekida unos brojeva. 
 * Ukoliko unesemo sljedeæi niz brojeva 2 5 6 23 42 58 2 6 0 program nam ispisuje da se broj 2 ponavlja 2 puta, broj 5 jednom, broj 6 2 puta, broj 23 jednom, itd.
 */

package zadaci_30_07_2015;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		//lista za unos brojeve
		ArrayList<Integer> list = new ArrayList <>();
		//niz za vodjenje evidencije o broju pojavljivanja brojeva
		int[]brojevi = new int[100];
		
		Scanner in = new Scanner(System.in);
		boolean uslov = true;
		System.out.println("Unesite brojeve: ");
		//unos brojeva u listu
		do{
			int broj = in.nextInt();
			//ako je unesen broj 0 unos se zavrsava
			if(broj == 0){
				uslov = false;
			}
			//ako je unesen broj razlicit od 0, broj se dodaje u listu
			else{
				list.add(broj);
				brojevi[broj - 1]++;
			}
		}while(uslov);
		in.close();
		//prolaz kroz niz za vodjenje evidencije broja ponavljanja
		for(int i = 0; i < brojevi.length; i++){
			if(brojevi[i] > 0){
				//stampanje broja ponavljanja za sve brojeve koji su se pojavili barem jednom
				System.out.println("Broj " + (i + 1) + " se pojavio " + brojevi[i] + " puta.");
			}
		}

	}

}
