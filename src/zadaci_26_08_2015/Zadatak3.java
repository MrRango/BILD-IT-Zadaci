/*
 * (The Octagon class) Write a class named Octagon that extends
 * GeometricObject and implements the Comparable and Cloneable interfaces.
 * Assume that all eight sides of the octagon are of equal length. The area can
 * be computed using the following formula:
 * area = (2 + 4/22)* side * side
 * Draw the UML diagram that involves Octagon, GeometricObject,
 * Comparable, and Cloneable. Write a test program that creates an Octagon
 * object with side value 5 and displays its area and perimeter. Create a new object
 * using the clone method and compare the two objects using the compareTo
 * method.
 */

package zadaci_26_08_2015;

public class Zadatak3 {

	public static void main(String[] args) throws CloneNotSupportedException {
		//pravljenje objekta 'octagon'
		Octagon octagon1 = new Octagon(5);
		//kloniranje prvog objekta
		Octagon octagon2 = octagon1.clone();
		//stampanje rezultata
		System.out.println(octagon1.compareTo(octagon2));

	}

}
