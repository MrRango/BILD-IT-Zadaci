/*
 * (Create large dataset) Create a data file with 1,000 lines. Each line in the file
 * consists of a faculty member’s first name, last name, rank, and salary. The
 * faculty member’s first name and last name for the ith line are FirstNamei and
 * LastNamei. The rank is randomly generated as assistant, associate, and full.
 * The salary is randomly generated as a number with two digits after the decimal
 * point. The salary for an assistant professor should be in the range from 50,000
 * to 80,000, for associate professor from 60,000 to 110,000, and for full professor
 * from 75,000 to 130,000. Save the file in Salary.txt. Here are some sample data:
 * FirstName1 LastName1 assistant 60055.95
 * FirstName2 LastName2 associate 81112.45
 * . . .
 * FirstName1000 LastName1000 full 92255.21
 */

package zadaci_23_08_2015;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Zadatak5 {

	public static void main(String[] args) throws FileNotFoundException {
		//lista za smijstanje kreiranih osoba (osoblja fakulteta)
		ArrayList<String> spisak = new ArrayList<>();
		//spisak zvanja
		String[] rank = {"assistant", "associate", "full"};
		//minimalni iznosi plata i razlike do maksimalne za svako zvanje
		int[][] plata = { {50000, 30000}, {60000, 50000}, {75000, 55000}};
		//generisanje 1000 osoba
		for (int i = 1; i <= 1000; i++){
			//generisanje zvanja za osobu (3 moguca iz niza 'rank')
			int rankNumber = (int)(Math.random() * 3);
			//generisanje plate koja zavisi od zvanja osobe
			double iznosPlata = Math.random() * plata[rankNumber][1] + plata[rankNumber][0];
			//pravljenje stringa koji sadrzi sve podatke o osobi
			String osoba = "FirstName" + i + " LastName" + i + " " + rank[rankNumber] + " " + (int)(iznosPlata * 100) / 100.0;
			//upisivanje osobe u listu
			spisak.add(osoba);
		}
		
		//pravljenje novog printWritera i brisanje prethodnog sadrzaja iz fajla
		PrintWriter writer = new PrintWriter("Salary.txt");
		writer.print("");
		writer.close();

		String str;
		//vadjenje stringova iz liste i njihovo upisivanje u fajl
		for (int i = 0; i < spisak.size(); i++) {
			str = spisak.get(i);

			PrintWriter pw = null;
			try {
				pw = new PrintWriter(new FileOutputStream("Salary.txt", true));
				pw.append(str + "\n");
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				pw.close();
			}
		}
			
	}

}
