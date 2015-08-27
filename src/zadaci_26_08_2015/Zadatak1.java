/*
 * (Enable Circle comparable) Rewrite the Circle class in Listing 13.2 to extend
 * GeometricObject and implement the Comparable interface. Override the
 * equals method in the Object class. Two Circle objects are equal if their radii
 * are the same. Draw the UML diagram that involves Circle, GeometricObject,
 * and Comparable.
 */

package zadaci_26_08_2015;

public class Zadatak1 {

	public static void main(String[] args) {
		//pravljenje objekata 'circle'
		Circle circle1 = new Circle(5);
		Circle circle2 = new Circle(6);
		Circle circle3 = new Circle(5);
		//stampanje rezultata
		System.out.println(circle1.compareTo(circle2));
		System.out.println(circle2.compareTo(circle3));
		System.out.println(circle1.compareTo(circle3));

	}

}
