/*
 * (Geometry: the bounding rectangle) A bounding rectangle is the minimum rectangle
 * that encloses a set of points in a two-dimensional plane, as shown in
 * Figure 10.24d. Write a method that returns a bounding rectangle for a set of
 * points in a two-dimensional plane, as follows:
 * public static MyRectangle2D getRectangle(double[][] points)
 * The Rectangle2D class is defined in Programming Exercise 10.13. Write a
 * test program that prompts the user to enter five points and displays the bounding
 * rectangle’s center, width, and height.
 */

package zadaci_13_08_2015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double[][] tacke = new double[5][2];
		//unos koordinata za 5 tacaka
		System.out.println("Unesite koordinate pet tacaka");
		for(int i = 0; i < 5; i++){
			tacke[i][0] = in.nextDouble();
			tacke[i][1] = in.nextDouble();
		}
		in.close();
		MyRectangle2D r = new MyRectangle2D();
		//pozivanje metode za kreiranje 'the bounding rectangle'
		r = getRectangle(tacke);
		//stampanje rezultata
		System.out.println("X = " + r.getX() + "\nY = " + r.getY() + "\nSirina: " + r.getWidth() + "\nVisina: " + r.getHeight());
		
	}
	/*
	 * metoda koja previ 'the bounding rectangle'
	 */
	public static MyRectangle2D getRectangle(double[][] points){
		MyRectangle2D r1 = new MyRectangle2D();
		//liste za smojestanje x i y od svake tacke
		ArrayList<Double> x = new ArrayList<>();
		ArrayList<Double> y = new ArrayList<>();
		//uzimanje x i y i smijestanje u liste
		for(int i = 0; i < 5; i++){
			x.add(points[i][0]);
			y.add(points[i][1]);
		}
		//sortiranje lista
		Collections.sort(x);
		Collections.sort(y);
		//odredjivanje pocetne tacke, sirine i visine
		r1.setX(x.get(0));
		r1.setY(y.get(0));
		r1.setWidth(x.get(x.size() - 1) - x.get(0));
		r1.setHeight(y.get(y.size() - 1) - y.get(0));
		
		return r1;
	}
	
}
