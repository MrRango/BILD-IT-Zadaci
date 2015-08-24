/*
 * (Process large dataset) A university posts its employees’ salaries at http://
 * cs.armstrong.edu/liang/data/Salary.txt. Each line in the file consists of a faculty
 * member’s first name, last name, rank, and salary (see Programming Exercise
 * 12.24). Write a program to display the total salary for assistant professors,
 * associate professors, full professors, and all faculty, respectively, and display
 * the average salary for assistant professors, associate professors, full professors,
 * and all faculty, respectively.
 */

package zadaci_24_08_2015;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		//url smjesten u string
		String urlString = "http://cs.armstrong.edu/liang/data/Salary.txt";
		
		try{
			URL url = new URL(urlString);
			int brojAsistenata = 0;
			int brojSaradnika = 0;
			int brojProfesora = 0;
			double plataAsistenata = 0;
			double plataSaradnika = 0;
			double plataProfesora = 0;
			
			Scanner in = new Scanner(url.openStream());
			//petlja se vrti dok ima linija 
			//u zavisnosti od ranga, povecavaju se brojaci i uvecavaju sume plata
			while(in.hasNextLine()){
				in.next();
				in.next();
				String rank = in.next();
				double salary = in.nextDouble();
				
				if(rank.equals("assistant")){
					brojAsistenata++;
					plataAsistenata += salary;
				}
				else if(rank.equals("associate")){
					brojSaradnika++;
					plataSaradnika += salary;
				}
				else{
					brojProfesora++;
					plataProfesora += salary;
				}
			}
			in.close();
			//stampanje rezultata
			System.out.println("Suma plata svih asistenata je: " + plataAsistenata + ", dok je njihova prosjecna plata: " + (int)((plataAsistenata / brojAsistenata) * 100) / 100.0);
			System.out.println("Suma plata svih saradnika je: " + plataSaradnika + ", dok je njihova prosjecna plata: " + (int)((plataSaradnika / brojSaradnika) * 100) / 100.0);
			System.out.println("Suma plata svih profesora je: " + plataProfesora + ", dok je njihova prosjecna plata: " + (int)((plataProfesora / brojProfesora) * 100) / 100.0);
			System.out.println("Suma plata svih radnika je: " + (plataAsistenata + plataSaradnika + plataProfesora) + ", dok je njihova prosjecna plata: " +
			(int)(((plataAsistenata + plataSaradnika + plataProfesora)/(brojAsistenata + brojSaradnika + brojProfesora)) * 100) / 100.0);
			
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
