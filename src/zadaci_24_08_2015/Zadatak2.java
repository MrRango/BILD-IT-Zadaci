/*
 * (Occurrences of each letter) Write a program that prompts the user to enter
 * a file name and displays the occurrences of each letter in the file. Letters are
 * case-insensitive.
 */

package zadaci_24_08_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite ime fajla ");
		// uzimamo od korisnika ime fajla
		String imeFajla = in.nextLine();
		// pozivamo metodu za prebrojavanje slova u fajlu
		try {
			prebrojSlova(imeFajla);
		}
		// u slucaju da uneseni fajl ne postoji, ispisuje se poruka
		catch (FileNotFoundException ex) {
			System.out.println("Fajl nije pronadjen");
		}
		in.close();

	}
	/*
	 * metoda za brojanje slova u fajlu
	 */
	public static void prebrojSlova(String imeFajla) throws FileNotFoundException{
		//niz koji sadrzi sva slova
		char[] slova = {'A', 'B', 'C', 'D',	'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};	
		//niz za brojanje pojavljivanja slova
		int[] brojacSlova = new int[26];
		
		File file = new File(imeFajla);
		
		Scanner inFile = new Scanner(file);
		//petlja se vrti dok ima rijeci u fajlu
		while(inFile.hasNext()){
			//rijec se smijesta u string i podize u velika slova
			String str = inFile.next().toUpperCase();
			//prolazak kroz rijec
			for(int i = 0; i < str.length(); i++){
				//odvajanje karaktera iz rijeci
				char karakter = str.charAt(i);
				//uporedjivanje karaktera sa slovima u nizu slova
				for(int j = 0; j < slova.length; j++){
					//ako je karakrer jednak slovi, brojac za to slovo se povecava
					if(karakter == slova[j]){
						brojacSlova[j]++;
					}
				}
			}
		}
		inFile.close();
		//stampanje rezultata
		for(int i = 0; i < slova.length; i++){
			System.out.println("Slovo " + slova[i] + " se pojavljuje " + brojacSlova[i]);
		}
		
	}

}
