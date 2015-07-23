/*
 * Napisati program koji pita korisnika da unese neki cijeli broj te ispisuje njegove najmanje faktore u rastuæem redosljedu. 
 * Na primjer, ukoliko korisnik unese 120 program treba da ispiše 2, 2, 2, 3, 5. (2 * 2 * 2 * 3 * 5 = 120)
 */

package zadaci_23_07_2015;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite neki cijeli broj ");
		
		int broj = in.nextInt();
		in.close();
		
		int br = broj;
		int brojac = 0;
		//ispitujemo da li je broj djeljiv sa bilo kojim brojem manjim od sebe 
		for(int i = 2; i < br; i++){
			//dok god je broj djeljiv sa trenutnom vrijednoscu 'i', dijelimo ga i stampamo vrijednost 'i'
			while(broj % i == 0){ 		
				broj = broj / i;
				System.out.print(i + " ");	
				//brojimo koliko broj ima najmanjih faktora
				brojac++;
			}
		}
		//ako broj nema manjih faktora, broj je prost i on se ne moze podijeliti na manje faktore
		if(brojac == 0){
			System.out.println("Unijeti broj je prost i on se ne moze podijeliti na manje faktore");
		}

	}

}
