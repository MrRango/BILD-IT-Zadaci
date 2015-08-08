/*
 * (Sum elements column by column) Write a method that returns the sum of all the
 * elements in a specified column in a matrix using the following header:
 * public static double sumColumn(double[][] m, int columnIndex)
 * Write a test program that reads a 3-by-4 matrix and displays the sum of each
 * column.
 */

package zadaci_07_08_2015;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//unos elemenata u matricu od strane korisnika
		System.out.println("Unesite elemente matrice 3x4");
		double[][] m = new double[3][4];
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 4; j++){
				m[i][j] = in.nextDouble();
			}
		}		
		in.close();
		//pozivanje i stampanje rezultata za svaku kolonu unesene matrice
		System.out.println("Zbir prve kolone: " + sumColumn(m, 0));
		System.out.println("Zbir prve kolone: " + sumColumn(m, 1));
		System.out.println("Zbir prve kolone: " + sumColumn(m, 2));
		System.out.println("Zbir prve kolone: " + sumColumn(m, 3));

	}
	/*
	 * metoda za sabiranje elemenata matrice po kolonama
	 */
	public static double sumColumn(double[][] m, int columnIndex){
		double rezultat = 0;
		//prolazak kroz redove matrice i sabiranje elemenata na odgovarajucim pozicijama
		for(int i = 0; i < m.length; i++){
			rezultat += m[i][columnIndex];
		}
		
		return rezultat;
	}
}
