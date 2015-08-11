/*
 * (Geometry: intersecting point) Write a method that returns the intersecting point of
 * two lines. The intersecting point of the two lines can be found by using the formula
 * shown in Programming Exercise 3.25. Assume that (x1, y1) and (x2, y2) are the
 * two points on line 1 and (x3, y3) and (x4, y4) are on line 2. The method header is
 * public static double[] getIntersectingPoint(double[][] points)
 * The points are stored in a 4-by-2 two-dimensional array points with
 * (points[0][0], points[0][1]) for (x1, y1). The method returns the intersecting
 * point or null if the two lines are parallel. Write a program that prompts
 * the user to enter four points and displays the intersecting point. See Programming
 * Exercise 3.25 for a sample run.
 */

package zadaci_10_08_2015;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double[][] points = new double[4][2];
		//unos parametara od strane korisnika
		System.out.println("Unesite vrijednosti x1,y1 x2,x2 x3,y3 x4,y4");
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 2; j++){
				points[i][j] = in.nextDouble();
			}
		}
		
		in.close();
		//pozivanje metode za trazenje presjeka
		double[] rezultat = getIntersectingPoint(points);
		//stampanje rezultata
		System.out.println("x = " + rezultat[0] + "\ny = " + rezultat[1]);

	}
	/*
	 * metoda za trazenje presjeka dvije duzi
	 */
	public static double[] getIntersectingPoint(double[][] points){
		double[] rez = new double[2];
//		"Kramerovo pravilo"	
//		(y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
//		(y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
//
//		ax + by = e	      ed - bf	      af - ec
//					x = -----------  y = ----------
//		cx + dy = f	      ad - bc	      ad - bc
//		
		double a = points[0][1] - points[1][1];
		double b = points[0][0] - points[1][0];
		double c = points[2][1] - points[3][1];
		double d = points[2][0] - points[3][0];
		double e = (points[0][1] - points[1][1]) * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
		double f = (points[2][1] - points[3][1]) * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];
		
		double dijelilac = a * d - b * c;
		////ako jednacine nemaju rijesenje, ispisuje se poruka i vraca vrijednost null
		if (dijelilac == 0) {
			System.out.println("Linije se ne presijecaju");
		}
		else {
			//formule za izracunavanje x i y
			rez[0] = (e * d - f * b) / dijelilac;
			rez[1] = (f * a - e * c) / dijelilac;	
		}
		return rez;
	}
}
