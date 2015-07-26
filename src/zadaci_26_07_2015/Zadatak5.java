/*
 * Neke web stranice forsiraju odreðena pravila za passworde. Napisati metodu koja provjerava da li je unijeti string validan password. 
 * Pravila da bi password bio validan su sljedeæa:
 * 1. Password mora biti saèinjen od najmanje 8 karaktera. 
 * 2. Password smije da se sastoji samo od slova i brojeva. 
 * 3. Password mora sadržati najmanje 2 broja. 
 * Napisati program koji pita korisnika da unese password te mu ispisuje "password je validan" ukoliko su sva pravila ispoštovana ili "password nije validan" 
 * ukoliko pravila nisu ispoštovana.
 */

package zadaci_26_07_2015;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//uzimanje passworda od korisnika
		System.out.println("Unesite password za provjeru ");
		String pass = in.next();
		in.close();
		int brojSlova = 0, brojBrojeva = 0;
		//prolazak kroz password karakter po karakter
		for(int i = 0; i < pass.length(); i++){
			//odvajanje karaktera iz passworda
			char karakter = pass.charAt(i);
			//testiranje karaktera, da li je broj, veliko ili malo slovo
			if((karakter >= '0' && karakter <= '9')||(karakter >= 'A' && karakter <= 'Z')||(karakter >= 'a' && karakter <= 'z')){
				//brojanje malih i velikih slova
				if((karakter >= 'a' && karakter <= 'z')||(karakter >= 'A' && karakter <= 'Z')){
					brojSlova++;
				}
				//brojanje brojeva
				if((karakter >= '0' && karakter <= '9')){
					brojBrojeva++;
				}
			}
		}
		//provjeravanje da li password ima dovoljno ukupno karaktera i dovoljno brojeva, i stampanje odgovarajuceg rezultata
		if((brojSlova + brojBrojeva >= 8) && brojBrojeva >= 2){
			System.out.println("Password je validan");
		}else{
			System.out.println("Password nije validan");
		}

	}

}
