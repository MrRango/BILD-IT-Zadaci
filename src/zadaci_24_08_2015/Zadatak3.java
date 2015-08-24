/*
 * (Baby name popularity ranking) The popularity ranking of baby names from
 * years 2001 to 2010 is downloaded from www.ssa.gov/oact/babynames and stored
 * in files named babynameranking2001.txt, babynameranking2002.txt, . . . ,
 * babynameranking2010.txt. Each file contains one thousand lines. Each line
 * contains a ranking, a boy’s name, number for the boy’s name, a girl’s name,
 * and number for the girl’s name. For example, the first two lines in the file
 * babynameranking2010.txt are as follows:
 * 
 * 1 	Jacob	 21,875	 	Isabella	 22,731
 * 2 	Ethan 	 17,866 	Sophia		 20,477
 * 
 * So, the boy’s name Jacob and girl’s name Isabella are ranked #1 and the boy’s
 * name Ethan and girl’s name Sophia are ranked #2. 21,875 boys are named
 * Jacob and 22,731 girls are named Isabella. Write a program that prompts the
 * user to enter the year, gender, and followed by a name, and displays the ranking
 * of the name for the year.
 */

package zadaci_24_08_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		boolean uslov = true;
		int godina = 0;
		do{
			try{
				//unos godine od strane korisnika
				System.out.println("Unesite godinu: ");
				godina = in.nextInt();
				uslov = false;
			}
			//ako je doslo do izuzetka prilikom unosa godine
			catch(InputMismatchException ex){
				//ispisuje se poruka da je doslo do greske pri unosu i trazi ponovo unosenje
				System.out.println("Pogresan unos, pokusajte ponovo");
				in.nextLine();
			}
			
		}while(uslov);
		//unos imena od strane korisnika
		System.out.println("Unesite ime: ");
		String unesenoIme = in.next().trim();
		//formiranje ime fajla tako da odgovara za unesenu godinu
		String imeFajla = "babynameranking" + godina + ".txt";
		//pronalazenje ranga za uneseno ime
		try {

			File file = new File(imeFajla);
			Scanner inFile = new Scanner(file);
			
			String ime = "";
			//petlja se vrti dok ima linija u fajlu
			//sadrzaj linija se smijesta u odgovarajuce promjenljive
			while(inFile.hasNextLine()){
				int rang = inFile.nextInt();
				String imeMusko = inFile.next().trim();
				inFile.next();
				String imeZensko = inFile.next().trim();
				inFile.next();
				//ako se unijeto ime nadje u fajlu ispisuje se rang
				if(unesenoIme.equals(imeMusko) || unesenoIme.equals(imeZensko)){
					ime = unesenoIme;
					System.out.println(ime + " je na poziciji #" + rang + " u " + godina + ". godini.");
					break;
				}
			}
			//ako ime nije pronadjeno, ispisuje se poruka
			if(ime.length() == 0){
				System.out.println("Uneseno ime nije rangirano u " + godina + ". godini.");
			}
			
			inFile.close();
			
		}
		// u slucaju da uneseni fajl ne postoji, ispisuje se poruka
		catch (FileNotFoundException ex) {
			System.out.println("Fajl nije pronadjen");
		}
		in.close();

	}
}
