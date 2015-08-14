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

package zadaci_13_08_2015;

public class MyPoint {
	
	private double x;
	private double y;
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	//no-arg konstruktor
	MyPoint(){
		x = 0;
		y = 0;
	}
	
	MyPoint(double newX, double newY){
		this.x = newX;
		this.y = newY;
	}
	/*
	 * metoda za racunanje udaljenosti izmedju dvije tacke u koordinatnom sistemu
	 */
	public double distance(MyPoint a, MyPoint b){
		//odredjivanje udaljenosti pitagorinom teoremom
		double distance = Math.sqrt(Math.pow((b.getX() - a.getX()), 2) + Math.pow((b.getY() - a.getY()), 2));
		
		return distance;
	}
}
