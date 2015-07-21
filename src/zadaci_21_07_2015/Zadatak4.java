/*
 * Napisati metodu koja ispisuje n x n matricu korsiteæi sljedeæi header:
 * public static void printMatrix(int n)
 * Svaki element u matrici je ili 0 ili 1, generisan nasumièno. Napisati test program koji pita korisnika da unese n te ispisuje n x n matricu.
 */

package zadaci_21_07_2015;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite 'n' za matricu 'n x n'");
		int broj = in.nextInt();
		in.close();
		//pozivanje metode za printanje matrice velicine n x n
		printMatrix(broj);

	}
	/*
	 * metoda za stampanje matrice n x n
	 */
	public static void printMatrix(int n){
		//petlja za redove
		for(int i = 0; i < n; i++){
			//petlja za kolone
			for(int j = 0; j < n; j++){
				//upisivanje broja na lokacuju i x j
				System.out.print((int)Math.round(Math.random()*1) + " ");
			}
			//prelazak u novi red
			System.out.println();
		}
	}

}
