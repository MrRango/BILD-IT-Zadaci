/*
 * (Geometry: area of a triangle) Write a method that returns the area of a triangle
 * using the following header:
 * public static double getTriangleArea(double[][] points)
 * The points are stored in a 3-by-2 two-dimensional array points with points[0]
 * [0] and points[0][1] for (x1, y1). The triangle area can be computed using the
 * formula in Programming Exercise 2.19. The method returns 0 if the three points
 * are on the same line. Write a program that prompts the user to enter three points of
 * a triangle and displays the triangle's area.
 */

package zadaci_10_08_2015;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double[][] points = new double[3][2];
		//unos matrice od strane korisnika
		System.out.println("Unesite koordinate tacaka trougla");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 2; j++){
				points[i][j] = in.nextDouble();
			}
		}
		in.close();
		//pozivanje metode i stampanje rezultata
		System.out.println(getTriangleArea(points));

	}
	/*
	 * metoda za racunanje povrsine trougla
	 */
	public static double getTriangleArea(double[][] points){
		double rez = 0;
		double stranica1 = 0;
		double stranica2 = 0;
		double stranica3 = 0;
		//odredjivanje duzine stranica pitagorinom teoremom
		stranica1 = Math.sqrt(Math.pow((points[1][0] - points[0][0]), 2) + Math.pow((points[1][1] - points[0][1]), 2));
		stranica2 = Math.sqrt(Math.pow((points[2][0] - points[1][0]), 2) + Math.pow((points[2][1] - points[1][1]), 2));
		stranica3 = Math.sqrt(Math.pow((points[0][0] - points[2][0]), 2) + Math.pow((points[0][1] - points[2][1]), 2));
		
		//racunanje povrsine datom formulom
		double s = (stranica1 + stranica2 + stranica3) / 2.0;
		rez = Math.sqrt(s * (s - stranica1) * (s - stranica2) * (s - stranica3));
		return rez;
	}

}
