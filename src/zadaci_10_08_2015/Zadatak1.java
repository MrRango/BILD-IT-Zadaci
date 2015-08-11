/*
 * (Identical arrays) The two-dimensional arrays m1 and m2 are identical if they
 * have the same contents. Write a method that returns true if m1 and m2 are identical,
 * using the following header:
 * public static boolean equals(int[][] m1, int[][] m2)
 * Write a test program that prompts the user to enter two 3 * 3 arrays of integers
 * and displays whether the two are identical.
 */

package zadaci_10_08_2015;

import java.util.Scanner;

public class Zadatak1 {

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
			System.out.println("Unesene matrice imaju iste elemente");
		}
		else{
			System.out.println("Unesene matrice nemaju iste elemente");
		}

	}
	/*
	 * metoda za testiranje da li matrice imaju iste elemente
	 */
	public static boolean equals(int[][] m1, int[][] m2){
		boolean equals = true;
		//nizovi za smijestanje elemenata niza
		int[]elementiMatrice1 = new int[m1.length * m1.length];
		int[]elementiMatrice2 = new int[m2.length * m2.length];
		int k = 0;
		//smijestanje elemenata matrice m1 u niz
		for(int i = 0; i < m1.length; i++){
			for(int j = 0; j < m1[i].length; j++){
				elementiMatrice1[k] = m1[i][j];
				k++;
			}
		}
		
		k = 0;
		//smijestanje elemenata matrice m2 u niz
		for(int i = 0; i < m2.length; i++){
			for(int j = 0; j < m2[i].length; j++){
				elementiMatrice2[k] = m2[i][j];
				k++;
			}
		}
		//uporedjivanje elemenata smijestenih u nizove
		for(int i = 0; i < elementiMatrice1.length; i++){
			for(int j = 0; j < elementiMatrice2.length; j++){
				if(elementiMatrice1[i] == elementiMatrice2[j]){
					break;
				}
				//ako element iz prvog niza nije pronadjen u drugom nizu, matrice nemaju iste elemente
				if(elementiMatrice1[i] != elementiMatrice2[j] && j == elementiMatrice2.length - 1){
					equals = false;
				}
			}
		}
		
		return equals;
	}

}
