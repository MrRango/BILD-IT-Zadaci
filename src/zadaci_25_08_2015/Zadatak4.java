/*
 * (The Colorable interface) Design an interface named Colorable with a void
 * method named howToColor(). Every class of a colorable object must implement
 * the Colorable interface. Design a class named Square that extends
 * GeometricObject and implements Colorable. Implement howToColor to
 * display the message.
 * Draw a UML diagram that involves Colorable, Square, and GeometricObject.
 * Write a test program that creates an array of five GeometricObjects. For each
 * object in the array, display its area and invoke its howToColor method if it is
 * colorable.
 */

package zadaci_25_08_2015;

public class Zadatak4 {

	public static void main(String[] args) {
		//niz za smijestanje objekata
		GeometricObject[] objekti = new GeometricObject[5];
		//pravljenje objekata
		objekti[0] = new Square(5);
		objekti[1] = new Circle2D(0, 0, 5);
		objekti[2] = new Circle2D(0, 0, 2);
		objekti[3] = new Square(2);
		objekti[4] = new Square(3);
		//prolazak kroz listu
		for(int i = 0; i < objekti.length; i++){
			//stampanje povrsine za objekte
			System.out.print("Objekat" + (i + 1)  + " ima povrsinu: " + objekti[i].getArea() + " ");
			//ako objekat pripada klasi koja je implementira interfejs 'Colorable'
			if(objekti[i] instanceof Colorable){
				//pozivanje metode 'howToColor()'
				((Colorable)objekti[i]).howToColor();
			}
			else{
				System.out.println();
			}
		}

	}

}
