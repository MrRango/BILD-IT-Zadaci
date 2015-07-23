/*
 * ISBN-10 (International Standard Book Number) se sadrži od 10 brojeva: d1 d2 d3 d4 d5 d6 d7 d8 d9 d10. 
 * Posljednji broj, d10, služi kao checksum i njega izraèunavamo iz prvih devet brojeva koristeæi se sljedeæom formulom: 
 * (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11. Ukoliko je checksum 10, zadnji broj oznaèavamo sa X u skladu sa ISBN-10 konvencijom. 
 * Napisati program koji pita korisnika da unese prvih 9 brojeva te ispiše desetocifreni ISBN-10 broj. 
 * (Primjer: ukoliko unesemo, kao prvih 9 brojeva, 013601267 program nam ispisuje 0136012671 kao ISBN-10 broj. 
 * ukoliko unesemo 013031997 kao prvih 9 brojeva, program nam ispisuje 013031997X kao ISBN-10 broj)
 */

package zadaci_23_07_2015;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		int[]brojevi = new int[9];
		Scanner in = new Scanner(System.in);
		//uzimanje od korisnika prvih 9 cifara ISBN-10 broja
		System.out.println("Unesite prvih 9 cifara ISBN-10 broja");
		for(int i = 0; i < 9; i++){
			brojevi[i] = in.nextInt();
		}
		in.close();
		//racunanje checksume po utvrdjenoj formuli
		int checksum = (brojevi[0] * 1 + brojevi[1] * 2 + brojevi[2] * 3 + brojevi[3] * 4 + brojevi[4] * 5 
				+ brojevi[5] * 6 + brojevi[6] * 7 + brojevi[7] * 8 + brojevi[8] * 9) % 11;
		//stampanje prvih devet cifara ISBN-10 broja
		System.out.print("ISBN-10 broj je: ");
		for(int i = 0; i < 9; i++){
			System.out.print(brojevi[i]);
		}
		//u zavisnosti od checksume, kao desetu cifru ISBN-10 broja stampamo 'X' ili checksumu
		if(checksum == 10){
			System.out.print("X");
		}else{
			System.out.print(checksum);
		}
	}

}
