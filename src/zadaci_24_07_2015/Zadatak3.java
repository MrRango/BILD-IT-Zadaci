/*
 * Napisati program koji pita korisnika da unese 2 stringa te ispisuje najve�i zajedni�ki prefix za ta dva stringa, ukoliko isti postoji. 
 * Na primjer, ukoliko korisnik unese sljede�a dva stringa "Dobrodo�li u Dubai" i "Dobrodo�li u Vankuver" program treba da ispi�e: 
 * Najve�i zajedni�ki prefix za dva stringa je "Dobrodo�li u". 
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
