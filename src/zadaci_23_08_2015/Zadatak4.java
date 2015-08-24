/*
 * (Process scores in a text file on the Web) Suppose that the text file on the
 * Web http://cs.armstrong.edu/liang/data/Scores.txt contains an unspecified number
 * of scores. Write a program that reads the scores from the file and displays their
 * total and average. Scores are separated by blanks.
 */

package zadaci_23_08_2015;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		//url smjesten u string
		String urlString = "http://cs.armstrong.edu/liang/data/Scores.txt";
		
		try{
			//pravljenje novog objekta url
			URL url = new URL(urlString);
			double suma = 0;
			int brojac = 0;
			
			Scanner in = new Scanner(url.openStream());
			//petlja se vrti dok ima ocjena
			//racuna se suma i broji koliko ima ocjena
			while(in.hasNext()){
				suma += in.nextDouble();
				brojac++;
			}
			in.close();
			//stampanje rezultata
			System.out.println("Suma: " + suma + "\nProsjek: " + (suma / brojac));
		}
		//hvatanje izuzetaka
		catch (MalformedURLException ex) {
			System.out.println("Nepravilan URL");
		}
		catch (IOException ex) {
			System.out.println("I/O Errors: fajl ne postoji");
		}

	}

}
