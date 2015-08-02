/*
 * Napisati program koji pita korisnika da unese cijeli broj te ispisuje piramidu svih brojeva do tog broja. 
 * (Na primjer, ukoliko korisnik unese 7 vrh piramide je broj 1, red ispod vrha piramide je 2 1 2, red ispod je 3 2 1 2 3, red ispod 4 3 2 1 2 3 4 itd.)
 * 
 * RIJEŠENJE SA ÈASA ŠTO MI JE DONIJELO Munchmallow :)
 */

package zadaci_02_08_2015;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesi broj "); 
		
		int broj = unos.nextInt();
		
		unos.close();

		int[] niz = new int [broj*2-1];	
		
		int prom = niz.length - broj;
		
		//napravili smo "fleksibilan" niz ciju duzinu dobijamo izrazom broj*2-1
		//u primjeru iznad se vidi da za unijeti br. 5 na kraju imamo niz dug 5*2-1=9
		
		//PUNJENJE NIZA
		//punjenje niza brojevima sastoji se iz dva dijela
		//prvo upisujemo opadajuci dio niza (5, 4, 3, 2), a nakon toga
		//upisujemo  jedinicu i rastuci dio (1, 2, 3, 4, 5)
		//jedinica se moze upisati i kao dio opadajuceg niza
		//ja sam izabrao da bude u rastucem, ali bitno je da ne bude u oba
		for(int i = 0, j = broj; i < prom; i++, j--){
			niz[i] = j;
		}
		for(int i = prom, j = 1; i < niz.length; i++, j++){
			niz[i] = j;
		}
		
		//STAMPANJE PIRAMIDE
		for(int i = 0; i < broj; i++){
			//da bi postigli oblik piramide moramo da sve centriramo, tako da moramo dodavati
			//prazna polja prije brojeva
			//bez ovoga sve bi bilo zalijepljeno za lijevu ivicu
			//broj praznih polja zavisi od toga koji red piramide stampamo i njihov broj se 
			//za svaki sljedeci red smanjuje za jedan (smanjuje se za i)
			for(int j = 1; j < broj - i; j++){
				System.out.print("    ");	
			}
			//stampanje krece iz sredine niza, odnosno od broja 1
			//u svakom sljedecem prolazu kroz petlju, dodaje se po jedan broj lijevo i desno
			for(int j = prom - i; j <= prom + i; j++ ){
				//u slucaju da je dvocifren broj pravimo kompenzaciju, 
				//dodajemo za jedan karakter manje prazno polje
				if(niz[j] < 10){
					System.out.print(niz[j] + "   ");
				}else{
					System.out.print(niz[j] + "  ");
				}
			}
			
			System.out.println(); //prebacivanje u novi red
		
		}
	}		
}