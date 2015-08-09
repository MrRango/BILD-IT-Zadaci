/*
 * (Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly
 * identical if their corresponding elements are equal. Write a method that returns
 * true if m1 and m2 are strictly identical, using the following header:
 * public static boolean equals(int[][] m1, int[][] m2)
 * Write a test program that prompts the user to enter two 3 * 3 arrays of
 * integers and displays whether the two are strictly identical. Here are the
 * sample runs.
 */

package zadaci_09_08_2015;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//trazi se od korisnika da odredi velicinu matrice
		System.out.println("Unesite 'n' za matricu 'n x n'");
		int duzina = in.nextInt();
		int[][] matrica = new int[duzina][duzina];
		//unosenje vrijednosti u matricu
		System.out.println("Unosite elemente prve matrice");
		for(int i = 0; i < duzina; i++){
			for(int j = 0; j < duzina; j++){
				matrica[i][j] = in.nextInt();
			}
		}
		int[][] matrica2 = new int[duzina][duzina];
		//unosenje vrijednosti u matricu
		System.out.println("Unosite elemente druge matrice");
		for(int i = 0; i < duzina; i++){
			for(int j = 0; j < duzina; j++){
				matrica2[i][j] = in.nextInt();
			}
		}
		in.close();
		//pozivanje metode i u zavisnosti od vracene vrijednosti stampanje odgovarajuce poruke
		if(equals(matrica, matrica2)){
			System.out.println("Unesene matrice su striktno jednake");
		}
		else{
			System.out.println("Unesene matrice nisu striktno jednake");
		}

	}
	/*
	 * metoda za testiranje da li su matrice jednake
	 */
	public static boolean equals(int[][] m1, int[][] m2){
		boolean equals = true;
		//prolazak kroz matrice
		for(int i = 0; i < m1.length; i++){
			for(int j = 0; j < m1[0].length; j++){
				//ako elementi na istim pozicijama u matricama nisu jednaki, matrice nisu jednake
				if(m1[i][j] != m2[i][j]){
					equals = false;
					break;
				}
			}
		}
		return equals;
	}

}
