/*
 * (ArrayIndexOutOfBoundsException) Write a program that meets the following requirements:
 * - Creates an array with 100 randomly chosen integers.
 * - Prompts the user to enter the index of the array, then displays the corresponding
 * element value. If the specified index is out of bounds, display the message Out of Bounds.
 */

package zadaci_20_08_2015;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int[] niz = new int[100];
		int indeks = 0;
		//popunjavanje niza generisanim brojevima
		for(int i = 0; i < 100; i++){
			niz[i] = (int)(Math.random() * 2);
		}
		//unos indeksa od strane korisnika
		System.out.println("Unesite indeks:");
		indeks = in.nextInt();
		//u slucaju ispravnog unos ispisivanje rezultataa, ili izbavivanje izuzetka ako je unos neispravan
		try{
			System.out.println("Element niza sa indeksom " + indeks + " je: " + niz[indeks]);
		}
		//prihvatanje izuzetka
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Unijeli ste indek koji je van opsega");
		}
		finally{
			in.close();
		}

	}

}
