/*
 * Napisati program koji pita korisnika da unese cijeli trocifreni broj te provjerava da li je unijeti broj palindrom. 
 * Broj je palindrom ukoliko se èita isto i sa lijeva na desno i sa desna na lijevo npr. 121, 131, itd.
 */

package zadaci_02_08_2015;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		boolean uslov = true;
		int broj = 0;
		
		Scanner in = new Scanner(System.in);
		//petlja se vrti dok se ne unese validan broj
		do{
			System.out.println("Unesite trocifreni cijeli broj");
			broj = in.nextInt();
			if(broj > 99 && broj <1000){
				uslov = false;
			}
			
		}while(uslov);
		in.close();
		//provjeravanje da li je broj isti i kada se napise naopako
		if(broj == reverse(broj)){
			System.out.println("Unijeti broj je palindrom");
		}else{
			System.out.println("Unijeti broj nije palindrom");
		}
	}
	/*
	 * metoda koja vraca broj ispisan naopako
	 */
	public static int reverse(int number){
		int newNumber = 0;
		int cifra = 0;
		//petlja se ponavlja dok broj ne postane jednak 0, tj. dok se sve cifre ne obrade
		while(number != 0){
			//odvajanje zadnje cifre od broja
			cifra = number % 10;
			//pomjeranje zareza za jedno mjesto u lijevo kod unesenog broja
			number = number / 10;
			//pomjeranje zareza za jedno mjesto u desno kod novog broja
			newNumber = newNumber * 10;
			//dodavanje odvojene cifre novom broju
			newNumber += cifra;
		}
		return newNumber;
	}

}
