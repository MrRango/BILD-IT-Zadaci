/*
 * (Count words) Write a program that counts the number of words in President
 * Abraham Lincoln’s Gettysburg address from http://cs.armstrong.edu/liang/data/
 * Lincoln.txt.
 */

package zadaci_23_08_2015;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		//url smjesten u string
		String urlString = "http://cs.armstrong.edu/liang/data/Lincoln.txt";
		
		try {
			//pravljenje novog url objekta
			URL url = new URL(urlString);
			int brojac = 0;
			
			Scanner in = new Scanner(url.openStream());
			//petlja se vrti dok ima rijeci
			//kad se ucita rijec, brojac se povecava
			while(in.hasNext()){
				in.next();
				brojac++;
			}
			in.close();
			//stampanje rezultata
			System.out.println("Broj rijeci: " + brojac);
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
