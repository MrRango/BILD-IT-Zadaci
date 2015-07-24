/*
 * Napisati program koji pita korisnika da unese 2 stringa te ispisuje najveæi zajednièki prefix za ta dva stringa, ukoliko isti postoji. 
 * Na primjer, ukoliko korisnik unese sljedeæa dva stringa "Dobrodošli u Dubai" i "Dobrodošli u Vankuver" program treba da ispiše: 
 * Najveæi zajednièki prefix za dva stringa je "Dobrodošli u". 
 */

package zadaci_24_07_2015;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite dva stringa");
		//uzimanje dva stringa od korisnika
		String string1 = in.nextLine();
		String string2 = in.nextLine();
		
		in.close();
		//splitovanje unesenih stringova na rijeci
		String[] str1 = string1.split(" ");
		String[] str2 = string2.split(" ");
		
		//ispitivanje da li stringovi pocinju sa istom rijeci
		if(str1[0].equals(str2[0])){
			System.out.print("Najveci zajednicki prefix za unesena dva stringa je: ");
			//testira se koliko stringovi od pocetka imaju zajednickih rijeci i one se stampaju
			for(int i = 0; i < str1.length && i < str2.length; i++){
				if(str1[i].equals(str2[i])){
					System.out.print(str1[i] + " ");
				}
			}
		} 
		//ako stringovi ne pocinju sa istom rijeci 
		else {
			System.out.println("Uneseni stringovi nemaju zajednicki prefiks");
		}
	}
}
