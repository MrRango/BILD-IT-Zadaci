/*
 * (Row sorting) Implement the following method to sort the rows in a twodimensional
 * array. A new array is returned and the original array is intact.
 * public static double[][] sortRows(double[][] m)
 * Write a test program that prompts the user to enter a 3 * 3 matrix of double
 * values and displays a new row-sorted matrix.
 */

package zadaci_09_08_2015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//trazi se od korisnika da odredi velicinu matrice
		System.out.println("Unesite 'n' za matricu 'n x n'");
		int duzina = in.nextInt();
		double[][] matrica = new double[duzina][duzina];
		//unosenje vrijednosti u matricu
		System.out.println("Unosite clanove matrice");
		for(int i = 0; i < duzina; i++){
			for(int j = 0; j < duzina; j++){
				matrica[i][j] = in.nextDouble();
			}
		}
		in.close();
		//pozivanje metode
		double[][]matrica2 = sortRows(matrica);
		//stampanje rezultata
		for(int i = 0; i < matrica2.length; i++){
			for(int j = 0; j < matrica2.length; j++){
				System.out.print(matrica2[i][j] + " ");
			}
			System.out.println();
		}
	}
	/*
	 * metoda za sortiranje redova matrice
	 */
	public static double[ ][ ] sortRows(double[ ][ ] m){
		ArrayList<Double>row = new ArrayList<>();
		double[][]matrica = new double[m.length][m.length];
		
		for(int i = 0; i < m.length; i++){ 			//prolazimo kroz redove
			for(int j = 0; j < m.length; j++){		//prolazimo kroz kolone
				row.add(m[i][j]);					//clanove jednog reda dodajemo u listu
			}
			Collections.sort(row);						//dobijenu listu sortiramo
			//elemente iz liste upisujemo u matricu
			for(int j = 0; j < m.length; j++){		
				matrica[i][j] = row.get(j);
			}
			//brisemo listu, jer za sledeci red treba da bude prazna
			row.clear();
		}
		return matrica;
	}
}