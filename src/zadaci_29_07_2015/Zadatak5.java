/*
 * Napisati program koji uèitava neodreðen broj cijelih brojeva, odreðuje koliko je pozitivnih brojeva korisnik unijeo,
 * koliko negativnih te izraèunava ukupnu sumu i prosjek svih unesenih brojeva. (Korisnik prekida unos tako što unese nulu). 
 * Na primjer, ukoliko korisnik unese 1 2 -1 3 0 program treba da ispiše da je broj pozitivnih brojeva 3, negativnih brojeva 1, suma ili zbir su 5.0 a prosjek svih brojeva je 1.25.
 */

package zadaci_29_07_2015;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList <>();
		int brojPozitivnih = 0, brojNegativnih = 0;
		double suma = 0;
		
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
				//broj se dodaje na sumu
				suma += broj;
				//ako je broj negativan, povecava se brojac za negativne brojeve
				if(broj < 0){
					brojNegativnih++;
				}
				//ako je broj pozitivan, povecava se brojac za pozitivne brojeve
				else{
					brojPozitivnih++;
				}
			}
		}while(uslov);
		in.close();
		//racunanje prosjeka unesenih brojeva
		double prosjek = suma / list.size();
		//Stampanje rezultata
		System.out.println("Broj pozitivnih brojeva je : " + brojPozitivnih 
				+ "\nBroj negativnih brojeva je: " + brojNegativnih
				+ "\nSuma svih unesenih brojeva je: " + suma
				+ "\nProsjek svih unesenih brojeva je: " + prosjek);

	}

}
