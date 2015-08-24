/*
 * (Reformat Java source code) Write a program that converts the Java source
 * code from the next-line brace style to the end-of-line brace style. For example,
 * the following Java source in (a) uses the next-line brace style. Your program
 * converts it to the end-of-line brace style in (b).
 * 
 * public class Test
 * {
 * 	public static void main(String[] args)
 * 	{
 * 		// Some statements
 * 	}
 * }
 * 
 * (a)
 * 
 * public class Test {
 * 	public static void main(String[] args) {
 * 		// Some statements
 * 	}
 * }
 * 
 * (b)
 * 
 * Your program can be invoked from the command line with the Java sourcecode
 * file as the argument. It converts the Java source code to a new format. For
 * example, the following command converts the Java source-code file Test.java
 * to the end-of-line brace style.
 * java Exercise12_12 Test.java
 */

package zadaci_23_08_2015;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Unesite ime fajla ");
		// uzimamo od korisnika ime fajla
		String imeFajla = in.nextLine();
		// pozivamo metodu za brojanje karaktera, linija i rijeci u fajlu
		try {
			promjeniStajl(imeFajla);
		}
		// u slucaju da uneseni fajl ne postoji, ispisuje se poruka
		catch (FileNotFoundException ex) {
			System.out.println("Fajl nije pronadjen");
		}
		in.close();

	}

	/*
	 * metoda za mijenjanje next-line brace stajla u end-of-line brace stajl
	 */
	public static void promjeniStajl(String imeFajla) throws FileNotFoundException {
		//lista za smijestanje sadrzaja fajla
		ArrayList<String> sadrzajFajla = new ArrayList<>();
		//lista za smijestanje obradjenog fajla
		ArrayList<String> noviFajl = new ArrayList<>();

		File file = new File(imeFajla);

		Scanner inFile = new Scanner(file);
		//prolazak kroz fajl i smijestanje linija u listu
		while (inFile.hasNextLine()) {
			sadrzajFajla.add(inFile.nextLine());
		}
		//prolazak kroz listu koja sadrzi linije fajla
		for (int i = 0; i < sadrzajFajla.size(); i++) {
			//ako je linija jednaka '{'
			if (sadrzajFajla.get(i).trim().equals("{")) {
				//pravi se novi string od prethodne linije na koju se dodaje razmak i zagrada
				String s = sadrzajFajla.get(i - 1) + " {";
				//u listi koja sadrzi linije za novi fajl, uklanja se zadnji unos
				noviFajl.remove(noviFajl.size() - 1);
				//novi string se dodaje
				noviFajl.add(s);
			}
			//ako string nije jedak '{'
			else {
				//linija se dodaje u novu listu
				noviFajl.add(sadrzajFajla.get(i));
			}
		}
		
		//pravljenje novog printWritera i brisanje prethodnog sadrzaja iz fajla
		PrintWriter writer = new PrintWriter(imeFajla);
		writer.print("");
		writer.close();

		String str;
		//vadjenje stringova iz liste i njihovo upisivanje u fajl
		for (int i = 0; i < noviFajl.size(); i++) {
			str = noviFajl.get(i);

			PrintWriter pw = null;
			try {
				pw = new PrintWriter(new FileOutputStream(imeFajla, true));
				pw.append(str + "\n");
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				pw.close();
			}
		}
		inFile.close();

	}

}
