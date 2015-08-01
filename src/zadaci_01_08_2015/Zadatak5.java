/*
 * Napisati metodu koja ispisuje n x n matricu koristeæi se sljedeæim headerom: public static void printMatrix(int n). 
 * Svaki element u matrici je ili 0 ili 1, nasumièno generisana. Napisati test program koji pita korisnika da unese broj n te mu ispiše n x n matricu u konzoli.
 */

package zadaci_01_08_2015;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//unos n za matricu n x n od strane korisnika
		System.out.println("Unesite n za matricu n x n");
		int n = in.nextInt();
		in.close();
		//pozivanje metode za stampanje matrice
		printMatrix(n);

	}
	/*
	 * metoda za stampanje matrice n x n
	 */
	public static void printMatrix(int n){
		//petlja za redove
		for(int i = 0; i < n; i++){
			//petlja za kolone
			for(int j = 0; j < n; j++){
				//stampanje broja na lokaciji i x j
				System.out.print((int)(Math.random() * 2) + " ");
				//ako je petlja za kolone dosla do kraja, prelazi se u novi red
				if(j == n - 1){
					System.out.println();
				}
			}
		}
	}

}
