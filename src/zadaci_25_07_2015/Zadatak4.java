/*
 * Napisati program koji pita korisnika da unese neki string te mu ispisuje sve karaktere koji se nalaze na neparnim pozicijama. 
 * Na primjer, ako korisnik unese string Beijing Chicago, program vraæa BiigCiao.
 */

package zadaci_25_07_2015;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//uzimanje stringa od korisnika
		System.out.println("Unesite string");
		String str = in.nextLine();
		in.close();
		//prolazak kroz citav string
		for(int i = 0; i < str.length(); i++){
			//odvajanje karakrera iz stringa
			char karakter = str.charAt(i);
			//ispisivanje svakog drugog karaktera krecuci od prvog, tj. ispisivanje karaktera na neparnim pozicijama
			if(i % 2 == 0){
				System.out.print(karakter);
			}
		}

	}

}
