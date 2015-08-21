/*
 * (Process scores in a text file) Suppose that a text file contains an unspecified
 * number of scores separated by blanks. Write a program that prompts the user
 * to enter the file, reads the scores from the file, and displays their total and average.
 */

package zadaci_21_08_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		double suma = 0;
		int brojac = 0;
		
		System.out.println("Unesite ime fajla ");
		// uzimamo od korisnika ome fajla
		String imeFajla = in.nextLine();
		try {
			File file = new File(imeFajla);
			Scanner inFile = new Scanner(file);
			//petlja se vrti dok ima zapisa
			while (inFile.hasNext()) {
				suma += inFile.nextInt();
				brojac++;
			}
			
			//stampanje rezultata
			System.out.println("Ukupno: " + suma + "\nProsjek: " + suma / brojac);
			
			inFile.close();
		} 
		//u slucaju da uneseni fajl ne postoji, ispisuje se poruka
		catch (FileNotFoundException ex) {
			System.out.println("Fajl nije pronadjen");
		}
		finally{
			in.close();
		}
		
	}

}
