/*
 * (Algebra: perfect square) Write a program that prompts the user to enter an integer
 * m and find the smallest integer n such that m * n is a perfect square. (Hint:
 * Store all smallest factors of m into an array list. n is the product of the factors that
 * appear an odd number of times in the array list. For example, consider m = 90,
 * store the factors 2, 3, 3, 5 in an array list. 2 and 5 appear an odd number of times
 * in the array list. So, n is 10.)
 */

package zadaci_20_08_2015;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int m = 0;
		boolean uslov = true;
		
		do {
			try {
				//unos broja od strane korisnika
				System.out.println("Unesite cijeli broj");
				m = in.nextInt();
				//uslov za izlazak iz petlje
				uslov = false;
			//ako je doslo do izuzetka prilikom unosa brojeva
			} catch (InputMismatchException ex) {
				//ispisuje se poruka da je unos pogresan
				System.out.println("Pogresan unos, pokusajte ponovo");
				in.nextLine();
			}
			
		} while (uslov);
		in.close();
		//pozivanje metode i stampanje rezultata
		System.out.println("Za m = " + m + ", n = " + findPerfectSquare(m));

	}
	/*
	 * metoda koja pronalazi 'perfect square'
	 */
	public static int findPerfectSquare(int m){
		int rezultat = 1;
		//pozivanje metode za pronalazenje najmanjih faktora broja m
		ArrayList<Integer> faktori = nadjiFaktore(m);
		//uklanjanje duplikata iz liste faktrori
		ArrayList<Integer> poJedan = removeDuplicate(faktori);
		//niz za brojanje ponavljanja vrijednosti faktora u listi faktori
		int[] brojac = new int[poJedan.size()];
		//brojanje ponavljanja vrijednosti faktora u listi faktori 
		for(int i = 0; i < poJedan.size(); i++){
			for(int j = 0; j < faktori.size(); j++){
				if(poJedan.get(i) == faktori.get(j)){
					brojac[i]++;
				}
			}
		}
		//rezultat dobijamo mnozenjem elemenata liste 'poJedan' koji su se pojavili u listi 'faktori' neparan broj puta
		for(int i = 0; i < brojac.length; i++){
			if(brojac[i] % 2 != 0){
				rezultat *= poJedan.get(i);
			}
		}
	
		return rezultat;
	}
	
	/*
	 * metoda za pronalazenje najmanjih faktora broja
	 */
	public static ArrayList<Integer> nadjiFaktore(int m){
		ArrayList<Integer> listaFaktora = new ArrayList<>();
		int br = m;
		//ispitujemo da li je broj djeljiv sa bilo kojim brojem manjim od sebe 
		for(int i = 2; i < br; i++){
			//dok god je broj djeljiv sa trenutnom vrijednoscu 'i', dijelimo ga i u listu dodajemo vrijednost 'i'
			while(m % i == 0){ 		
				m = m / i;
				listaFaktora.add(i);
			}
		}
		
		return listaFaktora;
	}
	
	/*
	 * metoda za uklanjanje duplikata iz liste
	 */
	public static ArrayList<Integer> removeDuplicate(ArrayList<Integer> list){
		//kreiranje nove liste za smijestenje unikata
		ArrayList<Integer> listaBezDuplikata = new ArrayList<>();
		//dodavanje prvog elementa iz liste u listu unikata
		listaBezDuplikata.add(list.get(0));
		//prolazak kroz listu i listu unikata
		for(int i = 0; i < list.size(); i++){
			for(int j = 0; j < listaBezDuplikata.size(); j++){
				//ako je element iz liste jednak elementu iz liste unikata, preskacemo ga
				if(list.get(i) == listaBezDuplikata.get(j)){
					break;
				}
				//kad se dodje do kraja liste unikata, a elemenat iz liste se ne nalaui u listi unikata, taj elemenata se dodaje u listu unikata
				if(j == listaBezDuplikata.size() - 1){
					listaBezDuplikata.add(list.get(i));
				}
				
			}
		}
		
		return listaBezDuplikata;
	}
}
