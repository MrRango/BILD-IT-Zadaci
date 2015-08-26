/*
 * (Enable GeometricObject comparable) Modify the GeometricObject class
 * to implement the Comparable interface, and define a static max method in the
 * GeometricObject class for finding the larger of two GeometricObject objects.
 * Draw the UML diagram and implement the new GeometricObject class. Write
 * a test program that uses the max method to find the larger of two circles and the
 * larger of two rectangles.
 */

package zadaci_25_08_2015;

public class Zadatak2 {

	public static void main(String[] args) {
		//pravljenje objekata
		GeometricObject krug1 = new Circle2D(0, 0, 2);
		GeometricObject krug2 = new Circle2D(0, 0, 4);
		GeometricObject pravougaonik1 = new MyRectangle2D(0, 0, 2, 2);
		GeometricObject pravougaonik2 = new MyRectangle2D(0, 0, 1, 1);
		//stampanje rezultata
		System.out.println("Veci krug je krug" + GeometricObject.max(krug1, krug2));
		System.out.println("Veci pravougaonik je pravougaonik" + GeometricObject.max(pravougaonik1, pravougaonik2));
	}

}
