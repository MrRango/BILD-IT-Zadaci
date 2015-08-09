/*
 * (Algebra: multiply two matrices) Write a method to multiply two matrices. The
 * header of the method is:
 * public static double[][]
 * multiplyMatrix(double[][] a, double[][] b)
 * To multiply matrix a by matrix b, the number of columns in a must be the same as
 * the number of rows in b, and the two matrices must have elements of the same or
 * compatible types. Let c be the result of the multiplication. Assume the column size
 * of matrix a is n. Each element cij is ai1 * b1j + ai2 * b2j + c + ain * bnj.
 * For example, for two 3 * 3 matrices a and b, c is

 * where cij = ai1 * b1j + ai2 * b2j + ai3 * b3j.
 * Write a test program that prompts the user to enter two 3 * 3 matrices and displays
 * their product.
 */

package zadaci_08_08_2015;

import java.util.Scanner;

public class Zadatak2 {

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
		
		//pozivanje metode za mnozenje matrica
		double[][] c = multiplyMatrix(a, b);
		//stampanje rezultata
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}
	/*
	 * metoda za mnozenje dvije matrice velicine 3x3
	 */
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		
		double[][] rezultat = new double[3][3];
		//svaki element matrice koja predstavlja rezultat mnozenja dvije matrice se dobija formulom
		//c[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j]
		for (int i = 0; i < 3; i++){	//za redove
			for (int j = 0; j < 3; j++){   //za kolone
				//formula
				rezultat[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j];
			}
		}
		return rezultat;
	}

}
