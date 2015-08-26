/*
 * (The ComparableCircle class) Define a class named ComparableCircle
 * that extends Circle and implements Comparable. Draw the UML diagram and
 * implement the compareTo method to compare the circles on the basis of area.
 * Write a test class to find the larger of two instances of ComparableCircle objects.
 */

package zadaci_25_08_2015;

public class Zadatak3 {

	public static void main(String[] args) {
		//pravljenje objekata
		ComparableCircle krug1 = new ComparableCircle(2);
		ComparableCircle krug2 = new ComparableCircle(5);
		//stampanje rezultata
		System.out.println(krug1.compareTo(krug2));

	}

}