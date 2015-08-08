/*
 * (Algebra: add two matrices) Write a method to add two matrices. The header of
 * the method is as follows:
 * public static double[][] addMatrix(double[][] a, double[][] b)
 * In order to be added, the two matrices must have the same dimensions and the
 * same or compatible types of elements. Let c be the resulting matrix. Each element
 * cij is aij + bij. For example, for two 3 * 3 matrices a and b, c is

 * Write a test program that prompts the user to enter two 3 * 3 matrices and
 * displays their sum.
 */

package zadaci_07_08_2015;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// unos elemenata u prvu matricu od strane korisnika
		System.out.println("Unesite elemente prve matrice 3x3");
		double[][] a = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = in.nextDouble();
			}
		}
		// unos elemenata u drugu matricu od strane korisnika
		System.out.println("Unesite elemente druge matrice 3x3");
		double[][] b = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				b[i][j] = in.nextDouble();
			}
		}
		in.close();
		//pozivanje metode za sabiranje matrica
		double[][] c = addMatrix(a, b);
		//stampanje rezultata
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}
	/*
	 * metoda za sabirenje dvije matrice
	 */
	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] rezultat = new double[a.length][a[0].length];
		//sabiranje elemenata matrice a i matrice b
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				rezultat[i][j] = a[i][j] + b[i][j];
			}
		}
		return rezultat;
	}

}
