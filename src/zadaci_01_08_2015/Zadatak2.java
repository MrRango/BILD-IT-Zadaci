/*
 * Napisati program koji igra sa protivnikom rock-paper-scissors. (papir-bunar-makaze ili tako nekako po naški) 
 * Program nasumièno generiše brojeve 0, 1 i 2 koji predstavljaju papir, bunar i makaze. 
 * Program pita korisnika da unese 0, 1 ili 2 te mu ispisuje poruku da li je korisnik pobijedio, da li je raèunar pobijedio ili je bilo neriješeno. 
 */

package zadaci_01_08_2015;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//spisak opcija smjestenih u niz
		String[] opcije = {"papir", "kamen", "makaze"};
		//generisanje nasumicnog broja, odnosno opcije od strane racunara
		int potezAI = (int)(Math.random() * 3);
		//uzimanje opcije koju je odabrao igrac
		System.out.println("Odaberite opciju\n"
				+ "[0] Papir   [1] Kamen   [2] Makaze");
		int potezKorisnik = in.nextInt();
		in.close();
		//stampanje opcije koju je odabrao racunar
		System.out.println("Racunar je izabrao " + opcije[potezAI]);
		//odredjivanje pobjednika i stampanje rezultata partije
		if(potezAI == potezKorisnik){
			System.out.println("Igrali ste nerijeseno");
		}else if((potezAI == 0 && potezKorisnik == 1) || (potezAI == 1 && potezKorisnik == 2) || (potezAI == 2 && potezKorisnik == 0) ){
			System.out.println("Racunar je pobjedio");
		}else{
			System.out.println("Korisnik je pobjedio");
		}

	}

}
