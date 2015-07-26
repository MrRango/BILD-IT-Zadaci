/*
 * Napisati program koji pita korisnika da unese mjesec i godinu te mu ispiše broj dana u datom mjesecu. 
 * Na primjer, ukoliko korisnik unese kao godinu 2012 a kao mjesec 2, program treba ispisati da je Februar 2012 imao 29 dana. 
 * Ukoliko korisnik unese kao godinu 2015 a kao mjesec 3, program treba ispisati da je Mart 2015 imao 31 dan. 
 */

package zadaci_26_07_2015;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//uzimanje godine od korisnika
		System.out.println("Unesite godinu ");
		int godina = in.nextInt();
		//uzimanje mjeseca od korisnika
		System.out.println("Unesite mjesec ");
		int mjesec = in.nextInt();
		in.close();
		//u zavisnosti od toga koji je mjesec unesen, stampa se odgovarajuci rezultat
		switch(mjesec){
		case 1:{
			System.out.println("Januar " + godina + ". ima 31 dan.");
			break;
		}
		case 2:{
			//ispituje se da li je godina prestupna i u zavisno od rezultata stampa rezultat
			if(isPrestupna(godina)){
				System.out.println("Februar " + godina + ". ima 29 dana");
			}else{
				System.out.println("Februar " + godina + ". ima 28 dana");
			}
			break;
		}
		case 3:{
			System.out.println("Mart " + godina + ". ima 31 dan.");
			break;
		}
		case 4:{
			System.out.println("April " + godina + ". ima 30 dan.");
			break;
		}
		case 5:{
			System.out.println("Maj " + godina + ". ima 31 dan.");
			break;
		}
		case 6:{
			System.out.println("Jun " + godina + ". ima 30 dan.");
			break;
		}
		case 7:{
			System.out.println("Jul " + godina + ". ima 31 dan.");
			break;
		}
		case 8:{
			System.out.println("Avgust " + godina + ". ima 31 dan.");
			break;
		}
		case 9:{
			System.out.println("Septembar " + godina + ". ima 30 dan.");
			break;
		}
		case 10:{
			System.out.println("Oktobar " + godina + ". ima 31 dan.");
			break;
		}
		case 11:{
			System.out.println("Novembar " + godina + ". ima 30 dan.");
			break;
		}
		case 12:{
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
