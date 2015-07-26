/*
 * Napisati program koji pita korisnika da unese godinu i prva tri slova imena mjeseca (prvo slovo uppercase) te mu ispiše broj dana u tom mjesecu. 
 * Na primjer, ukoliko korisnik kao godinu unese 2001 a kao mjesec Jan program mu ispisuje da Jan 2011 ima 31 dan.
 */

package zadaci_26_07_2015;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//uzimanje godine od korisnika
		System.out.println("Unesite godinu ");
		int godina = in.nextInt();
		//uzimanje mjeseca od korisnika
		System.out.println("Unesite mjesec ");
		String mjesec = in.next();
		in.close();
		//u zavisnosti od toga koji je mjesec unesen, stampa se odgovarajuci rezultat
		switch(mjesec){
		case "Jan":{
			System.out.println("Januar " + godina + ". ima 31 dan.");
			break;
		}
		case "Feb":{
			//ispituje se da li je godina prestupna i u zavisno od rezultata stampa rezultat
			if(isPrestupna(godina)){
				System.out.println("Februar " + godina + ". ima 29 dana");
			}else{
				System.out.println("Februar " + godina + ". ima 28 dana");
			}
			break;
		}
		case "Mar":{
			System.out.println("Mart " + godina + ". ima 31 dan.");
			break;
		}
		case "Apr":{
			System.out.println("April " + godina + ". ima 30 dan.");
			break;
		}
		case "Maj":{
			System.out.println("Maj " + godina + ". ima 31 dan.");
			break;
		}
		case "Jun":{
			System.out.println("Jun " + godina + ". ima 30 dan.");
			break;
		}
		case "Jul":{
			System.out.println("Jul " + godina + ". ima 31 dan.");
			break;
		}
		case "Avg":{
			System.out.println("Avgust " + godina + ". ima 31 dan.");
			break;
		}
		case "Sep":{
			System.out.println("Septembar " + godina + ". ima 30 dan.");
			break;
		}
		case "Okt":{
			System.out.println("Oktobar " + godina + ". ima 31 dan.");
			break;
		}
		case "Nov":{
			System.out.println("Novembar " + godina + ". ima 30 dan.");
			break;
		}
		case "Dec":{
			System.out.println("Decembar " + godina + ". ima 31 dan.");
			break;
		}
		default:{
			System.out.println("Unijeli ste pogresan mjesec");
			break;
		}
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
