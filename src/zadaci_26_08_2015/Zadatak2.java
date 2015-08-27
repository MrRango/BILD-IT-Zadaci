/*
 * (Enable Rectangle comparable) Rewrite the Rectangle class in Listing 13.3 to
 * extend GeometricObject and implement the Comparable interface. Override
 * the equals method in the Object class. Two Rectangle objects are equal
 * if their areas are the same. Draw the UML diagram that involves Rectangle,
 * GeometricObject, and Comparable.
 */

package zadaci_26_08_2015;

public class Zadatak2 {

	public static void main(String[] args) {
		
		//pravljenje objekata 'circle'
		Rectangle rectangle1 = new Rectangle(5, 5);
		Rectangle rectangle2 = new Rectangle(6, 6);
		Rectangle rectangle3 = new Rectangle(5, 5);
		//stampanje rezultata
		System.out.println(rectangle1.compareTo(rectangle2));
		System.out.println(rectangle2.compareTo(rectangle3));
		System.out.println(rectangle1.compareTo(rectangle3));

	}

}
