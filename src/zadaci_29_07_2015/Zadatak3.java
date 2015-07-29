/*
 * Ako pozovemo metodu System.currentTimeMillis() dobijemo broj milisekundi od 1. januara 1970 do trenutka pozivanja metode. 
 * Napisati program koji ispisuje trenutaèni datum i vrijeme u formatu "Trenutni datum i vrijeme: 22. juli, 2015 19:59:47"

 */

package zadaci_29_07_2015;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Zadatak3 {

	public static void main(String[] args) {
		//kreiranje novog datuma
		Date date = new Date(System.currentTimeMillis());
		//kreiranje formata za prikaz datuma
		SimpleDateFormat format = new SimpleDateFormat("dd. MMM, yyyy HH:mm:ss");
		//stampanje rezultata
		System.out.println("Trenutni datum i vrijeme: " + format.format(date));

	}

}
