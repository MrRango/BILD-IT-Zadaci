/*
 * Napisati program koji pita korisnika da unese dva cijela, pozitivna broja te ispisuje najveæi i najmanji zajednièki djelilac za ta dva broja.
 */

package zadaci_30_07_2015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		//lista za smijestanje zajednickih djelilaca
		ArrayList<Integer> lista = new ArrayList<>();
		
		Scanner in = new Scanner(System.in);
		//unos dva broja od strane korisnika
		System.out.println("Unesite dva broja");
		int broj1 = in.nextInt();
		int broj2 = in.nextInt();
		in.close();
		//petlja od 2 do manjeg od dva unesena broja
		for(int i = 2; i < broj1 && i < broj2; i++){
			//ako su oba broja djeljiva sa istim brojem, taj broj se dodaje u listu
			if(broj1 % i == 0 && broj2 % i == 0){
				lista.add(i);
			}
		}
		//ako lista sadrzi vise od jednog elementa, znaci da postoji najmanji i najveci djelilac za unijete brojeve
		if(lista.size() > 1){
			//lista se sortira
			Collections.sort(lista);
			//kao najmanji se stampa element prvi u listi, a kao najveci zadnji clan u listi
			System.out.println("Najmanji zajednicki djelilac za brojeve " + broj1 + " i " + broj2 + " je: " + lista.get(0) 
					+ "\nNajveci zajednicki djelilac za brojeve " + broj1 + " i " + broj2 + " je: " + lista.get(lista.size() - 1));
		}else{
			//ako se u listi ne nalaze minimalno dva elementa, spampa se odgovarajuca poruka
			System.out.println("Unijeti brojevi nemaju dva zajednicka djelioca, tako da nije moguce odstampati najmanji i najveci");
		}

	}

}
