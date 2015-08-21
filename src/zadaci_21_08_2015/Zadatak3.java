/*
 * (Remove text) Write a program that removes all the occurrences of a specified
 * string from a text file. For example, invoking
 * java Exercise12_11 John filename
 * removes the string John from the specified file. Your program should get the
 * arguments from the command line.
 * 
 * NAPOMENA:
 * novi tekst bez unijete rijeci se ne upisuje u fajl, vec samo stampa
 */

package zadaci_21_08_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite ime fajla ");
		//uzimamo od korisnika ime fajla
		String imeFajla = in.nextLine();
		System.out.println("Unesite rijec koju zelite da izbrisete iz fajla");
		String rijec = in.nextLine();
		//pozivamo metodu za brojanje karaktera, linija i rijeci u fajlu
		try{
			ukloniRijec(imeFajla, rijec);
		}
		//u slucaju da uneseni fajl ne postoji, ispisuje se poruka
		catch (FileNotFoundException ex){
			System.out.println("Fajl nije pronadjen");
		}
		in.close();

	}
	/*
	 * metoda koja uklanja unijetu rijec iz fajla
	 */
	public static void ukloniRijec(String imeFajla, String rijec) throws FileNotFoundException{
		//lista za smijestanje linija teksta iz fajla
		ArrayList<String> sadrzajFajla = new ArrayList<>();
		//lista za smijestanje linija teksta iz fajla bez unijete rijeci 
		ArrayList<String> bezUnijeteRijeci = new ArrayList<>();
		
		File file = new File(imeFajla);
		
		Scanner inFile = new Scanner(file);
		//petlja se vrti dok ima redova u fajlu
		while(inFile.hasNextLine()){
			//redove iz fajla dodajemo u listu
			sadrzajFajla.add(inFile.nextLine());
		}
		//prolazimo kroz listu gdje su smjestene linije teksta
		for(int i = 0; i < sadrzajFajla.size(); i++){
			//uzimamo liniju po liniju
			String red = sadrzajFajla.get(i);
			//splitamo liniju i smijstamo rijeci u niz
			String[] rijeci = red.split(" ");
			//string koji ce predstavljati red teksta, ali bez unijete rijeci
			String redBezUnijeteRijeci = "";
			//prolazak kroz niz rijeci i testiranje rijeci da li su jednake unesenoj rijeci
			for(int j = 0; j < rijeci.length; j++){
				//ako je rijec razlicita od unesene rijeci, ona se dodaje u string
				if(!rijeci[j].equals(rijec)){
					redBezUnijeteRijeci += rijeci[j] + " ";
				}
			}
			//red bez unesene rijeci se trimovan dodaje u listu 
			bezUnijeteRijeci.add(redBezUnijeteRijeci.trim());
			
		}
		//stampanje teksta koji ne sadrzi unijetu rijec
		for(int i = 0; i < bezUnijeteRijeci.size(); i++){
			System.out.println(bezUnijeteRijeci.get(i));
		}
		
		
		inFile.close();
		
	}

}
