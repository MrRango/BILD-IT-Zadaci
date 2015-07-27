/*
 * Napisati program koji pita korisnika da unese cijeli broj za današnji dan u sedmici (0 za ponedjeljak, 1 za utorak...) 
 * i da unese broj dana nakon današnjeg dana te mu ispiše koji je to dan u buduænosti. 
 * (Primjer: ako korisnik unese 1 kao današnji dan a 3 kao dan u buduænosti program mu ispisuje da je danas utorak a dan u buduænosti je petak.) 
 */

package zadaci_27_07_2015;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		//svi dani smjesteni u niz
		String[]dani = {"ponedeljak", "utorak", "srijeda", "cetvrtak", "petak", "subota", "nedelja"};
		//uzimanej podataka od korisnika
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite koji je danas dan u sedimici");
		int danasDan = in.nextInt();
		System.out.println("Unesite broj dana za koliko zelite da vidite koji je dan u sedimici");
		int pomak = in.nextInt();
		in.close();
		//racunanje koji dan u sedmici za unijeti broj dana ce biti u odnosu na danasnji 
		int noviDan = (danasDan + pomak) % 7;
		//stampanje rezultata
		System.out.println("Danas je " + dani[danasDan] + ", za " + pomak + " dana ce biti " + dani[noviDan]);
	}
}
