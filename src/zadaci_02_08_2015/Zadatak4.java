/*
 * Napisati metodu koja vraæa datum i trenutaèno vrijeme.
 */

package zadaci_02_08_2015;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Zadatak4 {

	public static void main(String[] args) {
		
		//pozivanje metode i stampanje rezultata
		System.out.println(vratiDatum());

	}
	/*
	 * metoda koja vraca trenutni datum i vrijeme
	 */
	public static String vratiDatum(){
		
		//kreiranje novog datuma
		Date date = new Date(System.currentTimeMillis());
		//kreiranje formata za prikaz datuma
		SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy. HH:mm:ss");
		//prosljedjivanje rezultata
		return "Trenutni datum i vrijeme: " + format.format(date);
	}

}
