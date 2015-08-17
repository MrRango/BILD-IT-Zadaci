/*
 * (The MyPoint class) Design a class named MyPoint to represent a point with
 * x- and y-coordinates. The class contains:
 * - The data fields x and y that represent the coordinates with getter methods.
 * - A no-arg constructor that creates a point (0, 0).
 * - A constructor that constructs a point with specified coordinates.
 * - A method named distance that returns the distance from this point to a
 * specified point of the MyPoint type.
 * - A method named distance that returns the distance from this point to
 * another point with specified x- and y-coordinates.
 * Draw the UML diagram for the class and then implement the class. Write a
 * test program that creates the two points (0, 0) and (10, 30.5) and displays the
 * distance between them.
 */

package zadaci_12_08_2015;

public class Zadatak3 {

	public static void main(String[] args) {
		
		//kreiranje dvije tacke
		MyPoint point1 = new MyPoint();
		MyPoint point2 = new MyPoint(10, 30.5);
		//pozivanje metode za racunanje udaljenosti izmedju dvije tacke i stampanje rezultata
		System.out.println("Udaljenost izmedju tacaka je " + point1.distance(point1, point2));

	}

}