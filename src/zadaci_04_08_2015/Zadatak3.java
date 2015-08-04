/*
 * U javi, short vrijednost se sprema u samo 16 bita. Napisati program koji pita korisnika da unese short broj te mu ispiše svih 16 bita za dati cijeli broj. 
 * Na primjer, ukoliko korisnik unese broj 5 - program mu ispisuje 0000000000000101

 */

package zadaci_04_08_2015;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		//niz za 16 bitova
		char[] brojBinarno = {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'};
		String rezultat = "";
		
		Scanner in = new Scanner(System.in);
		//unos broja od strane korisnika
		System.out.println("Unesite broj");
		int broj = in.nextInt();
		in.close();
		//petlja se ponavlja dok je broj veci od nula
		while(broj > 0){
			rezultat += broj % 2;
			//cifru binarnog broja dobijamo kao ostatak dijeljenja sa dva
			broj = broj / 2;
		}
		//upisivanje rezultata u niz brojBinarno
		for(int i = 0, j = brojBinarno.length - 1; i < rezultat.length(); i++, j--){
			char cifra = (char)rezultat.charAt(i);
			brojBinarno[j] = cifra;
		}
		//stampanje niza BrojBinarno
		for(int i = 0; i < brojBinarno.length; i++){
			System.out.print(brojBinarno[i]);
		}
	}

}
