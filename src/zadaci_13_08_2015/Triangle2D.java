/*
 * (Geometry: the Triangle2D class) Define the Triangle2D class that contains:
 * - Three points named p1, p2, and p3 of the type MyPoint with getter and
 * setter methods. MyPoint is defined in Programming Exercise 10.4.
 * - A no-arg constructor that creates a default triangle with the points (0, 0), (1, 1), and (2, 5).
 * - A constructor that creates a triangle with the specified points.
 * - A method getArea() that returns the area of the triangle.
 * - A method getPerimeter() that returns the perimeter of the triangle.
 * - A method contains(MyPoint p) that returns true if the specified point
 * p is inside this triangle (see Figure 10.22a).
 * - A method contains(Triangle2D t) that returns true if the specified
 * triangle is inside this triangle (see Figure 10.22b).
 * - A method overlaps(Triangle2D t) that returns true if the specified
 * triangle overlaps with this triangle (see Figure 10.22c).
 * Draw the UML diagram for the class and then implement the class. Write
 * a test program that creates a Triangle2D objects t1 using the constructor
 * new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3),
 * new MyPoint(5, 3.5)), displays its area and perimeter, and displays the
 * result of t1.contains(3, 3), r1.contains(new Triangle2D(new
 * MyPoint(2.9, 2), new MyPoint(4, 1), MyPoint(1, 3.4))), and t1.
 * overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), MyPoint(2, 6.5))).
 * (Hint: For the formula to compute the area of a triangle, see Programming Exercise
 * 2.19. To detect whether a point is inside a triangle, draw three dashed lines,
 * as shown in Figure 10.23. If the point is inside a triangle, each dashed line
 * should intersect a side only once. If a dashed line intersects a side twice, then
 * the point must be outside the triangle. For the algorithm of finding the intersecting
 * point of two lines, see Programming Exercise 3.25.)
 */

package zadaci_13_08_2015;

import java.awt.geom.Line2D;

public class Triangle2D {

	private MyPoint p1 = new MyPoint();
	private MyPoint p2 = new MyPoint();
	private MyPoint p3 = new MyPoint();
	
	//no-arg konstruktor
	Triangle2D(){
		this.p1 = new MyPoint(0, 0);
		this.p2 = new MyPoint(1, 1);
		this.p3 = new MyPoint(2, 5);
	}
	//kontstruktor koji prima konkretne vrijednosti za p1, p2 i p3
	Triangle2D(MyPoint newP1, MyPoint newP2, MyPoint newP3){
		this.p1 = newP1;
		this.p2 = newP2;
		this.p3 = newP3;
	}
	
	public MyPoint getP1() {
		return p1;
	}
	public void setP1(MyPoint p1) {
		this.p1 = p1;
	}
	public MyPoint getP2() {
		return p2;
	}
	public void setP2(MyPoint p2) {
		this.p2 = p2;
	}
	public MyPoint getP3() {
		return p3;
	}
	public void setP3(MyPoint p3) {
		this.p3 = p3;
	}
	
	/*
	 * metoda koja racuna povrsinu trougla
	 */
	public double getArea(){
		//odredjivanje duzine stranica
		double stranica1 = p1.distance(p1, p2);
		double stranica2 = p2.distance(p2, p3);
		double stranica3 = p3.distance(p3, p1);
		
		double s = (stranica1 + stranica2 + stranica3) / 2;
		//racunanje povrsine trougla
		double povrsina = Math.sqrt(s * (s - stranica1) * (s - stranica2) * (s - stranica3));
		
		
		return povrsina;
	}
	/*
	 * metoda koja racuna obim trougla
	 */
	public double getPerimeter(){

		//racunanje obima trougla
		double obim = p1.distance(p1, p2) + p2.distance(p2, p3) + p3.distance(p3, p1);
		
		return obim;
	}
	/*
	 * metoda koja testira da li se tacka nalazi unutar trokuta
	 */
	public boolean contains(MyPoint p){
		boolean contains = true;
		//duzi sa tackom p
		Line2D l1 = new Line2D.Double(p.getX(), p.getY(), this.p1.getX(), this.p1.getY());
		Line2D l2 = new Line2D.Double(p.getX(), p.getY(), this.p2.getX(), this.p2.getY());
		Line2D l3 = new Line2D.Double(p.getX(), p.getY(), this.p3.getX(), this.p3.getY());
		//duzi trougla
		Line2D tL1 = new Line2D.Double(this.p1.getX(), this.p1.getY(), this.p2.getX(), this.p2.getY());
		Line2D tL2 = new Line2D.Double(this.p1.getX(), this.p1.getY(), this.p3.getX(), this.p3.getY());
		Line2D tL3 = new Line2D.Double(this.p2.getX(), this.p2.getY(), this.p3.getX(), this.p3.getY());
		
		//testiranje  da li duz sa tackom p sijece stranicu trougla
		if(l1.intersectsLine(tL3) || l2.intersectsLine(tL2) || l3.intersectsLine(tL1)){
			contains = false;
		}
		return contains;
	}
	/*
	 * metoda koja testira da li se trougao nalazi unutar trougla
	 */
	public boolean contains(Triangle2D t){
		boolean contains = false;
		
		if(this.contains(t.getP1()) && this.contains(t.getP2()) && this.contains(t.getP3())){
			contains = true;
		}
		
		return contains;
	}
	/*
	 * metoda koja testira da li se dva trougla ukrstaju
	 */
	public boolean overlaps(Triangle2D t){
		boolean overlaps = false;
		
		//duzi prvog trougla
		Line2D l1 = new Line2D.Double(this.p1.getX(), this.p1.getY(), this.p2.getX(), this.p2.getY());
		Line2D l2 = new Line2D.Double(this.p1.getX(), this.p1.getY(), this.p3.getX(), this.p3.getY());
		Line2D l3 = new Line2D.Double(this.p2.getX(), this.p2.getY(), this.p3.getX(), this.p3.getY());
		
		//duzi drugog trougla
		Line2D tL1 = new Line2D.Double(t.p1.getX(), t.p1.getY(), t.p2.getX(), t.p2.getY());
		Line2D tL2 = new Line2D.Double(t.p1.getX(), t.p1.getY(), t.p3.getX(), t.p3.getY());
		Line2D tL3 = new Line2D.Double(t.p2.getX(), t.p2.getY(), t.p3.getX(), t.p3.getY());
		
		//testiranje da li se duzi prvog trougla ukrstaju sa duzima drugog trougla
		if (l1.intersectsLine(tL1) || l1.intersectsLine(tL2) || l1.intersectsLine(tL3) || l2.intersectsLine(tL1) || l2.intersectsLine(tL2) 
				|| l2.intersectsLine(tL3) || l3.intersectsLine(tL1) || l3.intersectsLine(tL2) || (l3.intersectsLine(tL3))) {
			overlaps = true;
		} 
		return overlaps;
	}
	
}	
