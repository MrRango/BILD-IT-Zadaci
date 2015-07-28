/*
 * Napisati program koji pita korisnika da unese dva stringa te provjerava i ispisuje da li je drugi string substring prvog stringa. 
 * Na primjer, ukoliko korisnik unese ABCD kao prvi string a BC kao drugi string program mu ispisuje da je BC substring ABCD stringa.
 */

package zadaci_28_07_2015;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//uzimanje dva stringa od korisnika
		System.out.println("Unesite prvi string");
		String string1 = in.nextLine();
		System.out.println("Unesite drugi string");
		String string2 = in.nextLine();
		in.close();
		//provjera da li su dva stinga jednaka
		if(string1.equals(string2)){
			//stampanje poruke da su stringovi jednaki
			System.out.println("Prvi i drugi sting su jednaki");
		}
		//provjera da li je drugi string substring prvog stringa
		else if(string1.contains(string2)){
			//stampanje poruke da je drugi string substring prvog stringa
			System.out.println("Drugi string je substring prvog stringa");
		}else{
			//stampanje poruke da drugi string nije substring prvog stringa
			System.out.println("Drugi string nije substring prvog stringa");
		}
		
	}

}
