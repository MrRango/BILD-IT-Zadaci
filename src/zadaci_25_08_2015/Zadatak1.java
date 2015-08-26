/*
 * (Display calendars) Rewrite the PrintCalendar class in Listing 6.12 to display
 * a calendar for a specified month using the Calendar and GregorianCalendar
 * classes. Your program receives the month and year from the command line.
 * You also can run the program without the year. In this case, the year is the current
 * year. If you run the program without specifying a month and a year, the month is
 * the current month.
 */

package zadaci_25_08_2015;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		boolean uslov = true;
		int godina = 0;
		int mjesec = 0;
		do{
			//unos godine i mjeseca od strane korisnika
			//u slucaju greske pri unosu hvata se izuzetak
			try{
				System.out.println("Unesite godinu");
				godina = in.nextInt();
				System.out.println("Unesite mjesec");
				mjesec = in.nextInt();
				if(mjesec < 1 || mjesec > 12){
					throw new InputMismatchException("Error");
				}
				uslov = false;
				
			}
			//hvatanje izuzetka
			catch(InputMismatchException ex){
				System.out.println("Desila se greska pri unosu, pokusajte ponovo");
				in.nextLine();
			}
		}while(uslov);
		in.close();
		//pozivanje metode za stampanje mjeseca
		ispisiKalendar(godina, mjesec);		
	}
	/*
	 * metoda za ispisivanje kalendara
	 */
	public static void ispisiKalendar(int godina, int mjesec){
		//buduci da po defaultu sedmica pocinje nedeljom, i koriste se brojevo od 1 do 7, morao sam napraviti svoju verziju sedmice
		//vrijednosti su smjestene u niz, a koristice se vrijednost indeksa
		int[] daniUSedmici = {2, 3, 4, 5, 6, 7, 1};
		//pravljenje novog kalendara za koji su uneseni godina i mjesec
		Calendar c = new GregorianCalendar(godina, mjesec - 1, 1);
				
		String mjesecText = null;
		int brojDana = 0;
		int pocetniDan = 0;
		//prolazi se kroz niz 'daniUSedmici'
		for(int i = 0; i < daniUSedmici.length; i++){
			//ako je trenutna vrijednost u nizu jednaka vrijednosti koju dobijamo metodom za odredjivanje dana u sedmici
			//za pocetni dan se uzima indeks na kojoj se ta vrijednost nalazi
			if(c.get(Calendar.DAY_OF_WEEK) == daniUSedmici[i]){
				pocetniDan = i;
			}
		}
			
		//odredjivanje broja dana za trazeni mjesec
		//odredjivanje "imena" mjeseca
		switch (mjesec){
		case 1:{
			mjesecText = "Januar";
			brojDana = 31;
			break;
		}
		case 2:{
			//testiranje da li je godina prestupna, jer to utice na duzinu februara
			if(isPrestupna(godina)){
				brojDana = 29;
			}else{
				brojDana = 28;
			}
			mjesecText = "Februar";
			break;
		}
		case 3:{
			mjesecText = "Mart";
			brojDana = 31;
			break;
		}
		case 4:{
			mjesecText = "April";
			brojDana = 30;
			break;
		}
		case 5:{
			mjesecText = "Maj";
			brojDana = 31;
			break;
		}
		case 6:{
			mjesecText = "Jun";
			brojDana = 30;
			break;
		}
		case 7:{
			mjesecText = "Jul";
			brojDana = 31;
			break;
		}
		case 8:{
			mjesecText = "Avgust";
			brojDana = 31;
			break;
		}
		case 9:{
			mjesecText = "Septembar";
			brojDana = 30;
			break;
		}
		case 10:{
			mjesecText = "Octobar";
			brojDana = 31;
			break;
		}
		case 11:{
			mjesecText = "Novembar";
			brojDana = 30;
			break;
		}
		case 12:{
			mjesecText = "Decembar";
			brojDana = 31;
			break;
		}
		}
		//stampanje zaglavlja kalendara
		System.out.println("___________________________________________________\n\n" 
				+ "                     " + mjesecText + " " + godina 
				+ "\n___________________________________________________\n"
				+ "\nPon     Uto     Sri     Cet     Pet     Sub     Ned");
		
		
		int brojac = 0;
		//ispisivanje brojeva/dana od 1 do broja dana koliko mjesec ima
		for(int i = 1; i <= brojDana; i++){
			//koristenje podataka o mjesecu za odredjivanje da li i koliko puta treba stampati prazna mjesta
			if(brojac < pocetniDan){  		//bez ovog uslova bi se prazna mjesta dodavala ispred svakog broja
				for(int j = 0; j < pocetniDan; j++){
					System.out.print("        ");
					brojac++;
				}
			}
			//prelazak u novi red/sedmicu
			if(brojac % 7 == 0){
				System.out.println();
			}
			//za dvocifrene brojeve stampa se razmak manji za jedan karakter
			if(i < 10){
				System.out.print(" " + i + "      ");
			}else{
				System.out.print(" " + i + "     ");
			}
			brojac++;
		}
		
	}
	/*
	 * metoda koja provjerava da li je godina prestupna
	 */
	public static boolean isPrestupna(int godina){
		boolean isPrestupna = false;
		//provjeravanje da li je godina prestupna
		if(godina % 4 == 0 && (godina % 100 != 0 || godina % 400 == 0)){
			isPrestupna = true;
		}
		return isPrestupna;
	}
	
	
}
