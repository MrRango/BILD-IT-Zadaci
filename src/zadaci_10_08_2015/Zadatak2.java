/*
 * (Algebra: solve linear equations) Write a method that solves the following
 * 2 * 2 system of linear equations:
 * 
 * a00x + a01y = b0	     b0a11 - b1a01	     	 b1a00 - b0a10
 * 					x = ----------------   y =  --------------------
 * a10x + a11y = b1	    a00a11 - a01a10	    	 a00a11 - a01a10

 * The method header is
 * public static double[] linearEquation(double[][] a, double[] b)
 * The method returns null if a00a11 - a01a10 is 0. Write a test program that
 * prompts the user to enter a00, a01, a10, a11, b0, and b1, and displays the result. If
 * a00a11 - a01a10 is 0, report that “The equation has no solution.”
 */

package zadaci_10_08_2015;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		double[][] a = new double[2][2];
		double[] b = new double[2];
		//unos vrijednosti od strane korisnika
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite vrijednosti a00, a01, a10, a11");
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				a[i][j] = in.nextDouble();
			}
		}
		System.out.println("Unesite vrijednosti b0 i b1");
		b[0] = in.nextDouble();
		b[1] = in.nextDouble();
		
		in.close();
		//pozivenje metode za racunanje linearnih jednacina
		double[] rezultat = linearEquation(a, b);
		//stampanje rezultata
		System.out.println("x = " + rezultat[0] + "\ny = " + rezultat[1]);

	}
	/*
	 * metoda za racunanje linearnih jednacina
	 */
	public static double[] linearEquation(double[][] a, double[] b){
		double[]rez = new double[2];
		
		double dijelilac = a[0][0] * a[1][1] - a[0][1] * a[1][0];
		//ako jednacine nemaju rijesenje, ispisuje se poruka i vraca vrijednost null
		if(dijelilac == 0){
			System.out.println("The equation has no solution.");
		}else{
			//formule za izracunavanje x i y
			rez[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / dijelilac;
			rez[1] = (b[1] * a[0][0] - b[0] * a[1][0]) / dijelilac;
		}
		
		return rez;
	}

}
