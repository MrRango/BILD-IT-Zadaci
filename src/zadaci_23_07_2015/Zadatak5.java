/*
 * Napisati program koji uèitava neodreðeni broj cijelih brojeva (nula prekida unos) te ispisuje koliko je brojeva bilo iznad ili jednako prosjeku svih unešenih brojeva 
 * a koliko je bilo brojeva ispod prosjeka. Pretpostavimo da je maksimalan niz brojeva koje korisnik može unijeti 100.
 */
 
package zadaci_23_07_2015;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList <>();
		Scanner in = new Scanner(System.in);
		boolean uslov = true;
		int brojac  = 0, brIspodProsjeka = 0, brIznadProsjeka = 0;
		double suma = 0;
		System.out.println("Unesite brojeve: ");
		//unos brojeva u listu
		do{
			int broj = in.nextInt();
			//ako je unesen broj 0 ili ako je uneseno 100 brojeva, unos se zavrsava
			if(broj == 0 || brojac == 100){
				uslov = false;
			}
			//ako je unesen broj razlicit od 0, broj se dodaje u listu
			else{
				list.add(broj);
				//broji koliko je brojeva uneseno u listu
				brojac++;
				//sve unesene brojeve dodaje na sumu
				suma += broj;
			}
		}while(uslov);
		in.close();
		//racuna se prosjek svih unesenih brojeva
		double prosjek = suma / brojac;
		//testiranje unesenih brojeva, da li su veci ili jednaki, ili su manji od prosjeka
		for(int i = 0; i < brojac; i++){
			//ako je broj veci ili jednak prosjeku, povecava se brojac za brojeve izndad prosjeka
			if(list.get(i)>= prosjek){
				brIznadProsjeka++;
			//ako je manji povecava se brojac za brojeve ispod prosjeka
			}else{
				brIspodProsjeka++;
			}
		}
		//stampanje rezultata
		System.out.print("Broj brojeva koji su iznad ili jednaki prosjeku unesenih brojeva: " + brIznadProsjeka 
				+ "\nBroj brojeva koji su ispod prosjeka unesenih brojeva: " + brIspodProsjeka);
	}

}
